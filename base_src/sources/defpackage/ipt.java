package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
class ipt extends iph {
    final /* synthetic */ ipx b;

    public ipt(ipx ipxVar) {
        this.b = ipxVar;
    }

    @Override // defpackage.iph
    public void a() {
        this.b.l.g();
        iqj iqjVar = this.b.l;
        if (iqjVar.k.k(dcu.J)) {
            iqjVar.I.d();
        } else {
            iro iroVar = iqjVar.i;
            AtomicLong atomicLong = iroVar.d;
            jun junVar = iroVar.h;
            atomicLong.set((System.currentTimeMillis() - iroVar.c.get()) + iroVar.d.get());
            jun junVar2 = iroVar.h;
            long jCurrentTimeMillis = (System.currentTimeMillis() - iroVar.e.get()) - iroVar.d.get();
            long j = iroVar.b.get() - jCurrentTimeMillis;
            if (j > 0) {
                AtomicLong atomicLong2 = iroVar.d;
                atomicLong2.set(atomicLong2.get() - j);
                jCurrentTimeMillis += j;
            }
            iroVar.c.set(0L);
            iroVar.b(jCurrentTimeMillis);
        }
        iqjVar.a.set(true);
    }

    @Override // defpackage.iph
    public void b() {
        this.b.i();
    }

    @Override // defpackage.iph, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.f.pauseTimelapseRecording();
        this.b.k.t();
        iqj iqjVar = this.b.l;
        if (iqjVar.k.k(dcu.J)) {
            iqjVar.I.c();
        } else {
            iro iroVar = iqjVar.i;
            AtomicLong atomicLong = iroVar.c;
            jun junVar = iroVar.h;
            atomicLong.set(System.currentTimeMillis());
        }
        iqjVar.a.set(false);
    }

    @Override // defpackage.iph, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.f.resumeTimelapseRecording();
        this.b.k.x();
    }
}
