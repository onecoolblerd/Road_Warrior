package com.example.roadwarrior;

import java.util.List;

import com.example.roadwarrior.TripCustom.CarCheck;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.view.View;
import android.view.View.OnClickListener;

public class CarList extends Activity {

		private CarCheck checkList = new CarCheck();
		
		private ListView lView;
		
		private Button checkAll, done;
		
		/*private String lv_items[] = { "Android", "iPhone", "BlackBerry",
		"AndroidPeople", "J2ME", "Listview", "ArrayAdapter", "ListItem",
		"Us", "UK", "India" };*/

		@Override
		public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.car_checklist);
		lView = (ListView) findViewById(R.id.ListView01);

		 List<String> carList = checkList.getCheck();
		
		// This is the array adapter, it takes the context of the activity as a 
        // first parameter, the type of list view as a second parameter and your 
        // array as a third parameter.
        ArrayAdapter<String> carCheckAdapter = new ArrayAdapter<String>(
                this, 
                android.R.layout.simple_list_item_multiple_choice,
                carList);
        
//		 Set option as Multiple Choice. So that user can able to select more the one option from list
		
        
        //Create footer with submit button and check all button
        //create new view that calls check all/submit layout
        View v = getLayoutInflater().inflate(R.layout.item_listview_footer, null);
        
        //add footer to listview before setting the adapter to make sure it displays
        lView.addFooterView(v);
		lView.setAdapter(carCheckAdapter);
		lView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
		
		//run onclick function
		}
		
		public void addListenerOnButton() {
			 
			//final Context context = this;
	 
			done = (Button) findViewById(R.id.newTrip);
			checkAll = (Button) findViewById(R.id.newTrip);
			//prevTrip = (Button) findViewById(R.id.newTrip);
			
			done.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
					if(lView.getCheckedItemCount() == )	
				    Intent intent = new Intent(CarList.this, CarList.class);
	                            startActivity(intent);   
	 
				}
	 
			});
		
}
