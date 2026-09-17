package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fnq {
    public final ddf a;
    public boolean b = true;
    private final Executor c;
    private final ilx d;

    public fnq(ilx ilxVar, ddf ddfVar, Executor executor) {
        this.d = ilxVar;
        this.a = ddfVar;
        this.c = executor;
    }

    public final void a() {
        mip.ca(this.d.a(), new lht() { // from class: fnp
            @Override // defpackage.lht
            public final void a(Object obj) {
                fnq fnqVar = this.a;
                ilv ilvVar = (ilv) obj;
                synchronized (fnqVar) {
                    ddf ddfVar = fnqVar.a;
                    ddi ddiVar = ddl.a;
                    ddfVar.b();
                    ilvVar.getClass();
                    fnqVar.b = ilvVar.c();
                }
            }
        }, this.c);
    }

    public final synchronized boolean b() {
        return this.b;
    }
}
