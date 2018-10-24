package com.example.user.vacationgoals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class SJaflong extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlipper;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaflong);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        next = (Button) findViewById(R.id.nxt);

        next.setOnClickListener(this);
       }

    @Override
    public void onClick(View v ){
        if(v==next){
            viewFlipper.showNext();
        }

    }
}
