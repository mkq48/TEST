package com.example.myapplication;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    GridView Grid;

    RecyclerView Rc;

    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


//        myListView = findViewById(R.id.myListView);
//
//        String[] items = {"Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3"}; // Dữ liệu cho danh sách
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
//        myListView.setAdapter(adapter);


//        Grid = findViewById(R.id.myGridView);
//        String[] items = {"Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3", "Mục 1", "Mục 2", "Mục 3"};
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
//        Grid.setAdapter(adapter);

        Rc = findViewById(R.id.myRecycer);

        Rc.setLayoutManager(new LinearLayoutManager(this));

        List<String> data = new ArrayList<>();
        data.add("Mục 1");
        data.add("Mục 2");


        adapter = new MyAdapter(data);


        Rc.setAdapter(adapter);

    }
}