package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mew {
    private final meq a;
    private final Map b;
    private final met c;
    private final mdo d;
    private final int e;
    private final int f;
    private final ArrayDeque g;

    public mew(meq meqVar, Map map, met metVar, mdo mdoVar, int i, int i2, ArrayDeque arrayDeque) {
        this.a = meqVar;
        this.b = map;
        this.c = metVar;
        this.d = mdoVar;
        this.e = i;
        this.f = i2;
        this.g = arrayDeque;
    }

    public final void a(poy poyVar) {
        boolean z = false;
        if ((((psl) poyVar.b).a & 64) == 0) {
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            psl pslVar = (psl) poyVar.b;
            pslVar.h = plk.ap(2);
            pslVar.a |= 64;
        }
        Throwable th = (Throwable) this.d.b.e(new Throwable());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        int length = string.length();
        long jB = pzl.a.a().b();
        if (jB < length && jB >= 0) {
            length = (int) jB;
        }
        String strSubstring = string.substring(0, length);
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        psl pslVar2 = (psl) poyVar.b;
        strSubstring.getClass();
        pslVar2.a |= 2048;
        pslVar2.l = strSubstring;
        psl pslVar3 = (psl) poyVar.j();
        Long lValueOf = Long.valueOf(pslVar3.d);
        int iAq = plk.aq(pslVar3.h);
        mev mevVar = new mev(lValueOf, iAq != 0 ? iAq : 2);
        long jA = pzl.a.a().a();
        synchronized (this.b) {
            Long l = (Long) this.b.get(mevVar);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (l == null || jA <= 0 || l.longValue() + jA < jCurrentTimeMillis) {
                z = true;
            }
            if (z) {
                this.b.put(mevVar, Long.valueOf(jCurrentTimeMillis));
            }
        }
        if (z) {
            this.c.a(pslVar3);
        }
    }

    public final poy b(int i) {
        poy poyVarM = psl.m.m();
        String packageName = this.d.a.getPackageName();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        psl pslVar = (psl) poyVarM.b;
        packageName.getClass();
        pslVar.a |= 1;
        pslVar.b = packageName;
        int iA = this.a.a(this.d.a);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        psl pslVar2 = (psl) poyVarM.b;
        int i2 = pslVar2.a | 2;
        pslVar2.a = i2;
        pslVar2.c = iA;
        int i3 = this.e;
        int i4 = i2 | 4;
        pslVar2.a = i4;
        pslVar2.d = i3;
        int i5 = i4 | 8;
        pslVar2.a = i5;
        pslVar2.e = -2032180703L;
        int i6 = this.f;
        pslVar2.a = i5 | 16;
        pslVar2.f = i6;
        ooh oohVarE = oom.e();
        Iterator itDescendingIterator = this.g.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            oohVarE.g(Long.valueOf(((mdu) itDescendingIterator.next()).e));
        }
        oom oomVarF = oohVarE.f();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        psl pslVar3 = (psl) poyVarM.b;
        pslVar3.i();
        pnl.e(oomVarF, pslVar3.k);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        psl pslVar4 = (psl) poyVarM.b;
        pslVar4.h = plk.ap(i);
        pslVar4.a |= 64;
        return poyVarM;
    }
}
