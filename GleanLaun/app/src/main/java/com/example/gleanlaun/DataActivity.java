package com.example.gleanlaun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gleanlaun.ui.Data;

import java.util.ArrayList;

public class DataActivity extends AppCompatActivity {
    private RecyclerView rvData;
    private ArrayList<Data> list = new ArrayList<>();
    private String title = "Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        rvData = findViewById(R.id.rv_heroes);
        rvData.setHasFixedSize(true);

        list.addAll(DataLaundry.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvData.setLayoutManager(new LinearLayoutManager(this));
    }


}
