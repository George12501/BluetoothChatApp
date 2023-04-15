package com.george.androidbluetoothchatapp.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.george.androidbluetoothchatapp.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain{
    return  BluetoothDeviceDomain(
        name = name,
        address = address
    )

}