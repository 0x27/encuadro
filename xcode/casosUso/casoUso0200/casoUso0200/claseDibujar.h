//
//  claseDibujar.h
//  LSD
//
//  Created by juani on 12/29/11.
//  Copyright (c) 2011 pablofloresguridi@gmail.com. All rights reserved.
//

#import <UIKit/UIKit.h>

double esqRepro[4];
@interface claseDibujar : UIView

@property(nonatomic, readwrite) int cantidadSegmentos;
@property(nonatomic, readwrite) int cantidadLsd;

@property(nonatomic, readwrite) double* segmentos_lsd;
@property(nonatomic, readwrite) double* segmentos;
@property(nonatomic, readwrite) double** esquinas;
@property(nonatomic, readwrite) double** esquinasReproyectadas;

@property(nonatomic, readwrite) int dealloc;

@property(nonatomic, readwrite) bool segments;
@property(nonatomic, readwrite) bool corners;
@property(nonatomic, readwrite) bool reproyected;
@property(nonatomic, readwrite) bool lsd_all;

- (id)initWithFrame:(CGRect)frame;
-(void)drawRect:(CGRect)rect; //cantidadSeg:(int) cantidadSeg segmentos: (double*) segmentos;

@end
