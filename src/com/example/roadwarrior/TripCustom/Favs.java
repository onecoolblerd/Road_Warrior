package com.example.roadwarrior.TripCustom;

import java.util.ArrayList;

public class Favs {

	//the actual favsList
	private ArrayList<String> favsList = new ArrayList<String>();

	//add single item to favsList 	
	public void addFav(String favorite)
	{
		favsList.add(favorite);				
	}
	
	//set the entire favsList
	public void addFavs(ArrayList<String> newList)
	{
		favsList.addAll(newList);				
	}
	
	//deletes a specific fav from favsList
	public void delFav(int favNum)
	{
		favsList.remove(favNum);
	}
	
	//clears entire favsList
	public void clearFavs()
	{
		favsList.clear();
	}	
	
	//get favsList
	public ArrayList<String> getFavs()
	{
		return favsList;
	}
	
}
