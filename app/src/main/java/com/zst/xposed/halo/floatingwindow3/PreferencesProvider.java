package com.zst.xposed.halo.floatingwindow3;

import com.crossbowffs.remotepreferences.RemotePreferenceProvider;

public class PreferencesProvider extends RemotePreferenceProvider {
    public PreferencesProvider() {
        super(Common.PREFERENCE_AUTHORITY_NAME, new String[] { Common.PREFERENCE_MAIN_FILE, Common.PREFERENCE_PACKAGES_FILE });
    }
}
