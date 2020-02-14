package com.example.android.tourism;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class View_Flipper extends AppCompatActivity {


    private ViewFlipper simpleViewFlipper;
    int[] images = {R.drawable.deoghar, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five};     // array of images

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_places);


        // get The references of ViewFlipper
        simpleViewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper); // get the reference of ViewFlipper

        // loop for creating ImageView's
        for (int i = 0; i < images.length; i++)

        {
            // create the object of ImageView
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(images[i]); // set image in ImageView
            simpleViewFlipper.addView(imageView); // add the created ImageView in ViewFlipper
        }

        // Declare in and out animations and load them using AnimationUtils class
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        // set the animation type's to ViewFlipper
        simpleViewFlipper.setInAnimation(in);
        simpleViewFlipper.setOutAnimation(out);
        // set interval time for flipping between views
        simpleViewFlipper.setFlipInterval(2000);
        // set auto start for flipping between views
        simpleViewFlipper.setAutoStart(true);

        TextView places = (TextView) findViewById(R.id.Places);
        places.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "Open the list of places", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(View_Flipper.this, Beauty_places.class);
                startActivity(i);
            }
        });


        TextView hot = (TextView) findViewById(R.id.Hot);
        hot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "Open the list of hotels", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(View_Flipper.this, Hotels.class);
                startActivity(i);
            }
        });

        TextView shop = (TextView) findViewById(R.id.Shops);
        shop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "Open the list of hotels", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(View_Flipper.this, Shopsname.class);
                startActivity(i);
            }
        });
    }
}





