package com.techlab.test;

import com.techlab.model.Puzzle4b;

public class Puzzle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puzzle4b[] obs=new Puzzle4b[6];
		int y=1,x=0,result=0;
		while(x<6) {
			obs[x]=new Puzzle4b();
			obs[x].ivar=y;
			y*=10;
			x+=1;
		}
		x=6;
		while(x>0)
		{
			x-=1;
			result+=obs[x].doStuff(x);
		}
		System.out.println("result : "+result);
	}

}
