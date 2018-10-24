package com.example.user.vacationgoals;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SliderActivity extends Activity {
	
	public int currentimageindex=0;
	ImageView slidingimage;
	
	private int[] IMAGE_IDS = {
			R.drawable.cxbazar, R.drawable.bisnakandi, R.drawable.bichnakandi1,
			R.drawable.bisnakandi3
		};
	
	
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageslider);
        final Handler mHandler = new Handler();

        // Create runnable for posting
        final Runnable mUpdateResults = new Runnable() {
            public void run() {
            	
            	AnimateandSlideShow();
            	
            }
        };
		
        int delay = 1000; // delay for 1 sec.

        int period = 15000; // repeat every 4 sec.

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {

        	 mHandler.post(mUpdateResults);

        }

        }, delay, period);
        
		 
		       
    }

    public void onClick(View v) {
    
        finish();
        android.os.Process.killProcess(android.os.Process.myPid());
      }
    
    /**
     * Helper method to start the animation on the splash screen
     */
    private void AnimateandSlideShow() {
    	
    	
    	slidingimage = (ImageView)findViewById(R.id.ImageView3_Left);
   		slidingimage.setImageResource(IMAGE_IDS[currentimageindex%IMAGE_IDS.length]);
   		
   		currentimageindex++;
    	

          
          	 
        
    }
    
     
    
    
}