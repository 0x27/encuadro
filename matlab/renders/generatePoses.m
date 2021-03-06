function pose = generatePoses(pose_nb,varargin)
%pose = generatePoses(poseNb)
%Generates poses in batch 
%
%Input:
%	pose_nb: int for pose choice
%	sigmaR, sigmaT: (optional) standard deviations for noise on each pose
%Output:
%	pose: 1xn vector of structs pose containing:
%		pose(i).rotation: 1x3 vector
%		pose(i).translation: 1x3 vector
%Usage:
%	pose = generatePoses(poseNb)
%	pose = generatePoses(poseNb,sigmaR,sigmaT)

%% NOISE

if (length(varargin)>5)
	sigmaR = varargin{1};
	sigmaT = varargin{2};
else
	sigmaR = 0;
	sigmaT = 0;
end

%% POSE OPTIONS
switch pose_nb
%==========================BASIC TRANSLATIONS=============================%
	case 1,		
		ax = 0;
		ay = 0;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 600:5:2100;
	case 2,
		ax = -45:15:45;
		ay = -45:15:45;
		az = -45:15:45;

		tx = 0;
		ty = 0;
		tz = 1000;	
	case 3,		
		ax = -60:2:60;
		ay = 0;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 1000;
	case 4,		
		ax = 0;
		ay = -60:2:60;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 1000;
	case 5,		
		ax = 0;
		ay = 0;
		az = -60:2:60;

		tx = 0;
		ty = 0;
		tz = 1000;	

    case 6,		
		ax = -60:2:60;
		ay = 0;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 1500;
	case 7,		
		ax = 0;
		ay = -60:2:60;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 1500;
	case 8,		
		ax = 0;
		ay = 0;
		az = -60:2:60;

		tx = 0;
		ty = 0;
		tz = 1500;	
        
    case 9,		
		ax = -60:2:60;
		ay = 0;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 1400;
	case 10,		
		ax = 0;
		ay = -60:2:60;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 1400;
        
    case 11,		
		ax = 0;
		ay = 0;
		az = -180:6:180;

		tx = 0;
		ty = 0;
		tz = 1400;
%==============================USER POSES=================================%
    case 12, %esta es de mou		
		ax = -45;
		ay = 15;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 700;
%=============================RANDOM POSES================================%
	case 50,		
		ax = randn(5);
		ay = randn(5);
		az = randn(5);

		tx = 0;
		ty = 0;
		tz = 1000;
	case 51,		
		ax = 0;
		ay = 0;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 1000+20*randn(1,500);
%=========================DEFUALT SINGLE POSE=============================%		
	otherwise
		ax = 0;
		ay = 0;
		az = 0;

		tx = 0;
		ty = 0;
		tz = 1000;
end


%% COMBINE POSES
idx=1;
for i=tx
	for j=ty
		for k=tz
			for l=ax
				for m=ay
					for n=az
						pose(idx).rotation = [l m n] + sigmaR*randn;
						pose(idx).translation = [i j k] + sigmaT*randn;
						idx=idx+1;
					end
				end
			end
		end
	end
end