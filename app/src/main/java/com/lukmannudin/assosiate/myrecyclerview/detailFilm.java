package com.lukmannudin.assosiate.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class detailFilm extends AppCompatActivity {
    TextView titleFilm,yearFilm,descriptionFilm;
    ImageView photoFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_film);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        titleFilm = findViewById(R.id.tvFilmTitle);
        yearFilm = findViewById(R.id.tvFilmYear);
        descriptionFilm = findViewById(R.id.tvFilmDescription);
        photoFilm = findViewById(R.id.imgTitleFilm);

        Intent intent = getIntent();
        titleFilm.setText(intent.getStringExtra(Utils.FILM_NAME));
        yearFilm.setText(intent.getStringExtra(Utils.YEAR));
        descriptionFilm.setText(intent.getStringExtra(Utils.FILM_DESCRIPTION));
        Glide.with(this)
                .load(intent.getStringExtra(Utils.PHOTO))
                .into(photoFilm);
    }
}
