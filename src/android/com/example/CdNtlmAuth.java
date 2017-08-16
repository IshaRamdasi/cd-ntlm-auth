/**
 */
package com.example;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;

public class CdNtlmAuth extends CordovaPlugin {
  private static final String TAG = "CdNtlmAuth";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Initializing CdNtlmAuth");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("download")) {
      String link = args.getString(0);
      // An example of returning data back to the web layer
      final PluginResult result = new PluginResult(PluginResult.Status.OK, link);
      //new PluginResult(PluginResult.Status.ERROR, "err msg")
      callbackContext.sendPluginResult(result);
    }
    return true;
  }

}
