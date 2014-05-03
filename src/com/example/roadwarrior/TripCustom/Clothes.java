package com.example.roadwarrior.TripCustom;

import java.util.ArrayList;
import java.util.Arrays;

public class Clothes {
	
	//user-defined clothing list
	private ArrayList<String> custom = new ArrayList<String>();

	//pre-defined sunny clothing list
	private ArrayList<String> sunny = 
			new ArrayList<String>(Arrays.asList("Short-Sleeve Shirt", "Shorts", "Sandals"));
	
	//pre-defined cold clothing list
	private ArrayList<String> cold = new ArrayList<String>(Arrays.asList("Winter Coat", "Thermals", "Scarf"));
	
	//pre-defined rainy clothing list
	private ArrayList<String> rainy = new ArrayList<String>(Arrays.asList("Umbrella", "Raincoat", "Rubber Boots"));
	
	//string type to describe weather
	private String weatherType = new String();
	
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
	
	//the following are methods working on the sunny list
	//add list of items to end of list
	public void addToSunny(ArrayList<String> more)
	{
		sunny.addAll(more);
	}
	
	//remove specific item from list
	public void removeFromSunny(int index)
	{
		sunny.remove(index);
	}

	//return list
	public ArrayList<String> getSunnyList()
	{
		return sunny;
	}
	
	//the following are methods working on the cold list
	//add list of items to end of list
	public void addToCold(ArrayList<String> more)
	{
		cold.addAll(more);
	}
	
	//remove specific item from list
	public void removeFromCold(int index)
	{
		cold.remove(index);
	}

	//return list
	public ArrayList<String> getColdList()
	{
		return cold;
	}
	
	//the following are methods working on the rainy list
	//add list of items to end of list
	public void addToRainy(ArrayList<String> more)
	{
		rainy.addAll(more);
	}
	
	//remove specific item from list
	public void removeFromRainy(int index)
	{
		rainy.remove(index);
	}

	//return list
	public ArrayList<String> getRainyList()
	{
		return rainy;
	}
	
	//the following are methods working on the custom list
	//add item to end of list
	public void addCustomItem(String item)
	{
		custom.add(item);
	}
	
	//remove specific item from list
	public void removeFromCustom(int index)
	{
		custom.remove(index);
	}
	
	//remove specific item from list
	public void clearCustom()
	{
		custom.clear();;
	}

	//return list
	public ArrayList<String> getCustomList()
	{
		return custom;
	}
	
	//add/set list of items to end of list
	public void setCustom(ArrayList<String> newList)
	{
			custom.addAll(newList);
	}
	
	//returns correct weather list based on weatherType
	public ArrayList<String> suggest()
	{
		ArrayList<String> suggestion = new ArrayList<String>();
		
		if(weatherType.equalsIgnoreCase("sunny"))
			suggestion.addAll(sunny);
		else if(weatherType.equalsIgnoreCase("cold"))
			suggestion.addAll(cold);
		else if(weatherType.equalsIgnoreCase("rainy"))
			suggestion.addAll(rainy);
		
		return suggestion;
	}
}
