package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Dhaka extends AppCompatActivity {
    String[] places = {
            "Ahsan Manzil",
            "Dhakeshwari Temple",
            "Gazipur Safari Park",
            "Lalbagh Fort",
            "Libaration War Museum",
            "National Museum",
            "National Parliament House",
            "National Martyr's Monument",
            "Ramna Park",
            "Star Mosque",
            "Taj Mahal"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhaka);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lv_custom_layout,R.id.list_item, places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String places = (String) adapterView.getItemAtPosition(i);

                if (places == "Ahsan Manzil") {
                    Intent am = new Intent(view.getContext(), DAManzil.class);
                    startActivity(am);
                }
                if (places == "Dhakeshwari Temple") {
                    Intent dt = new Intent(view.getContext(), DDhakeshwari.class);
                    startActivity(dt);
                }
                if (places == "Gazipur Safari Park") {
                    Intent gsp = new Intent(view.getContext(), DSafaripark.class);
                    startActivity(gsp);
                }
                if (places == "Lalbagh Fort") {
                    Intent lf = new Intent(view.getContext(), DLalbagh.class);
                    startActivity(lf);
                }
                if (places =="Libaration War Museum") {
                    Intent lwm = new Intent(view.getContext(), DLMuseum.class);
                    startActivity(lwm);
                }
                if (places == "National Museum") {
                    Intent nm = new Intent(view.getContext(), DNMuseum.class);
                    startActivity(nm);
                }
                if (places ==  "National Parliament House") {
                    Intent nph = new Intent(view.getContext(), DNPHouse.class);
                    startActivity(nph);
                }
                if (places == "National Martyr's Monument") {
                    Intent nmm = new Intent(view.getContext(), DNMMonument.class);
                    startActivity(nmm);
                }
                if (places =="Ramna Park") {
                    Intent rp = new Intent(view.getContext(), DRamna.class);
                    startActivity(rp);
                }
                if (places == "Star Mosque") {
                    Intent sm = new Intent(view.getContext(), DStarMosque.class);
                    startActivity(sm);
                }
                if (places == "Taj Mahal") {
                    Intent tm = new Intent(view.getContext(), DTaj.class);
                    startActivity(tm);
                }


            }
        });

    }
}
