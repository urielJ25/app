package com.example.quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ExDiagnosticoActivity extends AppCompatActivity {

    DisplayMetrics metrics;
    RelativeLayout.LayoutParams params;
    int width;
    int height;
    private TextView txTitulo, pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, pregunta6, pregunta7,
            pregunta8, pregunta9, pregunta10, pregunta11, pregunta12, pregunta13, pregunta14, pregunta15,
            seccionMate, SeccionFisica, seccionQuimica;

    private RadioButton opcionA1, opcionB1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_diagnostico);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels;
        height = metrics.heightPixels;

        txTitulo = findViewById(R.id.txTitulo);
        seccionMate = findViewById(R.id.seccionMate);
        //seccionFisica = findViewById(R.id.seccionFisica);
        //seccionQuimica = findViewById(R.id.seccionQuimica);
        pregunta1 = findViewById(R.id.pregunta1);
        pregunta2 = findViewById(R.id.pregunta2);
        pregunta3 = findViewById(R.id.pregunta3);
        pregunta4 = findViewById(R.id.pregunta4);
        pregunta5 = findViewById(R.id.pregunta5);
        pregunta6 = findViewById(R.id.pregunta6);
        pregunta7 = findViewById(R.id.pregunta7);
        pregunta8 = findViewById(R.id.pregunta8);
        pregunta9 = findViewById(R.id.pregunta9);
        pregunta10 = findViewById(R.id.pregunta10);
        pregunta11 = findViewById(R.id.pregunta11);
        pregunta12 = findViewById(R.id.pregunta12);
        pregunta13 = findViewById(R.id.pregunta13);
        pregunta14 = findViewById(R.id.pregunta14);
        pregunta15 = findViewById(R.id.pregunta15);

        opcionA1 = (RadioButton) findViewById(R.id.opcionA1);
        opcionB1 = (RadioButton) findViewById(R.id.opcionB1);

        txTitulo.setText("Examen Diagnóstico");




    }
}