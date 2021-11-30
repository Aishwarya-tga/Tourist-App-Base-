package com.example.touristapp;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class UttarActivity extends Activity {

    public static final String EXTRA_UTTARID = "uttarId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttar);
        int uttarId = (Integer)getIntent().getExtras().get(EXTRA_UTTARID);
        Uttar uttars = Uttar.uttar[uttarId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(uttars.getName());

        TextView detail = (TextView) findViewById(R.id.detail);
        detail.setText(uttars.getDetail());

        TextView area = (TextView) findViewById(R.id.area);
        area.setText(uttars.getArea());

        TextView elevation = (TextView) findViewById(R.id.elevation);
        elevation.setText(uttars.getElevation());

        TextView type = (TextView) findViewById(R.id.type);
        type.setText(uttars.getType());

        TextView bttv = (TextView) findViewById(R.id.bttv);
        bttv.setText(uttars.getBttv());

        TextView dest = (TextView) findViewById(R.id.dest);
        dest.setText(uttars.getDest());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(uttars.getImageResourceId());
        photo.setContentDescription(uttars.getName());
    }


}