package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class GoaCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa_category);
        ArrayAdapter<Goa> listAdapter = new ArrayAdapter<> (
                this,
                android.R.layout.simple_list_item_1,
                Goa.goa);
        ListView listgoa= (ListView) findViewById(R.id.list_goa);
        listgoa.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listgoa,
                                    View itemView,
                                    int position,
                                    long id) {
                Intent intent = new Intent(GoaCategoryActivity.this,GoaActivity.class);
                intent.putExtra(GoaActivity.EXTRA_GOAID,(int) id);
                startActivity(intent);
            }
        };

        listgoa.setOnItemClickListener(itemClickListener);
    }

}