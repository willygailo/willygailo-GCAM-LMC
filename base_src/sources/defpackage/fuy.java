package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fuy implements dvq, fuw {
    private static final long b = Math.round(1.6666666666666666E7d);
    public final dvp a;
    private final long d;
    private final List f;
    private final Executor g;
    private final ddf h;
    private final ojc i;
    private volatile hjz l;
    private volatile fuv m;
    private volatile long n;
    private volatile int p;
    private final gxm q;
    private final hkm r;
    private final hkm s;
    private ojc k = oih.a;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicBoolean e = new AtomicBoolean(true);
    private volatile long o = Long.MAX_VALUE;
    private final List j = new ArrayList();

    public fuy(dvp dvpVar, long j, List list, int i, Executor executor, gxm gxmVar, ddf ddfVar, ojc ojcVar, byte[] bArr) {
        hkm hkmVar;
        this.a = dvpVar;
        this.d = j;
        this.f = list;
        this.p = i;
        this.g = executor;
        this.q = gxmVar;
        this.h = ddfVar;
        this.i = ojcVar;
        if (ddfVar == null || !ddfVar.k(dds.I)) {
            this.r = new hkm(0.3f, 0.6f, null);
            hkmVar = new hkm(0.5f, 0.8f, null);
        } else {
            this.r = new hkm(0.3f, 0.6f, null);
            hkmVar = new hkm(0.6f, 0.8f, null);
        }
        this.s = hkmVar;
    }

    private final int b(List list) {
        int size = list.size();
        do {
            size--;
            if (size <= 1) {
                break;
            }
        } while (((hjz) list.get(size)).b > this.d + b);
        this.l = (hjz) list.get(size);
        return size;
    }

    private final ojc c(hjz hjzVar) {
        hjz hjzVar2 = this.l;
        if (hjzVar2 == null || hjzVar == null) {
            return oih.a;
        }
        e(hjzVar);
        long j = hjzVar.b;
        long j2 = this.d;
        if (j < j2) {
            return oih.a;
        }
        if (j > j2 + 1500000000) {
            ojc.i(fuz.MAX_LENGTH);
            return ojc.i(fuz.MAX_LENGTH);
        }
        for (fvh fvhVar : this.f) {
            if (fvhVar.b(hjzVar, hjzVar2)) {
                ojc.i(fvhVar.a());
                return ojc.i(fvhVar.a());
            }
        }
        return oih.a;
    }

    private final synchronized void e(hjz hjzVar) {
        this.j.add(hjzVar);
    }

    private final void f(fuz fuzVar) {
        if (fuzVar.equals(fuz.ADAPTIVE_DISTANCE)) {
            this.o = Math.max(this.d, this.o - (dvv.h * 6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    private final void g(fuv fuvVar, long j, fuz fuzVar) {
        boolean zI;
        boolean zH;
        boolean z = false;
        if (!this.c.compareAndSet(false, true) || fuvVar == null) {
            return;
        }
        long jMin = Math.min(TimeUnit.MICROSECONDS.convert(this.o, TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.d, TimeUnit.NANOSECONDS) + 1500000);
        if (this.h != null) {
            ddi ddiVar = ddr.a;
            int i = this.p;
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                zI = i();
            } else {
                zI = false;
            }
        } else {
            zI = false;
        }
        if (this.q.d()) {
            int i2 = this.p;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 1) {
                zH = h();
            } else {
                zH = false;
            }
        } else {
            zH = false;
        }
        if (jMin - j < 1000000) {
            z = zH;
        } else {
            if (!zI || zH) {
                fuvVar.b(jMin, fuzVar);
                return;
            }
            zI = true;
        }
        int i3 = this.p;
        if (i3 == 0) {
            throw null;
        }
        if (i3 != 1) {
            int i4 = this.p;
            if (i4 == 0) {
                throw null;
            }
            if (i4 == 2) {
                fuvVar.b(j + 1000000, fuzVar);
                return;
            }
            String strE = fvq.e(this.p);
            StringBuilder sb = new StringBuilder(strE.length() + 22);
            sb.append("Unknown trimming mode:");
            sb.append(strE);
            throw new IllegalStateException(sb.toString());
        }
        if (zI && !z) {
            ojc.i(fuj.STATIC_SCENE_OR_NO_BETTER_FRAME);
            fuvVar.a(fuj.STATIC_SCENE_OR_NO_BETTER_FRAME);
        } else if (TimeUnit.MICROSECONDS.convert(this.d, TimeUnit.NANOSECONDS) - j < dvv.g * 10) {
            ojc.i(fuj.START_TOO_CLOSE_TO_SHUTTER);
            fuvVar.a(fuj.START_TOO_CLOSE_TO_SHUTTER);
        } else {
            ojc.i(fuj.TOO_SHORT);
            fuvVar.a(fuj.TOO_SHORT);
        }
    }

    private final synchronized boolean h() {
        boolean z;
        hkn hknVarC = ((hko) ((ojj) this.i).a).c(this.l.b);
        if (hknVarC == null) {
            return false;
        }
        Iterator it = this.j.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            hkn hknVarC2 = ((hko) ((ojj) this.i).a).c(((hjz) it.next()).b);
            float f2 = hknVarC2 == null ? 0.0f : hknVarC2.b;
            if (f2 > f) {
                f = f2;
            }
        }
        if (this.h.k(dds.i)) {
            this.h.d();
            z = true;
        } else {
            z = false;
        }
        return ftw.a(f - hknVarC.b, z) > 0.6f;
    }

    private final synchronized boolean i() {
        int size = this.j.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < size; i++) {
            hjz hjzVar = (hjz) this.j.get(i);
            f += hjzVar.h;
            float f3 = hjzVar.o;
            if (f3 > f2) {
                f2 = f3;
            }
        }
        float size2 = f / this.j.size();
        float fJ = j(size2, this.r);
        float fJ2 = j(size2, this.s);
        if (this.h.k(dds.I) && size2 < 1.0E-9d) {
            fJ = 0.6f;
            fJ2 = 0.8f;
        }
        Iterator it = this.j.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            float f4 = ((hjz) it.next()).o;
            if (f4 > 0.1f) {
                f4 /= f2;
            }
            if (f4 > fJ) {
                i2++;
            } else {
                i3++;
            }
        }
        if (i2 == 0) {
            return true;
        }
        return ((float) i2) / ((float) (i2 + i3)) < fJ2;
    }

    private static final float j(float f, hkm hkmVar) {
        float f2 = hkmVar.b;
        float f3 = hkmVar.a;
        float fMin = Math.min(Math.max((f - 1.0f) / 0.5f, 0.0f), 1.0f);
        return (f2 * (1.0f - fMin)) + (f3 * fMin);
    }

    @Override // defpackage.fuw
    public final long a() {
        List listC = this.a.c();
        if (listC.isEmpty()) {
            return TimeUnit.MICROSECONDS.convert(this.d, TimeUnit.NANOSECONDS) - 1500000;
        }
        int iB = b(listC);
        long j = this.l.b;
        int i = iB - 1;
        while (true) {
            if (i < 0) {
                this.k = ojc.i(fuz.MAX_LENGTH);
                break;
            }
            hjz hjzVar = (hjz) listC.get(i);
            long j2 = hjzVar.b;
            hjz hjzVar2 = this.l;
            if (hjzVar2 != null && hjzVar != null) {
                e(hjzVar);
                long j3 = hjzVar.b;
                long j4 = this.d;
                if (j3 > j4) {
                    continue;
                } else {
                    if (j3 < j4 - 1500000000) {
                        this.k = ojc.i(fuz.MAX_LENGTH);
                    } else {
                        Iterator it = this.f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                fvh fvhVar = (fvh) it.next();
                                if (fvhVar.b(hjzVar, hjzVar2)) {
                                    this.k = ojc.i(fvhVar.a());
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (i <= iB) {
                        break;
                    }
                }
            }
            i--;
            j = j2;
        }
        this.n = Math.min(Math.max(TimeUnit.MICROSECONDS.convert(j + (this.k.equals(ojc.i(fuz.ADAPTIVE_DISTANCE)) ? dvv.h * 6 : 0L), TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.d, TimeUnit.NANOSECONDS) - 1500000), TimeUnit.MICROSECONDS.convert(this.d, TimeUnit.NANOSECONDS));
        return this.n;
    }

    @Override // defpackage.fuw
    public final void d(fuv fuvVar) {
        this.m = new fux(this, fuvVar);
        this.a.f(this, this.g);
    }

    @Override // defpackage.dvq
    public final synchronized void k(hjz hjzVar) {
        fuv fuvVar = this.m;
        long j = this.n;
        if (!this.e.compareAndSet(true, false)) {
            ojc ojcVarC = c(hjzVar);
            if (ojcVarC.g()) {
                f((fuz) ojcVarC.c());
                g(fuvVar, j, (fuz) ojcVarC.c());
            } else {
                this.o = hjzVar.b;
            }
            return;
        }
        List listC = this.a.c();
        if (!listC.isEmpty()) {
            this.o = this.d;
            for (int iB = b(listC) + 1; iB < listC.size(); iB++) {
                hjz hjzVar2 = (hjz) listC.get(iB);
                ojc ojcVarC2 = c(hjzVar2);
                if (ojcVarC2.g()) {
                    f((fuz) ojcVarC2.c());
                    g(fuvVar, j, (fuz) ojcVarC2.c());
                } else {
                    this.o = hjzVar2.b;
                }
            }
        }
    }
}
