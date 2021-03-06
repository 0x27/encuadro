clear all;
close all;
clc;

%% configure camera
camera = pinholeCamera(44.5,480,360,zeros(5,1),0);

%% setup

%juani setup
setup = renderMarkerSetup(	camera,...
 							'/Users/juanignaciobraun/Desktop/encuadro/',...
 							'/Users/juanignaciobraun/Dropbox/encuadro/renders/',...
							12,1);

% %colorado setup
% setup = renderMarkerSetup(	camera,...
% 							'/home/roho/workspace/encuadro/',...
% 							'/home/roho/Dropbox/encuadro/renders/',...
% 							1,1);

% %mou setup
% setup = renderMarkerSetup(camera,...
%							'/Users/pablofloresguridi/repositorios/encuadro/',...
% 							'/Users/pablofloresguridi/Desktop/',...
% 							1,1);                        

%% generate poses
poses = generatePoses(setup.pose_id);

%% batch render images

count = 0
for i=1:length(poses)
	renderMarker(poses(i),camera,setup,i);
	
	%pause rendering 5 seconds per 20 renders to be able to abort (CTRL+C)
	if (count==20)
		fprintf('***Pausing for 10 seconds***\n')
		pause(10)
		count=0;
	else
		count=count+1;
	end
end

%% write parameters 
writePosesFile(poses,[setup.img_path 'poses.txt']);
writeCameraFile(camera,[setup.img_path 'camera.txt']);
