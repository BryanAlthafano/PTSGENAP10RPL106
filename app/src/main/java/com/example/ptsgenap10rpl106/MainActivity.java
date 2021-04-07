package com.example.ptsgenap10rpl106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText username, password;
    public Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnLogin) {
            String ambilUsername = username.getText().toString().trim();
            String ambilPassword = password.getText().toString().trim();

            if (ambilUsername.equalsIgnoreCase("Bryan") && ambilPassword.equalsIgnoreCase("Bryan")) {
                Toast.makeText(this, "Succes Login", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
            } else{
                Toast.makeText(this, "Your Username or Password Wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }
}