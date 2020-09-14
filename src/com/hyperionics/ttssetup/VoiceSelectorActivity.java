package com.hyperionics.ttssetup;

import android.app.Activity;

/**
 * @author Adam Howard
 * @since 14/09/2020
 */
public class VoiceSelectorActivity {
    public static final String SELECTED_VOICE_LOC = "SELECTED_VOICE_LOC";
    public static final String CONFIG_DIR = "CONFIG_DIR";
    public static final String SELECTED_ENGINE = "SELECTED_ENGINE";
    public static final String INIT_LANG = "INIT_LANG";
    public static void resetSelector() {}
    public static boolean useSystemVoiceOnly() {
        return true;
    }
}
