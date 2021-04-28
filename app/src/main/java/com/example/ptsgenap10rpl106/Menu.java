package com.example.ptsgenap10rpl106;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

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
        gridLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new DashboardAdapter(dataMenu, new DashboardAdapter.Callback() {
            @Override
            public void onClick(int position) {
                Toast.makeText(Menu.this, "Click Item "+position, Toast.LENGTH_SHORT).show();
                Intent move = new Intent(getApplicationContext(), DetailActivity.class);
                SetterGetter tampil = dataMenu.get(position);
                move.putExtra("nama", tampil.getTittle());
                startActivity(move);
            }
        });
        recyclerView.setAdapter(adapter);
    }

    public void addData(){
        dataMenu = new ArrayList<>();
        dataMenu.add(new SetterGetter("Video", "Tonton Video", "video"));
        dataMenu.add(new SetterGetter("Group", "Lihat Group", "group"));
        dataMenu.add(new SetterGetter("Teman", "Lihat Teman", "team"));
        dataMenu.add(new SetterGetter("Game", "Mainkan Game", "game"));
        dataMenu.add(new SetterGetter("Marketplace", "Lihat Marketplace", "market"));
        dataMenu.add(new SetterGetter("Acara", "Acara Anda", "acara"));
        dataMenu.add(new SetterGetter("Kenangan", "Lihat Kenangan", "kenangan"));
        dataMenu.add(new SetterGetter("Bantuan", "Pusat Bantuan & Dukungan", "bantuan"));
        dataMenu.add(new SetterGetter("Pengaturan", "Pengaturan & Privasi", "pengaturan"));
        dataMenu.add(new SetterGetter("Keluar", "Keluar Akun", "keluar"));
    }

}