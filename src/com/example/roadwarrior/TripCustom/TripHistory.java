package com.example.roadwarrior.TripCustom;

import java.util.ArrayList;

public class TripHistory {

	//the actual list of recent trips
	private ArrayList<Trip> history = new ArrayList<Trip>();

	//add single item to history 	
	public void addTrip(Trip newTrip)
	{
		history.add(newTrip);				
	}
	
	//set the entire history or append list to history
	public void addTrips(ArrayList<Trip> newList)
	{
		history.addAll(newList);				
	}
	
	//deletes a specific trip from history
	public void delTrip(int favNum)
	{
		history.remove(favNum);
	}
	
	//clears entire history of trips
	public void clearFavs()
	{
		history.clear();
	}	
	
	//get history
	public ArrayList<Trip> getHist()
	{
		return history;
	}
}
