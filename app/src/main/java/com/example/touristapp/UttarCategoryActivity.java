package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UttarCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttar_category);
        ArrayAdapter<Uttar> listAdapter = new ArrayAdapter<> (
                this,
                android.R.layout.simple_list_item_1,
                Uttar.uttar);
        ListView listuttar= (ListView) findViewById(R.id.list_uttar);
        listuttar.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listuttar,
                                    View itemView,
                                    int position,
                                    long id) {
                Intent intent = new Intent(UttarCategoryActivity.this,UttarActivity.class);
                intent.putExtra(UttarActivity.EXTRA_UTTARID,(int) id);
                startActivity(intent);
            }
        };

        listuttar.setOnItemClickListener(itemClickListener);
    }

}