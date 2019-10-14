package com.hm.firebase.notifier;

import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        Connection connection = new Connection();
        try {
            connection.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
