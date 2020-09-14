package com.hyperionics.ttssetup;

import android.app.Application;
import android.speech.tts.TextToSpeech;

/**
 * @author Adam Howard
 * @since 14/09/2020
 */
public class AndyUtil {
    public static boolean setAppSmall(Application app) {
        return true;
    }

    public static String getTtsCurrentEngine(TextToSpeech tts) {
        return tts.toString();//omg, actual impl code?!
    }
}
