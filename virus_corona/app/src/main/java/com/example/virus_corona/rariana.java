package com.example.virus_corona;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class rariana extends AppCompatActivity {
    private Firebase mRef;
    ArrayList<String> mUsersnames=new ArrayList<>();
    ListView mlistView1;
    EditText khabar;
    Button ab3ath;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rariana);
        mRef=new Firebase("https://virus-coronaa.firebaseio.com/rariana");
        mlistView1=(ListView)findViewById(R.id.listview);
        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mUsersnames);
        mlistView1.setAdapter(arrayAdapter);
        mRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String value=dataSnapshot.getValue(String.class);
                mUsersnames.add(value);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        mDatabase = FirebaseDatabase.getInstance().getReference();

        khabar=findViewById(R.id.khabar);
        ab3ath=findViewById(R.id.ab3ath);
        ab3ath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message=khabar.getText().toString();
                mDatabase.child("ariana").setValue(message);
                Intent otherrr = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(otherrr);        }
        });
    }
}
