package com.example.touristapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RajasthanActivity extends Activity {

    public static final String EXTRA_RAJASTHANID = "rajasthanId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);

        int rajasthanId = (Integer)getIntent().getExtras().get(EXTRA_RAJASTHANID);
        Rajasthan rajasthans = Rajasthan.rajasthan[rajasthanId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(rajasthans.getName());

        TextView detail = (TextView) findViewById(R.id.detail);
        detail.setText(rajasthans.getDetail());

        TextView area = (TextView) findViewById(R.id.area);
        area.setText(rajasthans.getArea());

        TextView elevation = (TextView) findViewById(R.id.elevation);
        elevation.setText(rajasthans.getElevation());

        TextView type = (TextView) findViewById(R.id.type);
        type.setText(rajasthans.getType());

        TextView bttv = (TextView) findViewById(R.id.bttv);
        bttv.setText(rajasthans.getBttv());

        TextView dest = (TextView) findViewById(R.id.dest);
        dest.setText(rajasthans.getDest());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(rajasthans.getImageResourceId());
        photo.setContentDescription(rajasthans.getName());
    }
}