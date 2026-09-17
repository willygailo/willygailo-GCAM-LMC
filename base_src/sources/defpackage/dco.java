package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dco {
    private final long b;
    private final long c;
    private final ojc d;
    private final int g;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    public ojc a = oih.a;

    public dco(int i, long j, long j2, ojc ojcVar) {
        this.g = i;
        this.b = j;
        this.c = j2;
        this.d = ojcVar;
    }

    final synchronized void a(pbq pbqVar) {
        this.f.add(pbqVar);
    }

    final synchronized void b(long j) {
        this.e.add(Long.valueOf(j - this.c));
    }

    final synchronized pbr c(long j) {
        pbr pbrVar;
        poy poyVarM = pbr.j.m();
        int i = this.g;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbr pbrVar2 = (pbr) poyVarM.b;
        pbrVar2.b = i - 1;
        int i2 = pbrVar2.a | 1;
        pbrVar2.a = i2;
        long j2 = this.c;
        long j3 = this.b;
        pbrVar2.a = i2 | 2;
        pbrVar2.c = j2 - j3;
        List list = this.e;
        ppl pplVar = pbrVar2.e;
        if (!pplVar.c()) {
            pbrVar2.e = ppd.z(pplVar);
        }
        pnl.e(list, pbrVar2.e);
        long j4 = j - this.c;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbr pbrVar3 = (pbr) poyVarM.b;
        int i3 = pbrVar3.a | 16;
        pbrVar3.a = i3;
        pbrVar3.g = j4;
        pbrVar3.h = 2;
        pbrVar3.a = i3 | 32;
        if (this.d.g()) {
            poy poyVarM2 = pah.e.m();
            float f = ((ftm) this.d.c()).b;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pah pahVar = (pah) poyVarM2.b;
            pahVar.a |= 2;
            pahVar.c = f;
            float f2 = ((ftm) this.d.c()).c;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pah pahVar2 = (pah) poyVarM2.b;
            pahVar2.a |= 1;
            pahVar2.b = f2;
            float f3 = ((ftm) this.d.c()).a;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pah pahVar3 = (pah) poyVarM2.b;
            pahVar3.a |= 4;
            pahVar3.d = f3;
            pah pahVar4 = (pah) poyVarM2.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbr pbrVar4 = (pbr) poyVarM.b;
            pahVar4.getClass();
            pbrVar4.f = pahVar4;
            pbrVar4.a |= 8;
        }
        if (this.a.g()) {
            long jLongValue = ((Long) this.a.c()).longValue() - this.c;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbr pbrVar5 = (pbr) poyVarM.b;
            pbrVar5.a |= 4;
            pbrVar5.d = jLongValue;
        }
        if (!this.f.isEmpty()) {
            List list2 = this.f;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbr pbrVar6 = (pbr) poyVarM.b;
            ppk ppkVar = pbrVar6.i;
            if (!ppkVar.c()) {
                pbrVar6.i = ppd.x(ppkVar);
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                pbrVar6.i.g(((pbq) it.next()).d);
            }
        }
        pbrVar = (pbr) poyVarM.j();
        pbrVar.e.size();
        this.f.size();
        return pbrVar;
    }
}
