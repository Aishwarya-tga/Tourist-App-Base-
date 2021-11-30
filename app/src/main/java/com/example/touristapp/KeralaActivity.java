package com.example.touristapp;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class KeralaActivity extends Activity {

    public static final String EXTRA_KERALAID = "keralaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);

        int keralaId = (Integer)getIntent().getExtras().get(EXTRA_KERALAID);
        Kerala keralas = Kerala.kerala[keralaId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(keralas.getName());

        TextView detail = (TextView) findViewById(R.id.detail);
        detail.setText(keralas.getDetail());

        TextView area = (TextView) findViewById(R.id.area);
        area.setText(keralas.getArea());

        TextView elevation = (TextView) findViewById(R.id.elevation);
        elevation.setText(keralas.getElevation());

        TextView type = (TextView) findViewById(R.id.type);
        type.setText(keralas.getType());

        TextView bttv = (TextView) findViewById(R.id.bttv);
        bttv.setText(keralas.getBttv());

        TextView dest = (TextView) findViewById(R.id.dest);
        dest.setText(keralas.getDest());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(keralas.getImageResourceId());
        photo.setContentDescription(keralas.getName());
    }
}