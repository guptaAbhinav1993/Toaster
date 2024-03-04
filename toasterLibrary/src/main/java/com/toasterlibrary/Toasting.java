package com.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toasting {
    public static void toast(Context context, String message){
        Toast.makeText(context , message, Toast.LENGTH_SHORT).show();
    }

    public static void toaster(Context context, String message){
        Toast.makeText(context , message,Toast.LENGTH_SHORT).show();
    }
}
