package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CambiarActivity(View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.button2:
                Toast.makeText(this,"Entrando a nueva actividad",Toast.LENGTH_LONG).show();
                miIntent=new Intent(MainActivity.this,activity.class);
                break;
        }


    }


}
