package com.example.touristapp;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class TamilCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_category);
        ArrayAdapter<Tamil> listAdapter = new ArrayAdapter<> (
                this,
                android.R.layout.simple_list_item_1,
                Tamil.tamil);
        ListView listtamil = (ListView) findViewById(R.id.list_tamil);
        listtamil.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listtamil,
                                        View itemView,
                                        int position,
                                        long id) {
                Intent intent = new Intent(TamilCategoryActivity.this, TamilActivity.class);
                intent.putExtra(TamilActivity.EXTRA_TAMILID,(int) id);
                startActivity(intent);

            }
        };

        listtamil.setOnItemClickListener(itemClickListener);



    }
}