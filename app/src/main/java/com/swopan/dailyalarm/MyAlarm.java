package com.swopan.dailyalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;

import java.net.URI;

public class MyAlarm extends BroadcastReceiver {

    //the method will be fired when the alarm is triggerred
    @Override
    public void onReceive(Context context, Intent intent) {
        //you can check the log that it is fired
        //Here we are actually not doing anything
        //but you can do any task here that you want to be done at a specific time everyday
        MediaPlayer mediaPlayer = MediaPlayer.create(context.getApplicationContext(), R.raw.beep);
        mediaPlayer.start();
    }

}