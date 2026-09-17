package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class gzo implements hsn {
    final /* synthetic */ gzk a;
    final /* synthetic */ gog b;

    public gzo(gzk gzkVar, gog gogVar) {
        this.a = gzkVar;
        this.b = gogVar;
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.hsn
    public final void b() {
        gzk gzkVar = this.a;
        gzkVar.a.b("HdrPlusBurst#abortCaptures");
        gzkVar.d = true;
        poy poyVar = gzkVar.g;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        ozr ozrVar = (ozr) poyVar.b;
        ozr ozrVar2 = ozr.d;
        ozrVar.a |= 2;
        ozrVar.c = jElapsedRealtimeNanos;
        if (!gzkVar.e.k(ddm.D)) {
            try {
                if (gzkVar.f != null) {
                    gzkVar.a.b("Aborting all pending captures");
                    ((lqb) gzkVar.f).a.f();
                } else {
                    gzkVar.a.d("FrameServerSession not provided. Failed to abort capture.");
                }
            } catch (llv e) {
                gzkVar.a.d("Failed to abort capture.");
            }
        }
        this.b.c.f();
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void c(fjz fjzVar) {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void d(Bitmap bitmap) {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void e(ojc ojcVar) {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void f(int i, int i2, Throwable th) {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void g(int i, int i2, Throwable th) {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void h(int i, int i2) {
    }

    @Override // defpackage.hsn
    public final /* synthetic */ void i(int i, int i2) {
    }
}
