package com.example.android.ifpodcasts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView AbdAlsattar = (TextView) findViewById(R.id.sattar);
        AbdAlsattar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SattarIntent = new Intent(MainActivity.this, AbdAlsattar.class);
                startActivity(SattarIntent);
            }
        });
        TextView Hussein = (TextView) findViewById(R.id.Hussein);
        Hussein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HusseinIntent = new Intent(MainActivity.this, Hussein.class);
                startActivity(HusseinIntent);
            }
        });
        TextView Omar = (TextView) findViewById(R.id.Omar);
        Omar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent OmarIntent = new Intent(MainActivity.this, Omar.class);
                startActivity(OmarIntent);
            }
        });

    }
}
