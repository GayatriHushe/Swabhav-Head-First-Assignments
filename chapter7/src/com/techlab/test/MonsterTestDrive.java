package com.techlab.test;

import com.techlab.model.Dragon;
import com.techlab.model.Monster;
import com.techlab.model.Vampire;

public class MonsterTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster[] ma=new Monster[3];
		ma[0]=new Vampire();
		ma[1]=new Dragon();
		ma[2]=new Monster();
		
		for(int x=0;x<3;x++)
			ma[x].frighten(x);
	}

}
