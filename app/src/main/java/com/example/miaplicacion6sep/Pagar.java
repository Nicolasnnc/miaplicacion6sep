package com.example.miaplicacion6sep;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class Pagar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar);
    }

    public void onClickFin(View View){
        Intent intent =new Intent(this, Fin.class);
        startActivity(intent);
    }
}