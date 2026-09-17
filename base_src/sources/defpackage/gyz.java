package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class gyz implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Map b;
    final /* synthetic */ lnc c;
    final /* synthetic */ int d;
    final /* synthetic */ gza e;

    public gyz(gza gzaVar, String str, Map map, lnc lncVar, int i) {
        this.e = gzaVar;
        this.a = str;
        this.b = map;
        this.c = lncVar;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            hashCode();
            if (this.a.equals(this.e.d)) {
                lqd lqdVar = (lqd) this.b.get(this.a);
                ope opeVar = lqdVar.c;
                this.e.e = this.c.r(lqdVar, this.d);
                this.e.e.m(this.d);
                gza gzaVar = this.e;
                gzaVar.e.k(gzaVar.h);
                gza gzaVar2 = this.e;
                lmt lmtVar = gzaVar2.f;
                if (lmtVar != null) {
                    gzaVar2.e.n(lmtVar);
                }
            } else {
                ((oug) ((oug) gza.a.c()).G(2208)).o("Out of date task, skipping.");
            }
        } finally {
            Thread.currentThread().getId();
            this.e.b.unlock();
        }
    }
}
