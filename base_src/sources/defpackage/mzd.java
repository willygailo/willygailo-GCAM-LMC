package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class mzd extends mzi implements mwa, mxo {
    private static final ouj a = ouj.h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl");
    private final Application b;
    private final mwe c;
    private final myy d;
    private final myv e;
    private final ArrayMap f;
    private final mxl g;
    private final qkg h;
    private final mxt i;
    private final ojz j;
    private final qkg k;

    public mzd(mxm mxmVar, Context context, mwe mweVar, pyn pynVar, myv myvVar, qkg qkgVar, qkg qkgVar2, Executor executor, mxt mxtVar, final qkg qkgVar3, boolean z) {
        ArrayMap arrayMap = new ArrayMap();
        this.f = arrayMap;
        obr.aQ(true);
        this.g = mxmVar.a(executor, pynVar, qkgVar2);
        this.b = (Application) context;
        this.c = mweVar;
        this.h = qkgVar;
        this.e = myvVar;
        this.i = mxtVar;
        this.j = obr.au(new ojz() { // from class: myx
            @Override // defpackage.ojz
            public final Object a() {
                return this.a.b(qkgVar3);
            }
        });
        this.k = qkgVar3;
        myz myzVar = new myz(arrayMap);
        this.d = z ? new mzb(myzVar) : new mzc(myzVar);
    }

    public pht a(Activity activity) {
        mze mzeVar;
        int i;
        qyg qygVar;
        int i2;
        mza mzaVarA = mza.a(activity);
        nco ncoVar = this.g.c;
        boolean z = ncoVar.c;
        ncu ncuVar = ncoVar.b;
        if (!z || !ncuVar.c()) {
            return phq.a;
        }
        synchronized (this.f) {
            mzeVar = (mze) this.f.remove(mzaVarA);
            if (this.f.isEmpty()) {
                this.d.d();
            }
        }
        if (mzeVar == null) {
            ((oug) ((oug) a.c()).G((char) 3631)).r("Measurement not found: %s", mzaVarA);
            return phq.a;
        }
        String strB = mzaVarA.b();
        if (Trace.isEnabled()) {
            for (mzj mzjVar : ((mzk) this.k.get()).b) {
                int iA = myw.a(mzjVar.a);
                if (iA == 0) {
                    iA = 1;
                }
                switch (iA - 1) {
                    case 1:
                        i2 = 0;
                        break;
                    case 2:
                        i2 = mzeVar.g;
                        break;
                    case 3:
                        i2 = mzeVar.i;
                        break;
                    case 4:
                        i2 = mzeVar.j;
                        break;
                    case 5:
                        i2 = mzeVar.k;
                        break;
                    case 6:
                        i2 = mzeVar.l;
                        break;
                    case 7:
                        i2 = mzeVar.n;
                        break;
                    default:
                        String str = mzjVar.b;
                        continue;
                }
                Trace.setCounter(mzjVar.b.replace("%EVENT_NAME%", strB), i2);
            }
            Trace.endAsyncSection(String.format("J<%s>", strB), 352691800);
        }
        if (mzeVar.i == 0) {
            return phq.a;
        }
        if (((mzk) this.k.get()).c && mzeVar.n <= TimeUnit.SECONDS.toMillis(9L) && mzeVar.g != 0) {
            this.i.a((String) this.j.a());
        }
        poy poyVarM = qyk.t.m();
        int iB = ((int) (mzeVar.c.b() - mzeVar.d)) + 1;
        poy poyVarM2 = qyc.o.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        qyc qycVar = (qyc) poyVarM2.b;
        int i3 = qycVar.a | 16;
        qycVar.a = i3;
        qycVar.f = iB;
        int i4 = mzeVar.g;
        int i5 = i3 | 1;
        qycVar.a = i5;
        qycVar.b = i4;
        int i6 = mzeVar.i;
        int i7 = i5 | 2;
        qycVar.a = i7;
        qycVar.c = i6;
        int i8 = mzeVar.j;
        int i9 = i7 | 4;
        qycVar.a = i9;
        qycVar.d = i8;
        int i10 = mzeVar.l;
        int i11 = i9 | 32;
        qycVar.a = i11;
        qycVar.g = i10;
        int i12 = mzeVar.n;
        int i13 = i11 | 64;
        qycVar.a = i13;
        qycVar.h = i12;
        int i14 = mzeVar.k;
        qycVar.a = i13 | 8;
        qycVar.e = i14;
        if (mzeVar.o != Integer.MIN_VALUE) {
            int[] iArr = mze.b;
            int[] iArr2 = mzeVar.f;
            int i15 = mzeVar.o;
            poy poyVarM3 = qyg.c.m();
            int i16 = 0;
            while (true) {
                if (i16 >= 52) {
                    if (iArr2[51] > 0) {
                        poyVarM3.am(i15 + 1);
                        poyVarM3.an(0);
                    }
                    qygVar = (qyg) poyVarM3.j();
                } else if (iArr[i16] > i15) {
                    poyVarM3.an(0);
                    poyVarM3.am(i15 + 1);
                    qygVar = (qyg) poyVarM3.j();
                } else {
                    int i17 = iArr2[i16];
                    if (i17 > 0 || (i16 > 0 && iArr2[i16 - 1] > 0)) {
                        poyVarM3.an(i17);
                        poyVarM3.am(iArr[i16]);
                    }
                    i16++;
                }
            }
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qyc qycVar2 = (qyc) poyVarM2.b;
            qygVar.getClass();
            qycVar2.n = qygVar;
            int i18 = qycVar2.a | 2048;
            qycVar2.a = i18;
            int i19 = mzeVar.h;
            int i20 = i18 | 512;
            qycVar2.a = i20;
            qycVar2.l = i19;
            int i21 = mzeVar.m;
            qycVar2.a = i20 | 1024;
            qycVar2.m = i21;
            i = 0;
        } else {
            i = 0;
        }
        while (i < 28) {
            if (mzeVar.e[i] > 0) {
                poy poyVarM4 = qyb.e.m();
                int i22 = mzeVar.e[i];
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                qyb qybVar = (qyb) poyVarM4.b;
                qybVar.a |= 1;
                qybVar.b = i22;
                int i23 = mze.a[i];
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                qyb qybVar2 = (qyb) poyVarM4.b;
                qybVar2.a |= 2;
                qybVar2.c = i23;
                int i24 = i + 1;
                if (i24 < 28) {
                    int i25 = mze.a[i24] - 1;
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    qyb qybVar3 = (qyb) poyVarM4.b;
                    qybVar3.a |= 4;
                    qybVar3.d = i25;
                }
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                qyc qycVar3 = (qyc) poyVarM2.b;
                qyb qybVar4 = (qyb) poyVarM4.j();
                qybVar4.getClass();
                ppm ppmVar = qycVar3.j;
                if (!ppmVar.c()) {
                    qycVar3.j = ppd.B(ppmVar);
                }
                qycVar3.j.add(qybVar4);
            }
            i++;
        }
        qyc qycVar4 = (qyc) poyVarM2.j();
        poy poyVar = (poy) qycVar4.G(5);
        poyVar.o(qycVar4);
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        qyc qycVar5 = (qyc) poyVar.b;
        qycVar5.a |= 256;
        qycVar5.k = 0;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qyk qykVar = (qyk) poyVarM.b;
        qyc qycVar6 = (qyc) poyVar.j();
        qycVar6.getClass();
        qykVar.k = qycVar6;
        qykVar.a |= 2048;
        qyk qykVar2 = (qyk) poyVarM.j();
        mxl mxlVar = this.g;
        mxf mxfVarA = mxg.a();
        mxfVarA.d(qykVar2);
        mxfVarA.b = null;
        mxfVarA.c = "Activity";
        mxfVarA.a = mzaVarA.b();
        mxfVarA.b(true);
        return mxlVar.b(mxfVarA.a());
    }

    public /* synthetic */ String b(qkg qkgVar) {
        return ((mzk) qkgVar.get()).a.replace("%PACKAGE_NAME%", this.b.getPackageName());
    }

    @Override // defpackage.mwa
    public void c(Activity activity) {
        synchronized (this.f) {
            this.f.clear();
        }
    }

    public void d(Activity activity) {
        mza mzaVarA = mza.a(activity);
        if (this.g.c(mzaVarA.b())) {
            synchronized (this.f) {
                if (this.f.size() >= 25) {
                    ((oug) ((oug) a.c()).G(3634)).r("Too many concurrent measurements, ignoring %s", mzaVarA);
                    return;
                }
                mze mzeVar = (mze) this.f.put(mzaVarA, ((mzf) this.h).get());
                if (mzeVar != null) {
                    this.f.put(mzaVarA, mzeVar);
                    ((oug) ((oug) a.c()).G(3633)).r("measurement already started: %s", mzaVarA);
                } else {
                    if (this.f.size() == 1) {
                        this.d.c();
                    }
                    if (Trace.isEnabled()) {
                        Trace.beginAsyncSection(String.format("J<%s>", mzaVarA.b()), 352691800);
                    }
                }
            }
        }
    }

    @Override // defpackage.mxo
    public void t() {
        this.c.a(this.d);
        this.c.a(this.e);
    }
}
