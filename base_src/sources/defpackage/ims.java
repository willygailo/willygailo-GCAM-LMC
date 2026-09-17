package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ims {
    COLD(6),
    NORMAL(1),
    HEAT_LIGHT(7),
    HEAT_MODERATE(8),
    HEAT_SEVERE(2),
    HEAT_CRITICAL(3),
    HEAT_EMERGENCY(4),
    HEAT_SHUTDOWN(9),
    UNKNOWN(5);

    public final int j;

    ims(int i) {
        this.j = i;
    }

    public final boolean a(ims imsVar) {
        ims imsVar2 = UNKNOWN;
        return (this == imsVar2 || imsVar == imsVar2 || ordinal() < imsVar.ordinal()) ? false : true;
    }
}
