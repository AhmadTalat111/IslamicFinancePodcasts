package com.example.android.ifpodcasts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Hussein extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture_list);
        ArrayList<Lecture> lectures = new ArrayList<Lecture>();
        lectures.add(new Lecture("Realstate Sukuk Structures in Dubai", "33:50", R.drawable.ic_play_circle_filled));
        lectures.add(new Lecture("Sharia philosophy in replacing usury with sale and its modern applications", "1:02:35", R.drawable.ic_play_circle_filled));
        lectures.add(new Lecture("AAOIFI standards in light of the most recent economic developments", "55:08", R.drawable.ic_play_circle_filled));
        lectures.add(new Lecture("Overdraft and its Islamic finance alternatives", "1:06:54", R.drawable.ic_play_circle_filled));
        LectureAdapter adapter = new LectureAdapter(this, lectures);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        Button library = (Button) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent library = new Intent(Hussein.this, MainActivity.class);
                startActivity(library);
            }
        });
    }
}
