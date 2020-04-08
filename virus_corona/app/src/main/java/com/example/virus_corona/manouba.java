package com.example.virus_corona;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class manouba extends AppCompatActivity {
    EditText debut,milieu,fin;
    TextView text;
    Button btn;
    private Firebase mRootRef;
    private DatabaseReference mDatabase;
    FirebaseDatabase database=FirebaseDatabase.getInstance();
    DatabaseReference myRef=database.getReference("manouba");
    // ...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manouba);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        debut=findViewById(R.id.debutar);
        milieu=findViewById(R.id.milieu);
        fin=findViewById(R.id.fin);
        btn=findViewById(R.id.btnar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deb=debut.getText().toString();
                String mil=milieu.getText().toString();
                String finn=fin.getText().toString();
                String message=deb+""+mil+""+finn;
                mDatabase.child("rmanouba").push().setValue(message);
                Intent otherrr = new Intent(getApplicationContext(), societe.class);
                startActivity(otherrr);         }
        });

        text = findViewById(R.id.edit);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                text.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
