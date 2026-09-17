package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lea {
    MPEG_4(2, 0, mbs.MPEG4),
    WEBM(9, 1, mbs.WEBM),
    THREE_GPP(1, 2, mbs.THREE_GPP);

    public final int d;
    public final int e;
    public final mbs f;

    lea(int i, int i2, mbs mbsVar) {
        this.d = i;
        this.e = i2;
        this.f = mbsVar;
    }

    public static boolean a(les lesVar) {
        int i = lesVar.e;
        return i == 2 || i == 1;
    }
}
