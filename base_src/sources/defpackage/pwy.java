package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pwy {
    private static volatile boolean a = false;

    public static void a() {
        try {
            System.loadLibrary("gvr");
        } catch (UnsatisfiedLinkError e) {
        }
    }
}
