package com.alobot.dummyfileproperties.utilities;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.InputStream;
import java.util.Properties;

public class Base_Utility {
    public String getProperty(Context context, String key, String fileName) {
        Properties properties = new Properties();
        AssetManager assetManager = context.getAssets();

        try {
            InputStream inputStream = assetManager.open(fileName);
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return properties.getProperty(key);
    }
}
