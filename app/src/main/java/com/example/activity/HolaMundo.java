package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HolaMundo extends AppCompatActivity {

    TextView label;
    EditText editText;//nuevas lineas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        this.label=(TextView) findViewById(R.id.label);
        this.editText = (EditText) findViewById(R.id.editText);//nuevas lineas

    }

    public void OnClick (View view){
        switch (view.getId()){
            case R.id.button5:
                String name="";
                name=editText.getText().toString();
                Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
                this.label.setText("Hola "+name);
                break;
        }

    }
}
