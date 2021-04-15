package com.techlab.model;

public class GoodDog {

	private int size;
	
	public void setsize(int s) {
		// TODO Auto-generated method stub
		size=s;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	public void bark() {
		// TODO Auto-generated method stub
		if(size>60)
			System.out.println("Woof! Woof!");
		else if(size>14)
			System.out.println("Ruff! Ruff!");
		else
			System.out.println("Yip! Yip!");
	}

}
