package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kfe {
    final /* synthetic */ kff a;
    private final String b;

    public kfe(kff kffVar, long j) {
        this.a = kffVar;
        mip.ds("monitoring");
        mip.dl(j > 0);
        this.b = "monitoring";
    }

    public final String a() {
        return this.b.concat(":count");
    }

    public final String b() {
        return this.b.concat(":start");
    }

    protected final String c() {
        return this.b.concat(":value");
    }
}
