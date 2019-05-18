package com.example.vrushabh.rating_bar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar ratingbar = (RatingBar) findViewById(R.id.ratingbar);
        ratingbar.setOnRatingBarChangeListener(this);
    }
    public void onRatingChanged(RatingBar ratingBar, float rating,boolean fromUser) {
        Toast.makeText(MainActivity.this, "Thank You For Rating us : " + rating,
                Toast.LENGTH_SHORT).show();
    }
}
