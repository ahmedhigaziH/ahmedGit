package com.example.ahmedgit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private boolean flag = true;
    private int num = 0;
    private Thread count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.Number);
    }

    public void start(View view) {
        count = new Thread(() -> {
            try {
                flag=true;
                while (flag) {
                    num++;
                    txt.setText(num + "");
                    Thread.sleep(1000);
                }
            } catch (Exception e) {

            }
        });
        count.start();

    }

    public void stop(View view) {
        flag=false;
        Thread.interrupted();
    }

}









