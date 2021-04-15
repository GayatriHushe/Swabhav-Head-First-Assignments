package com.techlab.test;

import java.util.ArrayList;

import com.techlab.model.RetentionBot;
import com.techlab.model.V2Radiator;
import com.techlab.model.V3Radiator;

public class TestLifeSupportSim {

	public static void main(String[] args) {
		ArrayList aList=new ArrayList();
		V2Radiator v2=new V2Radiator(aList);
		V3Radiator v3=new V3Radiator(aList);
		for (int z = 0; z < 20; z++) {
			RetentionBot ret=new RetentionBot(aList);;
		}

	}

}
