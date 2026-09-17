package androidx.media;

import defpackage.aks;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(aks aksVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = aksVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = aksVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = aksVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = aksVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, aks aksVar) {
        aksVar.h(audioAttributesImplBase.a, 1);
        aksVar.h(audioAttributesImplBase.b, 2);
        aksVar.h(audioAttributesImplBase.c, 3);
        aksVar.h(audioAttributesImplBase.d, 4);
    }
}
