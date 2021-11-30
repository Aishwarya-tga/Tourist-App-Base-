package com.example.touristapp;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView;
import android.content.Intent;
import android.os.Bundle;

public class RajasthanCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan_category);
        ArrayAdapter<Rajasthan> listAdapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            Rajasthan.rajasthan);

        ListView listrajasthan = (ListView) findViewById(R.id.list_rajasthan);
        listrajasthan.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listrajasthan,
                                    View itemView,
                                    int position,
                                    long id) {
                Intent intent = new Intent(RajasthanCategoryActivity.this , RajasthanActivity.class);
                intent.putExtra(RajasthanActivity.EXTRA_RAJASTHANID,(int) id);
                startActivity(intent);
            }


        };

        listrajasthan.setOnItemClickListener(itemClickListener);

    }
}