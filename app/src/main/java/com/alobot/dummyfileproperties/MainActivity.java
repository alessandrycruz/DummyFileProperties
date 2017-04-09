package com.alobot.dummyfileproperties;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alobot.dummyfileproperties.utilities.Base_Utility;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Base_Utility base_Utility = new Base_Utility();
        boolean debug = Boolean.parseBoolean(base_Utility.getProperty(this, "debug", "properties/base.properties"));

        if (debug) {
            Log.d(MainActivity.class.getSimpleName(), "Debug property is enabled.");
        }
    }
}
