package com.example.quimica.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.quimica.Principal_Activity;
import com.example.quimica.R;

public class FisicaActivity extends AppCompatActivity {

    RelativeLayout.LayoutParams params;
    DisplayMetrics metrics;
    int width, height;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisica);

        btnBack = findViewById(R.id.btnBack);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels; // ancho absoluto en pixels
        height = metrics.heightPixels; // alto absoluto en pixels

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button back
        params.width = (int) (width * 0.2);
        params.height = (int) (height * 0.05);
        params.topMargin = (int) (height * 0.8);
        params.leftMargin = (int) (width * 0.05);
        btnBack.setLayoutParams(params);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FisicaActivity.this, Principal_Activity.class);
                startActivity(intent);
            }
        });

    }
}