package ru.carroute.application;

import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;

public class MyWebChromeClient extends WebChromeClient {
    @Override
    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        // callback.invoke(String origin, boolean allow, boolean remember);
        callback.invoke(origin, true, false);
    }

}
