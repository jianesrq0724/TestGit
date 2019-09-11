package com.example.myapplication.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    static Toast mToast;

    public static void show(Context context, String content) {

        if (mToast == null) {
//            mToast = Toast.makeText(context, content, Toast.LENGTH_LONG);
            mToast = Toast.makeText(context, null, Toast.LENGTH_LONG);
        }
        mToast.setText(content);
        mToast.show();
    }
}
