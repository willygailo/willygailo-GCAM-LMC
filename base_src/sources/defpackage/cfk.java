package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfk implements lie {
    public final cpj a;
    public final cjm b;
    public final ddf c;
    public final cux d;
    public ckd e;
    public final Object f = new Object();
    public final cfi g;
    public final nvb h;

    public cfk(cpj cpjVar, nvb nvbVar, cjm cjmVar, ddf ddfVar, cfi cfiVar, cux cuxVar, byte[] bArr, byte[] bArr2) {
        this.a = cpjVar;
        this.h = nvbVar;
        this.b = cjmVar;
        this.c = ddfVar;
        this.g = cfiVar;
        this.d = cuxVar;
    }

    public static boolean c(Intent intent) {
        return intent != null && intent.hasExtra("android.intent.extra.videoQuality") && intent.getIntExtra("android.intent.extra.videoQuality", 0) == 0;
    }

    public final oom a(cjo cjoVar, ldz ldzVar, leb lebVar, cqj cqjVar) {
        ooh oohVar = new ooh();
        if (ldzVar.f()) {
            return oohVar.f();
        }
        if (cqjVar.equals(cqj.ACTIVE)) {
            oohVar.g(ldz.FPS_30);
            return oohVar.f();
        }
        if (ldzVar.e()) {
            oohVar.g(ldz.FPS_60C_30E);
            ddf ddfVar = this.c;
            ddi ddiVar = dcu.a;
            ddfVar.f();
            return oohVar.f();
        }
        if (this.c.j(ddl.M) && cjoVar.a(ldz.FPS_AUTO, lebVar) && (!lebVar.e() || (this.c.k(dcu.E) && this.c.k(dcu.F)))) {
            oohVar.g(ldz.FPS_AUTO);
        }
        oohVar.g(ldz.FPS_AUTO);
        oohVar.g(ldz.FPS_24);
        oohVar.g(ldz.FPS_30);
        if (this.c.j(ddl.aF) && cjoVar.a(ldz.FPS_60, lebVar) && (!lebVar.e() || this.c.k(dcu.E))) {
            oohVar.g(ldz.FPS_60);
        }
        ddf ddfVar2 = this.c;
        ddi ddiVar2 = dcu.a;
        ddfVar2.f();
        return oohVar.f();
    }

    public final oom b(ldz ldzVar, leb lebVar, lwd lwdVar, cqj cqjVar) {
        ooh oohVar = new ooh();
        if (ldzVar.f() || ((lwdVar.equals(lwd.FRONT) && !this.c.k(ddl.U)) || cqjVar.equals(cqj.ACTIVE) || (cqjVar.equals(cqj.CINEMATIC) && !this.c.k(dcu.E)))) {
            oohVar.g(lebVar);
            return oohVar.f();
        }
        oohVar.g(leb.RES_1080P);
        oohVar.g(leb.RES_2160P);
        return oohVar.f();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            this.e = null;
        }
    }
}
