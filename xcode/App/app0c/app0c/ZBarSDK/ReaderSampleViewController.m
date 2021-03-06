//
//  ReaderSampleViewController.m
//  ReaderSample
//
//  Created by spadix on 4/14/11.
//

#import "ReaderSampleViewController.h"

@implementation ReaderSampleViewController

@synthesize resultImage, resultText,site, audioPlayer,start;

- (IBAction) scanButtonTapped
{

    
   
    // ADD: present a barcode reader that scans from the camera feed
    ZBarReaderViewController *reader = [ZBarReaderViewController new];
    reader.readerDelegate = self;
    reader.supportedOrientationsMask = ZBarOrientationMaskAll;
    
    ZBarImageScanner *scanner = reader.scanner;
    // TODO: (optional) additional reader configuration here
    
    // EXAMPLE: disable rarely used I2/5 to improve performance
    [scanner setSymbology: ZBAR_I25
                   config: ZBAR_CFG_ENABLE
                       to: 0];
    
    // present and release the controller
    [self presentModalViewController: reader animated: YES];
    

   // [reader release];
        
    
    
    
    
}

- (IBAction) play{
 
    if (click==0) {
       // audioPlayer=nil;
        click=1;
        NSURL *url =[NSURL fileURLWithPath:[NSString stringWithFormat:@"%@/Adele - Rolling In The Deep.mp3", [[NSBundle mainBundle] resourcePath]]];
        NSError *error;
        audioPlayer =[[AVAudioPlayer alloc] initWithContentsOfURL:url error:&error];
        audioPlayer.numberOfLoops=0;
        [audioPlayer play];
        
        [start setTitle:@"Stop" forState:UIControlStateNormal];
        
    }else {
        //audioPlayer=nil;
        [audioPlayer stop];
        click=0;
        [start setTitle:@"Start" forState:UIControlStateNormal];
    }
   

}

//- (IBAction) enCuadroSite:(id)sender { 
//    
//    NSURL *url = [ [ NSURL alloc ] initWithString:site];  
//    [[UIApplication sharedApplication] openURL:url];  
//}

- (void) imagePickerController: (UIImagePickerController*) reader
 didFinishPickingMediaWithInfo: (NSDictionary*) info
{
    

    
    // ADD: get the decode results
    id<NSFastEnumeration> results = [info objectForKey: ZBarReaderControllerResults];
    ZBarSymbol *symbol = nil;
    for(symbol in results)
        // EXAMPLE: just grab the first barcode

               break;
    
   
    
    //Aca vendria la busqueda en base de datos del texto del QR
//
    
    NSString *string=symbol.data;

    if ([string rangeOfString:@"BLANES"].location != NSNotFound) {
        //zona BLANES

        resultText.text = symbol.data;
        site=@"http://www.mnav.gub.uy/cms.php?a=1";
        opcionAutor=1;
        room=@"blanes";
        cad=@"AutorBlanes.jpeg";
        
       
    } else if ([string rangeOfString:@"FIGARI"].location != NSNotFound) {
        //zona FIGARI
        
        resultText.text = symbol.data;
        site=@"http://www.mnav.gub.uy/cms.php?a=6";
        opcionAutor=2;
        room=@"figari";
        cad=@"AutorFigari.jpeg";

        
    }else if ([string rangeOfString:@"TORRES"].location != NSNotFound) {
        //zona TORRES
        
        resultText.text = symbol.data;
        site=@"http://www.mnav.gub.uy/cms.php?a=4";
        opcionAutor=3;
        room=@"torres";
        cad=@"AutorTorres.jpeg";
        
    
    } else {
       //ninguna ZONA
        resultText.text = @"No está en zona BLANES, FIGARI ni TORRES GARCIA";
        site=@"http://code.google.com/p/encuadro/";
        opcionAutor=0;
        room=@"noroom";
        cad=@"Blanes_sraCarlota.jpg";

    }
    

      
    // EXAMPLE: do something useful with the barcode image
    //resultImage.image = [info objectForKey: UIImagePickerControllerOriginalImage];

    UIImage *cuadroPhoto = [UIImage imageNamed:cad];
    
    resultImage.image = cuadroPhoto;
    
    UIAlertView *alertWithOkButton;
    UIAlertView *alertWithYesNoButtons;
    alertWithOkButton = [[UIAlertView alloc] initWithTitle:@"QR Detectado!"
                                                   message:@"Presione Foward para reconocer cuadro" delegate:self cancelButtonTitle:@"OK" otherButtonTitles:nil];
    
    [alertWithOkButton show];
    [alertWithOkButton release];
    

    // ADD: dismiss the controller (NB dismiss from the *reader*!)
    [reader dismissModalViewControllerAnimated: YES];
    
    
  
    NSLog(@"opcionAutor en picker es %d",opcionAutor);
    
    [reader release];
    
}


//- (void) imagePickerControllerDidCancel: (UIImagePickerController *) picker {
//    
//    //[[picker parentViewController] dismissModalViewControllerAnimated: YES];
//    //[picker release];
//}

-(void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender
{
    if ([[segue identifier] isEqualToString:@"Fow"])
    {
        [audioPlayer stop];
        click=0;
        [start setTitle:@"Start" forState:UIControlStateNormal];
       
        
        
    }
}

-(void) viewDidLoad{

    [super viewDidLoad];
    room=@"noroom";

}

- (BOOL) shouldAutorotateToInterfaceOrientation: (UIInterfaceOrientation) orient
{
    return(YES);
}

- (void) dealloc {
    self.resultImage = nil;
    self.resultText = nil;
  //  [super dealloc];
}

@end
