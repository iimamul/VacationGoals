package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mymensing extends AppCompatActivity {
    String[] places = {
            "Bangladesh Agricultural University",
            "Birisiri",
            "Gajani",
            "Jalchhatra",
            "Orchid Garden",
            "Strawberry Garden",
            "Susong Durgapur and Bijoypur"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymensing);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lv_custom_layout,R.id.list_item, places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String places = (String) adapterView.getItemAtPosition(i);

                if (places ==  "Bangladesh Agricultural University") {
                    Intent b = new Intent(view.getContext(), MBAU.class);
                    startActivity(b);
                }
                if (places ==  "Birisiri") {
                    Intent hh = new Intent(view.getContext(), MBirisiri.class);
                    startActivity(hh);
                }
                if (places == "Gajani") {
                    Intent j = new Intent(view.getContext(), MGajani.class);
                    startActivity(j);
                }
                if (places == "Jalchhatra") {
                    Intent la = new Intent(view.getContext(), MJalchhatra.class);
                    startActivity(la);
                }
                if (places == "Orchid Garden") {
                    Intent lnp = new Intent(view.getContext(), MOGarden.class);
                    startActivity(lnp);
                }
                if (places == "Strawberry Garden") {
                    Intent ltg = new Intent(view.getContext(), MSGarden.class);
                    startActivity(ltg);
                }
                if (places == "Susong Durgapur and Bijoypur") {
                    Intent mw = new Intent(view.getContext(), MSusong.class);
                    startActivity(mw);
                }


            }
        });

    }
}
