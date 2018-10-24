package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Khulna extends AppCompatActivity {
    String[] places = {
            "Benapole",
            "Kuthi Bari",
            "Khan Jahan Ali Tomb",
            "Lalon Akhra",
            "Mujibnagar",
            "Mongla",
            "Nine Dombed Mosque",
            "Sixty Dombed Mosque",
            "Singar Mosque",
            "Shundarban"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.khulna);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lv_custom_layout,R.id.list_item, places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String places = (String) adapterView.getItemAtPosition(i);

                if (places == "Benapole") {
                    Intent b = new Intent(view.getContext(), KBenapole.class);
                    startActivity(b);
                }
                if (places =="Kuthi Bari") {
                    Intent hh = new Intent(view.getContext(), KKuthiBari.class);
                    startActivity(hh);
                }
                if (places == "Khan Jahan Ali Tomb") {
                    Intent j = new Intent(view.getContext(), KKJAliTomb.class);
                    startActivity(j);
                }
                if (places =="Lalon Akhra") {
                    Intent la = new Intent(view.getContext(), KLalonAkhra.class);
                    startActivity(la);
                }
                if (places =="Mujibnagar") {
                    Intent lnp = new Intent(view.getContext(), KMujibnagar.class);
                    startActivity(lnp);
                }
                if (places =="Mongla") {
                    Intent ltg = new Intent(view.getContext(), KMongla.class);
                    startActivity(ltg);
                }
                if (places =="Nine Dombed Mosque") {
                    Intent mw = new Intent(view.getContext(), KNMosque.class);
                    startActivity(mw);
                }
                if (places =="Sixty Dombed Mosque") {
                    Intent rsf = new Intent(view.getContext(), KSMosque.class);
                    startActivity(rsf);
                }
                if (places =="Singar Mosque") {
                    Intent s = new Intent(view.getContext(), SSrimangal.class);
                    startActivity(s);
                }
                if (places =="Shundarban") {
                    Intent th = new Intent(view.getContext(), STangur.class);
                    startActivity(th);
                }

            }
        });

    }
}
