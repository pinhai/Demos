package com.hai.relevancelaunch2.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.hai.relevancelaunch2.R;

/**
 * Created by Administrator on 2016/6/7 0007.
 */
public class BadService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        NotificationManager nm = (NotificationManager)this.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder nb = new Notification.Builder(this);
        nb.setSmallIcon(R.drawable.icon_notify);
        nb.setContentTitle("Hello");
        nb.setContentText("我是被其它APP关联启动的龌龊后台服务");
        nb.setOngoing(true);
        nb.setAutoCancel(true);
        nm.notify(101, nb.getNotification());

        return super.onStartCommand(intent, flags, startId);
    }
}
