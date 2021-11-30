package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DelhiCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi_category);
        ArrayAdapter<Delhi> listAdapter = new ArrayAdapter<> (
                this,
                android.R.layout.simple_list_item_1,
                Delhi.delhi);
        ListView listdelhi= (ListView) findViewById(R.id.list_delhi);
        listdelhi.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listdelhi,
                                    View itemView,
                                    int position,
                                    long id) {
                Intent intent = new Intent(DelhiCategoryActivity.this,DelhiActivity.class);
                intent.putExtra(DelhiActivity.EXTRA_DELHIID,(int) id);
                startActivity(intent);
            }
        };

        listdelhi.setOnItemClickListener(itemClickListener);
    }

}