package com.techlab.model;

import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	//int[] locationCells;
	//int numOfHits=0;
	public void setLocationCells(ArrayList<String> locs) {
		locationCells=locs;
	}

	public String checkYourself(String userInput) {
		//int guess=Integer.parseInt(stringGuess);
		String result="miss";
		
		int index=locationCells.indexOf(userInput);
		if(index>=0)
		{
			locationCells.remove(index);
			if(locationCells.isEmpty())
			{
				result="kill";
			}
			else
			{
				result="hit";
			}
		}
		
		
		
		return result;
	}

}
