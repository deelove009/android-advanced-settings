package com.logicvoid.androidadvancedsettings;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class RoamingGuardsSettingsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);      
        
        
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(ComponentName.unflattenFromString("com.android.phone/com.android.phone.HtcCdmaRoamingGuardList"));
        intent.addCategory("android.intent.category.LAUNCHER");
        startActivity(intent);
        finish();       

    }
}