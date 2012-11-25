package com.leviwilson.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.leviwilson.android.R;
import static com.leviwilson.android.R.id;


import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup;

//http://stackoverflow.com/questions/2469466/refreshing-a-linearlayout-after-adding-a-view

public class HelloAndroidActivity extends Activity {

    private static String TAG = "android-travis";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
		// main.xml => R.layout.main
        setContentView(R.layout.main);
		createButton();
    }


    public void createButton() {
	    
		
		  //LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
		  //          LinearLayout.LayoutParams.MATCH_PARENT,
		  //          LinearLayout.LayoutParams.WRAP_CONTENT);

		  
		  //LayoutInflater inflater = getLayoutInflater();
		  //LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.main,null);
		  
		  //LinearLayout ll = (LinearLayout) R.layout;
		  
		  //LinearLayout ll = (LinearLayout) findViewById(R.layout.main);
		  
		  //ViewGroup ll = (ViewGroup) findViewById(R.layout);
		  
		  //LinearLayout ll = new LinearLayout(this);
		  //final LinearLayout ll = new LinearLayout(this);
		 
		 
		  
		  TextView text = (TextView) findViewById(R.id.greet_them);
		 
		  
		  LinearLayout ll = (LinearLayout) text.getParent();
		  
		
		  Button btn = new Button(this); 
		  //btn.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)  
		  btn.setText("MyButton"); 
		  
		  
		  //ll.addView(btn, params);
		  
	      //layout.addView(btn); 

		  ll.addView(btn);
		 
		  // setContentView(ll);
		  //TextView txt = (TextView) findViewById(R.id.greet_them);
		  //txt.setText("hello from runtime"); 	  
		  
		  
	}
}

