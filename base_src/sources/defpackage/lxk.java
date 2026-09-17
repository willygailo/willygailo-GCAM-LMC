package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lxk {
    ROTATION_0(1, false),
    FLIP_ROTATION_0(2, false),
    ROTATION_90(8, true),
    FLIP_ROTATION_90(5, true),
    ROTATION_180(3, false),
    FLIP_ROTATION_180(4, false),
    ROTATION_270(6, true),
    FLIP_ROTATION_270(7, true);

    public final int i;
    public final boolean j;

    lxk(int i, boolean z) {
        this.i = i;
        this.j = z;
    }
}
