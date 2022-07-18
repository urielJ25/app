package com.example.quimica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Principal_Activity extends AppCompatActivity {

    DisplayMetrics metrics;
    RelativeLayout.LayoutParams params;
    int width;
    int height;
    private TextView lbTopics, lbRead;
    private ImageButton imageBtnPhysics, imageBtnMaths, imageBtnChemistry, imgBtnRead1, imgBtnRead2, imgBtnRead3;
    private Button btnPhysics, btnMaths, btnChemistry, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels; // ancho absoluto en pixels
        height = metrics.heightPixels; // alto absoluto en pixels

        lbTopics = findViewById(R.id.lbTopics);
        lbRead = findViewById(R.id.lbRead);

        imageBtnPhysics = findViewById(R.id.imageBtnPhysics);
        imageBtnMaths = findViewById(R.id.imageBtnMaths);
        imageBtnChemistry = findViewById(R.id.imageBtnChemistry);

        imgBtnRead1 = findViewById(R.id.imgBtnRead1);
        imgBtnRead2 = findViewById(R.id.imgBtnRead2);
        imgBtnRead3 = findViewById(R.id.imgBtnRead3);

        btnPhysics = findViewById(R.id.btnPhysics);
        btnMaths = findViewById(R.id.btnMaths);
        btnChemistry = findViewById(R.id.btnChemistry);
        btnBack = findViewById(R.id.btnBack);

        lbRead.setVisibility(View.INVISIBLE);
        btnBack.setVisibility(View.INVISIBLE);

        //POSICIONES

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Edit Text Materias
        params.width = (int) (width * 0.8);
        params.height = (int) (height * 0.9);
        params.topMargin = (int) (height * 0.07);
        params.leftMargin = (int) (width * 0.1);
        lbTopics.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button Physics
        params.width = (int) (width * 0.3);
        params.height = (int) (height * 0.05);
        params.topMargin = (int) (height * 0.22);
        params.leftMargin = (int) (width * 0.35);
        imageBtnPhysics.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text Physics
        params.width = (int) (width * 0.3); //Tamaño
        params.height = (int) (height * 0.05);
        params.topMargin = (int) (height * 0.26);//Posicion
        params.leftMargin = (int) (width * 0.35);
        btnPhysics.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button Maths
        params.width = (int) (width * 0.4);
        params.height = (int) (height * 0.05);
        params.topMargin = (int) (height * 0.37);
        params.leftMargin = (int) (width * 0.3);
        imageBtnMaths.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text Maths
        params.width = (int) (width * 0.4); //Tamaño
        params.height = (int) (height * 0.05);
        params.topMargin = (int) (height * 0.41);//Posicion
        params.leftMargin = (int) (width * 0.3);
        btnMaths.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button Chemistry
        params.width = (int) (width * 0.3);
        params.height = (int) (height * 0.05);
        params.topMargin = (int) (height * 0.53);
        params.leftMargin = (int) (width * 0.35);
        imageBtnChemistry.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Text Chemistry
        params.width = (int) (width * 0.3); //Tamaño
        params.height = (int) (height * 0.05);
        params.topMargin = (int) (height * 0.57);//Posicion
        params.leftMargin = (int) (width * 0.35);
        btnChemistry.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button Read
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.22);
        params.leftMargin = (int) (width * 0.7);
        imgBtnRead1.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button Read
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.37);
        params.leftMargin = (int) (width * 0.7);
        imgBtnRead2.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button Read
        params.width = (int) (width * 0.1);
        params.height = (int) (height * 0.1);
        params.topMargin = (int) (height * 0.52);
        params.leftMargin = (int) (width * 0.7);
        imgBtnRead3.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button lbRead
        params.width = (int) (width * 0.7);
        params.height = (int) (height * 0.8);
        params.topMargin = (int) (height * 0.2);
        params.leftMargin = (int) (width * 0.1);
        lbRead.setLayoutParams(params);

        params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        // Button back
        params.width = (int) (width * 0.2);
        params.height = (int) (height * 0.05);
        params.topMargin = (int) (height * 0.8);
        params.leftMargin = (int) (width * 0.05);
        btnBack.setLayoutParams(params);

        imageBtnMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal_Activity.this, MatematicasActivity.class);
                startActivity(intent);
            }
        });

        imageBtnChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal_Activity.this, QuimicaActivity.class);
                startActivity(intent);
            }
        });

        btnChemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal_Activity.this, QuimicaActivity.class);
                startActivity(intent);
            }
        });

        btnMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal_Activity.this, MatematicasActivity.class);
                startActivity(intent);
            }
        });

        imgBtnRead1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lbTopics.setText("Moles");
                imageBtnPhysics.setVisibility(View.INVISIBLE);
                imageBtnMaths.setVisibility(View.INVISIBLE);
                imageBtnChemistry.setVisibility(View.INVISIBLE);

                imgBtnRead1.setVisibility(View.INVISIBLE);
                imgBtnRead2.setVisibility(View.INVISIBLE);
                imgBtnRead3.setVisibility(View.INVISIBLE);

                btnPhysics.setVisibility(View.INVISIBLE);
                btnMaths.setVisibility(View.INVISIBLE);
                btnChemistry.setVisibility(View.INVISIBLE);

                lbRead.setVisibility(View.VISIBLE);
                btnBack.setVisibility(View.VISIBLE);

                btnBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Principal_Activity.this, Principal_Activity.class);
                        startActivity(intent);
                    }
                });

            }
        });

        imgBtnRead2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lbTopics.setText("Álgebra");
                imageBtnPhysics.setVisibility(View.INVISIBLE);
                imageBtnMaths.setVisibility(View.INVISIBLE);
                imageBtnChemistry.setVisibility(View.INVISIBLE);

                imgBtnRead1.setVisibility(View.INVISIBLE);
                imgBtnRead2.setVisibility(View.INVISIBLE);
                imgBtnRead3.setVisibility(View.INVISIBLE);

                btnPhysics.setVisibility(View.INVISIBLE);
                btnMaths.setVisibility(View.INVISIBLE);
                btnChemistry.setVisibility(View.INVISIBLE);

                lbRead.setVisibility(View.VISIBLE);
                btnBack.setVisibility(View.VISIBLE);

                btnBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Principal_Activity.this, Principal_Activity.class);
                        startActivity(intent);
                    }
                });

            }
        });

        imgBtnRead3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lbTopics.setText("Moles");
                imageBtnPhysics.setVisibility(View.INVISIBLE);
                imageBtnMaths.setVisibility(View.INVISIBLE);
                imageBtnChemistry.setVisibility(View.INVISIBLE);

                imgBtnRead1.setVisibility(View.INVISIBLE);
                imgBtnRead2.setVisibility(View.INVISIBLE);
                imgBtnRead3.setVisibility(View.INVISIBLE);

                btnPhysics.setVisibility(View.INVISIBLE);
                btnMaths.setVisibility(View.INVISIBLE);
                btnChemistry.setVisibility(View.INVISIBLE);

                lbRead.setVisibility(View.VISIBLE);
                btnBack.setVisibility(View.VISIBLE);

                btnBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Principal_Activity.this, Principal_Activity.class);
                        startActivity(intent);
                    }
                });

            }
        });
    }
}