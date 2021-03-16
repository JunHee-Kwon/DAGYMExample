package com.example.dagym_login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InbodyActivity extends AppCompatActivity {

    // 현재 시간을 msec로 구한다.
    long now = System.currentTimeMillis();

    // 현재 시간을 date 변수에 저장한다.
    Date date = new Date(now);

    // 시간을 나타낼 포맷을 정한다.
    SimpleDateFormat sdfNow = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");

    // nowDate 변수에 값을 저장한다.
    String formatDate = sdfNow.format(date);

    TextView dateNow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbody_fragment);

        dateNow = (TextView) findViewById(R.id.dateNow);
        dateNow.setText(formatDate); // TextView에 현재 시간 문자열 할당
    }
}

