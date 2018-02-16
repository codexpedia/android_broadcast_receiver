package com.example.simplebroadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // broadcast a custom intent.
    public void broadcastIntent1(View view) {
        Intent intent = new Intent();
        intent.setAction("com.example.simplebroadcastreceiver.CUSTOM_INTENT1");
        sendBroadcast(intent);
    }

    // broadcast a custom intent.
    public void broadcastIntent2(View view) {
        Intent intent = new Intent();
        intent.setAction("com.example.simplebroadcastreceiver.CUSTOM_INTENT2");
        sendBroadcast(intent);
    }
}
