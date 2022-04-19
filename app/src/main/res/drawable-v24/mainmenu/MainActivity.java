package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCircle1;
    private Button btnCircle2;
    private Button btnCircle3;
    private Button btnCircle4;
    private Button btnCircle5;
    private Button btnCircle6;
    private Button btnCircle7;
    private Button btnCircle8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCircle1 = (Button) findViewById(R.id.btnCircle1);
        btnCircle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openScreen1();
            }
        });

        btnCircle2 = (Button) findViewById(R.id.btnCircle2);
        btnCircle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openScreen2();
            }
        });
        btnCircle3 = (Button) findViewById(R.id.btnCircle3);
        btnCircle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openScreen3();
            }
        });
        btnCircle4 = (Button) findViewById(R.id.btnCircle4);
        btnCircle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openScreen4();
            }


        });

        btnCircle5 = (Button) findViewById(R.id.btnCircle5);
        btnCircle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openPubertyScreen();
            }
        });

        btnCircle6 = (Button) findViewById(R.id.btnCircle6);
        btnCircle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                opengender_equality();
            }
        });

        btnCircle7 = (Button) findViewById(R.id.btnCircle7);
        btnCircle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openMythBusters();
            }
        });
        btnCircle8 = (Button) findViewById(R.id.btnCircle8);
        btnCircle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openDiseases();
            }
        });



    }
        public void openScreen1(){
            Intent intent= new Intent(this, Screen1.class);
            startActivity(intent);
        }
        public void openScreen2(){
            Intent intent= new Intent(this, Screen2.class);
            startActivity(intent);
        }
    public void openScreen3(){
        Intent intent= new Intent(this, Screen3.class);
        startActivity(intent);
    }
    public void openScreen4(){
        Intent intent= new Intent(this, Screen4.class);
        startActivity(intent);
    }

    public void openPubertyScreen(){
        Intent intent= new Intent(this, PubertyScreen.class);
        startActivity(intent);
    }

    public void opengender_equality(){
        Intent intent= new Intent(this, gender_equality.class);
        startActivity(intent);
    }

    public void openMythBusters(){
        Intent intent= new Intent(this, MythBusters.class);
        startActivity(intent);
    }

    public void openDiseases(){
        Intent intent= new Intent(this, Diseases.class);
        startActivity(intent);
    }


}