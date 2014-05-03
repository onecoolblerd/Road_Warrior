package com.example.roadwarrior.TripCustom;

import java.util.ArrayList;

public class Trip {
	
	//private variables
	
	// may remove;may be redundant due to packing.weatherType
	private String weatherType = new String(); 
	private String finalDest = new String();
	
	private ArrayList<String> stops = new ArrayList<String>();
	
	//custom classes
	private CarCheck pre = new CarCheck();
	private Clothes packing = new Clothes();
	private Favs favsList = new Favs();
	
	
	//methods
	
	//set weatherType 	
	public void setWeather(String weather)
	{
		weatherType = weather;				
	}
	
	//get weatherType
	public String getWeather()
	{
		return weatherType;			
	}
	
	//set final destination
	public void setFinalDest(String destination)
	{
		finalDest = destination;
	}
	
	//get final destination
	public String getFinalDest()
	{
		return finalDest;
	}
	
	
	//the following are methods working on the stops list
	//add item to end of list
	public void addStop(String singleStop)
	{
		stops.add(singleStop);
	}
	
	//add/set list of items to end of list
	public void setStops(ArrayList<String> allStops)
	{
			stops.addAll(allStops);
	}
		
	//remove specific item from list
	public void removeStop(int index)
	{
		stops.remove(index);
	}
	
	//remove specific item from list
	public void clearStops()
	{
		stops.clear();
	}

	//return list
	public ArrayList<String> getAllStops()
	{
		return stops;
	}

	//the following are methods working on
	//pre the CarCheck object
	//add item to end of list
	public void addCheck(String newCheck)
	{
		pre.addCheck(newCheck);
	}
	
	//add/set list of items to end of list
	public void setCheck(ArrayList<String> newList)
	{
		pre.setCheck(newList);
	}
		
	//return list
	public ArrayList<String> getCheck()
	{
		return pre.getCheck();
	}
	
	//the following are methods working on the 
	//packing the Clothes object
	//add item to end of list
	public void addCloth(String item)
	{
		packing.addCustomItem(item);
	}
	
	//add/set list of items to end of list
	public void addClothes(ArrayList<String> newList)
	{
			packing.setCustom(newList);
	}
	
	//remove specific item from list
	public void removeCloth(int index)
	{
		packing.removeFromCustom(index);
	}
	
	//clear packing list
	public void clearPacking()
	{
		packing.clearCustom();
	}
	
	//get suggested list
	public ArrayList<String> packingSuggestion()
	{
		packing.setWeather(weatherType);
		return packing.suggest();
	}

	//return list
	public ArrayList<String> getPacking()
	{
		return packing.getCustomList();
	}
	
	//the following methods manipulate favsList
	//add single item to favsList 	
	public void addFav(String favorite)
	{
		favsList.addFav(favorite);				
	}
	
	//set the entire favsList
	public void addFavs(ArrayList<String> newList)
	{
		favsList.addFavs(newList);				
	}
	
	//deletes a specific fav from favsList
	public void delFav(int favNum)
	{
		favsList.delFav(favNum);
	}
	
	//clears entire favsList
	public void clearFavs()
	{
		favsList.clearFavs();
	}	
	
	//get favsList
	public ArrayList<String> getFavs()
	{
		return favsList.getFavs();
	}

}
