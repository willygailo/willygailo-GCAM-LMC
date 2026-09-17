package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class gar implements mad {
    public final lmr a;
    final /* synthetic */ gas b;
    private final gfs c;
    private final gfi d;
    private final lig e;
    private mad f = null;

    public gar(gas gasVar, lmr lmrVar, gfs gfsVar, gfi gfiVar) {
        this.b = gasVar;
        this.a = lmrVar;
        this.c = gfsVar;
        this.d = gfiVar;
        mad madVarE = gasVar.b.a(lmrVar).e();
        try {
            madVarE.getClass();
            this.e = lig.h(madVarE.c(), madVarE.b());
            madVarE.close();
        } catch (Throwable th) {
            if (madVarE != null) {
                try {
                    madVarE.close();
                } catch (Throwable th2) {
                }
            }
            throw th;
        }
    }

    private final synchronized mad k() {
        pih pihVarF = pih.f();
        if (this.f == null) {
            this.b.a.b(this.a, this.c, this.d, new gaq(this, pihVarF));
            this.f = (mad) plk.ae(pihVarF);
        }
        return this.f;
    }

    @Override // defpackage.mad
    public final int a() {
        return 35;
    }

    @Override // defpackage.mad
    public final int b() {
        return this.e.b;
    }

    @Override // defpackage.mad
    public final int c() {
        return this.e.a;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
        mad madVar = this.f;
        if (madVar != null) {
            madVar.close();
        }
    }

    @Override // defpackage.mad
    public final long d() {
        lmw lmwVarB = this.a.b();
        lmwVarB.getClass();
        return lmwVarB.b;
    }

    @Override // defpackage.mad
    public final Rect e() {
        lig ligVar = this.e;
        return new Rect(0, 0, ligVar.a, ligVar.b);
    }

    @Override // defpackage.mad
    public final HardwareBuffer f() {
        mad madVarK = k();
        if (madVarK != null) {
            return madVarK.f();
        }
        return null;
    }

    @Override // defpackage.mad
    public final List g() {
        return k() != null ? k().g() : oom.l();
    }

    @Override // defpackage.mad
    public final void h(Rect rect) {
        throw new UnsupportedOperationException("Cannot set crop rect in this implementation!");
    }

    @Override // defpackage.mad
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.lzl
    public final kkm j() {
        return kkm.b();
    }
}
