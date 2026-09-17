package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum cpa {
    FPS_30(20000001, 33333333, 1.0f),
    FPS_60(0, 20000000, 1.5f);

    public final float c;
    private final long e;
    private final long f;

    cpa(long j, long j2, float f) {
        this.e = j;
        this.f = j2;
        this.c = f;
    }

    public final boolean a(long j) {
        return j >= this.e && j <= this.f;
    }
}
