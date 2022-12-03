package com.souravshah.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupLIst();
    }

    private void setupLIst() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("THE AMAZONS ", "try to survive the wild ", R.drawable.amazon, 5),
                new BucketListEntry("ICELAND ", "dynjandi waterfall ,may be the northern lights too", R.drawable.iceland, 5),
                new BucketListEntry("JAPAN", "Hot Springs , SUSHIS ", R.drawable.japan, 4.5f),
                new BucketListEntry("KERALA", "Try various flavours of tea", R.drawable.kerala, 3.5f),
                new BucketListEntry("VIETNAM", "Con Dao islands ", R.drawable.vietnam, 5)
        };
        RecyclerView recyclerView = findViewById(R.id.Recycler_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }


}