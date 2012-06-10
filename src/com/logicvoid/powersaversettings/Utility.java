package com.logicvoid.powersaversettings;

/**
 * The Utility Class
 */
public class Utility {

	/**
	 * Checks if device is compatible.
	 * 
	 * @return the boolean
	 */
	public static Boolean IsDeviceCompatible() {
		try {

			return android.os.Build.MANUFACTURER.contains("HTC") ? true : false;

		} catch (Exception e) {

			return false;
		}
	}

}
