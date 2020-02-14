package com.example.android.tourism;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Shopsname extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopsname);
        ArrayList<Word> words  = new ArrayList<Word>();

        //storing words in string
        words.add(new Word("Mahaver peda bhandar","rating - 5*",R.drawable.mithai));
        words.add(new Word("shivam peda bhandar","rating -4*",R.drawable.id2));
        words.add(new Word("shri shyam peda bhandar","rating -4*",R.drawable.id3));
        words.add(new Word("sudha peda bhandar","rating -4*",R.drawable.id4));
        words.add(new Word("awantika sweet shop","rating -3*",R.drawable.id5));
        words.add(new Word("gourang sweets","rating -5*",R.drawable.id6));
        words.add(new Word("Maa plaza","rating -5*",R.drawable.id7));
        words.add(new Word("tibre baba dahi dukan","rating -5*",R.drawable.id8));


        WordAdapter adapter= new WordAdapter(this, words, R.color.category_phrases);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Shopsname.this, "Showing in map", Toast.LENGTH_SHORT).show();

                if (position == 0) {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=Mahadev+peda+Bhandar,+Deoghar+Jharkhand+India");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }

                if (position == 1) {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=Shivam+peda+Bhandar,+Deoghar+Jharkhand+India");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }

                if (position == 2) {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=Shri+shyam+peda+Bhandar,+Deoghar+Jharkhand+India");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }

                if (position == 3) {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=sudha+peda+Bhandar,+Deoghar+Jharkhand+India");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }

                if (position == 4) {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=Awantika,+Deoghar+Jharkhand+India");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }

                if (position == 5) {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=Gourang+sweet,+Deoghar+Jharkhand+India");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }

                if (position == 6) {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=Maa+plaza,+Deoghar+Jharkhand+India");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }

                if (position == 7) {


                    Uri gmmIntentUri = Uri.parse("google.navigation:q=Lakshmi+pur+chowk,+Deoghar+Jharkhand+India");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }
            }

        });
    }

}
