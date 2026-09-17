package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Base64;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class mwr extends mwp implements mvt, mwb, mwa, mxo {
    private static final ouj b = ouj.h("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl");
    final AtomicBoolean a = new AtomicBoolean();
    private final Context c;
    private final mwe d;
    private final phw e;
    private final mxa f;
    private final mwk g;
    private final mxl h;
    private final AtomicBoolean i;

    public mwr(mxm mxmVar, Context context, mwe mweVar, phw phwVar, pyn pynVar, mxa mxaVar, mwk mwkVar, qkg qkgVar, Executor executor) {
        new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.h = mxmVar.a(executor, pynVar, qkgVar);
        this.c = context;
        this.d = mweVar;
        this.e = phwVar;
        this.f = mxaVar;
        this.g = mwkVar;
    }

    private final pht u(final qwt qwtVar) {
        return plk.aa(new pgj() { // from class: mwq
            @Override // defpackage.pgj
            public final pht a() {
                return this.a.q(qwtVar, null);
            }
        }, this.e);
    }

    @Override // defpackage.mvt
    public void a(Activity activity, Bundle bundle) {
        if (this.i.getAndSet(true)) {
            return;
        }
        b((Activity) null);
    }

    @Override // defpackage.mwb
    public void b(Activity activity) {
        if (this.a.get()) {
            return;
        }
        s();
    }

    @Override // defpackage.mwa
    public void c(Activity activity) {
        r();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0303  */
    /* JADX WARN: Code duplicated, block: B:164:0x030f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0312  */
    /* JADX WARN: Code duplicated, block: B:168:0x0334 A[LOOP:0: B:166:0x0328->B:168:0x0334, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:172:0x0358 A[LOOP:1: B:170:0x034c->B:172:0x0358, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x037c A[LOOP:2: B:174:0x0370->B:176:0x037c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x03a0 A[LOOP:3: B:178:0x0394->B:180:0x03a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03c4 A[LOOP:4: B:182:0x03b8->B:184:0x03c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x03e8 A[LOOP:5: B:186:0x03dc->B:188:0x03e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x040c A[LOOP:6: B:190:0x0400->B:192:0x040c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x044e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0463  */
    /* JADX WARN: Code duplicated, block: B:209:0x046f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0479  */
    /* JADX WARN: Code duplicated, block: B:215:0x0484  */
    /* JADX WARN: Code duplicated, block: B:218:0x0490  */
    /* JADX WARN: Code duplicated, block: B:220:0x0498  */
    /* JADX WARN: Code duplicated, block: B:224:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:227:0x04e3  */
    public /* synthetic */ pht q(qwt qwtVar, mul mulVar) throws IOException {
        Object objB;
        qwt qwtVar2;
        mwz mwzVar;
        qxe qxeVar;
        boolean zCommit;
        Long l;
        mxc mxcVar;
        qxd qxdVarI;
        poy poyVar;
        mws mwsVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        qxd qxdVar;
        poy poyVarM;
        qwu qwuVar;
        int i8;
        qwt qwtVar3;
        String str;
        qxe qxeVar2;
        qwt qwtVar4;
        Long l2;
        poy poyVarM2;
        poy poyVarM3;
        int length;
        qyk qykVar = null;
        if (!this.h.c(null)) {
            return phq.a;
        }
        myw.f();
        synchronized (this.f) {
            ncb ncbVar = this.f.a;
            pqs pqsVar = (pqs) ndw.j.G(7);
            myw.f();
            byte[] bArrDecode = !mez.c(ncbVar.b) ? null : Base64.decode(((SharedPreferences) ncbVar.c.get()).getString("primes.battery.snapshot", ""), 0);
            if (bArrDecode == null || (length = bArrDecode.length) == 0) {
                objB = null;
            } else if (bArrDecode[0] == 1) {
                try {
                    objB = pqsVar.b(bArrDecode, length - 1, pos.b());
                } catch (ppp e) {
                    ((oug) ((oug) ((oug) ncb.a.c()).h(e)).G((char) 3672)).o("failure reading proto");
                    objB = null;
                }
            } else {
                ((oug) ((oug) ncb.a.c()).G((char) 3671)).o("wrong header");
                objB = null;
            }
            ndw ndwVar = (ndw) objB;
            if (ndwVar == null) {
                mwzVar = null;
            } else {
                if ((ndwVar.a & 32) != 0) {
                    qwt qwtVarB = qwt.b(ndwVar.g);
                    if (qwtVarB == null) {
                        qwtVarB = qwt.UNKNOWN;
                    }
                    qwtVar2 = qwtVarB;
                } else {
                    qwtVar2 = null;
                }
                qxd qxdVar2 = ndwVar.b;
                qxd qxdVar3 = qxdVar2 == null ? qxd.an : qxdVar2;
                Long lValueOf = (ndwVar.a & 2) != 0 ? Long.valueOf(ndwVar.c) : null;
                Long lValueOf2 = (ndwVar.a & 4) != 0 ? Long.valueOf(ndwVar.d) : null;
                Long lValueOf3 = (ndwVar.a & 8) != 0 ? Long.valueOf(ndwVar.e) : null;
                Long lValueOf4 = (ndwVar.a & 16) != 0 ? Long.valueOf(ndwVar.f) : null;
                int i9 = ndwVar.a;
                String str2 = (i9 & 64) != 0 ? ndwVar.h : null;
                if ((i9 & 256) != 0) {
                    qxe qxeVar3 = ndwVar.i;
                    qxeVar = qxeVar3 == null ? qxe.a : qxeVar3;
                } else {
                    qxeVar = null;
                }
                mwzVar = new mwz(qxdVar3, lValueOf, lValueOf2, lValueOf3, lValueOf4, qwtVar2, str2, qxeVar);
            }
        }
        mwk mwkVar = this.g;
        Long lValueOf5 = Long.valueOf(mwkVar.b.b());
        Long lValueOf6 = Long.valueOf(mwkVar.b.a());
        SystemHealthManager systemHealthManager = (SystemHealthManager) mwkVar.a.a.getSystemService("systemhealth");
        HealthStats healthStatsTakeMyUidSnapshot = systemHealthManager != null ? systemHealthManager.takeMyUidSnapshot() : null;
        ((mud) mwkVar.d).get();
        mwz mwzVarD = mwp.d(lValueOf5, lValueOf6, healthStatsTakeMyUidSnapshot, qwtVar, mwkVar);
        synchronized (this.f) {
            mxa mxaVar = this.f;
            poy poyVarM4 = ndw.j.m();
            qxd qxdVar4 = mwzVarD.a;
            if (qxdVar4 != null) {
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                ndw ndwVar2 = (ndw) poyVarM4.b;
                ndwVar2.b = qxdVar4;
                ndwVar2.a |= 1;
            }
            Long l3 = mwzVarD.b;
            if (l3 != null) {
                long jLongValue = l3.longValue();
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                ndw ndwVar3 = (ndw) poyVarM4.b;
                ndwVar3.a |= 2;
                ndwVar3.c = jLongValue;
            }
            Long l4 = mwzVarD.c;
            if (l4 != null) {
                long jLongValue2 = l4.longValue();
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                ndw ndwVar4 = (ndw) poyVarM4.b;
                ndwVar4.a |= 4;
                ndwVar4.d = jLongValue2;
            }
            Long l5 = mwzVarD.d;
            if (l5 != null) {
                long jLongValue3 = l5.longValue();
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                ndw ndwVar5 = (ndw) poyVarM4.b;
                ndwVar5.a |= 8;
                ndwVar5.e = jLongValue3;
            }
            Long l6 = mwzVarD.e;
            if (l6 != null) {
                long jLongValue4 = l6.longValue();
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                ndw ndwVar6 = (ndw) poyVarM4.b;
                ndwVar6.a |= 16;
                ndwVar6.f = jLongValue4;
            }
            qwt qwtVar5 = mwzVarD.f;
            if (qwtVar5 != null) {
                int i10 = qwtVar5.h;
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                ndw ndwVar7 = (ndw) poyVarM4.b;
                ndwVar7.a |= 32;
                ndwVar7.g = i10;
            }
            String str3 = mwzVarD.g;
            if (str3 != null) {
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                ndw ndwVar8 = (ndw) poyVarM4.b;
                ndwVar8.a |= 64;
                ndwVar8.h = str3;
            }
            qxe qxeVar4 = mwzVarD.h;
            if (qxeVar4 != null) {
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                ndw ndwVar9 = (ndw) poyVarM4.b;
                ndwVar9.i = qxeVar4;
                ndwVar9.a |= 256;
            }
            ncb ncbVar2 = mxaVar.a;
            ndw ndwVar10 = (ndw) poyVarM4.j();
            ndwVar10.getClass();
            byte[] bArrG = ndwVar10.g();
            myw.f();
            if (mez.c(ncbVar2.b)) {
                int length2 = bArrG.length;
                byte[] bArr = new byte[length2 + 1];
                bArr[0] = 1;
                System.arraycopy(bArrG, 0, bArr, 1, length2);
                zCommit = ((SharedPreferences) ncbVar2.c.get()).edit().putString("primes.battery.snapshot", Base64.encodeToString(bArr, 0)).commit();
            } else {
                zCommit = false;
            }
        }
        if (!zCommit) {
            this.d.b(this);
            synchronized (this.f) {
                ncb ncbVar3 = this.f.a;
                myw.f();
                if (mez.c(ncbVar3.b)) {
                    ((SharedPreferences) ncbVar3.c.get()).edit().remove("primes.battery.snapshot").commit();
                }
            }
            throw new IOException("Failure storing persistent snapshot and helper data");
        }
        mwk mwkVar2 = this.g;
        if (mwzVar != null && Objects.equals(mwzVar.d, mwzVarD.d) && Objects.equals(mwzVar.e, mwzVarD.e) && mwzVar.b != null && mwzVar.c != null && (l = mwzVarD.b) != null && mwzVarD.c != null) {
            long jLongValue5 = l.longValue();
            Long l7 = mwzVar.b;
            l7.getClass();
            long jLongValue6 = jLongValue5 - l7.longValue();
            Long l8 = mwzVarD.c;
            l8.getClass();
            long jLongValue7 = l8.longValue();
            Long l9 = mwzVar.c;
            l9.getClass();
            long jLongValue8 = jLongValue7 - l9.longValue();
            if (jLongValue8 > 0) {
                long jAbs = Math.abs(jLongValue6 - jLongValue8);
                if (jAbs >= 25) {
                    double d = jAbs;
                    double d2 = jLongValue8;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    if (d / d2 <= 3.472222222222222E-5d) {
                        mxcVar = mwkVar2.a;
                        qxdVarI = myq.i(mwzVarD.a, mwzVar.a);
                        if (qxdVarI == null) {
                            qxdVar = null;
                        } else {
                            poyVar = (poy) qxdVarI.G(5);
                            poyVar.o(qxdVarI);
                            mwsVar = mxcVar.b;
                            Collections.unmodifiableList(((qxd) poyVar.b).g);
                            for (i = 0; i < ((qxd) poyVar.b).g.size(); i++) {
                                poyVar.aj(i, mwsVar.b(poyVar.K(i)));
                            }
                            Collections.unmodifiableList(((qxd) poyVar.b).h);
                            for (i2 = 0; i2 < ((qxd) poyVar.b).h.size(); i2++) {
                                poyVar.ak(i2, mwsVar.b(poyVar.L(i2)));
                            }
                            Collections.unmodifiableList(((qxd) poyVar.b).i);
                            for (i3 = 0; i3 < ((qxd) poyVar.b).i.size(); i3++) {
                                poyVar.al(i3, mwsVar.b(poyVar.M(i3)));
                            }
                            Collections.unmodifiableList(((qxd) poyVar.b).j);
                            for (i4 = 0; i4 < ((qxd) poyVar.b).j.size(); i4++) {
                                poyVar.ai(i4, mwsVar.b(poyVar.N(i4)));
                            }
                            Collections.unmodifiableList(((qxd) poyVar.b).k);
                            for (i5 = 0; i5 < ((qxd) poyVar.b).k.size(); i5++) {
                                poyVar.af(i5, mwsVar.b(poyVar.O(i5)));
                            }
                            Collections.unmodifiableList(((qxd) poyVar.b).l);
                            for (i6 = 0; i6 < ((qxd) poyVar.b).l.size(); i6++) {
                                poyVar.ac(i6, mwsVar.b(poyVar.P(i6)));
                            }
                            Collections.unmodifiableList(((qxd) poyVar.b).n);
                            for (i7 = 0; i7 < ((qxd) poyVar.b).n.size(); i7++) {
                                poyVar.ae(i7, mwsVar.b(poyVar.Q(i7)));
                            }
                            qxdVar = (qxd) poyVar.j();
                        }
                        if (qxdVar != null && (qxdVar.a & 1) != 0 && qxdVar.c > 0) {
                            poyVarM = qwu.k.m();
                            Long l10 = mwzVarD.b;
                            l10.getClass();
                            long jLongValue9 = l10.longValue();
                            Long l11 = mwzVar.b;
                            l11.getClass();
                            long jLongValue10 = jLongValue9 - l11.longValue();
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qwuVar = (qwu) poyVarM.b;
                            i8 = qwuVar.a | 64;
                            qwuVar.a = i8;
                            qwuVar.h = jLongValue10;
                            qwtVar3 = mwzVar.f;
                            if (qwtVar3 != null) {
                                qwuVar.b = qwtVar3.h;
                                i8 |= 1;
                                qwuVar.a = i8;
                            }
                            str = mwzVar.g;
                            if (str != null) {
                                i8 |= 8;
                                qwuVar.a = i8;
                                qwuVar.e = str;
                            }
                            qxeVar2 = mwzVar.h;
                            if (qxeVar2 != null) {
                                qwuVar.f = qxeVar2;
                                i8 |= 16;
                                qwuVar.a = i8;
                            }
                            qwtVar4 = mwzVarD.f;
                            if (qwtVar4 != null) {
                                qwuVar.g = qwtVar4.h;
                                qwuVar.a = i8 | 32;
                            }
                            l2 = mwzVarD.b;
                            if (l2 != null) {
                                long jLongValue11 = l2.longValue();
                                if (poyVarM.c) {
                                    poyVarM.m();
                                    poyVarM.c = false;
                                }
                                qwu qwuVar2 = (qwu) poyVarM.b;
                                qwuVar2.a |= 256;
                                qwuVar2.j = jLongValue11;
                            }
                            qwu qwuVar3 = (qwu) poyVarM.b;
                            qwuVar3.i = qxdVar;
                            qwuVar3.a |= 128;
                            poyVarM2 = qyk.t.m();
                            poyVarM3 = qwv.c.m();
                            if (poyVarM3.c) {
                                poyVarM3.m();
                                poyVarM3.c = false;
                            }
                            qwv qwvVar = (qwv) poyVarM3.b;
                            qwu qwuVar4 = (qwu) poyVarM.j();
                            qwuVar4.getClass();
                            qwvVar.b = qwuVar4;
                            qwvVar.a |= 1;
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            qyk qykVar2 = (qyk) poyVarM2.b;
                            qwv qwvVar2 = (qwv) poyVarM3.j();
                            qwvVar2.getClass();
                            qykVar2.j = qwvVar2;
                            qykVar2.a |= 512;
                            qykVar = (qyk) poyVarM2.j();
                        }
                    }
                } else {
                    mxcVar = mwkVar2.a;
                    qxdVarI = myq.i(mwzVarD.a, mwzVar.a);
                    if (qxdVarI == null) {
                        qxdVar = null;
                    } else {
                        poyVar = (poy) qxdVarI.G(5);
                        poyVar.o(qxdVarI);
                        mwsVar = mxcVar.b;
                        Collections.unmodifiableList(((qxd) poyVar.b).g);
                        while (i < ((qxd) poyVar.b).g.size()) {
                            poyVar.aj(i, mwsVar.b(poyVar.K(i)));
                        }
                        Collections.unmodifiableList(((qxd) poyVar.b).h);
                        while (i2 < ((qxd) poyVar.b).h.size()) {
                            poyVar.ak(i2, mwsVar.b(poyVar.L(i2)));
                        }
                        Collections.unmodifiableList(((qxd) poyVar.b).i);
                        while (i3 < ((qxd) poyVar.b).i.size()) {
                            poyVar.al(i3, mwsVar.b(poyVar.M(i3)));
                        }
                        Collections.unmodifiableList(((qxd) poyVar.b).j);
                        while (i4 < ((qxd) poyVar.b).j.size()) {
                            poyVar.ai(i4, mwsVar.b(poyVar.N(i4)));
                        }
                        Collections.unmodifiableList(((qxd) poyVar.b).k);
                        while (i5 < ((qxd) poyVar.b).k.size()) {
                            poyVar.af(i5, mwsVar.b(poyVar.O(i5)));
                        }
                        Collections.unmodifiableList(((qxd) poyVar.b).l);
                        while (i6 < ((qxd) poyVar.b).l.size()) {
                            poyVar.ac(i6, mwsVar.b(poyVar.P(i6)));
                        }
                        Collections.unmodifiableList(((qxd) poyVar.b).n);
                        while (i7 < ((qxd) poyVar.b).n.size()) {
                            poyVar.ae(i7, mwsVar.b(poyVar.Q(i7)));
                        }
                        qxdVar = (qxd) poyVar.j();
                    }
                    if (qxdVar != null) {
                        poyVarM = qwu.k.m();
                        Long l12 = mwzVarD.b;
                        l12.getClass();
                        long jLongValue12 = l12.longValue();
                        Long l13 = mwzVar.b;
                        l13.getClass();
                        long jLongValue13 = jLongValue12 - l13.longValue();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        qwuVar = (qwu) poyVarM.b;
                        i8 = qwuVar.a | 64;
                        qwuVar.a = i8;
                        qwuVar.h = jLongValue13;
                        qwtVar3 = mwzVar.f;
                        if (qwtVar3 != null) {
                            qwuVar.b = qwtVar3.h;
                            i8 |= 1;
                            qwuVar.a = i8;
                        }
                        str = mwzVar.g;
                        if (str != null) {
                            i8 |= 8;
                            qwuVar.a = i8;
                            qwuVar.e = str;
                        }
                        qxeVar2 = mwzVar.h;
                        if (qxeVar2 != null) {
                            qwuVar.f = qxeVar2;
                            i8 |= 16;
                            qwuVar.a = i8;
                        }
                        qwtVar4 = mwzVarD.f;
                        if (qwtVar4 != null) {
                            qwuVar.g = qwtVar4.h;
                            qwuVar.a = i8 | 32;
                        }
                        l2 = mwzVarD.b;
                        if (l2 != null) {
                            long jLongValue14 = l2.longValue();
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            qwu qwuVar5 = (qwu) poyVarM.b;
                            qwuVar5.a |= 256;
                            qwuVar5.j = jLongValue14;
                        }
                        qwu qwuVar6 = (qwu) poyVarM.b;
                        qwuVar6.i = qxdVar;
                        qwuVar6.a |= 128;
                        poyVarM2 = qyk.t.m();
                        poyVarM3 = qwv.c.m();
                        if (poyVarM3.c) {
                            poyVarM3.m();
                            poyVarM3.c = false;
                        }
                        qwv qwvVar3 = (qwv) poyVarM3.b;
                        qwu qwuVar7 = (qwu) poyVarM.j();
                        qwuVar7.getClass();
                        qwvVar3.b = qwuVar7;
                        qwvVar3.a |= 1;
                        if (poyVarM2.c) {
                            poyVarM2.m();
                            poyVarM2.c = false;
                        }
                        qyk qykVar3 = (qyk) poyVarM2.b;
                        qwv qwvVar4 = (qwv) poyVarM3.j();
                        qwvVar4.getClass();
                        qykVar3.j = qwvVar4;
                        qykVar3.a |= 512;
                        qykVar = (qyk) poyVarM2.j();
                    }
                }
            }
        }
        if (qykVar == null) {
            return phq.a;
        }
        mxl mxlVar = this.h;
        mxf mxfVarA = mxg.a();
        mxfVarA.a = mwzVarD.g;
        mxfVarA.b(true);
        mxfVarA.d(qykVar);
        mxfVarA.b = mwzVarD.h;
        return mxlVar.b(mxfVarA.a());
    }

    public pht r() {
        if (!mez.c(this.c)) {
            return phq.a;
        }
        try {
            obr.aQ(this.a.getAndSet(false));
            return u(qwt.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return plk.U(e);
        }
    }

    public pht s() {
        if (!mez.c(this.c)) {
            return phq.a;
        }
        if (!this.a.getAndSet(true)) {
            return u(qwt.BACKGROUND_TO_FOREGROUND);
        }
        ((oug) ((oug) b.c()).G((char) 3607)).o("App is already in the foreground.");
        return plk.T();
    }

    @Override // defpackage.mxo
    public void t() {
        this.d.a(this);
    }
}
