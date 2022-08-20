package com.example.quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {

    DisplayMetrics metrics;
    int width;
    int height;
    private TextView text1, text2;

    private Typewriter writer;
    private TextView tv_textView;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels; // ancho absoluto en pixels
        height = metrics.heightPixels; // alto absoluto en pixels

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        tv_textView = (TextView) findViewById(R.id.text2);
        writer = new Typewriter(tv_textView);
        writer.animateText("Hola, este es un ejemplo de texto");



    }
}