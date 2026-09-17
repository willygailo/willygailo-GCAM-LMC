package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class him {
    public Rect f;
    private final mad i;
    public lwd a = null;
    public hsr b = hsr.UNKNOWN;
    public lic c = lic.CLOCKWISE_0;
    public pht d = null;
    public iij e = null;
    public Long g = null;
    private Long j = null;
    public htf h = htf.OFF;

    public him(mad madVar) {
        this.f = null;
        this.i = madVar;
        this.f = madVar.e();
    }

    public final hin a() {
        Long lValueOf = this.g;
        Long lValueOf2 = this.j;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(this.i.d());
        }
        if (lValueOf2 == null) {
            lValueOf2 = Long.valueOf(jum.a(lValueOf.longValue()));
        }
        mad madVar = this.i;
        hsr hsrVar = this.b;
        lwd lwdVar = this.a;
        lic licVar = this.c;
        pht phtVar = this.d;
        Rect rect = this.f;
        return new hin(madVar, hsrVar, lwdVar, licVar, phtVar, rect == null ? madVar.e() : rect, lValueOf.longValue(), lValueOf2.longValue(), this.e, this.h);
    }

    public final void b(long j) {
        this.j = Long.valueOf(j);
    }

    public final void c(lzv lzvVar) {
        this.d = lzvVar != null ? plk.V(lzvVar) : null;
    }
}
