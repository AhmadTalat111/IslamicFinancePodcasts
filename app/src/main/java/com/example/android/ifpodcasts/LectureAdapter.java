package com.example.android.ifpodcasts;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LectureAdapter extends ArrayAdapter <Lecture> {
    public LectureAdapter (Activity context, ArrayList<Lecture> lectures){
        super(context, 0, lectures);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Lecture currentLecture = getItem(position);

        TextView lectureInfo = (TextView) listItemView.findViewById(R.id.lecture_title);
        lectureInfo.setText(currentLecture.getLectureInfo());

        TextView lectureDuration = (TextView) listItemView.findViewById(R.id.duration);
        lectureDuration.setText(currentLecture.getLectureDuration());

        ImageView playButton = (ImageView) listItemView.findViewById(R.id.play);
        playButton.setImageResource(currentLecture.getPlayButton());

        return listItemView;    }
}