package com.techlab.test;

public class XCopy {
	public static void main(String[] args) {
		int orig=42;
		XCopy x=new XCopy();
		int y=x.go(orig);
		System.out.println(orig+" "+y);
	}

	private int go(int arg) {
		// TODO Auto-generated method stub
		arg*=2;
		return arg;
	}
}
