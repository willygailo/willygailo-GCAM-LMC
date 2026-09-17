package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class fpz implements AutoCloseable {
    private static final ouj h = ouj.h("com/google/android/apps/camera/microvideo/encoder/AudioTrackSampler");
    public final ojc a;
    public final ojc c;
    public final Executor d;
    fpy f;
    boolean g;
    private final ddf i;
    private final MediaFormat j;
    private final AtomicLong k = new AtomicLong();
    private final AtomicLong l = new AtomicLong();
    private final AtomicLong m = new AtomicLong();
    public final AtomicLong e = new AtomicLong();
    private final AtomicLong n = new AtomicLong();
    public final Handler b = mip.bW(new lap(), "mv-aud-encoder");

    public fpz(ddf ddfVar, MediaFormat mediaFormat, ojc ojcVar, ojc ojcVar2, Executor executor) {
        this.i = ddfVar;
        this.j = mediaFormat;
        this.a = ojcVar2;
        this.c = ojcVar;
        this.d = executor;
    }

    public final void a(boolean z) {
        if (z || System.currentTimeMillis() >= this.n.get() + 1000) {
            this.k.get();
            this.m.get();
            this.e.get();
            this.l.get();
            this.n.set(System.currentTimeMillis());
        }
    }

    public final synchronized void b(mln mlnVar, fqn fqnVar) {
        if (this.c.g()) {
            if (this.f != null) {
                ((oug) ((oug) h.c()).G((char) 1869)).o("Attempting to re-initialize AudioTrackSampler!");
                return;
            }
            ((dve) this.c.c()).d(new fpw(this, 2), this.d);
            msd msdVarJ = mwp.j(new frc(mlnVar));
            msj msjVarC = ((msh) msdVarJ).c(this.j);
            msjVarC.c = this.b;
            msjVarC.b(new fpx(this));
            msc mscVarA = msjVarC.a();
            msdVarJ.b();
            this.f = new fpy(msdVarJ, mscVarA, fqnVar);
        }
    }

    public final synchronized void c() {
        ojc ojcVarI;
        if (this.c.g() && !this.g) {
            fpy fpyVar = this.f;
            fpyVar.getClass();
            msc mscVar = fpyVar.b;
            if (mscVar == null) {
                return;
            }
            try {
                mru mruVarD = mscVar.d();
                if (mruVarD != null) {
                    try {
                        fqn fqnVar = fpyVar.c;
                        while (true) {
                            Object objB = ((dve) this.c.c()).b();
                            if (objB != null) {
                                this.k.incrementAndGet();
                                nle nleVarG = fqnVar.g(TimeUnit.MICROSECONDS.convert(((mro) objB).c, TimeUnit.NANOSECONDS));
                                if (!nleVarG.l()) {
                                    ddf ddfVar = this.i;
                                    ddi ddiVar = ddr.a;
                                    ddfVar.d();
                                    if (nleVarG.m() && this.a.g() && this.k.get() >= 5) {
                                        ((dvt) this.a.c()).b();
                                        a(true);
                                        this.k.set(0L);
                                    }
                                    ojcVarI = ojc.i(objB);
                                    break;
                                }
                                this.l.incrementAndGet();
                            } else {
                                ojcVarI = oih.a;
                                break;
                            }
                        }
                        if (ojcVarI.g()) {
                            mruVarD.b.put(((mro) ojcVarI.c()).a.asReadOnlyBuffer());
                            mruVarD.a = TimeUnit.MICROSECONDS.convert(((mro) ojcVarI.c()).c, TimeUnit.NANOSECONDS);
                            this.m.incrementAndGet();
                            a(false);
                        }
                        mruVarD.close();
                    } catch (Throwable th) {
                        try {
                            mruVarD.close();
                        } catch (Throwable th2) {
                        }
                        throw th;
                    }
                }
            } catch (IllegalStateException e) {
                ((oug) ((oug) ((oug) h.c()).h(e)).G((char) 1874)).o("Error trying to encode audio packet. Possible codec shutdown");
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.g = true;
        a(true);
        fpy fpyVar = this.f;
        if (this.a.g()) {
            ((dvt) this.a.c()).b();
            this.k.set(0L);
        }
        pht phtVarA = fpyVar != null ? fpyVar.a.a() : plk.V(null);
        fvq.a("AudioTrackSampler", phtVarA);
        phtVarA.d(new fpw(this, 1), pgr.INSTANCE);
    }
}
