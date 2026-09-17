package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum cui {
    ENABLED_VISIBLE(true, true),
    DISABLED_VISIBLE(false, true),
    DISABLED_HIDDEN(false, false);

    public final boolean d;
    public final boolean e;

    cui(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
