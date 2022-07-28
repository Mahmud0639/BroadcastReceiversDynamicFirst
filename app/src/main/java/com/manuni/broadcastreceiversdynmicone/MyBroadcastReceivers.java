package com.manuni.broadcastreceiversdynmicone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyBroadcastReceivers extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
           boolean isConnected = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false);
           if (!isConnected){
               Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
           }else{
               Toast.makeText(context,"Disconnected",Toast.LENGTH_SHORT).show();
           }
        }else if (Intent.ACTION_TIME_TICK.equals(intent.getAction())){
            Toast.makeText(context, "Time incremented.", Toast.LENGTH_SHORT).show();
        }
    }
}
