package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class lrg {
    public lrt a;
    private final ReentrantLock b = new ReentrantLock();
    private final lpq c;

    public lrg(lpq lpqVar) {
        this.a = lpqVar.a().d();
        this.c = lpqVar;
    }

    public static final Set f(lrt lrtVar) {
        return ope.M(mip.be(CaptureRequest.CONTROL_MODE, lrtVar.d()), mip.be(CaptureRequest.CONTROL_AF_MODE, lrtVar.b()), mip.be(CaptureRequest.CONTROL_AE_MODE, lrtVar.a()), mip.be(CaptureRequest.CONTROL_AWB_MODE, lrtVar.c()), mip.be(CaptureRequest.FLASH_MODE, lrtVar.e()), mip.be(CaptureRequest.CONTROL_AE_LOCK, lrtVar.b), mip.be(CaptureRequest.CONTROL_AWB_LOCK, lrtVar.c), mip.be(CaptureRequest.CONTROL_AF_REGIONS, lrtVar.d), mip.be(CaptureRequest.CONTROL_AE_REGIONS, lrtVar.e), mip.be(CaptureRequest.CONTROL_AWB_REGIONS, lrtVar.f));
    }

    static final void g(lpc lpcVar, lrt lrtVar) {
        lpcVar.e(f(lrtVar));
    }

    final lie a() {
        this.b.lock();
        final ReentrantLock reentrantLock = this.b;
        return new lie() { // from class: lrf
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                reentrantLock.unlock();
            }
        };
    }

    final lrs b() {
        lie lieVarA = a();
        try {
            lrs lrsVarB = lrs.b(this.a);
            lrt lrtVar = this.a;
            lrsVarB.f = lrtVar.a;
            lrsVarB.g = lrtVar.b;
            lrsVarB.h = lrtVar.c;
            lieVarA.close();
            return lrsVarB;
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    final lrt c() {
        lie lieVarA = a();
        try {
            lrt lrtVar = this.a;
            lieVarA.close();
            return lrtVar;
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    final void d(lrt lrtVar, boolean z) {
        lie lieVarA = a();
        try {
            this.a = lrtVar;
            if (z) {
                this.c.c(lrtVar);
            }
            lieVarA.close();
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    final void e(boolean z, boolean z2, boolean z3, boolean z4) {
        lie lieVarA = a();
        try {
            lrs lrsVarC = lrs.c(this.a);
            Boolean boolValueOf = Boolean.valueOf(z);
            lrsVarC.f = boolValueOf;
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            lrsVarC.g = boolValueOf2;
            Boolean boolValueOf3 = Boolean.valueOf(z3);
            lrsVarC.h = boolValueOf3;
            this.a = lrsVarC.d();
            if (z4) {
                lpq lpqVar = this.c;
                lrs lrsVarA = lpqVar.a();
                lrsVarA.f = boolValueOf;
                lrsVarA.g = boolValueOf2;
                lrsVarA.h = boolValueOf3;
                lpqVar.c(lrsVarA.d());
            }
            lieVarA.close();
        } catch (Throwable th) {
            try {
                lieVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }
}
