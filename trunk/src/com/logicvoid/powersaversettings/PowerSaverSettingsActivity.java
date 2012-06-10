package com.logicvoid.powersaversettings;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class PowerSaverSettingsActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Determine if device is compatible with application
		if (Utility.IsDeviceCompatible()) {
			Intent intent = new Intent("android.intent.action.MAIN");
			intent.setComponent(ComponentName.unflattenFromString("com.android.settings/com.android.settings.Settings$PowersaverListActivity"));
			intent.addCategory("android.intent.category.LAUNCHER");
			startActivity(intent);
			finish();

		} else {
			Toast.makeText(getApplicationContext(),	R.string.incompatible_device_message, Toast.LENGTH_LONG).show();
			finish();
		}

	}
}