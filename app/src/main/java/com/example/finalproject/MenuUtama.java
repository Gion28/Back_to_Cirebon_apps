package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {

    Button alam, religi, kuliner, about, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        alam = (Button)findViewById(R.id.wAlam);
        religi = (Button)findViewById(R.id.wReligi);
        kuliner = (Button)findViewById(R.id.wKuliner);
        about = (Button)findViewById(R.id.about);
        exit = (Button)findViewById(R.id.exit);

        alam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuUtama.this, WisataAlam.class);
                finish();
                startActivity(i);
            }
        });

        religi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuUtama.this, WisataReligi.class);
                finish();
                startActivity(i);
            }
        });

        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuUtama.this, WisataKuliner.class);
                finish();
                startActivity(i);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuUtama.this, Tentang.class);
                finish();
                startActivity(i);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }
}