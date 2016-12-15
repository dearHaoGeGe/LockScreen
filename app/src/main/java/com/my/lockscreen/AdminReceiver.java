package com.my.lockscreen;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * 继承DeviceAdminReceiver的广播
 *
 * Created by YJH on 2016/10/28 14:53.
 */
public class AdminReceiver extends DeviceAdminReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);

        Log.e("AdminReceiver","接收到广播~");
    }
}
