package com.example.touristapp;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Button;


public class TamilActivity extends Activity {

    public static final String EXTRA_TAMILID = "tamilId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil);

        int tamilId = (Integer) getIntent().getExtras().get(EXTRA_TAMILID);
        Tamil tamils = Tamil.tamil[tamilId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(tamils.getName());

        TextView detail = (TextView) findViewById(R.id.detail);
        detail.setText(tamils.getDetail());

        TextView area = (TextView) findViewById(R.id.area);
        area.setText(tamils.getArea());

        TextView elevation = (TextView) findViewById(R.id.elevation);
        elevation.setText(tamils.getElevation());

        TextView type = (TextView) findViewById(R.id.type);
        type.setText(tamils.getType());

        TextView bttv = (TextView) findViewById(R.id.bttv);
        bttv.setText(tamils.getBttv());

        TextView dest = (TextView) findViewById(R.id.dest);
        dest.setText(tamils.getDest());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(tamils.getImageResourceId());
        photo.setContentDescription(tamils.getName());

    }

}