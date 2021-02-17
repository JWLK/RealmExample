package com.jwlks.realmexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.realm.Realm;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;
import io.realm.mongodb.Credentials;

public class MainActivity extends AppCompatActivity {
    Realm uiThreadRealm;
    App app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Realm.init(this); // context, usually an Activity or Application

        String appID = "RealmDB";
        app = new App(new AppConfiguration.Builder(appID)
                .build());

        Credentials credentials = Credentials.anonymous();




    }
}