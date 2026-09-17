package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cnd implements lie {
    public final ljf a;
    public final qkg b;
    public final ojc c;
    public final phv d;
    public final ScheduledExecutorService e;
    public final cpj f;
    public final qkg g;
    public final cmm h;
    public final fix i;
    public final cvh j;
    public final lfc k;
    public final cux l;
    public final ddf m;
    public final cnu n;
    public lfl q;
    public cle s;
    public final cid t;
    public final nvb u;
    public final Object o = new Object();
    public ojc p = oih.a;
    public boolean r = true;

    public cnd(qkg qkgVar, cid cidVar, ojc ojcVar, cmm cmmVar, phv phvVar, ScheduledExecutorService scheduledExecutorService, cpj cpjVar, ljf ljfVar, qkg qkgVar2, fix fixVar, nvb nvbVar, cvh cvhVar, lfc lfcVar, cux cuxVar, ddf ddfVar, cnu cnuVar, byte[] bArr, byte[] bArr2) {
        this.a = ljfVar;
        this.d = phvVar;
        this.e = scheduledExecutorService;
        this.f = cpjVar;
        this.g = qkgVar2;
        this.h = cmmVar;
        this.b = qkgVar;
        this.t = cidVar;
        this.c = ojcVar;
        this.i = fixVar;
        this.u = nvbVar;
        this.j = cvhVar;
        this.k = lfcVar;
        this.l = cuxVar;
        this.m = ddfVar;
        this.n = cnuVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.o) {
            this.r = true;
            lfl lflVar = this.q;
            if (lflVar != null) {
                lflVar.close();
                this.q = null;
            }
            if (this.p.g()) {
                ((lhd) this.p.c()).e();
                this.p = oih.a;
            }
        }
    }
}
