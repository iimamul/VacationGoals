package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.common.api.GoogleApiClient;

public class Sylhet extends AppCompatActivity {

    String[] places = {

            "Bisnakandi",
            "Hakaluki Haor",
            "Jaflong",
            "Lalakhal",
            "Lawachara National Park",
            "Lakkatura Tea Garden",
            "Madhabkunda waterfall",
            "Ratarkul Swamp Forest",
            "Srimangal",
            "Tangur Haor"
    };
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sylhet);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lv_custom_layout,R.id.list_item, places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String places = (String) adapterView.getItemAtPosition(i);

                if (places == "Bisnakandi") {
                    Intent b = new Intent(view.getContext(), SBisnakandi.class);
                    startActivity(b);
                }
                if (places == "Hakaluki Haor") {
                    Intent hh = new Intent(view.getContext(), CHakaluki.class);
                    startActivity(hh);
                }
                if (places == "Jaflong") {
                    Intent j = new Intent(view.getContext(), SJaflong.class);
                    startActivity(j);
                }
                if (places == "Lalakhal") {
                    Intent la = new Intent(view.getContext(), SLalakhal.class);
                    startActivity(la);
                }
                if (places == "Lawachara National Park") {
                    Intent lnp = new Intent(view.getContext(), SLawachara.class);
                    startActivity(lnp);
                }
                if (places == "Lakkatura Tea Garden") {
                    Intent ltg = new Intent(view.getContext(), SLakkatura.class);
                    startActivity(ltg);
                }
                if (places == "Madhabkunda waterfall") {
                    Intent mw = new Intent(view.getContext(), SMadhabkunda.class);
                    startActivity(mw);
                }
                if (places == "Ratarkul Swamp Forest") {
                    Intent rsf = new Intent(view.getContext(), SRatarkul.class);
                    startActivity(rsf);
                }
                if (places == "Srimangal") {
                    Intent s = new Intent(view.getContext(), SSrimangal.class);
                    startActivity(s);
                }
                if (places == "Tangur Haor") {
                    Intent th = new Intent(view.getContext(), STangur.class);
                    startActivity(th);
                }

            }
        });


    }
}
