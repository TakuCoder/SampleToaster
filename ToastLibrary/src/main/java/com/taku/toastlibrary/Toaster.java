package com.taku.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    private Context context;

   public Toaster(Context context) {
        this.context = context;
    }

    public void doToast(String s){
        Toast.makeText(this.context, s, Toast.LENGTH_SHORT).show();
    }
}
