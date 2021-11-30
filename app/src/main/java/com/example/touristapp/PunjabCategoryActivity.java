package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PunjabCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab_category);
        ArrayAdapter<Punjab> listAdapter = new ArrayAdapter<> (
                this,
                android.R.layout.simple_list_item_1,
                Punjab.punjab);
        ListView listpunjab= (ListView) findViewById(R.id.list_punjab);
        listpunjab.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listpunjab,
                                    View itemView,
                                    int position,
                                    long id) {
                Intent intent = new Intent(PunjabCategoryActivity.this,PunjabActivity.class);
                intent.putExtra(PunjabActivity.EXTRA_PUNJABID,(int) id);
                startActivity(intent);
            }
        };

        listpunjab.setOnItemClickListener(itemClickListener);
    }


}