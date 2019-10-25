package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SaludarNewActivity extends AppCompatActivity {
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludar_new);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        this.textView6=(TextView) findViewById(R.id.textView6);
        this.textView6.setText(name);

        Toast.makeText(this,"Hola "+name,Toast.LENGTH_LONG).show();

    }
}
