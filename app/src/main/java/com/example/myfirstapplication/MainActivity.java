package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import gt.wmrd.andorid_nfccharging.SahlNFCReadingandCharging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SahlNFCReadingandCharging.PrintLog("SahlNFCReadingandCharging" , " Hello Sahl GT");
    }
}