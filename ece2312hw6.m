close ALL HIDDEN
clear all
clc

%Homework Assignment 6
%(5.M-11)

%eighth order FIR lowpass
[b,a] = ellip(8, 3, 20, 1/3);
figure
freqz(b,a);
%input('enter anything to continue to pole-sero plot ', 's');
figure
zplane(b,a);

%eighth order FIR highpass
[b,a] = ellip(8, 3, 20, 1/3,'high');
figure
freqz(b,a);
%input('enter anything to continue to pole-sero plot ', 's');
figure
zplane(b,a);

%eighth order FIR bandpass
[b,a] = ellip(8, 3, 20, [5/24,11/24]);
figure
freqz(b,a);
%input('enter anything to continue to pole-sero plot ', 's');
figure
zplane(b,a);

%eighth order FIR bandstop
[b,a] = ellip(8, 3, 20, [5/24,11/24], 'stop');
figure
freqz(b,a);
%input('enter anything to continue to pole-sero plot ', 's');
figure
zplane(b,a);