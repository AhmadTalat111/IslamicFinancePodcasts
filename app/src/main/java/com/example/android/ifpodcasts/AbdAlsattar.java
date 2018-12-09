package com.example.android.ifpodcasts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AbdAlsattar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture_list);
        ArrayList<Lecture> lectures = new ArrayList<Lecture>();
        lectures.add(new Lecture( "Treasury bonds alternatives in Islamic Finance","33:50",R.drawable.play));
        lectures.add(new Lecture( "Sukuk applications in Dubai","1:02:35",R.drawable.play));
        lectures.add(new Lecture( "Standardization in Islamic Finance","55:08",R.drawable.play));
        lectures.add(new Lecture( "Conversion of conventional Banks to Islamic Banks","1:06:54",R.drawable.play));
        LectureAdapter adapter = new LectureAdapter(this, lectures);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        Button library = (Button) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent library = new Intent(AbdAlsattar.this, MainActivity.class);
                startActivity(library);
            }
        });
    }
}
