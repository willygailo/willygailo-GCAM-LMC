package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ndv {
    private static final ojq d = ojq.b('/').a();
    static final ndu a = new ndt(1);
    static final ndu b = new ndt(0);
    static final ndu c = new ndt(2);

    public static qyk a(qyk qykVar) {
        poy poyVar = (poy) qykVar.G(5);
        poyVar.o(qykVar);
        b(a, poyVar);
        qwv qwvVar = ((qyk) poyVar.b).j;
        if (qwvVar == null) {
            qwvVar = qwv.c;
        }
        if ((qwvVar.a & 1) != 0) {
            qwv qwvVar2 = ((qyk) poyVar.b).j;
            if (qwvVar2 == null) {
                qwvVar2 = qwv.c;
            }
            qwu qwuVar = qwvVar2.b;
            if (qwuVar == null) {
                qwuVar = qwu.k;
            }
            poy poyVar2 = (poy) qwuVar.G(5);
            poyVar2.o(qwuVar);
            b(b, poyVar2);
            qwv qwvVar3 = ((qyk) poyVar.b).j;
            if (qwvVar3 == null) {
                qwvVar3 = qwv.c;
            }
            poy poyVar3 = (poy) qwvVar3.G(5);
            poyVar3.o(qwvVar3);
            if (poyVar3.c) {
                poyVar3.m();
                poyVar3.c = false;
            }
            qwv qwvVar4 = (qwv) poyVar3.b;
            qwu qwuVar2 = (qwu) poyVar2.j();
            qwuVar2.getClass();
            qwvVar4.b = qwuVar2;
            qwvVar4.a |= 1;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            qyk qykVar2 = (qyk) poyVar.b;
            qwv qwvVar5 = (qwv) poyVar3.j();
            qwvVar5.getClass();
            qykVar2.j = qwvVar5;
            qykVar2.a |= 512;
        }
        qxy qxyVar = ((qyk) poyVar.b).g;
        if (qxyVar == null) {
            qxyVar = qxy.j;
        }
        if ((qxyVar.a & 256) != 0) {
            qxy qxyVar2 = ((qyk) poyVar.b).g;
            if (qxyVar2 == null) {
                qxyVar2 = qxy.j;
            }
            pey peyVar = qxyVar2.h;
            if (peyVar == null) {
                peyVar = pey.d;
            }
            poy poyVar4 = (poy) peyVar.G(5);
            poyVar4.o(peyVar);
            pex pexVar = ((pey) poyVar4.b).b;
            if (pexVar == null) {
                pexVar = pex.f;
            }
            poy poyVar5 = (poy) pexVar.G(5);
            poyVar5.o(pexVar);
            String str = ((pex) poyVar5.b).c;
            if (!str.isEmpty()) {
                long jLongValue = piv.a(str).longValue();
                if (poyVar5.c) {
                    poyVar5.m();
                    poyVar5.c = false;
                }
                pex pexVar2 = (pex) poyVar5.b;
                int i = pexVar2.a | 4;
                pexVar2.a = i;
                pexVar2.d = jLongValue;
                pexVar2.a = i & (-3);
                pexVar2.c = pex.f.c;
            }
            pex pexVar3 = (pex) poyVar5.j();
            if (poyVar4.c) {
                poyVar4.m();
                poyVar4.c = false;
            }
            pey peyVar2 = (pey) poyVar4.b;
            pexVar3.getClass();
            peyVar2.b = pexVar3;
            peyVar2.a |= 1;
            List<pex> listUnmodifiableList = Collections.unmodifiableList(peyVar2.c);
            if (poyVar4.c) {
                poyVar4.m();
                poyVar4.c = false;
            }
            ((pey) poyVar4.b).c = pey.A();
            for (pex pexVar4 : listUnmodifiableList) {
                poy poyVar6 = (poy) pexVar4.G(5);
                poyVar6.o(pexVar4);
                String str2 = ((pex) poyVar6.b).c;
                if (!str2.isEmpty()) {
                    long jLongValue2 = piv.a(str2).longValue();
                    if (poyVar6.c) {
                        poyVar6.m();
                        poyVar6.c = false;
                    }
                    pex pexVar5 = (pex) poyVar6.b;
                    int i2 = pexVar5.a | 4;
                    pexVar5.a = i2;
                    pexVar5.d = jLongValue2;
                    pexVar5.a = i2 & (-3);
                    pexVar5.c = pex.f.c;
                }
                pex pexVar6 = (pex) poyVar6.j();
                if (poyVar4.c) {
                    poyVar4.m();
                    poyVar4.c = false;
                }
                pey peyVar3 = (pey) poyVar4.b;
                pexVar6.getClass();
                peyVar3.b();
                peyVar3.c.add(pexVar6);
            }
            qxy qxyVar3 = ((qyk) poyVar.b).g;
            if (qxyVar3 == null) {
                qxyVar3 = qxy.j;
            }
            poy poyVar7 = (poy) qxyVar3.G(5);
            poyVar7.o(qxyVar3);
            pey peyVar4 = (pey) poyVar4.j();
            if (poyVar7.c) {
                poyVar7.m();
                poyVar7.c = false;
            }
            qxy qxyVar4 = (qxy) poyVar7.b;
            peyVar4.getClass();
            qxyVar4.h = peyVar4;
            qxyVar4.a |= 256;
            qxy qxyVar5 = (qxy) poyVar7.j();
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            qyk qykVar3 = (qyk) poyVar.b;
            qxyVar5.getClass();
            qykVar3.g = qxyVar5;
            qykVar3.a |= 64;
        }
        qyf qyfVar = ((qyk) poyVar.b).i;
        if (qyfVar == null) {
            qyfVar = qyf.k;
        }
        if (qyfVar.j.size() != 0) {
            qyf qyfVar2 = ((qyk) poyVar.b).i;
            if (qyfVar2 == null) {
                qyfVar2 = qyf.k;
            }
            poy poyVar8 = (poy) qyfVar2.G(5);
            poyVar8.o(qyfVar2);
            for (int i3 = 0; i3 < ((qyf) poyVar8.b).j.size(); i3++) {
                qye qyeVar = (qye) ((qyf) poyVar8.b).j.get(i3);
                poy poyVar9 = (poy) qyeVar.G(5);
                poyVar9.o(qyeVar);
                if (!TextUtils.isEmpty(((qye) poyVar9.b).b)) {
                    if (poyVar9.c) {
                        poyVar9.m();
                        poyVar9.c = false;
                    }
                    ((qye) poyVar9.b).c = qye.y();
                    List listC = c(((qye) poyVar9.b).b);
                    if (poyVar9.c) {
                        poyVar9.m();
                        poyVar9.c = false;
                    }
                    qye qyeVar2 = (qye) poyVar9.b;
                    ppl pplVar = qyeVar2.c;
                    if (!pplVar.c()) {
                        qyeVar2.c = ppd.z(pplVar);
                    }
                    pnl.e(listC, qyeVar2.c);
                }
                if (poyVar9.c) {
                    poyVar9.m();
                    poyVar9.c = false;
                }
                qye qyeVar3 = (qye) poyVar9.b;
                qyeVar3.a &= -2;
                qyeVar3.b = qye.f.b;
                if (poyVar8.c) {
                    poyVar8.m();
                    poyVar8.c = false;
                }
                qyf qyfVar3 = (qyf) poyVar8.b;
                qye qyeVar4 = (qye) poyVar9.j();
                qyeVar4.getClass();
                qyfVar3.i();
                qyfVar3.j.set(i3, qyeVar4);
            }
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            qyk qykVar4 = (qyk) poyVar.b;
            qyf qyfVar4 = (qyf) poyVar8.j();
            qyfVar4.getClass();
            qykVar4.i = qyfVar4;
            qykVar4.a |= 256;
        }
        qxk qxkVar = ((qyk) poyVar.b).f;
        if (qxkVar == null) {
            qxkVar = qxk.b;
        }
        if (qxkVar.a.size() != 0) {
            qxk qxkVar2 = ((qyk) poyVar.b).f;
            if (qxkVar2 == null) {
                qxkVar2 = qxk.b;
            }
            poy poyVar10 = (poy) qxkVar2.G(5);
            poyVar10.o(qxkVar2);
            for (int i4 = 0; i4 < ((qxk) poyVar10.b).a.size(); i4++) {
                qxj qxjVar = (qxj) ((qxk) poyVar10.b).a.get(i4);
                poy poyVar11 = (poy) qxjVar.G(5);
                poyVar11.o(qxjVar);
                if (!TextUtils.isEmpty(((qxj) poyVar11.b).d)) {
                    if (poyVar11.c) {
                        poyVar11.m();
                        poyVar11.c = false;
                    }
                    ((qxj) poyVar11.b).e = qxj.y();
                    List listC2 = c(((qxj) poyVar11.b).d);
                    if (poyVar11.c) {
                        poyVar11.m();
                        poyVar11.c = false;
                    }
                    qxj qxjVar2 = (qxj) poyVar11.b;
                    ppl pplVar2 = qxjVar2.e;
                    if (!pplVar2.c()) {
                        qxjVar2.e = ppd.z(pplVar2);
                    }
                    pnl.e(listC2, qxjVar2.e);
                }
                if (poyVar11.c) {
                    poyVar11.m();
                    poyVar11.c = false;
                }
                qxj qxjVar3 = (qxj) poyVar11.b;
                qxjVar3.a &= -524289;
                qxjVar3.d = qxj.g.d;
                if (poyVar10.c) {
                    poyVar10.m();
                    poyVar10.c = false;
                }
                qxk qxkVar3 = (qxk) poyVar10.b;
                qxj qxjVar4 = (qxj) poyVar11.j();
                qxjVar4.getClass();
                ppm ppmVar = qxkVar3.a;
                if (!ppmVar.c()) {
                    qxkVar3.a = ppd.B(ppmVar);
                }
                qxkVar3.a.set(i4, qxjVar4);
            }
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            qyk qykVar5 = (qyk) poyVar.b;
            qxk qxkVar4 = (qxk) poyVar10.j();
            qxkVar4.getClass();
            qykVar5.f = qxkVar4;
            qykVar5.a |= 32;
        }
        qxn qxnVar = ((qyk) poyVar.b).m;
        if (qxnVar == null) {
            qxnVar = qxn.f;
        }
        if (qxnVar.d.size() != 0) {
            qxn qxnVar2 = ((qyk) poyVar.b).m;
            if (qxnVar2 == null) {
                qxnVar2 = qxn.f;
            }
            poy poyVar12 = (poy) qxnVar2.G(5);
            poyVar12.o(qxnVar2);
            for (int i5 = 0; i5 < ((qxn) poyVar12.b).d.size(); i5++) {
                qxo qxoVar = (qxo) ((qxn) poyVar12.b).d.get(i5);
                poy poyVar13 = (poy) qxoVar.G(5);
                poyVar13.o(qxoVar);
                b(c, poyVar13);
                if (poyVar12.c) {
                    poyVar12.m();
                    poyVar12.c = false;
                }
                qxn qxnVar3 = (qxn) poyVar12.b;
                qxo qxoVar2 = (qxo) poyVar13.j();
                qxoVar2.getClass();
                ppm ppmVar2 = qxnVar3.d;
                if (!ppmVar2.c()) {
                    qxnVar3.d = ppd.B(ppmVar2);
                }
                qxnVar3.d.set(i5, qxoVar2);
            }
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            qyk qykVar6 = (qyk) poyVar.b;
            qxn qxnVar4 = (qxn) poyVar12.j();
            qxnVar4.getClass();
            qykVar6.m = qxnVar4;
            qykVar6.a |= 16384;
        }
        return (qyk) poyVar.j();
    }

    static void b(ndu nduVar, pql pqlVar) {
        String strA = nduVar.a(pqlVar);
        String strB = nduVar.b(pqlVar);
        if (!TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB)) {
            nduVar.c(pqlVar, null);
        } else {
            nduVar.c(pqlVar, piv.a(strB));
        }
        nduVar.d(pqlVar);
    }

    private static List c(String str) {
        return obr.am(d.g(str), imd.q);
    }
}
