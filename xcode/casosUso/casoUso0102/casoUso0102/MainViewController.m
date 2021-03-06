//
//  MainViewController.m
//  casoUso0102
//
//  Created by Juan Ignacio Braun on 10/19/12.
//
//

#import "MainViewController.h"

@interface MainViewController ()

@end

@implementation MainViewController

@synthesize window = _window;
@synthesize HWview = _HWview;
@synthesize viewController = _viewController;
@synthesize controlsView = _controlsView;



- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
    self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
    if (self) {
        // Custom initialization
    }
    return self;
}

- (void)viewDidLoad
{
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    _controlsView = [[UIView alloc] init];
  
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void) hacerRender
{
    NSLog(@"HACER RENDER VISTA");
    casoUso0102AppDelegate *appDelegate = (casoUso0102AppDelegate *)[[UIApplication sharedApplication] delegate];
    self.viewController=(Isgl3dViewController*)appDelegate.viewController;
    
    ///////////////////////////////////////////////
    ///////////////////////////////////////////////
    ///////////////////////////////////////////////
    [self.viewController viewDidLoad];
    ///////////////////////////////////////////////
    ///////////////////////////////////////////////
    ///////////////////////////////////////////////
    
    
        
    //agrego render
    [self.view addSubview:self.viewController.view];
    [self.view sendSubviewToBack:self.viewController.view];
    self.viewController.view.opaque = NO;
    
    //agrego video
    [self.view addSubview:self.viewController.videoView];
    [self.view sendSubviewToBack:self.viewController.videoView];

    
    [self createViews];
    
    
    

}

- (void) removeViews {
    
    NSLog(@"REMOVE VIEWS VISTA");
	// Create view and add to Isgl3dDirector
	//Isgl3dView * view = [HelloWorldView view];
    
    [self.viewController.view removeFromSuperview];
    // [self.view removeFromSuperview:self.HWview];
    _viewController.isgl3DView = nil;
	[[Isgl3dDirector sharedInstance] removeView:self.HWview];
    [self.HWview release];
}

- (void) createViews {
    printf("CREATE VIEWS\n");
	// Set the device orientation
	[Isgl3dDirector sharedInstance].deviceOrientation = Isgl3dOrientationLandscapeLeft;
    
	// Set the background transparent
	[Isgl3dDirector sharedInstance].backgroundColorString = @"00000000";
    
	// Create view and add to Isgl3dDirector
    self.HWview =[[Isgl3dView alloc] init];
    
	self.HWview = [HelloWorldView view];
    _viewController.isgl3DView = self.HWview;
	[[Isgl3dDirector sharedInstance] addView:self.HWview];
}

- (void) buttonBACK {
    NSLog(@"BUTTON BACK");
    // _viewController.AugmReal=false;
    
    [self removeViews];
    
    [self.viewController.session stopRunning];

    
    //////////////////////////////////////////////////////
    
    // applicationWillTerminate
    // applicationWillTerminate
    // applicationWillTerminate
    
    [[Isgl3dDirector sharedInstance].openGLView removeFromSuperview];
    
    // End and reset the director
    
    //[Isgl3dDirector resetInstance];
    
    // Release
    [_viewController release];
    _viewController = nil;
    [_window release];
    _window = nil;
    
    
    // applicationWillTerminate
    // applicationWillTerminate
    // applicationWillTerminate
    
    
    //////////////////////////////////////////////////////
    [[Isgl3dDirector sharedInstance] resume];
    
    
    //self.view=Nil;
    
}

- (void)viewWillDisappear:(BOOL)animated
{
    NSLog(@"WILL DIS VISTA");
    [super viewWillDisappear:animated];
    
    [self buttonBACK];
}

- (void)viewWillAppear:(BOOL)animated
{
    NSLog(@"VIEW WILL APPEAR VISTA");
    [super viewWillAppear:animated];
    [self hacerRender];
    
    // [self.navigationController setNavigationBarHidden:NO animated:animated];
}

- (IBAction)LSD:(UIBarButtonItem *)sender {
    if (self.viewController.LSD) {
        self.viewController.LSD=false;
    }
    else{
        self.viewController.LSD=true;
    }

}

- (IBAction)LSD_original:(UIBarButtonItem *)sender {
    if (self.viewController.LSD_original) {
        self.viewController.LSD_original=false;
    }
    else{
        self.viewController.LSD_original=true;
    }
    
}


- (IBAction)Segments:(UIBarButtonItem *)sender {
    if (self.viewController.segments) {
        self.viewController.segments=false;
    }
    else{
        self.viewController.segments=true;
    }
}

- (IBAction)detectedPts:(UIBarButtonItem *)sender {
    if (self.viewController.detectedPts) {
        self.viewController.detectedPts=false;
    }
    else{
        self.viewController.detectedPts=true;
    }
}

- (IBAction)reproyectedPts:(UIBarButtonItem *)sender {
    if (self.viewController.reproyectedPts) {
        self.viewController.reproyectedPts=false;
    }
    else{
        self.viewController.reproyectedPts=true;
    }
}

- (IBAction)kalman:(UISwitch *)sender {
    if (sender.on) {
        self.viewController.kalman=true;
    }
    else{
        self.viewController.kalman=false;
    }
}

- (IBAction)kalmanErrorGain:(UISlider *)sender {
    self.viewController.kalmanErrorGain = sender.value;
}

- (IBAction)segmentsFilterThresh:(UISlider *)sender {
    self.viewController.segmentFilterThres = sender.value;
    NSLog(@"filter threshold: %f",sender.value);
}

- (IBAction)RefPose:(UIBarButtonItem *)sender {
    if (self.viewController.newRefPose) {
        self.viewController.newRefPose=false;
    }
    else{
        self.viewController.newRefPose=true;
    }
}

- (IBAction)Sensors:(UISwitch *)sender {
    if (sender.on) {
        self.viewController.sensors=true;
        self.viewController.newRefPose=true;
        self.viewController.ini=true;
    }
    else{
        self.viewController.sensors=false;
        self.viewController.ini=true;
    }
}

- (void)dealloc {

    [super dealloc];
}

@end
