package com.techlab.test;

import com.techlab.model.GoodDog;

public class GoodDogTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodDog one=new GoodDog();
		one.setsize(70);
		GoodDog two=new GoodDog();
		two.setsize(8);
		System.out.println("Dog one : "+one.getSize());
		System.out.println("Dog two : "+two.getSize());
		one.bark();
		two.bark();
	}

}
