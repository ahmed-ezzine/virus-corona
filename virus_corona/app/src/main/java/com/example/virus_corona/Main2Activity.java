package com.example.virus_corona;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main2Activity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    EditText cin1,m2p;
    Button cnx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tataouin);
        mAuth=FirebaseAuth.getInstance();
        cin1=findViewById(R.id.cinnn);
        m2p=findViewById(R.id.mdppp);
        cnx=findViewById(R.id.cnx);
        mAuthListener=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser()!=null){
                    startActivity(new Intent(Main2Activity.this,sante.class));
                }
            }
        };


        cnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSingIn();
            }
        });

    }
    public void onStart() {

        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }
    private void startSingIn() {
        String email = cin1.getText().toString().trim();
        String password = m2p.getText().toString().trim();

        if (!TextUtils.isEmpty(email)||!TextUtils.isEmpty(password)) {
            Toast.makeText(Main2Activity.this, "filed are empty", Toast.LENGTH_LONG).show();
        }

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Main2Activity.this, "sign succes", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                }
                else {
                    Toast.makeText(Main2Activity.this, "eror" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}


