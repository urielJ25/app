package com.example.quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DisplayMetrics metrics;
    RelativeLayout.LayoutParams params;
    int width;
    int height;
    Button begin_btn;
    TextView wel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels; // ancho absoluto en pixels
        height = metrics.heightPixels; // alto absoluto en pixels

        begin_btn = findViewById(R.id.btn_begin);
        wel = findViewById(R.id.wel);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Edit Text Materias
        params.width = (int) (width * 0.3);
        params.height = (int) (height * 0.07);
        params.topMargin = (int) (height * 0.4);
        params.leftMargin = (int) (width * 0.3);
        begin_btn.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Edit Text Materias
        params.width = (int) (width * 0.3);
        params.height = (int) (height * 0.07);
        params.topMargin = (int) (height * 0.4);
        params.leftMargin = (int) (width * 0.3);
        wel.setLayoutParams(params);

        begin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Principal_Activity.class);
                startActivity(intent);
            }
        });
    }
}