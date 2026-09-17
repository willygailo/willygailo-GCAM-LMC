package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class gdd implements gex {
    final /* synthetic */ gdh a;
    final /* synthetic */ gdj b;

    public gdd(gdj gdjVar, gdh gdhVar) {
        this.b = gdjVar;
        this.a = gdhVar;
    }

    @Override // defpackage.gex
    public final void a() {
        this.b.h.post(new gdb(this, this.a, 1));
    }

    @Override // defpackage.gex
    public final void b(Throwable th) {
        this.b.h.post(new gdb(this, this.a, 0));
    }

    @Override // defpackage.gex
    public final void c(final mad madVar) {
        Handler handler = this.b.h;
        final gdh gdhVar = this.a;
        handler.post(new Runnable() { // from class: gdc
            @Override // java.lang.Runnable
            public final void run() {
                gdd gddVar = this.a;
                gdh gdhVar2 = gdhVar;
                mad madVar2 = madVar;
                synchronized (gdj.class) {
                    gdhVar2.a = false;
                    gdhVar2.b = ojc.i(new lwk(madVar2));
                    gdhVar2.e = ojc.i(Long.valueOf(System.currentTimeMillis()));
                    gddVar.b.r();
                }
            }
        });
    }
}
