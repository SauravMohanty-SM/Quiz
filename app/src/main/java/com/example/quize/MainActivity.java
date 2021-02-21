package com.example.quize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton phy_button = (ImageButton) findViewById(R.id.phy_button);

        ImageButton prog_button = (ImageButton) findViewById(R.id.prog_button);

        ImageButton net_butoon = (ImageButton) findViewById(R.id.net_button);

        phy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phyandmath_page = new Intent(MainActivity.this, phyandmath.class);
                startActivity(phyandmath_page);
            }
        });

        prog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent programming_page = new Intent(MainActivity.this, programming.class);
                startActivity(programming_page);
            }
        });

        net_butoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Intent net_page = new Intent(MainActivity.this, net.class);
                startActivity(net_page);*/
                Toast.makeText(getApplicationContext(), "Nothing Yet", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
