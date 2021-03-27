package com.example.swipeandtabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout maTab;
    ViewPager maPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maTab = (TabLayout)findViewById(R.id.myTab);
        maPage = (ViewPager) findViewById(R.id.myPager);
    }
}