package com.example.touristapp;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KeralaCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala_category);
        ArrayAdapter<Kerala> listAdapter = new ArrayAdapter<> (
                this,
                android.R.layout.simple_list_item_1,
                Kerala.kerala);
        ListView listkerala= (ListView) findViewById(R.id.list_kerala);
        listkerala.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listkerala,
                                    View itemView,
                                    int position,
                                    long id) {
                Intent intent = new Intent(KeralaCategoryActivity.this,KeralaActivity.class);
                intent.putExtra(KeralaActivity.EXTRA_KERALAID,(int) id);
                startActivity(intent);
            }
        };

        listkerala.setOnItemClickListener(itemClickListener);
    }
}