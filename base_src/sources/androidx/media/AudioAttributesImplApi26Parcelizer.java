package androidx.media;

import android.media.AudioAttributes;
import defpackage.aks;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(aks aksVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) aksVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = aksVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, aks aksVar) {
        aksVar.i(audioAttributesImplApi26.a, 1);
        aksVar.h(audioAttributesImplApi26.b, 2);
    }
}
