package com.natidze.irakli.assign2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.natidze.irakli.assign2.model.PlayerModel;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        PlayerModel detailsPlayer = (PlayerModel) getIntent().getExtras().getSerializable("player");

        TextView detailsText = (TextView) findViewById(R.id.detailsText);
        detailsText.setText(detailsPlayer.getName());

        ImageView detailsImage = (ImageView) findViewById(R.id.detailsImage);
        Picasso.with(this).load(detailsPlayer.getImage()).resize(150,120).centerCrop().into(detailsImage);

        TextView detailsDescription = (TextView) findViewById(R.id.detailsDescriptionText);
        detailsDescription.setText(detailsPlayer.getDescription());

    }
}
