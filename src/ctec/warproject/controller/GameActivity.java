package ctec.warproject.controller;

import java.util.ArrayList;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu.*;
import android.widget.*;
import ctec.state.model.WarGameState;

public class GameActivity extends Activity
{
	private TextView lossText;
	private TextView winText;
	private TextView lossCount;
	private TextView winCount;
	private TextView resultText;
	private ImageView comImageView;
	private ImageView userImageView;
	private Button gameReturnButton;
	private Button selectButton;
	private Button startButton;
	private WarGameState appState;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_item);
		
		startButton = (Button) findViewById(R.id.startButton);
		selectButton = (Button) findViewById(R.id.selectButton);
		gameReturnButton = (Button) findViewById(R.id.gameReturnButton);
		
		userImageView = (ImageView) findViewById(R.id.userImageView);
		comImageView = (ImageView) findViewById(R.id.comImageView);
		
		resultText = (TextView) findViewById(R.id.resultText);
		winCount = (TextView) findViewById(R.id.winCount);
		lossCount = (TextView) findViewById(R.id.lossCount);
		winText = (TextView) findViewById(R.id.winText);
		lossText = (TextView) findViewById(R.id.lossText);
		
		
		comImageView.setImageResource(R.drawable.questionmrk);
		
		appState = (WarGameState) this.getApplication();
				
		setupListeners();
	
	}

	private void setupListeners()
	{
		// TODO Auto-generated method stub
		
	}	
}
