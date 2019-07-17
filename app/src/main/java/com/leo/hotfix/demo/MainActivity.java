package com.leo.hotfix.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leo.hotfix.demo.bug.BugClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new BugClass(this);
    }
}
