package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ass extends Exception {
    public final int a;

    public ass(String str, int i) {
        super(str);
        this.a = i;
    }

    public ass(String str, int i, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
