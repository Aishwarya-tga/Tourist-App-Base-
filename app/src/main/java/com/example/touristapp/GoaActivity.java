package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class GoaActivity extends AppCompatActivity {

    public static final String EXTRA_GOAID = "goaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

        int goaId = (Integer)getIntent().getExtras().get(EXTRA_GOAID);
        Goa goas = Goa.goa[goaId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(goas.getName());

        TextView detail = (TextView) findViewById(R.id.detail);
        detail.setText(goas.getDetail());

        TextView area = (TextView) findViewById(R.id.area);
        area.setText(goas.getArea());

        TextView elevation = (TextView) findViewById(R.id.elevation);
        elevation.setText(goas.getElevation());

        TextView type = (TextView) findViewById(R.id.type);
        type.setText(goas.getType());

        TextView bttv = (TextView) findViewById(R.id.bttv);
        bttv.setText(goas.getBttv());

        TextView dest = (TextView) findViewById(R.id.dest);
        dest.setText(goas.getDest());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(goas.getImageResourceId());
        photo.setContentDescription(goas.getName());


    }
}