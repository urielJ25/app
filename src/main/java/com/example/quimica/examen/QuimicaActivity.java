package com.example.quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class QuimicaActivity extends AppCompatActivity {

    RelativeLayout.LayoutParams params;
    DisplayMetrics metrics;
    int width, height;
    private TextView lbInstructions, txQt1, txQt2, txQt3, txQt4, txQt5;
    private TextView op1, op2, op3, op4, op5;
    private EditText inAw1, inAw2, inAw3, inAw4, inAw5;
    private Button btnAccept, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quimica);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels; // ancho absoluto en pixels
        height = metrics.heightPixels; // alto absoluto en pixels

        lbInstructions = findViewById(R.id.lbInstructions);
        txQt1 = findViewById(R.id.txQt1);
        txQt2 = findViewById(R.id.txQt2);
        txQt3 = findViewById(R.id.txQt3);
        txQt4 = findViewById(R.id.txQt4);
        txQt5 = findViewById(R.id.txQt5);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);
        op5 = findViewById(R.id.op5);

        inAw1 = findViewById(R.id.inAw1);
        inAw2 = findViewById(R.id.inAw2);
        inAw3 = findViewById(R.id.inAw3);
        inAw4 = findViewById(R.id.inAw4);
        inAw5 = findViewById(R.id.inAw5);

        btnAccept = findViewById(R.id.btnAccept);
        btnBack = findViewById(R.id.btnBack);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Instrcution
        params.width = (int) (width * 0.72);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.03); //Arriba a la izquierda
        params.leftMargin = (int) (width * 0.03);
        lbInstructions.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Question1
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.19);
        params.leftMargin = (int) (width * 0.1);
        txQt1.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Answer1
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.13);
        params.leftMargin = (int) (width * 0.49);
        inAw1.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Question2
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.29);
        params.leftMargin = (int) (width * 0.1);
        txQt2.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Answer2
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.23);
        params.leftMargin = (int) (width * 0.49);
        inAw2.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Question3
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.39);
        params.leftMargin = (int) (width * 0.1);
        txQt3.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Answer3
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.33);
        params.leftMargin = (int) (width * 0.49);
        inAw3.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Question4
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.49);
        params.leftMargin = (int) (width * 0.1);
        txQt4.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Answer4
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.43);
        params.leftMargin = (int) (width * 0.49);
        inAw4.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Question5
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.59);
        params.leftMargin = (int) (width * 0.1);
        txQt5.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View Answer5
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.53);
        params.leftMargin = (int) (width * 0.49);
        inAw5.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View option1
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.18);
        params.leftMargin = (int) (width * 0.7);
        op1.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View option2
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.28);
        params.leftMargin = (int) (width * 0.7);
        op2.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View option3
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.38);
        params.leftMargin = (int) (width * 0.7);
        op3.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View option4
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.48);
        params.leftMargin = (int) (width * 0.7);
        op4.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text View option5
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.58);
        params.leftMargin = (int) (width * 0.7);
        op5.setLayoutParams(params);

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
                Intent intent = new Intent(QuimicaActivity.this, Principal_Activity.class);
                startActivity(intent);
            }
        });

    }
}