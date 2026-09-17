package defpackage;

import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public final class acx extends act {
    public acy q;
    public float r;
    private boolean s;

    public acx(Object obj, acw acwVar) {
        super(obj, acwVar);
        this.q = null;
        this.r = Float.MAX_VALUE;
        this.s = false;
    }

    @Override // defpackage.act
    public final void e() {
        acy acyVar = this.q;
        if (acyVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = acyVar.a();
        if (dA > this.n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.o) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        acy acyVar2 = this.q;
        double dAbs = Math.abs(b());
        acyVar2.c = dAbs;
        acyVar2.d = dAbs * 62.5d;
        super.e();
    }

    @Override // defpackage.act
    public final boolean f(long j) {
        float f;
        if (this.s) {
            float f2 = this.r;
            if (f2 != Float.MAX_VALUE) {
                this.q.d(f2);
                this.r = Float.MAX_VALUE;
            }
            this.i = this.q.a();
            this.h = 0.0f;
            this.s = false;
            return true;
        }
        if (this.r != Float.MAX_VALUE) {
            long j2 = j / 2;
            acq acqVarB = this.q.b(this.i, this.h, j2);
            this.q.d(this.r);
            this.r = Float.MAX_VALUE;
            acq acqVarB2 = this.q.b(acqVarB.a, acqVarB.b, j2);
            f = acqVarB2.a;
            this.i = f;
            this.h = acqVarB2.b;
        } else {
            acq acqVarB3 = this.q.b(this.i, this.h, j);
            f = acqVarB3.a;
            this.i = f;
            this.h = acqVarB3.b;
        }
        float fMax = Math.max(f, this.o);
        this.i = fMax;
        float fMin = Math.min(fMax, this.n);
        this.i = fMin;
        float f3 = this.h;
        acy acyVar = this.q;
        if (Math.abs(f3) >= acyVar.d || Math.abs(fMin - acyVar.a()) >= acyVar.c) {
            return false;
        }
        this.i = this.q.a();
        this.h = 0.0f;
        return true;
    }

    public final void j() {
        if (this.q.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!c().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.m) {
            this.s = true;
        }
    }
}
