package com.example.virus_corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button societe,sante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        societe=findViewById(R.id.societe);
        sante=findViewById(R.id.sante);
        societe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherrr = new Intent(getApplicationContext(), societe.class);
                startActivity(otherrr);
            }
        });
        sante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherrr = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(otherrr);
            }
        });
    }
}
