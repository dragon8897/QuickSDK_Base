package com.dolphingame.sdkbase;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutID = getResources().getIdentifier("activity_main", "layout", getPackageName());
        setContentView(layoutID);
    }
}
