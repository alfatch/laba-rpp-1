package com.amin.lw_01_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = findViewById(R.id.mainLayoutId);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        view.setLayoutManager(manager);
        view.setHasFixedSize(true);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(App.ListCount);
        view.setAdapter(adapter);

        App.Log("MainActivity.onCreate");
    }
}
