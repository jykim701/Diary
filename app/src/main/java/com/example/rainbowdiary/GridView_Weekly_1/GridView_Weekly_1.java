package com.example.rainbowdiary.GridView_Weekly_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.rainbowdiary.R;

public class GridView_Weekly_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view__weekly_1);

        GridView gridview = (GridView)findViewById(R.id.gridview_weekly);
        gridview.setAdapter(new ImageAdapter(this));
    }
}
