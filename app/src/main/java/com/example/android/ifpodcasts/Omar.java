package com.example.android.ifpodcasts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Omar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture_list);
        Button library = (Button) findViewById(R.id.library);
        ArrayList<Lecture> lectures = new ArrayList<Lecture>();
        lectures.add(new Lecture("Sukuk role in balancing governmental budget deficit", "33:50", R.drawable.ic_play_circle_filled));
        lectures.add(new Lecture("AAOIFI Accounting Standards for Islamic finance institutions", "1:02:35", R.drawable.ic_play_circle_filled));
        lectures.add(new Lecture("Mudaraba role in financing corporate deals", "55:08", R.drawable.ic_play_circle_filled));
        lectures.add(new Lecture("Islamic Takaful: objective analysis", "1:06:54", R.drawable.ic_play_circle_filled));
        LectureAdapter adapter = new LectureAdapter(this, lectures);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent library = new Intent(Omar.this, MainActivity.class);
                startActivity(library);
            }
        });
    }
}
