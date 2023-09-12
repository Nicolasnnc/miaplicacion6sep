package com.example.miaplicacion6sep;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class Tarjeta extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta);
    }

    public void onClickPagar(View View){
        Intent intent =new Intent(this, Pagar.class);
        startActivity(intent);
    }
}