package com.example.dagym_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Button button = (Button) findViewById(R.id.register1); // 버튼 객체 참조
        button.setOnClickListener(new View.OnClickListener() { // View에 리스너를 바로 구현
            @Override // 상속 받은 메소드(onclick) 변경
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResisterActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.find1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FindidActivity.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.find2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FindpwdActivity.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.d_button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}