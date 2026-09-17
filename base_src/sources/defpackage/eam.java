package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
import com.Helper;
import com.custom.Astro;
import com.custom.OneShot;
import j$.util.function.Supplier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class eam {
    public final lce a;
    public final lco b;
    public final Supplier c;
    public final lce d;
    public boolean e;
    private final ddf f;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private long j = -1;
    private final List k = new CopyOnWriteArrayList();
    private final lco l;
    private final huf m;
    private final lco n;
    private final lco o;
    private final hlv p;
    private final ead q;
    private boolean r;

    public eam(ddf ddfVar, lco lcoVar, lco lcoVar2, lco lcoVar3, final Supplier supplier, hlv hlvVar, huf hufVar, bui buiVar, lar larVar, ead eadVar) {
        lce lceVar = new lce(false);
        this.a = lceVar;
        lce lceVar2 = new lce(false);
        this.d = lceVar2;
        this.f = ddfVar;
        this.m = hufVar;
        this.n = lcoVar2;
        this.c = supplier;
        this.o = lcoVar3;
        this.p = hlvVar;
        this.b = lcv.d(lcoVar, lceVar, lceVar2);
        this.q = eadVar;
        ddi ddiVar = ddm.a;
        ddfVar.f();
        this.l = new eal(this, lcoVar, lcoVar2);
        if (ddfVar.k(ddm.aa)) {
            buiVar.b.c(lcoVar2.a(new lij() { // from class: eaj
                /* JADX WARN: Code duplicated, block: B:15:0x0045  */
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    boolean z;
                    eam eamVar = this.a;
                    Supplier supplier2 = supplier;
                    Float f = (Float) obj;
                    boolean zBooleanValue = ((Boolean) eamVar.d.d).booleanValue();
                    int i = Helper.sAutoNS;
                    if (i > 0) {
                        z = true;
                    } else if (i >= 0) {
                        z = false;
                        if (!zBooleanValue) {
                            eamVar.a.fB(false);
                            return;
                        }
                        dzc dzcVar = (dzc) supplier2.get();
                        float f2 = ((Boolean) eamVar.a.d).booleanValue() ? dzcVar.b : dzcVar.a;
                        if (!f.equals(Float.valueOf(-999.0f)) && f.floatValue() < f2) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (z == ((Boolean) eamVar.a.d).booleanValue() || eamVar.e) {
                        return;
                    }
                    eamVar.a.fB(Boolean.valueOf(z));
                }
            }, larVar));
        }
    }

    private final synchronized void r(boolean z, boolean z2, lwd lwdVar, boolean z3, boolean z4) {
        if (this.q.g) {
            this.h = z;
            boolean z5 = false;
            if (lwdVar.equals(lwd.FRONT) || Helper.sFront != 0 || Helper.sModeNS == 0 || ((OneShot.OneShotState == 0 && Astro.AstroState == 0) || (((Integer) this.m.c(htu.W)).equals(Integer.valueOf(hls.g(1))) && this.p.a))) {
                this.h = false;
            } else {
                z5 = true;
                this.h = true;
            }
            boolean z6 = false;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((eak) it.next()).b(this.h && !z4);
            }
            if (!z3) {
                this.h = z5;
                z6 = false;
            }
            if (((Float) this.o.fA()).floatValue() < 1.0f) {
                boolean z7 = this.h;
                this.h = z5;
                this.j = SystemClock.elapsedRealtimeNanos();
                z5 = z7;
                z6 = false;
            } else if (this.j <= -1 || TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - this.j) >= 3) {
                this.j = -1L;
            } else {
                this.h = z5;
                z6 = false;
            }
            if (z4) {
                this.i = this.h;
            }
            Iterator it2 = this.k.iterator();
            while (it2.hasNext()) {
                ((eak) it2.next()).a(this.h, z6, z5, !z4);
            }
        }
    }

    public final synchronized lco a() {
        return this.b;
    }

    public final synchronized lco b() {
        return this.a;
    }

    public final synchronized lco c() {
        return this.l;
    }

    public final synchronized lie d(final eak eakVar) {
        if (this.k.contains(eakVar)) {
            return new jmf(3);
        }
        this.k.add(eakVar);
        return new lie() { // from class: eai
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.a.h(eakVar);
            }
        };
    }

    public final void e(gog gogVar) {
        if (((Boolean) this.d.d).booleanValue()) {
            iij iijVarK = gogVar.b.k();
            poy poyVarM = ozu.e.m();
            boolean zBooleanValue = ((Boolean) a().fA()).booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ozu ozuVar = (ozu) poyVarM.b;
            ozuVar.a |= 1;
            ozuVar.b = zBooleanValue;
            boolean zBooleanValue2 = ((Boolean) ((lce) b()).d).booleanValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ozu ozuVar2 = (ozu) poyVarM.b;
            ozuVar2.a |= 2;
            ozuVar2.c = zBooleanValue2;
            float fFloatValue = ((Float) this.n.fA()).floatValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            ozu ozuVar3 = (ozu) poyVarM.b;
            ozuVar3.a |= 4;
            ozuVar3.d = fFloatValue;
            ((iik) iijVarK).o = (ozu) poyVarM.j();
        }
    }

    public final synchronized void f(boolean z, lwd lwdVar, boolean z2, boolean z3) {
        r(z, false, lwdVar, z2, z3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
    public final synchronized void g(lzv lzvVar, boolean z, boolean z2, lwd lwdVar, boolean z3) {
        boolean z4;
        boolean z5;
        if (!this.r) {
            Long l = (Long) lzvVar.d(TotalCaptureResult.SENSOR_EXPOSURE_TIME);
            Integer num = (Integer) lzvVar.d(TotalCaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            Integer num2 = (Integer) lzvVar.d(TotalCaptureResult.SENSOR_SENSITIVITY);
            obr.ao(l);
            long jLongValue = l.longValue();
            obr.ao(num);
            int iIntValue = num.intValue();
            obr.ao(num2);
            if (jLongValue * 1.0E-6f * num2.intValue() * iIntValue <= ddq.a(this.f, lwdVar) * 0.9f) {
                z4 = false;
                z5 = false;
            } else if (z) {
                z4 = true;
                z5 = false;
            } else if (z2) {
                z4 = false;
                z5 = true;
            } else {
                z4 = false;
                z5 = false;
            }
            r(z4, z5, lwdVar, z3, false);
        }
    }

    public final synchronized void h(eak eakVar) {
        this.k.remove(eakVar);
    }

    public final synchronized void i(boolean z) {
        this.d.fB(Boolean.valueOf(z));
    }

    public final synchronized void j(boolean z) {
        this.e = z;
    }

    public final synchronized void k(boolean z) {
        this.r = z;
    }

    public final synchronized void l(boolean z) {
        this.g = z;
        if (!z) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((eak) it.next()).c();
            }
        }
    }

    public final synchronized boolean m() {
        return this.h;
    }

    public final synchronized boolean n() {
        return this.i;
    }

    public final synchronized boolean o() {
        return this.g;
    }

    public final synchronized void p() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((eak) it.next()).d();
        }
    }

    public final synchronized void q() {
        ddf ddfVar = this.f;
        ddi ddiVar = ddm.a;
        ddfVar.b();
    }
}
