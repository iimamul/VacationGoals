package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rajshahi extends AppCompatActivity {
    String[] places = {
            "Chalan Beel",
            "Mahasthangar Museum",
            "Padma River",
            "Paharpur",
            "Puthia",
            "Venedra Research Museum"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rajshahi);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lv_custom_layout,R.id.list_item, places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String places = (String) adapterView.getItemAtPosition(i);

                if (places == "Chalan Beel") {
                    Intent cb = new Intent(view.getContext(), RChalanBeel.class);
                    startActivity(cb);
                }
                if (places =="Mahasthangar Museum") {
                    Intent mm = new Intent(view.getContext(), RMahasthangar.class);
                    startActivity(mm);
                }
                if (places == "Padma River") {
                    Intent pr = new Intent(view.getContext(), RPadma.class);
                    startActivity(pr);
                }
                if (places =="Paharpur") {
                    Intent p = new Intent(view.getContext(), RPaharpur.class);
                    startActivity(p);
                }
                if (places =="Puthia") {
                    Intent pu = new Intent(view.getContext(), RPuthia.class);
                    startActivity(pu);
                }
                if (places =="Venedra Research Museum") {
                    Intent vrm = new Intent(view.getContext(), RaVRMuseum.class);
                    startActivity(vrm);
                }
            }
        });

    }
}
