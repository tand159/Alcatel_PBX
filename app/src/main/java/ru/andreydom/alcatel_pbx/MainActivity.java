package ru.andreydom.alcatel_pbx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static ru.andreydom.alcatel_pbx.R.id.button_konspekt_base;
import static ru.andreydom.alcatel_pbx.R.id.button_konspekt_network;
import static ru.andreydom.alcatel_pbx.R.id.button_kurs_base;
import static ru.andreydom.alcatel_pbx.R.id.button_kurs_network;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnKursBase;
    Button btnKursNetwork;
    Button btnKonspektBase;
    Button btnKonspektNetwork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKursBase = findViewById(R.id.button_kurs_base);
        btnKursNetwork = findViewById(R.id.button_kurs_network);
        btnKonspektBase = findViewById(button_konspekt_base);
        btnKonspektNetwork = findViewById(button_konspekt_network);
        btnKursBase.setOnClickListener(this);
        btnKursNetwork.setOnClickListener(this);
        btnKonspektBase.setOnClickListener(this);
        btnKonspektNetwork.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case button_kurs_base:
                Intent intent = new Intent(this, ActivityKursBase.class);
                startActivity(intent);
                break;

            case button_kurs_network:
                intent = new Intent(this, ActivityKursNetwork.class);
                startActivity(intent);
                break;

            case button_konspekt_base:
                intent = new Intent(this, ActivityKonspektBase.class);
                startActivity(intent);
                break;

            case button_konspekt_network:
                intent = new Intent(this, ActivityKonspektNetwork.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
