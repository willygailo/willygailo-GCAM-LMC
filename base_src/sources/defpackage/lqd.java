package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lqd {
    public final ope a;
    public final ope b;
    public final ope c;
    public final ope d;
    public final int e;
    public final long f;
    private final int g;
    private final ojz h;

    public lqd(ope opeVar, ope opeVar2, ope opeVar3, ope opeVar4, int i, ojz ojzVar) {
        int i2;
        boolean z = true;
        obr.aF(!opeVar.isEmpty());
        if (i <= 0) {
            if (i == -1) {
                i = -1;
            } else {
                z = false;
            }
        }
        obr.aI(z, "Capacity %s must be greater than 0, or -1 to indicate that capacity is not tracked.", i);
        this.c = opeVar;
        this.a = opeVar2;
        this.b = opeVar3;
        this.d = opeVar4;
        this.e = i;
        this.h = ojzVar;
        this.f = mip.aW(opeVar2);
        synchronized (lrv.class) {
            i2 = lrv.a;
            lrv.a = i2 + 1;
        }
        this.g = i2;
    }

    public final lco a() {
        return (lco) this.h.a();
    }

    public final String toString() {
        int i = this.g;
        StringBuilder sb = new StringBuilder(23);
        sb.append("FrameStream-");
        sb.append(i);
        return sb.toString();
    }
}
