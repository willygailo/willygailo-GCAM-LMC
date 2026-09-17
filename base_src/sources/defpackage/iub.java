package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iub {
    private static final ouj a = ouj.h("com/google/android/apps/camera/tracking/api/TrackingStatus");

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                ((oug) ((oug) a.c()).G(3162)).p("Invalid tracking status: %d", i);
                return 1;
        }
    }
}
