package com.example.roadwarrior.TripCustom;

import java.util.ArrayList;
import java.util.Arrays;


public class CarCheck {
	
	//the actual CarCheckList
	private ArrayList<String> checkList = 
			new ArrayList<String>(Arrays.asList("Battery","Oil", "Tires"));
	
	//set/append the entire CarCheck list
	public void setCheck(ArrayList<String> newList)
	{
		checkList.addAll(newList);				
	}
	
	//get CarCheck list
	public ArrayList<String> getCheck()
	{
		return checkList;
	}
	
	//add single new custom item to check list 	
	public void addCheck(String newCheck)
	{
		checkList.add(newCheck);				
	}

}
