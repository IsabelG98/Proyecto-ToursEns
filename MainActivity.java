package com.example.tourism_ens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button Bcomidas;
   Button Blugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bcomidas =(Button)findViewById(R.id.btlugarescomida);
        Bcomidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(MainActivity.this, PrincipalComida.class);
                startActivity(siguiente);
            }
        });

        Blugares =(Button)findViewById(R.id.btlugaresturisticos);
        Blugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguiente = new Intent(MainActivity.this, PrincipalLugar.class);
                startActivity(siguiente);
            }
        });

    }

}
