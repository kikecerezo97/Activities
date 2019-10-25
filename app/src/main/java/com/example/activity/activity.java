package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity extends AppCompatActivity {
    EditText editTextName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        this.editTextName=(EditText) findViewById(R.id.editTextName);

    }
    public void SaludarActivity(View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.button:
                Toast.makeText(this,"Entrando a actividad SaludarNewActivity",Toast.LENGTH_SHORT).show();
                miIntent=new Intent(activity.this,SaludarNewActivity.class);
                miIntent.putExtra("name",this.editTextName.getText().toString());
                break;

            default:
                Toast.makeText(this,"Lo sentimos, un error a ocurrido",Toast.LENGTH_LONG).show();
                break;
        }

        if(miIntent!=null){//nueva linea
            startActivity(miIntent);//nueva linea
        }//nueva linea

    }

}
