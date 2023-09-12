package com.example.miaplicacion6sep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Fin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);
    }

    public void onClickMainActivity(View View){
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}