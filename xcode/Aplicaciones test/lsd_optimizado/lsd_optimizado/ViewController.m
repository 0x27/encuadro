//
//  ViewController.m
//  lsd_optimizer
//
//  Created by Pablo Flores Guridi on 10/10/12.
//  Copyright (c) 2012 Pablo Flores Guridi. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()
@property (weak, nonatomic) IBOutlet UIImageView *vista;

@end

@implementation ViewController

@synthesize vista = _vista;

/*Para levantar la imagen*/
FILE *in = 0 ;
int err = 0;
//VlPgmImage pim;
unsigned char *datachar  = 0;
float *datafloat = 0;
int width;
int height;

/*Para el gaussian sampler*/

image_float luminancia_sub;
image_float imagen_float;

/*Para el LSD*/
float* list;
int listSize;

float scale = 0.5;
float sigma_scale = 0.6; /* Sigma for Gaussian filter is computed as
                          sigma = sigma_scale/scale.                    */
float quant = 2.0;       /* Bound to the quantization error on the
                          gradient norm.                                */
float ang_th = 22.5;     /* Gradient angle tolerance in degrees.           */
float log_eps = 0.0;     /* Detection threshold: -log10(NFA) > log_eps     */
float density_th = 0.7;  /* Minimal density of region points in rectangle. */
int n_bins = 1024;        /* Number of bins in pseudo-ordering of gradient
                           modulus.                                       */

/*para DIBUJAR*/
//claseDibujar *cgvista;

- (void)viewDidLoad
{
    [super viewDidLoad];
	/*Aca levantamos la imagen, la pasamos a nivel de grises y la desplegamos*/
    
    /*-------------------------|PARA CORRER DESDE EL IPAD|-----------------------*/
    UIImage* uiimage = [UIImage imageNamed:@"marker_0004.png"];
    
    CGImageRef image = [uiimage CGImage];
    width = CGImageGetWidth(image);
    height = CGImageGetHeight(image);
    CGColorSpaceRef colorSpace = CGColorSpaceCreateDeviceRGB();
    unsigned char *rawData = malloc(height * width * 4);
    NSUInteger bytesPerPixel = 4;
    NSUInteger bytesPerRow = bytesPerPixel * width;
    NSUInteger bitsPerComponent = 8;
    CGContextRef context = CGBitmapContextCreate(rawData, width, height, bitsPerComponent, bytesPerRow, colorSpace, kCGImageAlphaPremultipliedLast | kCGBitmapByteOrder32Big);
    CGColorSpaceRelease(colorSpace);
    
    CGContextDrawImage(context, CGRectMake(0, 0, width, height),image);
    CGContextRelease(context);
    
    
    datafloat = malloc(width*height*sizeof(float));
    int cantidad =width*height;
    NSLog(@"Entra a rgb2gray\n");
    //rgb2gray(datafloat, rawData, width, height, 4);
    for(int pixelNr=0;pixelNr<cantidad;pixelNr++) datafloat[pixelNr] = 0.30*rawData[pixelNr*4+2] + 0.59*rawData[pixelNr*4+1] + 0.11*rawData[pixelNr*4];
    
    NSLog(@"Sale de rgb2gray\n");
    
    /*-------------------------|PARA LEVANTAR EL PGM DESDE LA PC|-----------------------*/
    
    //char* nombre = "/Users/pablofloresguridi/repositorios/encuadro/xcode/Aplicaciones test/gaussian_sampler/gaussian_sampler/marker_0004.pgm";
    
    //datafloat = read_pgm_image_float(&width,&height,nombre);
    
    //free(datachar);
    
    /*-------------------------|CORREMOS GAUSSIAN SAMPLER|-----------------------*/
    

    
    imagen_float = new_image_float_ptr( (unsigned int) width, (unsigned int) height, (float*)datafloat );
    NSLog(@"Entra a gaussian_sampler\n");
    luminancia_sub = gaussian_sampler(imagen_float, scale, sigma_scale);
    NSLog(@"Sale de gaussian_sampler\n");
    
    [self reconstruirImg:luminancia_sub->data width:round(width*scale) height:round(height*scale)];
    
    free( (void *) image );
    free_image_float(imagen_float);

     //cgvista=[[claseDibujar alloc] initWithFrame:self.vista.frame];
    
}
- (IBAction)lsd_oringinal:(id)sender {
    

    NSLog(@"LSD in\n");
    list = LineSegmentDetection(&listSize, luminancia_sub->data, luminancia_sub->xsize, luminancia_sub->ysize,2, sigma_scale, quant, ang_th, log_eps, density_th, n_bins, NULL, NULL, NULL);
    NSLog(@"LSD out\n");
    printf("Cantidad de segmentos detectados: %d\n",listSize);
    [self dibujarSegmentos];
}


- (void) dibujarSegmentos{

//    [cgvista removeFromSuperview];
// 
//    cgvista.cantidadSegmentos = listSize;
//    cgvista.segments = list;
//
//    [self.vista addSubview:cgvista];
//    
//    cgvista.backgroundColor=[UIColor colorWithRed:0.0 green:0.0 blue:0.0 alpha:0.0];
//    
//    cgvista.bounds=CGRectMake(0, 0, 1024, 768);
//    
//    [cgvista setNeedsDisplay];




}

- (void) reconstruirImg: (float*)datafloat width: (int) width height: (int) height {
    
    printf("width: %d \t height: %d\n",width, height);
    
    unsigned char *result = (unsigned char *) malloc(width * height *sizeof(unsigned char) *4);
    
    // process the image back to rgb
    
    for(int i = 0; i < height * width; i++) {
        
        result[i*4]=datafloat[i];
        result[i*4+1]=datafloat[i];
        result[i*4+2]=datafloat[i];
        result[i*4+3]=0;
    }
    CGDataProviderRef provider  = CGDataProviderCreateWithData(NULL, result, width*height, NULL);
    // set up for CGImage creation
    int bitsPerComponent = 8;
    int bitsPerPixel = 32;
    int bytesPerRow = 4* width;
    CGColorSpaceRef colorSpaceRef = CGColorSpaceCreateDeviceGray();
    CGBitmapInfo bitmapInfo = kCGBitmapByteOrderDefault;
    CGColorRenderingIntent renderingIntent = kCGRenderingIntentDefault;
    CGImageRef imageRef = CGImageCreate(width, height, bitsPerComponent, bitsPerPixel, bytesPerRow, colorSpaceRef, bitmapInfo, provider, NULL, NO, renderingIntent);
    
    self.vista.image = [UIImage imageWithCGImage:imageRef];
    
    
    CGColorSpaceRelease(colorSpaceRef);
    
    
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
