package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Division extends AppCompatActivity {
    Button D,Raj,Ra,B,K,C,S,M;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        D=(Button)findViewById(R.id.button2);
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d =new Intent(view.getContext(),Dhaka.class);
                startActivity(d);
            }
        });
        Raj=(Button)findViewById(R.id.button3);
        Raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent raj =new Intent(view.getContext(),Rajshahi.class);
                startActivity(raj);
            }
        });
        Ra=(Button)findViewById(R.id.button8);
        Ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ra =new Intent(view.getContext(),Rangpur.class);
                startActivity(Ra);
            }
        });
        B=(Button)findViewById(R.id.button4);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b =new Intent(view.getContext(),Barisal.class);
                startActivity(b);
            }
        });
        K=(Button)findViewById(R.id.button5);
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k =new Intent(view.getContext(),Khulna.class);
                startActivity(k);
            }
        });
        C=(Button)findViewById(R.id.button6);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c =new Intent(view.getContext(),Chittagong.class);
                startActivity(c);
            }
        });
        S=(Button)findViewById(R.id.button7);
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s =new Intent(view.getContext(),Sylhet.class);
                startActivity(s);
            }
        });
        M=(Button)findViewById(R.id.button9);
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m =new Intent(view.getContext(),Mymensing.class);
                startActivity(m);
            }
        });
    }
}
