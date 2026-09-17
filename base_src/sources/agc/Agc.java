package agc;

import go.Seq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Agc {
    static {
        Seq.touch();
        _init();
    }

    private Agc() {
    }

    private static native void _init();

    public static native boolean devSetting(String str);

    public static native int getGcamSensorID(int i, float f, float f2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2);

    public static native int getSensorId();

    public static native boolean noNeedFixLens();

    public static native void setSensorId(int i);

    public static void touch() {
    }
}
