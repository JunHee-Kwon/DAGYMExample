package com.example.dagym_login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


public class RecordActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt1, bt2;
    FragmentManager fm;
    FragmentTransaction tran;
    Fragment frag1;
    Fragment frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

        frag1 = new Fragment(); // 프래그먼트 객체 생성
        frag2 = new Fragment(); // 프래그먼트 객체 생성
        setFrag(0); // 프래그먼트 교체
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.bt1:
                setFrag(0);
                break;
            case R.id.bt2:
                setFrag(1);
                break;
        }
    }
    public void setFrag(int n){    // 프래그먼트를 교체하는 작업을 하는 메소드 생성
        fm = getFragmentManager();
        tran = fm.beginTransaction();
        switch (n){
            case 0:
                tran.replace(R.id.main_frame, frag1);  //replace의 매개 변수: (프래그먼트를 담을 영역 id, 프래그먼트 객체)
                tran.commit();
                break;
            case 1:
                tran.replace(R.id.main_frame, frag2);  //replace의 매개 변수: (프래그먼트를 담을 영역 id, 프래그먼트 객체)
                tran.commit();
                break;
        }
    }
}