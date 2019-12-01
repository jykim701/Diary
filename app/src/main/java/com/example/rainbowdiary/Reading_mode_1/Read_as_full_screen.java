package com.example.rainbowdiary.Reading_mode_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.rainbowdiary.R;

public class Read_as_full_screen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_read_as_full_screen);
    }
}
//weekly에서 일기를 열어볼 경우 일기를 작성하는 것이 아닌 일기를 보는 용도이기 때문에 상태 바를 표시하지 않고 풀 스크린으로 다이어리를 볼 수 있도록 한다.
