package com.example.animatedsplashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button singin,logion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singin=findViewById(R.id.btn1);
        logion=findViewById(R.id.btn2);
        singin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main,new sign()).commit();

            }
        });
      logion.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
              fragmentTransaction.replace(R.id.main,new login()).commit();
          }
      });
    }
}