package com.example.dagym_login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.EventLogTags;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {
    ArrayList writing;
    int x;
    int y;

    PieChart pieChart;
    PieChart pieToChart;
    int[] colorArray = new int[]{Color.LTGRAY, Color.BLUE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(Main2Activity.this, "" + year + "/" + (month + 1) + "/" + dayOfMonth, 0).show();
            }
        });

        pieChart = findViewById(R.id.picChart);
        pieToChart = findViewById(R.id.picChart2);

        PieDataSet pieDataSet = new PieDataSet(data1(), "");
        pieDataSet.setColors(colorArray);
        PieData pieData = new PieData(pieDataSet);
        pieChart.setDrawEntryLabels(true);
        pieChart.setUsePercentValues(true);
        pieChart.setHoleRadius(30);

        pieChart.setData(pieData);
        pieChart.invalidate();

        Description description = new Description();
        description.setText("총 운동 시간");
        description.setTextSize(12);
        pieChart.setDescription(description);


        PieDataSet pieDataSet2 = new PieDataSet(data2(), "");
        pieDataSet2.setColors(colorArray);
        PieData pieData2 = new PieData(pieDataSet);
        pieToChart.setDrawEntryLabels(true);
        pieToChart.setUsePercentValues(true);
        pieToChart.setHoleRadius(30);

        pieToChart.setData(pieData2);
        pieToChart.invalidate();

        Description description2 = new Description();
        description.setText("하루 섭취량");
        description.setTextSize(12);
        pieToChart.setDescription(description);

    }

    private ArrayList<PieEntry> data1() {
        ArrayList<PieEntry> datavalue = new ArrayList<>();

        datavalue.add(new PieEntry(30, "적당"));
        datavalue.add(new PieEntry(70, "훌륭"));
        return datavalue;
    }

    private ArrayList<PieEntry> data2() {
        ArrayList<PieEntry> datavalue2 = new ArrayList<>();

        datavalue2.add(new PieEntry(30, "적당"));
        datavalue2.add(new PieEntry(70, "많음"));
        return datavalue2;
    }
}