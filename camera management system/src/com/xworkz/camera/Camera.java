package com.xworkz.camera;

public class Camera {
	
	public void picThePhoto() {
		System.out.println("let's Take photo");
	}
	
	public void transitionDuration() {
		System.out.println("Define the duration of the animation, in milliseconds");
	}
	
	public void idleRotationSpeed() {
		System.out.println("Speed at which the camera rotates around the mesh");
	}

	public void zoomStopsAnimation() {
		System.out.println("Flag that indicates if user zooming should stop animation");
	}
	
	public void idleRotationWaitTime() {
		System.out.println("Time to wait after user interaction before the camera starts rotating");
	}
	
}
