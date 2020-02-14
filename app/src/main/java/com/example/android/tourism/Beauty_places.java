package com.example.android.tourism;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class  Beauty_places extends AppCompatActivity {

    String videoId="Aaq50GN9Oiw";
    String id5="BIDQ1NbhHns";
    String id4="ceLFxiv6ATA";
    String id3="lVCQqiu8rRI";
    String id2="GR33kj_0I7E";
    String id1="gaPJ8D365CY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_places);
        ImageView baba = (ImageView) findViewById(R.id.Baba);

        baba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of places", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v="+videoId));
                //intent.putExtra("VIDEO_ID",videoId);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);}


            }});

        ImageView nandan = (ImageView) findViewById(R.id.Nandan);

        nandan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of places", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v="+id1));
                //intent.putExtra("VIDEO_ID",videoId);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);}


            }});
        ImageView trikut = (ImageView) findViewById(R.id.Trikut);

        trikut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of places", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v="+id2));
                //intent.putExtra("VIDEO_ID",videoId);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);}


            }});
        ImageView naulakha = (ImageView) findViewById(R.id.Naulakha);

        naulakha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of places", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v="+id3));
                //intent.putExtra("VIDEO_ID",videoId);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);}


            }});


        ImageView impotance = (ImageView) findViewById(R.id.Babadarbar);

        impotance.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of places", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v="+id5));
                //intent.putExtra("VIDEO_ID",videoId);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);}


            }});
        ImageView tapowan = (ImageView) findViewById(R.id.Tapowan);

        tapowan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open the list of places", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v="+id4));
                //intent.putExtra("VIDEO_ID",videoId);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);}


            }});

    }
}


