package ctec.warproject.controller;

import java.util.Scanner;

import android.R;
import android.widget.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import ctec.state.model.WarGameState;

public class WarActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_item);
		
		Button startButton = (Button) findViewById(R.id.button1);
		
		appState = (WarGameState) this.getApplication();
		
		setupListeners();
	}

	private void setupListeners()
	{
		// TODO Auto-generated method stub
		
	}
	
	
	

