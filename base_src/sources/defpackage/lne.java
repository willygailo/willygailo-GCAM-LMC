package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lne {
    public lnt a;
    public lnt b;
    public lnt c;
    public Long d;
    public Integer e;
    private lvs f;
    private lnp g;
    private lnt h;
    private lnt i;
    private ooh j;
    private oom k;
    private opc l;
    private ope m;
    private llt n;
    private lmo o;
    private ope p;
    private mip q;

    public final lnf a() {
        lnp lnpVar;
        lnt lntVar;
        lnt lntVar2;
        lnt lntVar3;
        lnt lntVar4;
        lnt lntVar5;
        mip mipVar;
        llt lltVar;
        lmo lmoVar;
        Long l;
        llt lltVar2 = this.n;
        if (!(lltVar2 == null ? oih.a : ojc.i(lltVar2)).g()) {
            this.n = new llu();
        }
        ooh oohVar = this.j;
        if (oohVar != null) {
            this.k = oohVar.f();
        } else if (this.k == null) {
            this.k = oom.l();
        }
        opc opcVar = this.l;
        if (opcVar != null) {
            this.m = opcVar.f();
        } else if (this.m == null) {
            this.m = orx.a;
        }
        lvs lvsVar = this.f;
        if (lvsVar != null && (lnpVar = this.g) != null && (lntVar = this.h) != null && (lntVar2 = this.a) != null && (lntVar3 = this.b) != null && (lntVar4 = this.c) != null && (lntVar5 = this.i) != null && (mipVar = this.q) != null && (lltVar = this.n) != null && (lmoVar = this.o) != null && (l = this.d) != null && this.e != null && this.p != null) {
            lnf lnfVar = new lnf(lvsVar, lnpVar, lntVar, lntVar2, lntVar3, lntVar4, lntVar5, mipVar, this.k, this.m, lltVar, lmoVar, l.longValue(), this.e.intValue(), this.p, null, null, null);
            int i = ((orr) lnfVar.g).c;
            if (lnfVar.b == lnp.HIGH_SPEED) {
                lnp lnpVar2 = lnp.HIGH_SPEED;
                if (i > 2) {
                    throw new IllegalStateException(obr.aw("At most 2 surfaces are supported in %s, but we get %s", lnpVar2, Integer.valueOf(i)));
                }
                oom oomVar = lnfVar.g;
                int i2 = ((orr) oomVar).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    lnz lnzVar = (lnz) oomVar.get(i3);
                    obr.aR((lnzVar.a == loa.SURFACE || lnzVar.a == loa.SURFACE_DEFERRED || lnzVar.a == loa.SURFACE_VIEW) ? true : lnzVar.a == loa.SURFACE_TEXTURE, "Streams in highspeed operating mode must be a viewfinder or MediaRecorder/MediaCodec surface.");
                }
            }
            obr.aR(i > 0, "At least one stream should be provided");
            return lnfVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" cameraId");
        }
        if (this.g == null) {
            sb.append(" operatingMode");
        }
        if (this.h == null) {
            sb.append(" template");
        }
        if (this.a == null) {
            sb.append(" captureTemplate");
        }
        if (this.b == null) {
            sb.append(" reprocessingTemplate");
        }
        if (this.c == null) {
            sb.append(" repeatingTemplate");
        }
        if (this.i == null) {
            sb.append(" repeatingCaptureTemplate");
        }
        if (this.q == null) {
            sb.append(" frameListener");
        }
        if (this.n == null) {
            sb.append(" fatalErrorHandler");
        }
        if (this.o == null) {
            sb.append(" cameraDeviceErrorListener");
        }
        if (this.d == null) {
            sb.append(" result3ATimeoutNs");
        }
        if (this.e == null) {
            sb.append(" result3ATimeoutFrameCount");
        }
        if (this.p == null) {
            sb.append(" quirks");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final opc b() {
        if (this.l == null) {
            this.l = ope.D();
        }
        return this.l;
    }

    public final void c(Set set) {
        b().i(set);
    }

    public final void d(lnz lnzVar) {
        if (this.j == null) {
            this.j = oom.e();
        }
        this.j.g(lnzVar);
    }

    public final void e(lmo lmoVar) {
        if (lmoVar == null) {
            throw new NullPointerException("Null cameraDeviceErrorListener");
        }
        this.o = lmoVar;
    }

    public final void f(lvs lvsVar) {
        if (lvsVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f = lvsVar;
    }

    public final void g(lnp lnpVar) {
        if (lnpVar == null) {
            throw new NullPointerException("Null operatingMode");
        }
        this.g = lnpVar;
    }

    public final void h(ope opeVar) {
        if (opeVar == null) {
            throw new NullPointerException("Null quirks");
        }
        this.p = opeVar;
    }

    public final void i(lnt lntVar) {
        if (lntVar == null) {
            throw new NullPointerException("Null repeatingCaptureTemplate");
        }
        this.i = lntVar;
    }

    public final void j(lnt lntVar) {
        if (lntVar == null) {
            throw new NullPointerException("Null template");
        }
        this.h = lntVar;
    }

    public final void k(mip mipVar) {
        if (mipVar == null) {
            throw new NullPointerException("Null frameListener");
        }
        this.q = mipVar;
    }
}
