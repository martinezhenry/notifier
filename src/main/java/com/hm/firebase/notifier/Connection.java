package com.hm.firebase.notifier;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.IOException;

public class Connection {

    private final String URL_BASE = "https://transactionnotifier.firebaseio.com/";

    public void connect() throws IOException {
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.getApplicationDefault())
                .setDatabaseUrl(URL_BASE)
                .build();

        FirebaseApp.initializeApp(options);
    }

}
