package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class byz implements lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/autotimer/AutoTimerAnalysis");
    public final lce b;
    public final lda c;
    public final bzu d;
    public final qkg e;
    public final Executor f;
    public final lnc g;
    public final lco h;
    public final pkr i;
    public final bzv j;
    public final pyn k;
    public final lnx l;
    public final ljf m;
    public lie p;
    public final jdy r;
    public BaseCurator n = null;
    public lmv o = null;
    public boolean q = false;

    public byz(lce lceVar, lda ldaVar, jdy jdyVar, bzu bzuVar, qkg qkgVar, Executor executor, lnc lncVar, lco lcoVar, pkr pkrVar, bzv bzvVar, pyn pynVar, ljf ljfVar, lnx lnxVar, byte[] bArr) {
        this.b = lceVar;
        this.c = ldaVar;
        this.r = jdyVar;
        this.d = bzuVar;
        this.e = qkgVar;
        this.f = plk.M(executor);
        this.g = lncVar;
        this.h = lcoVar;
        this.i = pkrVar;
        this.j = bzvVar;
        this.k = pynVar;
        this.l = lnxVar;
        this.m = ljfVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.f.execute(new byx(this, 1));
    }
}
