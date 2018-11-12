package com.example.redes.loginapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Random rand = new Random();
        int n = rand.nextInt(20);

        final TextView usernametxt = findViewById(R.id.textView);

        Intent i = getIntent();

        String valor_recibido = i.getStringExtra("valornombre");
        String valor_recibido2 = i.getStringExtra("valorpassword");
        //Agrega valor a TextView.
        usernametxt.setText("This is "+ valor_recibido + " with password "+ valor_recibido2 + " and code " + n);
    }
}
