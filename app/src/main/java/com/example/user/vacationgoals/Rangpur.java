package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rangpur extends AppCompatActivity {
    String[] places = {
            "Bhinno Jogot",
            "Kantaji Temple",
            "Tajhat Rajbari"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rangpur);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lv_custom_layout,R.id.list_item, places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String places = (String) adapterView.getItemAtPosition(i);

                if (places == "Bhinno Jogot") {
                    Intent bj = new Intent(view.getContext(), RBhinnoJogot.class);
                    startActivity(bj);
                }
                if (places == "Kantaji Temple") {
                    Intent kt = new Intent(view.getContext(), RKantajiTemple.class);
                    startActivity(kt);
                }
                if (places == "Tajhat Rajbari") {
                    Intent tr = new Intent(view.getContext(), RTajhatRajbari.class);
                    startActivity(tr);
                }

            }
        });

    }
}
