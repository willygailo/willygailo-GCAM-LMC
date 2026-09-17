package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum bkt {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    public final boolean f;

    bkt(boolean z) {
        this.f = z;
    }
}
