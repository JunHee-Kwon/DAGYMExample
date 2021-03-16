package com.example.dagym_login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class RecordActivity extends AppCompatActivity implements View.OnClickListener{
    FragmentManager manager;
    FragmentTransaction ft;

    ExFragment frag1;
    KcalFragment frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        manager = getSupportFragmentManager();

        Button b1 = findViewById(R.id.bt1);
        Button b2 = findViewById(R.id.bt2);

        frag1 = new ExFragment();
        frag2 = new KcalFragment();

        ft = manager.beginTransaction();
        ft.add(R.id.main_frame, frag1);
        ft.addToBackStack(null);
        ft.commit();

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ft = manager.beginTransaction();

        int id = v.getId();
        switch (id) {
            case R.id.bt1:
                ft.replace(R.id.main_frame, frag1);
                ft.commit();
                break;
            case R.id.bt2:
                ft.replace(R.id.main_frame, frag2);
                ft.commit();
                break;
        }
    }
}