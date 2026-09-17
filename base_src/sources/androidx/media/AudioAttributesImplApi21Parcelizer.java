package androidx.media;

import android.media.AudioAttributes;
import defpackage.aks;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(aks aksVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) aksVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = aksVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, aks aksVar) {
        aksVar.i(audioAttributesImplApi21.a, 1);
        aksVar.h(audioAttributesImplApi21.b, 2);
    }
}
