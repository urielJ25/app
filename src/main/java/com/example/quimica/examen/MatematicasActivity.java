package com.example.quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MatematicasActivity extends AppCompatActivity {

    RelativeLayout.LayoutParams params;
    DisplayMetrics metrics;
    int width, height;
    private TextView lbInstructions, txQt1, txQt2, txQt3, txQt4;
    private EditText inAw1, inAw2, inAw3, inAw4;
    private Button btnAccept, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicas);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels; // ancho absoluto en pixels
        height = metrics.heightPixels; // alto absoluto en pixels

        lbInstructions = findViewById(R.id.lbInstructions);
        txQt1 = findViewById(R.id.txQt1);
        txQt2 = findViewById(R.id.txQt2);
        txQt3 = findViewById(R.id.txQt3);
        txQt4 = findViewById(R.id.txQt4);

        inAw1 = findViewById(R.id.inAw1);
        inAw2 = findViewById(R.id.inAw2);
        inAw3 = findViewById(R.id.inAw3);
        inAw4 = findViewById(R.id.inAw4);

        btnAccept = findViewById(R.id.btnAccept);
        btnBack = findViewById(R.id.btnBack);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text Materias
        params.width = (int) (width * 0.72);
        params.height = (int) (height * 0.2);
        params.topMargin = (int) (height * 0.03); //Arriba a la izquierda
        params.leftMargin = (int) (width * 0.03);
        lbInstructions.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text 1
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.9);
        params.topMargin = (int) (height * 0.23);
        params.leftMargin = (int) (width * 0.4);
        txQt1.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Anw 1
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.24);
        params.leftMargin = (int) (width * 0.43);
        inAw1.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text 2
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.9);
        params.topMargin = (int) (height * 0.35);
        params.leftMargin = (int) (width * 0.4);
        txQt2.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text 2
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.36);
        params.leftMargin = (int) (width * 0.43);
        inAw2.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text 3
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.9);
        params.topMargin = (int) (height * 0.46);
        params.leftMargin = (int) (width * 0.4);
        txQt3.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text 3
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.47);
        params.leftMargin = (int) (width * 0.43);
        inAw3.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text 4
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.9);
        params.topMargin = (int) (height * 0.57);
        params.leftMargin = (int) (width * 0.4);
        txQt4.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text 4
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.58);
        params.leftMargin = (int) (width * 0.43);
        inAw4.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button Accept
        params.width = (int) (width * 0.4);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.7 + width * 0.02);
        params.leftMargin = (int) (width * 0.3);
        btnAccept.setLayoutParams(params);

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
                Intent intent = new Intent(MatematicasActivity.this, Principal_Activity.class);
                startActivity(intent);
            }
        });

    }
}