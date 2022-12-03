package com.souravshah.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
setupList();
}

    private void setupList() {
        BucketListEntry[] thingsToDo = {
            new BucketListEntry("climb mt killimanjaro","Do it the hard way",R.drawable.kilimanjaro,5),
                new BucketListEntry("exprience Northen lights ","Somewhere in artic circle",R.drawable.northern_lights,5),
                new BucketListEntry("Road Trip across USA ","hire a car from the west course of amesrica ",R.drawable.road_trip,3.5f),
                new BucketListEntry("Scubadive","In Koh Tao , Thailand",R.drawable.scubadive,4.5f),
                new BucketListEntry("Skydiving","in dubai",R.drawable.skydive,5)
        };
        RecyclerView recyclerView = findViewById(R.id.Recycler_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
    }