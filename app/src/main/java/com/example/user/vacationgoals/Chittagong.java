package com.example.user.vacationgoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chittagong extends AppCompatActivity {
    String[] places = {

            "Bandarban",
            "Cox's Bazar",
            "Inani Sea Beach",
            "Kaptai",
            "Nijhum Island",
            "Patenga Sea Beach",
            "Rangamati",
            "Sajek ",
            "Saint Martin",
            "Shitakundo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chittagong);

        final ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.lv_custom_layout,R.id.list_item,places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String places = (String) adapterView.getItemAtPosition(i);


                if(places == "Bandarban"){
                    Intent b=new Intent(view.getContext(),CBandarban.class);
                    startActivity(b);
                }
                if(places == "Cox's Bazar"){
                    Intent cb=new Intent(view.getContext(),CCxbazar.class);
                    startActivity(cb);
                }
                if(places == "Inani Sea Beach"){
                    Intent isb=new Intent(view.getContext(),CInani.class);
                    startActivity(isb);
                }
                if(places == "Kaptai"){
                    Intent k=new Intent(view.getContext(),CKaptai.class);
                    startActivity(k);
                }
                if(places == "Nijhum Island"){
                    Intent ni=new Intent(view.getContext(),CNijhum.class);
                    startActivity(ni);
                }
                if(places == "Patenga Sea Beach"){
                    Intent p=new Intent(view.getContext(),CPatenga.class);
                    startActivity(p);
                }
                if(places == "Rangamati"){
                    Intent r=new Intent(view.getContext(),CRangamati.class);
                    startActivity(r);
                }
                if(places == "Sajek "){
                    Intent s=new Intent(view.getContext(),CSajek.class);
                    startActivity(s);
                }
                if(places == "Saint Martin"){
                    Intent sm=new Intent(view.getContext(),CStmartin.class);
                    startActivity(sm);
                }
                if(places == "Shitakundo"){
                    Intent sk=new Intent(view.getContext(),CShitakundo.class);
                    startActivity(sk);
                }


            }


        });
    }
}
