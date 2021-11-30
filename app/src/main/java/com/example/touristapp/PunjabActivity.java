package com.example.touristapp;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class PunjabActivity extends Activity {

    public static final String EXTRA_PUNJABID = "punjabId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);

        int punjabId = (Integer)getIntent().getExtras().get(EXTRA_PUNJABID);
        Punjab punjabs = Punjab.punjab[punjabId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(punjabs.getName());

        TextView detail = (TextView) findViewById(R.id.detail);
        detail.setText(punjabs.getDetail());

        TextView area = (TextView) findViewById(R.id.area);
        area.setText(punjabs.getArea());

        TextView elevation = (TextView) findViewById(R.id.elevation);
        elevation.setText(punjabs.getElevation());

        TextView type = (TextView) findViewById(R.id.type);
        type.setText(punjabs.getType());

        TextView bttv = (TextView) findViewById(R.id.bttv);
        bttv.setText(punjabs.getBttv());

        TextView dest = (TextView) findViewById(R.id.dest);
        dest.setText(punjabs.getDest());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(punjabs.getImageResourceId());
        photo.setContentDescription(punjabs.getName());

    }
}