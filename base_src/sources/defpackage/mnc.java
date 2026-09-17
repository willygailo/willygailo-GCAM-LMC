package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mnc extends Exception {
    protected mnc(Throwable th) {
        super(th);
        setStackTrace(th.getStackTrace());
    }

    public static mnc a(Throwable th) {
        return th instanceof mnc ? (mnc) th : new mnc(th);
    }
}
