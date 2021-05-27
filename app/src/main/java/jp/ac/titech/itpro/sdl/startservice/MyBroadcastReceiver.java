package jp.ac.titech.itpro.sdl.startservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
       Bundle bundle = intent.getExtras();
       String message = bundle.getString("SERVICE3_ANSWER_VALUE");
       Toast.makeText(context, "Received message: " + message, Toast.LENGTH_SHORT).show();
    }
}
