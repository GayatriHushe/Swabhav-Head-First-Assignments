package com.techlab.test;

import com.techlab.model.Dog;

public class DogTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog one = new Dog();
		one.size = 70;
		Dog two = new Dog();
		two.size = 8;
		
		Dog three = new Dog();
		three.size = 35;
		one.bark () ;
		two.bark () ;
		three.bark();
	}

}
