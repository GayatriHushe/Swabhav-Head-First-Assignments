package com.techlab.test;

import com.techlab.model.A;
import com.techlab.model.B;
import com.techlab.model.C;

public class Mixed2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		C c=new C();
		A a2=new C();
		
		b.m1();
		c.m2();
		a.m3();
		System.out.println();
		
		c.m1();
		c.m2();
		c.m3();
		System.out.println();
		
		a.m1();
		b.m2();
		c.m3();
		System.out.println();
		
		a2.m1();
		a2.m2();
		a2.m3();
		System.out.println();
	}

}
