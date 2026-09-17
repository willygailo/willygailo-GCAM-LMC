package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class ewz implements epi {
    final /* synthetic */ exi a;

    public ewz(exi exiVar) {
        this.a = exiVar;
    }

    @Override // defpackage.epi
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.epi
    public final void d(boolean z) {
        exi exiVar = this.a;
        if (exiVar.L) {
            return;
        }
        if (!z) {
            epl eplVar = exiVar.g;
            synchronized (eplVar.a) {
                int i = eplVar.f;
                if (i == 2) {
                    eplVar.f = 1;
                } else if (i == 3) {
                    eplVar.f = 1;
                    eplVar.d.b(3);
                }
                if (this.a.v.e()) {
                    this.a.v();
                    return;
                }
                exi exiVar2 = this.a;
                if (exiVar2.ah.h) {
                    exiVar2.p.b(3);
                    return;
                } else if (exiVar2.L()) {
                    exi exiVar3 = this.a;
                    exiVar3.K = true;
                    exiVar3.i.onShutterButtonClick();
                }
            }
        } else if (!exiVar.ah.h) {
            boolean z2 = false;
            if (exiVar.R.g() && ((Boolean) ((ima) this.a.R.c()).a().fA()).booleanValue()) {
                z2 = true;
            }
            if (!this.a.N.f() && !this.a.v.e() && !z2) {
                epl eplVar2 = this.a.g;
                mcu mcuVar = eplVar2.b;
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                synchronized (eplVar2.a) {
                    int i2 = eplVar2.f;
                    if (i2 == 1) {
                        eplVar2.f = 2;
                        eplVar2.e = jElapsedRealtimeNanos;
                    } else if (jElapsedRealtimeNanos - eplVar2.e > eplVar2.c && i2 == 2) {
                        eplVar2.f = 3;
                        eplVar2.d.a(3);
                    }
                }
            }
            if (this.a.L()) {
                this.a.i.onShutterTouchStart();
            }
        }
        this.a.h.A(z);
    }

    @Override // defpackage.epi
    public final void e(boolean z) {
        exi exiVar = this.a;
        boolean z2 = exiVar.ah.h;
        if (z) {
            if (exiVar.L() || z2) {
                this.a.j.z();
            }
        }
    }

    @Override // defpackage.epi
    public final void f(boolean z) {
        exi exiVar = this.a;
        boolean z2 = exiVar.ah.h;
        if (z) {
            if (exiVar.L() || z2) {
                this.a.j.A();
            }
        }
    }
}
