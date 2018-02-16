package com.example.simplebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SimpleReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "com.example.simplebroadcastreceiver.CUSTOM_INTENT1") {
            Toast.makeText(context, "Intent 1 Detected.", Toast.LENGTH_SHORT).show();
        } else if (intent.getAction() == "com.example.simplebroadcastreceiver.CUSTOM_INTENT2") {
            Toast.makeText(context, "Intent 2 Detected.", Toast.LENGTH_SHORT).show();
        }
    }

}
