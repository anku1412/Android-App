package com.example.android.tourism;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Hotels extends AppCompatActivity {

   // String id = "24.4929124,86.6568561,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x39f116289b68023d:0x1e75ead288bd5c59!2m2!1d86.6918757!2d24.4929164";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        ImageView rame = (ImageView)findViewById(R.id.rame);

        rame.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening in google map", Toast.LENGTH_SHORT).show();



                Uri gmmIntentUri = Uri.parse("google.navigation:q=Hotel+Rameshwaram,+Deoghar+Jharkhand+India");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }});

        ImageView amar = (ImageView)findViewById(R.id.amar);

        amar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening in google map", Toast.LENGTH_SHORT).show();



                Uri gmmIntentUri = Uri.parse("google.navigation:q=Hotel+amarpali,+Deoghar+Jharkhand+India");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);




            }});
        ImageView baid = (ImageView)findViewById(R.id.Baid);

        baid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening in google map", Toast.LENGTH_SHORT).show();



                Uri gmmIntentUri = Uri.parse("google.navigation:q=Hotel+Baidyanath,+Deoghar+Jharkhand+India");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);




            }});
        ImageView maha = (ImageView)findViewById(R.id.maha);

        maha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening in google map", Toast.LENGTH_SHORT).show();



                Uri gmmIntentUri = Uri.parse("google.navigation:q=Hotel+amarpali,+Deoghar+Jharkhand+India");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);




            }});

    }

}
