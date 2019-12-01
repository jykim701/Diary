package com.example.rainbowdiary.GridView_sticker_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.rainbowdiary.R;


public class GridView_sticker_1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_sticker_1);

        GridView gridview = (GridView)findViewById(R.id.gridview_weekly);
        gridview.setAdapter(new ImageAdapter(this));
    }
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_sticker_1);
    }
}
