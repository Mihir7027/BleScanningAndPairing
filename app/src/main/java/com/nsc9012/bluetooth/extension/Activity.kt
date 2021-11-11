package com.nsc9012.bluetooth.extension

import android.app.Activity
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.widget.Toast

fun Activity.hasPermission(permission: String) = ContextCompat.checkSelfPermission(
    this,
    permission
) == PackageManager.PERMISSION_GRANTED

fun Activity.toast(message: String){
    Toast.makeText(this, message , Toast.LENGTH_SHORT).show()
}