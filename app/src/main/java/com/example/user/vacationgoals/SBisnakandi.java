package com.example.user.vacationgoals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class SBisnakandi extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper viewFlipper;
    Button next,prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisnakandi);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        next = (Button) findViewById(R.id.nxt);
        prev = (Button) findViewById(R.id.pre);

       next.setOnClickListener(this);
        prev.setOnClickListener(this);
    }
     @Override
     public void onClick(View v ){
         if(v==next){
             viewFlipper.showNext();
         }
         if(v==prev){
             viewFlipper.showPrevious();
         }
     }
}
