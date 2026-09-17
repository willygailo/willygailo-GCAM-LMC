package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pvp extends Exception {
    public final pvo a;

    public pvp(pvo pvoVar, String str) {
        this(pvoVar, str, null);
    }

    public pvp(pvo pvoVar, String str, Throwable th) {
        super(str, th);
        this.a = pvoVar;
    }

    public pvp(pvo pvoVar, Throwable th) {
        this(pvoVar, null, th);
    }

    public final boolean a() {
        return this.a.g;
    }
}
