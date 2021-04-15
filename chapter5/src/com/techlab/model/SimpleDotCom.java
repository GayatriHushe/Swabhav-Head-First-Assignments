package com.techlab.model;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits=0;
	public void setLocationCells(int[] locs) {
		// TODO Auto-generated method stub
		locationCells=locs;
	}

	public String checkYourself(String stringGuess) {
		// TODO Auto-generated method stub
		int guess=Integer.parseInt(stringGuess);
		String result="miss";
		for(int cell:locationCells)
		{
			if(guess==cell)
			{
				result="hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits==locationCells.length)
			result="kill";
		System.out.println(result);
		return result;
	}

}
