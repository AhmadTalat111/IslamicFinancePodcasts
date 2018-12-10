package com.example.android.ifpodcasts;

public class Lecture {
    private String mLectureInfo;
    private String mLectureDuration;
    private int mPlayButton;

    public Lecture(String lectureInfo, String lectureDuration, int playButton) {
        mLectureInfo = lectureInfo;
        mLectureDuration = lectureDuration;
        mPlayButton = playButton;
    }

    public String getLectureInfo() {
        return mLectureInfo;
    }

    public String getLectureDuration() {
        return mLectureDuration;
    }

    public int getPlayButton() {
        return mPlayButton;
    }
}
