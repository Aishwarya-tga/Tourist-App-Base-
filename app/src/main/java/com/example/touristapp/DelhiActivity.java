package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DelhiActivity extends Activity {

    public static final String EXTRA_DELHIID = "delhiId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
        int delhiId = (Integer)getIntent().getExtras().get(EXTRA_DELHIID);
        Delhi delhis = Delhi.delhi[delhiId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(delhis.getName());

        TextView detail = (TextView) findViewById(R.id.detail);
        detail.setText(delhis.getDetail());

        TextView area = (TextView) findViewById(R.id.area);
        area.setText(delhis.getArea());

        TextView height = (TextView) findViewById(R.id.height);
        height.setText(delhis.getHeight());

        TextView type = (TextView) findViewById(R.id.type);
        type.setText(delhis.getType());

        TextView bttv = (TextView) findViewById(R.id.bttv);
        bttv.setText(delhis.getBttv());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(delhis.getImageResourceId());
        photo.setContentDescription(delhis.getName());
    }
}