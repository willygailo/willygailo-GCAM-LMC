package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ovf {
    SMALL(10),
    MEDIUM(20),
    LARGE(50),
    FULL(-1),
    NONE(0);

    public final int f;

    ovf(int i) {
        this.f = i;
    }
}
