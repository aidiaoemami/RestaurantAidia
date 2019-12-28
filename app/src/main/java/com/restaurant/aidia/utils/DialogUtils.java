package com.restaurant.aidia.utils;

import android.content.Context;
import android.app.ProgressDialog;

public class DialogUtils {
    public static ProgressDialog progressDialog;
    public static void openDialog(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading . . . ");
        progressDialog.show();
    }
    public static void closeDialog() {
        progressDialog.dismiss();
    }
}
