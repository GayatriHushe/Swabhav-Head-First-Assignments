package com.techlab.model;

public class Puzzle4b {

	public int ivar;

	public int doStuff(int factor) {
		// TODO Auto-generated method stub
		if(ivar>100)
			return ivar*factor;
		else
			return ivar*(5-factor);
	}

}
