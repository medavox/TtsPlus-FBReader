package com.hyperionics.ttssetup;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import com.hyperionics.fbreader.plugin.tts_plus.SpeakActivity;
import com.hyperionics.fbreader.plugin.tts_plus.SpeakService;

/**
 * @author Adam Howard
 * @since 14/09/2020
 */
public class TtsWrapper {
    public static TextToSpeech createTts(Context context, SpeakActivity sa, String s) {
        return null;
    }

    public static void shutdownTts(TextToSpeech tts){

    }

    public static int speak(TextToSpeech tts, String text, Object todo1, Object todo2) {
        return 0;
    }
}
