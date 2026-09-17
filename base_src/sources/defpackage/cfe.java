package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.util.Range;
import android.view.Surface;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class cfe {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/CamcorderController");
    public final jtx A;
    private final cev B;
    private final cka C;
    private final Executor D;
    private final qkg E;
    private final qkg F;
    private final cvc G;
    private final cux H;
    private final ojc I;
    private cni J;
    private pht K;
    private final nvb L;
    public final ckh b;
    public final lar c;
    public final cvo d;
    public final ljf e;
    public final kas g;
    public final jlb h;
    public final iuf i;
    public final iju j;
    public final dlt k;
    public final cxz l;
    public final ddf m;
    public final epj o;
    public cfy q;
    public cju r;
    public boolean s;
    public boolean t;
    public cvf u;
    public int v;
    public final cwc x;
    public cng y;
    public final emb z;
    public final List f = new ArrayList();
    final jli n = new cfa(this);
    final epi p = new cfb(this);
    public final Object w = new Object();

    public cfe(ckh ckhVar, cev cevVar, nvb nvbVar, cka ckaVar, Executor executor, emb embVar, qkg qkgVar, qkg qkgVar2, cvo cvoVar, kas kasVar, epj epjVar, lar larVar, ljf ljfVar, jlb jlbVar, iuf iufVar, iju ijuVar, cvc cvcVar, cux cuxVar, dlt dltVar, cwc cwcVar, jtx jtxVar, cxz cxzVar, ojc ojcVar, ddf ddfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.B = cevVar;
        this.L = nvbVar;
        this.C = ckaVar;
        this.b = ckhVar;
        this.D = executor;
        this.z = embVar;
        this.E = qkgVar;
        this.F = qkgVar2;
        this.d = cvoVar;
        this.g = kasVar;
        this.o = epjVar;
        this.c = larVar;
        this.e = ljfVar;
        this.h = jlbVar;
        this.i = iufVar;
        this.j = ijuVar;
        this.G = cvcVar;
        this.H = cuxVar;
        this.k = dltVar;
        this.x = cwcVar;
        this.A = jtxVar;
        this.l = cxzVar;
        this.I = ojcVar;
        this.m = ddfVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void q() {
        int i;
        synchronized (this.w) {
            pht phtVar = this.K;
            int i2 = 1;
            if (phtVar != null && !phtVar.isDone()) {
                phtVar.cancel(true);
            }
            this.K = null;
            if (this.q != null) {
                this.j.i(ijt.CAPTURE_SESSION_CLOSED);
                cvf cvfVar = this.u;
                cvfVar.getClass();
                cvfVar.d(this.j.c(ijt.CAPTURE_SESSION_STARTED, ijt.CAPTURE_SESSION_CLOSED));
                cvfVar.c(this.H.b());
                cvc cvcVar = this.G;
                cvf cvfVar2 = this.u;
                cvfVar2.getClass();
                Integer num = cvfVar2.a;
                if (num != null && cvfVar2.b != null && cvfVar2.c != null && cvfVar2.d != null && cvfVar2.e != 0 && cvfVar2.f != 0) {
                    cvg cvgVar = new cvg(num.intValue(), cvfVar2.b.intValue(), cvfVar2.c.intValue(), cvfVar2.d, cvfVar2.e, cvfVar2.f);
                    poy poyVarM = pek.h.m();
                    int i3 = cvgVar.a;
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pek pekVar = (pek) poyVarM.b;
                    int i4 = pekVar.a | 1;
                    pekVar.a = i4;
                    pekVar.b = i3;
                    int i5 = cvgVar.b;
                    int i6 = i4 | 2;
                    pekVar.a = i6;
                    pekVar.c = i5;
                    int i7 = cvgVar.c;
                    pekVar.a = i6 | 4;
                    pekVar.d = i7;
                    boolean z = cvgVar.d == lwd.FRONT;
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pek pekVar2 = (pek) poyVarM.b;
                    int i8 = pekVar2.a | 8;
                    pekVar2.a = i8;
                    pekVar2.e = z;
                    int i9 = cvgVar.e;
                    cqj cqjVar = cqj.OFF;
                    lga lgaVar = lga.VIDEO_BUFFER_DELAY;
                    jrl jrlVar = jrl.UNINITIALIZED;
                    int i10 = i9 - 1;
                    if (i9 == 0) {
                        throw null;
                    }
                    switch (i10) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        default:
                            String strC = agq.c(i9);
                            StringBuilder sb = new StringBuilder(strC.length() + 27);
                            sb.append("Not a valid session state: ");
                            sb.append(strC);
                            throw new IllegalArgumentException(sb.toString());
                    }
                    pekVar2.f = i - 1;
                    int i11 = i8 | 16;
                    pekVar2.a = i11;
                    int i12 = cvgVar.f;
                    int i13 = i12 - 1;
                    if (i12 == 0) {
                        throw null;
                    }
                    switch (i13) {
                        case 0:
                            pekVar2.g = i2 - 1;
                            pekVar2.a = i11 | 32;
                            cvcVar.a.K((pek) poyVarM.j());
                            this.u = null;
                            this.q = null;
                            break;
                        case 1:
                            i2 = 2;
                            pekVar2.g = i2 - 1;
                            pekVar2.a = i11 | 32;
                            cvcVar.a.K((pek) poyVarM.j());
                            this.u = null;
                            this.q = null;
                            break;
                        case 2:
                            i2 = 3;
                            pekVar2.g = i2 - 1;
                            pekVar2.a = i11 | 32;
                            cvcVar.a.K((pek) poyVarM.j());
                            this.u = null;
                            this.q = null;
                            break;
                        case 3:
                            i2 = 4;
                            pekVar2.g = i2 - 1;
                            pekVar2.a = i11 | 32;
                            cvcVar.a.K((pek) poyVarM.j());
                            this.u = null;
                            this.q = null;
                            break;
                        case 4:
                            i2 = 5;
                            pekVar2.g = i2 - 1;
                            pekVar2.a = i11 | 32;
                            cvcVar.a.K((pek) poyVarM.j());
                            this.u = null;
                            this.q = null;
                            break;
                        case 5:
                            i2 = 6;
                            pekVar2.g = i2 - 1;
                            pekVar2.a = i11 | 32;
                            cvcVar.a.K((pek) poyVarM.j());
                            this.u = null;
                            this.q = null;
                            break;
                        case 6:
                            i2 = 7;
                            pekVar2.g = i2 - 1;
                            pekVar2.a = i11 | 32;
                            cvcVar.a.K((pek) poyVarM.j());
                            this.u = null;
                            this.q = null;
                            break;
                        default:
                            String strD = agq.d(i12);
                            StringBuilder sb2 = new StringBuilder(strD.length() + 28);
                            sb2.append("Not a valid session source: ");
                            sb2.append(strD);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                if (cvfVar2.a == null) {
                    sb3.append(" creationLatencyMs");
                }
                if (cvfVar2.b == null) {
                    sb3.append(" sessionDurationMs");
                }
                if (cvfVar2.c == null) {
                    sb3.append(" numRecordedSessions");
                }
                if (cvfVar2.d == null) {
                    sb3.append(" cameraFacing");
                }
                if (cvfVar2.e == 0) {
                    sb3.append(" sessionState");
                }
                if (cvfVar2.f == 0) {
                    sb3.append(" sessionSource");
                }
                String strValueOf = String.valueOf(sb3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                sb4.append("Missing required properties:");
                sb4.append(strValueOf);
                throw new IllegalStateException(sb4.toString());
            }
            this.t = false;
            this.L.l(cms.CAPTURE_SESSION);
            this.L.l(cms.VIDEO_RECORDER);
            Collection.EL.stream(this.f).forEach(cez.b);
            cju cjuVar = this.r;
            if (cjuVar != null) {
                cjuVar.a(cjr.CAPTURE_SESSION_CLOSED);
            }
        }
    }

    private final boolean r() {
        boolean z;
        synchronized (this.w) {
            z = this.q != null;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:243:0x066c  */
    /* JADX WARN: Code duplicated, block: B:289:0x0724  */
    /* JADX WARN: Code duplicated, block: B:301:0x0755  */
    /* JADX WARN: Type inference failed for: r32v1, types: [cgk, java.lang.Object] */
    private final void s(int i) throws Throwable {
        cev cevVar;
        lvs lvsVar;
        lji ljiVar;
        cjo cjoVar;
        leb lebVarA;
        ldz ldzVar;
        ojc ojcVarI;
        lee leeVarA;
        lig ligVar;
        Intent intent;
        ojc ojcVarI2;
        boolean z;
        boolean z2;
        boolean z3;
        lvs lvsVar2;
        cjo cjoVar2;
        ldz ldzVar2;
        leb lebVar;
        lig ligVar2;
        leh lehVar;
        Boolean bool;
        synchronized (this.w) {
            try {
                try {
                    this.r.a(cjr.INITIATING);
                    cvf cvfVar = new cvf();
                    cvfVar.b(0);
                    cvfVar.d(0);
                    cvfVar.c(0);
                    cvfVar.a(lwd.BACK);
                    cvfVar.e = 1;
                    cvfVar.f = i;
                    cvfVar.a(this.d.d());
                    this.u = cvfVar;
                    this.e.a("CamcorderControllers#createCaptureSession");
                    this.j.a();
                    this.j.i(ijt.CAPTURE_SESSION_STARTING);
                    Collection.EL.stream(this.f).forEach(cez.a);
                    cev cevVar2 = this.B;
                    lar.a();
                    lji ljiVarA = cevVar2.c.a("CamcorderCaptureSessionFactory#createNewSession");
                    cfk cfkVar = cevVar2.k;
                    ckh ckhVar = cevVar2.f;
                    final ckd ckdVar = cfkVar.e;
                    if (ckdVar != null) {
                        cevVar = cevVar2;
                        ljiVar = ljiVarA;
                    } else {
                        try {
                            synchronized (cfkVar.f) {
                                try {
                                    ckd ckdVar2 = cfkVar.e;
                                    if (ckdVar2 != null) {
                                        cevVar = cevVar2;
                                        ckdVar = ckdVar2;
                                        ljiVar = ljiVarA;
                                    } else {
                                        cfkVar.h.k(cms.CAPTURE_SESSION).c(cfkVar);
                                        lvs lvsVarB = ckhVar.b();
                                        lvsVarB.getClass();
                                        lvs lvsVarC = ckhVar.c();
                                        lvsVarC.getClass();
                                        Intent intentA = ckhVar.h.a();
                                        cjp cjpVar = cfkVar.g.a;
                                        if (cjpVar.b.containsKey(lvsVarC)) {
                                            cjoVar = (cjo) cjpVar.b.get(lvsVarC);
                                            cevVar = cevVar2;
                                            lvsVar = lvsVarB;
                                            ljiVar = ljiVarA;
                                        } else {
                                            ghx ghxVarF = cjpVar.c.f(lvsVarC);
                                            HashMap map = new HashMap();
                                            map.put(ldz.FPS_30, cjpVar.a(lvsVarC, ldz.FPS_30));
                                            map.put(ldz.FPS_60, cjpVar.a(lvsVarC, ldz.FPS_60));
                                            map.put(ldz.FPS_AUTO, cjpVar.a(lvsVarC, ldz.FPS_AUTO));
                                            map.put(ldz.FPS_24, cjpVar.a(lvsVarC, ldz.FPS_24));
                                            map.put(ldz.FPS_60C_30E, cjpVar.a(lvsVarC, ldz.FPS_60C_30E));
                                            map.put(ldz.FPS_60C_24E, cjpVar.a(lvsVarC, ldz.FPS_60C_24E));
                                            HashMap map2 = new HashMap();
                                            for (Iterator it = ldz.d().iterator(); it.hasNext(); it = it) {
                                                try {
                                                    map2.put((ldz) it.next(), new ArrayList());
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                            if (ghxVarF.K()) {
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it2 = ghxVarF.w().iterator();
                                                while (it2.hasNext()) {
                                                    it2 = it2;
                                                    ljiVarA = ljiVarA;
                                                    leb lebVar2 = (leb) leb.l.get((lig) it2.next());
                                                    if (lebVar2 != null) {
                                                        arrayList.add(lebVar2);
                                                    }
                                                }
                                                ljiVar = ljiVarA;
                                                Iterator it3 = arrayList.iterator();
                                                while (it3.hasNext()) {
                                                    leb lebVar3 = (leb) it3.next();
                                                    len lenVarA = len.a(lebVar3);
                                                    if (lenVarA != null && mip.bC(lvsVarC, lenVarA)) {
                                                        Iterator it4 = it3;
                                                        List listV = ghxVarF.v(lebVar3.c());
                                                        for (ldz ldzVar3 : ldz.d()) {
                                                            cevVar2 = cevVar2;
                                                            if (mip.bC(lvsVarC, lenVarA)) {
                                                                lvs lvsVar3 = lvsVarB;
                                                                len lenVar = lenVarA;
                                                                if (cjpVar.a.d(mip.bD(lvsVarC, lenVarA), ldzVar3, lebVar3)) {
                                                                    Iterator it5 = listV.iterator();
                                                                    while (true) {
                                                                        if (!it5.hasNext()) {
                                                                            lvsVarB = lvsVar3;
                                                                            lenVarA = lenVar;
                                                                            break;
                                                                        }
                                                                        List list = listV;
                                                                        if (ldzVar3.i == ((Integer) ((Range) it5.next()).getUpper()).intValue()) {
                                                                            List list2 = (List) map2.get(ldzVar3);
                                                                            list2.getClass();
                                                                            list2.add(lebVar3);
                                                                            lvsVarB = lvsVar3;
                                                                            lenVarA = lenVar;
                                                                            listV = list;
                                                                            break;
                                                                        }
                                                                        listV = list;
                                                                    }
                                                                } else {
                                                                    lvsVarB = lvsVar3;
                                                                    lenVarA = lenVar;
                                                                }
                                                            }
                                                        }
                                                        it3 = it4;
                                                    }
                                                }
                                                cevVar = cevVar2;
                                                lvsVar = lvsVarB;
                                                len[] lenVarArrValues = len.values();
                                                int length = lenVarArrValues.length;
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 >= length) {
                                                        map2.put(ldz.FPS_240_HFR_8X, new ArrayList());
                                                        break;
                                                    }
                                                    len lenVar2 = lenVarArrValues[i2];
                                                    if (mip.bC(lvsVarC, lenVar2) && mip.bD(lvsVarC, lenVar2).l == 240) {
                                                        break;
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                            } else {
                                                cevVar = cevVar2;
                                                lvsVar = lvsVarB;
                                                ljiVar = ljiVarA;
                                            }
                                            map.putAll(map2);
                                            Iterator it6 = map.keySet().iterator();
                                            while (it6.hasNext()) {
                                                Collections.sort((List) map.get((ldz) it6.next()), leb.d());
                                            }
                                            cjo cjoVar3 = new cjo(ghxVarF, map);
                                            cjpVar.b.put(lvsVarC, cjoVar3);
                                            cjoVar = cjoVar3;
                                        }
                                        lwd lwdVarK = cjoVar.b.k();
                                        cqj cqjVarA = ckhVar.f.a();
                                        if (cqjVarA.equals(cqj.ACTIVE)) {
                                            lebVarA = leb.RES_1080P;
                                            ldzVar = ldz.FPS_30;
                                        } else if (!cqjVarA.equals(cqj.CINEMATIC) || cfkVar.c.k(dcu.E)) {
                                            lebVarA = cfkVar.c.k(ddv.b) ? cfk.c(intentA) ? leb.RES_720P : ckhVar.e.a(lwdVarK) : cfk.c(intentA) ? leb.RES_720P : cfkVar.a.a(lwdVarK);
                                            cpm cpmVar = ckhVar.a;
                                            cpmVar.a = lebVarA;
                                            ldzVar = (ldz) cpmVar.a(ckhVar.a()).fA();
                                            if (!cjoVar.a(ldzVar, lebVarA)) {
                                                if (ldzVar.f()) {
                                                    List list3 = (List) cjoVar.a.get(ldzVar);
                                                    list3.getClass();
                                                    lebVarA = (leb) list3.get(0);
                                                } else {
                                                    ldzVar = ldz.FPS_30;
                                                }
                                            }
                                        } else {
                                            lebVarA = leb.RES_1080P;
                                            ldzVar = ldz.FPS_60C_30E;
                                        }
                                        jrl jrlVarA = ckhVar.a();
                                        if (jrlVarA == jrl.VIDEO_INTENT) {
                                            ojcVarI = ojc.i(lebVarA.c());
                                        } else if (jrlVarA == jrl.VIDEO) {
                                            ddf ddfVar = cfkVar.c;
                                            ddi ddiVar = dcu.a;
                                            ddfVar.d();
                                            List listX = cjoVar.b.x(256);
                                            leb lebVar4 = leb.RES_2160P;
                                            lig ligVar3 = new lig(0, 0);
                                            Iterator it7 = listX.iterator();
                                            while (it7.hasNext()) {
                                                lig ligVar4 = (lig) it7.next();
                                                it7 = it7;
                                                if (lhs.h(ligVar4).k(lhs.h(lebVarA.c())) && (((lebVarA != lebVar4 && ldzVar.i != 60 && (ldzVar.k != 60 || cjoVar.b.k() != lwd.FRONT)) || ligVar4.b() <= lebVarA.a()) && ligVar4.b() > ligVar3.b())) {
                                                    ligVar3 = ligVar4;
                                                }
                                            }
                                            ojcVarI = ligVar3.b() == 0 ? oih.a : ojc.i(ligVar3);
                                        }
                                        lig ligVarC = (ckhVar.c.k() || (lebVarA.e() && ldzVar.i == 60 && cfkVar.c.k(dcu.G)) || (lebVarA == leb.RES_1080P && ldzVar.i == 60 && cfkVar.c.k(dcu.ag))) ? leb.RES_720P.c() : lebVarA.e() ? leb.RES_1080P.c() : lebVarA.c();
                                        cna cnaVar = cfkVar.g.b;
                                        leh lehVarC = cnaVar.b.c(cnaVar.a(lvsVarC, lebVarA, ckhVar.a()), ldzVar, lebVarA);
                                        if (ldzVar == ldz.FPS_60C_24E || ldzVar == ldz.FPS_60C_30E) {
                                            leeVarA = null;
                                        } else {
                                            jrl jrlVarA2 = ckhVar.a();
                                            ddf ddfVar2 = cnaVar.a.b;
                                            ddi ddiVar2 = dcu.a;
                                            ddfVar2.b();
                                            leeVarA = ldzVar.g() ? cnaVar.b.a(ldzVar, cnaVar.a(lvsVarC, lebVarA, jrlVarA2)) : cnaVar.b.b(ldzVar, cnaVar.a(lvsVarC, lebVarA, jrlVarA2));
                                        }
                                        List listU = cjoVar.b.u();
                                        obr.aQ(!listU.isEmpty());
                                        Range range = new Range(0, 0);
                                        Iterator it8 = listU.iterator();
                                        while (it8.hasNext()) {
                                            Range range2 = (Range) it8.next();
                                            Iterator it9 = it8;
                                            Intent intent2 = intentA;
                                            if (((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue() > ((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) {
                                                range = range2;
                                            }
                                            it8 = it9;
                                            intentA = intent2;
                                        }
                                        Intent intent3 = intentA;
                                        ojc ojcVarI3 = ((Integer) range.getUpper()).intValue() == ((Integer) range.getLower()).intValue() ? oih.a : (ldzVar != ldz.FPS_AUTO && listU.contains(cjm.a)) ? ojc.i(cjm.a) : ojc.i(range);
                                        cjg cjiVar = ldzVar.g() ? new cji(new Range(Integer.valueOf(ldzVar.i), Integer.valueOf(ldzVar.i)), ojcVarI3, (cjoVar.b.k() == lwd.FRONT && ldzVar == ldz.FPS_30 && cfkVar.b.b) ? true : ldzVar == ldz.FPS_AUTO) : new cjh(lehVarC);
                                        ckc ckcVar = new ckc(null);
                                        cux cuxVar = cfkVar.d;
                                        cuxVar.b.set(0);
                                        cuxVar.c.set(0);
                                        ckcVar.A = Integer.valueOf(cuxVar.a.incrementAndGet());
                                        ckcVar.a = lvsVar;
                                        ckcVar.b = lvsVarC;
                                        if (ldzVar == null) {
                                            throw new NullPointerException("Null captureRate");
                                        }
                                        ckcVar.d = ldzVar;
                                        if (lebVarA == null) {
                                            throw new NullPointerException("Null videoResolution");
                                        }
                                        ckcVar.e = lebVarA;
                                        if (cjoVar == null) {
                                            throw new NullPointerException("Null camcorderCharacteristics");
                                        }
                                        ckcVar.c = cjoVar;
                                        ckcVar.f = ojcVarI;
                                        ckcVar.g = ligVar;
                                        ckcVar.h = lehVarC;
                                        ckcVar.i = ojc.h(leeVarA);
                                        ckcVar.j = bqe.e(intent3);
                                        if (intent3 == null) {
                                            ligVar = ligVarC;
                                            ojcVarI2 = oih.a;
                                            intent = intent3;
                                        } else {
                                            intent = intent3;
                                            if (intent.hasExtra("android.intent.extra.durationLimit")) {
                                                ligVar = ligVarC;
                                                ojcVarI2 = ojc.i(Integer.valueOf(intent.getIntExtra("android.intent.extra.durationLimit", 0)));
                                            } else {
                                                ligVar = ligVarC;
                                                ojcVarI2 = oih.a;
                                            }
                                        }
                                        ckcVar.k = ojcVarI2;
                                        ojc ojcVarI4 = (intent != null && intent.hasExtra("android.intent.extra.sizeLimit")) ? ojc.i(Long.valueOf(intent.getIntExtra("android.intent.extra.sizeLimit", 0))) : oih.a;
                                        ckcVar.l = ojcVarI4;
                                        ckcVar.m = Boolean.valueOf(ckhVar.c.m());
                                        Range rangeA = cjiVar.a();
                                        if (rangeA == null) {
                                            throw new NullPointerException("Null previewFpsRange");
                                        }
                                        ckcVar.n = rangeA;
                                        Range rangeB = cjiVar.b();
                                        if (rangeB == null) {
                                            throw new NullPointerException("Null recordFpsRange");
                                        }
                                        ckcVar.o = rangeB;
                                        if (lwdVarK == null) {
                                            throw new NullPointerException("Null cameraFacing");
                                        }
                                        ckcVar.y = lwdVarK;
                                        ckcVar.p = Boolean.valueOf(!ldzVar.f());
                                        boolean z4 = cfkVar.c.k(dcu.y) || lwdVarK == lwd.BACK;
                                        ckcVar.q = Boolean.valueOf(z4);
                                        ckcVar.r = Boolean.valueOf((cfkVar.c.k(dcu.l) && lwdVarK == lwd.FRONT) ? true : cfkVar.c.k(dcu.m));
                                        ckcVar.s = Boolean.valueOf(cjoVar.b.M() && cfkVar.a.c());
                                        ckcVar.t = Boolean.valueOf(cfkVar.a.d());
                                        cfkVar.c.b();
                                        if (lebVarA.e()) {
                                            z = false;
                                        } else if (cfkVar.c.k(dcu.w) && ldzVar == ldz.FPS_30) {
                                            z = true;
                                        } else if (cfkVar.c.k(dcu.x) && ldzVar == ldz.FPS_AUTO) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        ckcVar.u = Boolean.valueOf(z);
                                        cqj cqjVarA2 = ckhVar.f.a();
                                        opc opcVar = new opc();
                                        oom oomVarB = cfkVar.b(ldzVar, lebVarA, lwdVarK, cqjVarA2);
                                        int i3 = ((orr) oomVarB).c;
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            opcVar.i(cfkVar.a(cjoVar, ldzVar, (leb) oomVarB.get(i4), cqjVarA2));
                                        }
                                        oom oomVarV = opcVar.f().v();
                                        if (oomVarV == null) {
                                            throw new NullPointerException("Null allSupportedCaptureRates");
                                        }
                                        ckcVar.v = oomVarV;
                                        oom oomVarA = cfkVar.a(cjoVar, ldzVar, lebVarA, ckhVar.f.a());
                                        if (oomVarA == null) {
                                            throw new NullPointerException("Null supportedCaptureRates");
                                        }
                                        ckcVar.w = oomVarA;
                                        oom oomVarB2 = cfkVar.b(ldzVar, lebVarA, lwdVarK, ckhVar.f.a());
                                        if (oomVarB2 == null) {
                                            throw new NullPointerException("Null supportedVideoResolutions");
                                        }
                                        ckcVar.x = oomVarB2;
                                        hsr hsrVar = ldzVar.e() ? hsr.CINEMATIC : hsr.VIDEO;
                                        if (hsrVar == null) {
                                            throw new NullPointerException("Null captureSessionType");
                                        }
                                        ckcVar.z = hsrVar;
                                        ckcVar.B = Boolean.valueOf(ckhVar.c.e() ? (cfkVar.c.k(dcu.H) && lebVarA.e() && ldzVar == ldz.FPS_60) ? false : true : false);
                                        boolean z5 = ldzVar == ldz.FPS_30 && lebVarA == leb.RES_1080P;
                                        boolean z6 = ldzVar == ldz.FPS_30 && lebVarA.e();
                                        if (!ckhVar.c.i()) {
                                            z2 = false;
                                        } else if (z5) {
                                            z2 = true;
                                        } else if (lwdVarK == lwd.FRONT && z6) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        ckcVar.C = Boolean.valueOf(z2);
                                        if (!ckhVar.c.g()) {
                                            z3 = false;
                                        } else if (lwdVarK.equals(lwd.FRONT) && ldzVar.equals(ldz.FPS_30)) {
                                            z3 = true;
                                        } else if (lwdVarK.equals(lwd.BACK)) {
                                            cfkVar.c.d();
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        ckcVar.D = Boolean.valueOf(z3);
                                        if (ckhVar.a().equals(jrl.VIDEO)) {
                                            cfkVar.c.b();
                                        }
                                        ckcVar.E = false;
                                        lvs lvsVar4 = ckcVar.a;
                                        if (lvsVar4 == null || (lvsVar2 = ckcVar.b) == null || (cjoVar2 = ckcVar.c) == null || (ldzVar2 = ckcVar.d) == null || (lebVar = ckcVar.e) == null || (ligVar2 = ckcVar.g) == null || (lehVar = ckcVar.h) == null || (bool = ckcVar.m) == null || ckcVar.n == null || ckcVar.o == null || ckcVar.p == null || ckcVar.q == null || ckcVar.r == null || ckcVar.s == null || ckcVar.t == null || ckcVar.u == null || ckcVar.v == null || ckcVar.w == null || ckcVar.x == null || ckcVar.y == null || ckcVar.z == null || ckcVar.A == null || ckcVar.B == null || ckcVar.C == null || ckcVar.D == null || ckcVar.E == null) {
                                            StringBuilder sb = new StringBuilder();
                                            if (ckcVar.a == null) {
                                                sb.append(" cameraId");
                                            }
                                            if (ckcVar.b == null) {
                                                sb.append(" streamCameraId");
                                            }
                                            if (ckcVar.c == null) {
                                                sb.append(" camcorderCharacteristics");
                                            }
                                            if (ckcVar.d == null) {
                                                sb.append(" captureRate");
                                            }
                                            if (ckcVar.e == null) {
                                                sb.append(" videoResolution");
                                            }
                                            if (ckcVar.g == null) {
                                                sb.append(" previewSize");
                                            }
                                            if (ckcVar.h == null) {
                                                sb.append(" videoEncoderProfile");
                                            }
                                            if (ckcVar.m == null) {
                                                sb.append(" shouldRecordLocationIfPermitted");
                                            }
                                            if (ckcVar.n == null) {
                                                sb.append(" previewFpsRange");
                                            }
                                            if (ckcVar.o == null) {
                                                sb.append(" recordFpsRange");
                                            }
                                            if (ckcVar.p == null) {
                                                sb.append(" useContinuousAutoFocusOnDuringRecording");
                                            }
                                            if (ckcVar.q == null) {
                                                sb.append(" shouldUnlockAfAeWithSceneChange");
                                            }
                                            if (ckcVar.r == null) {
                                                sb.append(" shouldDetectFace");
                                            }
                                            if (ckcVar.s == null) {
                                                sb.append(" shouldVideoStabilizationOn");
                                            }
                                            if (ckcVar.t == null) {
                                                sb.append(" useOpticalStabilization");
                                            }
                                            if (ckcVar.u == null) {
                                                sb.append(" useLlv");
                                            }
                                            if (ckcVar.v == null) {
                                                sb.append(" allSupportedCaptureRates");
                                            }
                                            if (ckcVar.w == null) {
                                                sb.append(" supportedCaptureRates");
                                            }
                                            if (ckcVar.x == null) {
                                                sb.append(" supportedVideoResolutions");
                                            }
                                            if (ckcVar.y == null) {
                                                sb.append(" cameraFacing");
                                            }
                                            if (ckcVar.z == null) {
                                                sb.append(" captureSessionType");
                                            }
                                            if (ckcVar.A == null) {
                                                sb.append(" sessionId");
                                            }
                                            if (ckcVar.B == null) {
                                                sb.append(" useMediaCodec");
                                            }
                                            if (ckcVar.C == null) {
                                                sb.append(" topShotEnabled");
                                            }
                                            if (ckcVar.D == null) {
                                                sb.append(" shouldSupportSpeechMode");
                                            }
                                            if (ckcVar.E == null) {
                                                sb.append(" viewfinderEffectEnabled");
                                            }
                                            String strValueOf = String.valueOf(sb);
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                                            sb2.append("Missing required properties:");
                                            sb2.append(strValueOf);
                                            throw new IllegalStateException(sb2.toString());
                                        }
                                        ckd ckdVar3 = new ckd(lvsVar4, lvsVar2, cjoVar2, ldzVar2, lebVar, ckcVar.f, ligVar2, lehVar, ckcVar.i, ckcVar.j, ckcVar.k, ckcVar.l, bool.booleanValue(), ckcVar.n, ckcVar.o, ckcVar.p.booleanValue(), ckcVar.q.booleanValue(), ckcVar.r.booleanValue(), ckcVar.s.booleanValue(), ckcVar.t.booleanValue(), ckcVar.u.booleanValue(), ckcVar.v, ckcVar.w, ckcVar.x, ckcVar.y, ckcVar.z, ckcVar.A.intValue(), ckcVar.B.booleanValue(), ckcVar.C.booleanValue(), ckcVar.D.booleanValue(), ckcVar.E.booleanValue());
                                        cfkVar.e = ckdVar3;
                                        ckdVar = ckdVar3;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    final cev cevVar3 = cevVar;
                    try {
                        cevVar3.m.k(cms.CAPTURE_SESSION).c(cevVar3.h);
                        cevVar3.m.k(cms.CAPTURE_SESSION).c(cevVar3);
                        ddf ddfVar3 = cevVar3.l;
                        ddi ddiVar3 = dcu.a;
                        ddfVar3.b();
                        final cgx cgxVar = cevVar3.d;
                        cgxVar.w = ckdVar;
                        cgxVar.c.a(ckdVar.c.b);
                        cgxVar.q.c(new Runnable() { // from class: cgu
                            @Override // java.lang.Runnable
                            public final void run() {
                                lda ldaVar;
                                gtm gtmVar;
                                float fA;
                                cgx cgxVar2 = cgxVar;
                                ckd ckdVar4 = ckdVar;
                                lar.a();
                                if (cgxVar2.j.h() || cgxVar2.j.i()) {
                                    cgxVar2.e.m();
                                }
                                cgxVar2.e.y(ojc.i(ckdVar4.d), ckdVar4.e.e());
                                if ((cgxVar2.j.d() || cgxVar2.j.h()) && cgxVar2.h.j()) {
                                    cgxVar2.e.p(false);
                                }
                                if (cgxVar2.j.d() || cgxVar2.j.f()) {
                                    cgxVar2.e.j();
                                }
                                if (cgxVar2.r.k(ddl.T)) {
                                    if (ckdVar4.d.i == 60 && ckdVar4.e.e()) {
                                        fA = cgxVar2.e.a(true, jrl.VIDEO);
                                    } else {
                                        fA = ckdVar4.d.f() ? cgxVar2.e.a(true, jrl.SLOW_MOTION) : ckdVar4.c.b.c();
                                    }
                                    nvb nvbVar = cgxVar2.x;
                                    Map map3 = nvbVar.a;
                                    cqj cqjVar = cqj.DEFAULT;
                                    Float fValueOf = Float.valueOf(fA);
                                    map3.put(cqjVar, fValueOf);
                                    nvbVar.a.put(cqj.CINEMATIC, fValueOf);
                                    nvbVar.a.put(cqj.ACTIVE, fValueOf);
                                    float fJ = cgxVar2.x.j((cqj) cgxVar2.m.a().i.fA());
                                    cgxVar2.e.t(fJ);
                                    if (cgxVar2.e.d() < fJ && ((cqj) cgxVar2.m.a().i.fA()).equals(cqj.DEFAULT)) {
                                        cgxVar2.e.r(fJ);
                                    }
                                }
                                gtg gtgVar = cgxVar2.f;
                                List listB = cgx.b(ckdVar4.v);
                                List listB2 = cgx.b(ckdVar4.w);
                                List list4 = (List) Collection.EL.stream(ckdVar4.x).map(cgw.a).filter(bql.c).map(cgw.c).collect(Collectors.toList());
                                boolean zE = ckdVar4.e.e();
                                boolean zE2 = ckdVar4.d.e();
                                if (gtgVar.b.fA() == jrl.VIDEO) {
                                    List listE = gtgVar.e(listB);
                                    if (zE2) {
                                        ldaVar = gtgVar.K.c;
                                    } else {
                                        huq huqVar = gtgVar.K;
                                        ldaVar = zE ? huqVar.b : huqVar.a;
                                    }
                                    gtgVar.J = ldaVar;
                                    gsp gspVar = gtgVar.ba;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it10 = listE.iterator();
                                    while (it10.hasNext()) {
                                        gtl gtlVar = (gtl) gsp.a.get((gtv) it10.next());
                                        gtlVar.getClass();
                                        arrayList2.add(gtlVar);
                                    }
                                    if (zE2) {
                                        gtmVar = gtm.FPS_CM;
                                    } else {
                                        gtmVar = zE ? gtm.FPS_4K : gtm.FPS;
                                    }
                                    gtgVar.aj = gtk.a(gtmVar, R.string.fps_option_desc, R.string.fps_options_desc, oom.j(arrayList2));
                                    gtgVar.m(gtgVar.J, gtgVar.aE, gtgVar.aj);
                                    boolean z7 = listE.size() > 1 && !(gtgVar.ar && zE);
                                    gtgVar.at = z7;
                                    gtgVar.au = zE2;
                                    gtgVar.av = list4.size() > 1;
                                    gtgVar.az = gtgVar.e(listB2);
                                    gtgVar.p(false);
                                }
                                cqq cqqVar = cgxVar2.l;
                                cqqVar.e(cqqVar.a(), true);
                            }
                        });
                        cfw cfwVar = cevVar3.g;
                        Executor executor = (Executor) ((cfz) cfwVar).a.get();
                        executor.getClass();
                        lar larVar = (lar) ((cfz) cfwVar).b.get();
                        larVar.getClass();
                        gvb gvbVar = (gvb) ((cfz) cfwVar).c.get();
                        gvbVar.getClass();
                        jje jjeVar = (jje) ((cfz) cfwVar).d.get();
                        jjeVar.getClass();
                        cvc cvcVarA = ((cvd) ((cfz) cfwVar).e).get();
                        cgx cgxVar2 = (cgx) ((cfz) cfwVar).f.get();
                        cgxVar2.getClass();
                        ckg ckgVar = (ckg) ((cfz) cfwVar).g.get();
                        ckgVar.getClass();
                        cve cveVar = (cve) ((cfz) cfwVar).h.get();
                        cveVar.getClass();
                        ?? r32 = ((cfz) cfwVar).i.get();
                        nvb nvbVar = (nvb) ((cfz) cfwVar).j.get();
                        nvbVar.getClass();
                        cka ckaVar = (cka) ((cfz) cfwVar).k.get();
                        ckaVar.getClass();
                        cvo cvoVar = (cvo) ((cfz) cfwVar).l.get();
                        cvoVar.getClass();
                        bne bneVarA = ((fxn) ((cfz) cfwVar).m).a();
                        ggo ggoVar = (ggo) ((cfz) cfwVar).n.get();
                        ggoVar.getClass();
                        cuz cuzVarA = ((cva) ((cfz) cfwVar).o).get();
                        ilu iluVar = (ilu) ((cfz) cfwVar).p.get();
                        iluVar.getClass();
                        cpc cpcVar = (cpc) ((cfz) cfwVar).q.get();
                        cpcVar.getClass();
                        ojc ojcVarA = ((hlj) ((cfz) cfwVar).r).a();
                        cof cofVarA = ((cog) ((cfz) cfwVar).s).get();
                        ddf ddfVar4 = (ddf) ((cfz) cfwVar).t.get();
                        ddfVar4.getClass();
                        Object obj = ((cfz) cfwVar).u.get();
                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((cfz) cfwVar).v.get();
                        scheduledExecutorService.getClass();
                        ijw ijwVar = (ijw) ((cfz) cfwVar).w.get();
                        ijwVar.getClass();
                        qkg qkgVar = ((cfz) cfwVar).x;
                        pyn pynVar = ((pyv) ((cfz) cfwVar).y).get();
                        pynVar.getClass();
                        jtd jtdVar = (jtd) ((cfz) cfwVar).z.get();
                        jtdVar.getClass();
                        cif cifVar = (cif) ((cfz) cfwVar).A.get();
                        cifVar.getClass();
                        final cfy cfyVar = new cfy(executor, larVar, gvbVar, jjeVar, cvcVarA, cgxVar2, ckgVar, cveVar, r32, nvbVar, ckaVar, cvoVar, bneVarA, ggoVar, cuzVarA, iluVar, cpcVar, ojcVarA, cofVarA, ddfVar4, (cmy) obj, scheduledExecutorService, ijwVar, qkgVar, pynVar, jtdVar, cifVar, ckdVar, null, null);
                        cvi cviVar = cevVar3.e;
                        lig ligVar5 = ckdVar.g;
                        if (cviVar.b.a(ckdVar)) {
                            cviVar.b.b();
                        }
                        jnl jnlVarB = jnl.b(ckdVar.y, ligVar5, lhs.h(ligVar5), oih.a);
                        if (ckdVar.E) {
                            ojc ojcVar = cviVar.c;
                        }
                        final pht phtVarF = cviVar.a.f(jnlVarB, oih.a);
                        final pht phtVarI = pgb.i(plk.Z(new Callable() { // from class: ceu
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return cevVar3.i.a(ckdVar.e);
                            }
                        }, cevVar3.a), new pgk() { // from class: cet
                            @Override // defpackage.pgk
                            public final pht a(Object obj2) {
                                final cev cevVar4 = cevVar3;
                                ojc ojcVar2 = (ojc) obj2;
                                return ojcVar2.g() ? plk.V((Surface) ojcVar2.c()) : pgb.h(cevVar4.h.b(ckdVar), new oiu() { // from class: ceq
                                    @Override // defpackage.oiu
                                    public final Object a(Object obj3) {
                                        cev cevVar5 = cevVar4;
                                        cmz cmzVar = (cmz) obj3;
                                        cmzVar.getClass();
                                        cevVar5.m.k(cms.CAPTURE_SESSION).c(cmzVar);
                                        ojc ojcVarC = cmzVar.a.c();
                                        obr.aR(ojcVarC.g(), "Recording surface not present.");
                                        return (Surface) ojcVarC.c();
                                    }
                                }, cevVar4.a);
                            }
                        }, cevVar3.a);
                        final lji ljiVar2 = ljiVar;
                        pht phtVarB = plk.P(phtVarF, phtVarI).b(new pgj() { // from class: ces
                            @Override // defpackage.pgj
                            public final pht a() {
                                pht phtVarB2;
                                cev cevVar4 = cevVar3;
                                final cfy cfyVar2 = cfyVar;
                                pht phtVar = phtVarF;
                                pht phtVar2 = phtVarI;
                                lji ljiVar3 = ljiVar2;
                                ckh ckhVar2 = cevVar4.f;
                                jnj jnjVar = (jnj) phtVar.get();
                                Surface surface = (Surface) phtVar2.get();
                                synchronized (cfyVar2.f) {
                                    cfx cfxVar = cfyVar2.A;
                                    if (cfxVar != null) {
                                        String strValueOf2 = String.valueOf(cfxVar);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 27);
                                        sb3.append("Trying to init with state: ");
                                        sb3.append(strValueOf2);
                                        throw new IllegalStateException(sb3.toString());
                                    }
                                    cfyVar2.l.d(cfyVar2.v, jnjVar, surface);
                                    phtVarB2 = cfyVar2.l.b();
                                    if (cfyVar2.o.k(dcu.C)) {
                                        cfyVar2.l.f(oom.l());
                                        cfyVar2.y = cfyVar2.q.schedule(new Callable() { // from class: cfs
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                cfyVar2.e();
                                                return null;
                                            }
                                        }, 500L, TimeUnit.MILLISECONDS);
                                    }
                                    bnf bnfVarA = cfyVar2.i.a(cfyVar2, cfyVar2.v.c.b, cfyVar2.B.a, lcv.g(false), cfyVar2.j.a(cfyVar2.v));
                                    cfyVar2.g.add(cfyVar2);
                                    cfyVar2.g.add(cfyVar2.n);
                                    lap lapVarK = cfyVar2.D.k(cms.CAPTURE_SESSION);
                                    lapVarK.c(cfyVar2);
                                    lapVarK.c(bnfVarA);
                                    cmy cmyVar = cfyVar2.p;
                                    jrl jrlVarA3 = ckhVar2.a();
                                    ckd ckdVar4 = cfyVar2.v;
                                    cmyVar.h = cfyVar2;
                                    cmyVar.i = cmyVar.a.a(jrlVarA3);
                                    if ((cmyVar.c.k(dcu.G) && ckdVar4.e == leb.RES_2160P && ckdVar4.d == ldz.FPS_60) || (cmyVar.c.k(dcu.ag) && ckdVar4.e == leb.RES_1080P && ckdVar4.d == ldz.FPS_60)) {
                                        cmyVar.l = ims.HEAT_CRITICAL;
                                        cmyVar.j = oom.n(cmyVar.g, cmyVar.f);
                                    } else {
                                        cmyVar.l = ims.HEAT_EMERGENCY;
                                        cmyVar.j = oom.o(cmyVar.d, cmyVar.e, cmyVar.f);
                                    }
                                    cfyVar2.u.b(cfyVar2.v);
                                    cfyVar2.k.b(new ilt() { // from class: cfo
                                        @Override // defpackage.ilt
                                        public final void a(ilv ilvVar) {
                                            cfy cfyVar3 = cfyVar2;
                                            boolean zC = ilvVar.c();
                                            synchronized (cfyVar3.f) {
                                                if (!zC) {
                                                    ((oug) ((oug) cfy.a.c()).G(353)).q("Stopping recording due to low storage. Remaining bytes=%d", ilvVar.b);
                                                    cfyVar3.k(cfyVar3.A != cfx.RECORDING);
                                                }
                                            }
                                            if (zC) {
                                                ((ilq) cfyVar3.s.get()).e(ilvVar);
                                                ((ilo) cfyVar3.t.get()).c(ilvVar);
                                            }
                                        }
                                    });
                                    cfyVar2.l(cfx.NO_RECORDING);
                                }
                                ljiVar3.a();
                                return pgb.h(phtVarB2, new oiu() { // from class: cer
                                    @Override // defpackage.oiu
                                    public final Object a(Object obj2) {
                                        return cfyVar2;
                                    }
                                }, pgr.INSTANCE);
                            }
                        }, cevVar3.a);
                        mip.ca(phtVarB, new lht() { // from class: cep
                            @Override // defpackage.lht
                            public final void a(Object obj2) {
                                cev cevVar4 = cevVar3;
                                cfy cfyVar2 = (cfy) obj2;
                                cevVar4.j.fB(fxl.b);
                                cgx cgxVar3 = cevVar4.d;
                                cgxVar3.m(false);
                                cgxVar3.t.g();
                                if (cfyVar2 != null) {
                                    cmy cmyVar = cfyVar2.p;
                                    cmyVar.d();
                                    imt imtVar = cmyVar.b;
                                    imtVar.getClass();
                                    cmyVar.k = imtVar.d(cmyVar);
                                }
                            }
                        }, cevVar3.b);
                        this.v = this.H.a();
                        this.K = phtVarB;
                        plk.af(phtVarB, new cfd(this, i, phtVarB), this.D);
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public final cfy a() {
        cfy cfyVar;
        synchronized (this.w) {
            cfyVar = this.q;
        }
        return cfyVar;
    }

    public final void b(chy chyVar) {
        this.f.add(chyVar);
    }

    public final void c() {
        synchronized (this.w) {
            this.r = this.C.a();
        }
    }

    public final void d() {
        synchronized (this.w) {
            if (this.b.a() == jrl.SLOW_MOTION) {
                ((oug) ((oug) a.c()).G(313)).o("Camera switch not supported for slow motion");
            } else {
                this.d.h(new Runnable() { // from class: cey
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.p(3);
                    }
                });
            }
        }
    }

    public final void e() {
        cfy cfyVar;
        synchronized (this.w) {
            if (!r() || (cfyVar = this.q) == null) {
                ((oug) ((oug) a.c()).G(315)).r("onPauseButtonClicked ignored with state: %s", ((lce) this.r.f).d);
            } else {
                lar.a();
                synchronized (cfyVar.f) {
                    cgl cglVar = cfyVar.z;
                    if (cglVar != null) {
                        synchronized (cglVar.f) {
                            int i = cglVar.K;
                            if (i == 3 || i == 2) {
                                cmz cmzVar = cglVar.G;
                                cmzVar.getClass();
                                cmzVar.a.g();
                                cglVar.g.c();
                                cglVar.J.a.b(R.raw.video_pause);
                                cglVar.L.b(1);
                                cglVar.l(4);
                                if (cglVar.l.C) {
                                    cglVar.x.c(false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void f(int i) {
        synchronized (this.w) {
            if (r()) {
                cfy cfyVar = this.q;
                boolean z = false;
                if (cfyVar != null) {
                    synchronized (cfyVar.f) {
                        if (i == 0) {
                            cfyVar.x = false;
                        }
                    }
                }
                lda ldaVar = this.r.e;
                if (i == 0 && ((Boolean) ((lce) ldaVar).d).booleanValue()) {
                    z = true;
                }
                ldaVar.fB(Boolean.valueOf(z));
            }
        }
    }

    public final void g() {
        cfy cfyVar;
        synchronized (this.w) {
            if (!r() || (cfyVar = this.q) == null) {
                ((oug) ((oug) a.c()).G(318)).r("onResumeButtonClicked ignored with state: %s", ((lce) this.r.f).d);
            } else {
                lar.a();
                synchronized (cfyVar.f) {
                    cgl cglVar = cfyVar.z;
                    if (cglVar != null) {
                        synchronized (cglVar.f) {
                            if (cglVar.K == 4) {
                                cglVar.J.a.b(R.raw.video_start);
                                cglVar.L.b(2);
                                cglVar.l(2);
                                cglVar.r.schedule(new cge(cglVar, 1), 400L, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(boolean z) {
        cfy cfyVar;
        synchronized (this.w) {
            if (r() && (cfyVar = this.q) != null) {
                cfyVar.j(z);
                if ((this.t || this.s) && this.m.k(ddl.aw)) {
                    this.h.A(false);
                    this.t = false;
                    this.s = false;
                }
            } else if (((lce) this.r.f).d == cjr.INITIATING) {
                this.t = true;
            } else {
                ((oug) ((oug) a.c()).G(320)).r("onShutterButtonClicked ignored with state: %s", ((lce) this.r.f).d);
            }
        }
    }

    public final void i() {
        cfy cfyVar;
        synchronized (this.w) {
            if (!r() || (cfyVar = this.q) == null) {
                ((oug) ((oug) a.c()).G(323)).r("onSnapshotButtonClicked ignored with state: %s", ((lce) this.r.f).d);
            } else {
                lar.a();
                synchronized (cfyVar.f) {
                    cgl cglVar = cfyVar.z;
                    if (cglVar != null) {
                        lar.a();
                        synchronized (cglVar.f) {
                            int i = cglVar.K;
                            if (i == 3 || i == 4 || i == 2) {
                                cglVar.d.l(false);
                                hsq hsqVarA = hsq.a(hsp.a(), System.currentTimeMillis(), dhy.a(hsr.VIDEO_SNAPSHOT, System.currentTimeMillis()), hsr.VIDEO_SNAPSHOT);
                                cglVar.z.i(hsqVarA);
                                cglVar.D.add(hsqVarA);
                                pht phtVarA = cglVar.p.a(hsqVarA);
                                cglVar.d.t.l();
                                plk.af(phtVarA, new cgj(cglVar, 0), cglVar.c);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void j() {
        cfy cfyVar;
        synchronized (this.w) {
            if (!r() || (cfyVar = this.q) == null) {
                ((oug) ((oug) a.c()).G(325)).r("onThumbnailButtonClicked ignored with state: %s", ((lce) this.r.f).d);
            } else {
                synchronized (cfyVar.f) {
                    cfyVar.x = true;
                }
            }
        }
    }

    public final void k(boolean z) {
        cfy cfyVar;
        synchronized (this.w) {
            if (!r() || (cfyVar = this.q) == null) {
                ((oug) ((oug) a.c()).G(327)).r("onWindowFocusChanged ignored with state: %s", ((lce) this.r.f).d);
            } else {
                synchronized (cfyVar.f) {
                    if (z) {
                        cfyVar.x = false;
                    }
                }
            }
        }
    }

    public final void l(chy chyVar) {
        this.f.remove(chyVar);
    }

    public final void m(boolean z) {
        final int i;
        synchronized (this.w) {
            if (this.r == null) {
                c();
            }
            if (((lce) this.r.f).d != cjr.UNINITIALIZED) {
                ((oug) ((oug) a.c()).G(329)).o("Capture session already started. Ignoring...");
                return;
            }
            cnk cnkVarA = ((cnl) this.E).get();
            this.J = cnkVarA;
            cnk cnkVar = cnkVarA;
            synchronized (cnkVarA.f) {
                cnk cnkVar2 = cnkVarA;
                i = 1;
                if (!cnkVarA.d) {
                    cnk cnkVar3 = cnkVarA;
                    if (cnkVarA.e) {
                        cnk cnkVar4 = cnkVarA;
                        cnkVarA.a();
                    }
                    cnk cnkVar5 = cnkVarA;
                    cnkVarA.b();
                    cnk cnkVar6 = cnkVarA;
                    cnk cnkVar7 = cnkVarA;
                    cnk cnkVar8 = cnkVarA;
                    cnkVarA.a.registerAudioDeviceCallback(cnkVarA.b, cnkVarA.c);
                    cnk cnkVar9 = cnkVarA;
                    cnkVarA.e = true;
                }
            }
            this.L.k(cms.MODULE).c(this.J);
            lap lapVarK = this.L.k(cms.MODULE);
            this.o.a(this.p);
            lapVarK.c(new lie() { // from class: cex
                @Override // defpackage.lie, java.lang.AutoCloseable
                public final void close() {
                    cfe cfeVar = this.a;
                    cfeVar.o.b(cfeVar.p);
                }
            });
            this.L.k(cms.MODULE).c(this.h.d(this.n));
            if (this.m.k(dcu.r)) {
                final cng cngVar = ((cnh) this.F).get();
                this.y = cngVar;
                synchronized (cngVar.e) {
                    cngVar.d.c(lcv.j(cngVar.f, bxe.m).a(new lij() { // from class: cne
                        @Override // defpackage.lij
                        public final void fB(Object obj) {
                            switch (i) {
                                case 0:
                                    cng cngVar2 = cngVar;
                                    String str = (String) obj;
                                    synchronized (cngVar2.e) {
                                        if (cngVar2.j) {
                                            return;
                                        }
                                        if (cngVar2.i && ((hth) cngVar2.f.fA()).equals(hth.EXT_BLUETOOTH) && !str.isEmpty()) {
                                            cngVar2.a(str);
                                        }
                                        return;
                                    }
                                default:
                                    cng cngVar3 = cngVar;
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    synchronized (cngVar3.e) {
                                        if (cngVar3.j) {
                                            return;
                                        }
                                        if (zBooleanValue) {
                                            cngVar3.a((String) cngVar3.g.fA());
                                        } else {
                                            cngVar3.b();
                                        }
                                        return;
                                    }
                            }
                        }
                    }, pgr.INSTANCE));
                    final int i2 = 0;
                    cngVar.d.c(cngVar.g.a(new lij() { // from class: cne
                        @Override // defpackage.lij
                        public final void fB(Object obj) {
                            switch (i2) {
                                case 0:
                                    cng cngVar2 = cngVar;
                                    String str = (String) obj;
                                    synchronized (cngVar2.e) {
                                        if (cngVar2.j) {
                                            return;
                                        }
                                        if (cngVar2.i && ((hth) cngVar2.f.fA()).equals(hth.EXT_BLUETOOTH) && !str.isEmpty()) {
                                            cngVar2.a(str);
                                        }
                                        return;
                                    }
                                default:
                                    cng cngVar3 = cngVar;
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    synchronized (cngVar3.e) {
                                        if (cngVar3.j) {
                                            return;
                                        }
                                        if (zBooleanValue) {
                                            cngVar3.a((String) cngVar3.g.fA());
                                        } else {
                                            cngVar3.b();
                                        }
                                        return;
                                    }
                            }
                        }
                    }, pgr.INSTANCE));
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                    cngVar.b.registerReceiver(cngVar.k, intentFilter);
                }
                this.L.k(cms.MODULE).c(this.y);
            }
            if (z) {
                s(2);
            }
        }
    }

    public final void n() {
        synchronized (this.w) {
            q();
            cni cniVar = this.J;
            if (cniVar != null) {
                cniVar.a();
            }
            nvb nvbVar = this.L;
            Iterator it = new HashSet(nvbVar.a.keySet()).iterator();
            while (it.hasNext()) {
                nvbVar.l((cms) it.next());
            }
            cju cjuVar = this.r;
            if (cjuVar != null) {
                cjuVar.a(cjr.UNINITIALIZED);
            }
        }
    }

    public final boolean o() {
        synchronized (this.w) {
            if (((lce) this.r.f).d == cjr.RECORDING_SESSION_ACTIVE) {
                h(false);
                return true;
            }
            if (!this.m.k(dcu.J) || !this.b.a().equals(jrl.SLOW_MOTION) || !this.I.g()) {
                return false;
            }
            ((ctw) this.I.c()).d();
            return true;
        }
    }

    public final void p(int i) {
        synchronized (this.w) {
            q();
            s(i);
        }
    }
}
