package com.example.touristapp;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.AdapterView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                if (position ==0) {
                    Intent intent = new Intent(MainActivity.this, KeralaCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==1) {
                    Intent intent = new Intent(MainActivity.this, TamilCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==2) {
                    Intent intent = new Intent(MainActivity.this, RajasthanCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==3) {
                    Intent intent = new Intent(MainActivity.this, UttarCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==4) {
                    Intent intent = new Intent(MainActivity.this, DelhiCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==5) {
                    Intent intent = new Intent(MainActivity.this, PunjabCategoryActivity.class);
                    startActivity(intent);
                }
                if(position ==6) {
                    Intent intent = new Intent(MainActivity.this,GoaCategoryActivity.class);
                    startActivity(intent);
                }

            }

        };

        ListView listView = (ListView) findViewById (R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}