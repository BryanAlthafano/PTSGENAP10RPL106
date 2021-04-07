package com.example.ptsgenap10rpl106;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<SetterGetter> dataMenu;
    GridLayoutManager gridLayoutManager;
    DashboardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = findViewById(R.id.rv_menu);

        addData();
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new DashboardAdapter(dataMenu);
        recyclerView.setAdapter(adapter);
    }

    public void addData(){
        dataMenu = new ArrayList<>();
        dataMenu.add(new SetterGetter("Video", "logoMenu1"));
        dataMenu.add(new SetterGetter("Group", "logoMenu2"));
        dataMenu.add(new SetterGetter("Teman", "logoMenu3"));
        dataMenu.add(new SetterGetter("Game", "logoMenu4"));
        dataMenu.add(new SetterGetter("Marketplace", "logoMenu5"));
        dataMenu.add(new SetterGetter("Acara", "logoMenu6"));
        dataMenu.add(new SetterGetter("Kenangan", "logoMenu7"));
        dataMenu.add(new SetterGetter("Bantuan", "logoMenu8"));
        dataMenu.add(new SetterGetter("Pengaturan", "logoMenu9"));
        dataMenu.add(new SetterGetter("Keluar", "logoMenu10"));

    }
}