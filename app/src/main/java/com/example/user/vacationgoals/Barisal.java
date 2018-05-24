package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Barisal extends AppCompatActivity {
    String[] places = {

            "Buddhist Temple",
            "Kuakata"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barisal);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lv_custom_layout,R.id.list_item, places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String places = (String) adapterView.getItemAtPosition(i);

                if (places == "Buddhist Temple") {
                    Intent bt = new Intent(view.getContext(), BBuddhistTemple.class);
                    startActivity(bt);
                }
                if (places == "Kuakata") {
                    Intent k = new Intent(view.getContext(), BKuakata.class);
                    startActivity(k);
                }

            }
        });

    }
}
