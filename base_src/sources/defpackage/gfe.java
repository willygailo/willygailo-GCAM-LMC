package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gfe {
    private List a;
    private int b = 1;

    public final synchronized void a() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        obr.aQ(z);
        this.b = 4;
    }

    public final synchronized void b() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        obr.aQ(z);
        this.b = 3;
    }

    public final synchronized void c(oom oomVar) {
        this.a = oomVar;
    }

    public final synchronized void d() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        obr.aQ(z);
        this.b = 2;
    }

    public final synchronized void e(poy poyVar) {
        List list = this.a;
        if (list != null) {
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pcw pcwVar = (pcw) poyVar.b;
            pcw pcwVar2 = pcw.m;
            pcwVar.i = pcw.A();
            for (int i = 0; i < list.size(); i++) {
                poy poyVarM = pcz.c.m();
                Long l = (Long) list.get(i);
                l.getClass();
                int iLongValue = (int) l.longValue();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pcz pczVar = (pcz) poyVarM.b;
                pczVar.a |= 1;
                pczVar.b = iLongValue;
                pcz pczVar2 = (pcz) poyVarM.j();
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                pcw pcwVar3 = (pcw) poyVar.b;
                pczVar2.getClass();
                ppm ppmVar = pcwVar3.i;
                if (!ppmVar.c()) {
                    pcwVar3.i = ppd.B(ppmVar);
                }
                pcwVar3.i.add(pczVar2);
            }
        }
        int i2 = this.b;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pcw pcwVar4 = (pcw) poyVar.b;
        int i3 = i2 - 1;
        pcw pcwVar5 = pcw.m;
        if (i2 == 0) {
            throw null;
        }
        pcwVar4.k = i3;
        pcwVar4.a |= 256;
    }
}
