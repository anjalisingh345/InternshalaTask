package com.example.android.internshalatask.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android.internshalatask.Adapter.BottomAdapter;
import com.example.android.internshalatask.Adapter.MiddleAdapter;
import com.example.android.internshalatask.Adapter.TopAdapter;
import com.example.android.internshalatask.MyUtils;
import com.example.android.internshalatask.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView top_recyclerView,middle_recyclerView,bottom_recyclerView;
    TopAdapter topAdapter;
    MiddleAdapter middleAdapter;
    BottomAdapter bottomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setTopRecycerView();
        setMiddleRecycerView();
        setBottomRecycerView();


    }
    private void initView() {
        top_recyclerView = findViewById(R.id.top_recyclerView);
        middle_recyclerView = findViewById(R.id.middle_recyclerView);
        bottom_recyclerView=findViewById(R.id.bottom_recycerView);

    }

    private void setTopRecycerView() {
        topAdapter = new TopAdapter();
        RecyclerView.LayoutManager rLayoutManager =  new LinearLayoutManager(MainActivity.this,RecyclerView.HORIZONTAL,false);
        top_recyclerView.setLayoutManager(rLayoutManager);
        top_recyclerView.setAdapter(topAdapter);
    }

    private void setMiddleRecycerView() {
        middleAdapter= new MiddleAdapter();
        middle_recyclerView.setAdapter(middleAdapter);
    }

    private void setBottomRecycerView() {
        bottomAdapter= new BottomAdapter();
        bottom_recyclerView.setAdapter(bottomAdapter);
    }


}