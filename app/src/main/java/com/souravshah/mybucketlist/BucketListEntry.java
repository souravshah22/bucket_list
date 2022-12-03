package com.souravshah.mybucketlist;

import android.media.Rating;

import androidx.annotation.DrawableRes;

public class BucketListEntry {

    String heading;
    String description;
    int image;
    float Rating;

    public BucketListEntry(String heading, String description, @DrawableRes int image, float rating) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.Rating = rating;
    }
}
