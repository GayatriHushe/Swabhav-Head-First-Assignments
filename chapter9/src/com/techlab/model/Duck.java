package com.techlab.model;

public class Duck {
	
	int pounds=6;
	float floatability=2.1f;
	String name="Generic";
	long[] feathers= {1,2,3,4,5,6,7};
	boolean canFly=true;
	int maxSpeed=25;
	
	public Duck() {
		System.out.println("Type 1 duck");
	}

	public Duck(boolean fly) {
		canFly=fly;
		System.out.println("Type 2 duck");
	}

	public Duck(String n, long[] f) {
		System.out.println("Type 3 duck");
	}

	public Duck(int w, float f) {
		pounds=w;
		floatability=f;
		System.out.println("Type 4 duck");
	}
	
	public Duck(float density, int max) {
		floatability=density;
		maxSpeed=max;
		System.out.println("Type 5 duck");
	}

}
