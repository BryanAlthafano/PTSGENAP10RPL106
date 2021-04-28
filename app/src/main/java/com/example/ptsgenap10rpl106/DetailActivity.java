package com.example.ptsgenap10rpl106;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Bundle bundle;
    String tittle;
    TextView tvnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvnama = (TextView)findViewById(R.id.tvnama);
        bundle = getIntent().getExtras();
        if (bundle != null){
            tittle = bundle.getString("nama");
        }
        tvnama.setText("nama : "+ tittle);
    }
}