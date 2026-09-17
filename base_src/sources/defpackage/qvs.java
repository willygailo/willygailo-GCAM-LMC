package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qvs {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final String a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException e) {
            return null;
        }
    }
}
