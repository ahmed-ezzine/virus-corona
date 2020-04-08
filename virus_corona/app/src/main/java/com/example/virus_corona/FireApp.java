package com.example.virus_corona;

import android.app.Application;
import com.firebase.client.Firebase;
public class FireApp extends Application {
    public void onCreate() {

        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
