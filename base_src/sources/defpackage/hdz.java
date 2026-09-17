package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.BurstSpec;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hdz implements eav, eby {
    public static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/OnDemandPreviewProcessor");
    public final pyn b;
    public final lig c;
    public final hcg d;
    public final ddf e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public dzu j;
    public final ghx k;
    private final dzv l;
    private final Executor m;
    private boolean n;
    private final nvb o;

    public hdz(pyn pynVar, lig ligVar, dzv dzvVar, hcg hcgVar, ghx ghxVar, Executor executor, nvb nvbVar, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        this.b = pynVar;
        this.c = ligVar;
        this.l = dzvVar;
        this.d = hcgVar;
        this.k = ghxVar;
        this.m = executor;
        this.o = nvbVar;
        this.e = ddfVar;
    }

    @Override // defpackage.eby
    public final /* synthetic */ void b(iin iinVar, dzx dzxVar) {
    }

    @Override // defpackage.eby
    public final void c(edd eddVar, ebr ebrVar) {
        d(eddVar.c.b.h());
    }

    @Override // defpackage.eav
    public final synchronized void d(hsp hspVar) {
        this.i = false;
        this.n = false;
    }

    @Override // defpackage.eav
    public final synchronized void e(final edd eddVar, final lmr lmrVar) {
        this.h++;
        if (this.i && this.n) {
            this.m.execute(new Runnable() { // from class: hdy
                /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
                /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                public final void run() {
                    hdz hdzVar = this.a;
                    edd eddVar2 = eddVar;
                    lmr lmrVar2 = lmrVar;
                    Bitmap bitmap = null;
                    try {
                        try {
                            mip.bh(lmrVar2);
                            mad madVarE = hdzVar.d.a(lmrVar2).e();
                            lzv lzvVarC = lmrVar2.c();
                            if (madVarE != null && lzvVarC != null) {
                                ebe ebeVar = (ebe) hdzVar.b.get();
                                gog gogVar = eddVar2.c;
                                Bitmap bitmapB = ebeVar.B(madVarE, lzvVarC, ((dzt) hdzVar.j).g, ojc.i(hdzVar.c), ojc.i(Integer.valueOf(hdzVar.g)), ojc.i(Integer.valueOf(hdzVar.h)), ojc.i(eddVar2.o));
                                madVarE.close();
                                if (bitmapB != null) {
                                    synchronized (hdzVar) {
                                        if (hdzVar.i) {
                                            Bitmap bitmapB2 = jte.b(bitmapB, brg.d(eddVar2.c.a.a, hdzVar.k, hdzVar.e));
                                            lmrVar2.close();
                                            bitmap = bitmapB2;
                                        } else {
                                            bitmapB.recycle();
                                        }
                                    }
                                }
                                if (bitmap != null) {
                                    eddVar2.c.b.V(bitmap);
                                }
                            }
                            ((oug) ((oug) hdz.a.b()).G(2384)).o("Error getting the required input.");
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            ((oug) ((oug) hdz.a.b()).G(2385)).o("Error generating on-demand preview image");
                        }
                        lmrVar2.close();
                        if (bitmap != null) {
                            eddVar2.c.b.V(bitmap);
                        }
                    } catch (Throwable th) {
                        lmrVar2.close();
                        throw th;
                    }
                }
            });
        } else {
            lmrVar.close();
        }
    }

    @Override // defpackage.eav
    public final void f(edd eddVar, BurstSpec burstSpec, lzv lzvVar) {
        this.j = this.l.a();
        if (burstSpec != null) {
            this.g = (int) burstSpec.b().a();
            this.h = 0;
        }
    }

    @Override // defpackage.eav
    public final void g(hsp hspVar) {
        this.o.f(hspVar).e(this);
    }

    @Override // defpackage.eav
    public final synchronized void h(edd eddVar) {
        this.i = false;
        this.n = false;
    }

    @Override // defpackage.eav
    public final /* synthetic */ void i(edd eddVar) {
    }

    public final synchronized void j(long j) {
        this.i = true;
        this.f = j;
        if (j >= 30000) {
            this.n = true;
        }
    }

    public final synchronized void k(final edd eddVar) {
        if (this.i) {
            this.m.execute(new Runnable() { // from class: hdx
                @Override // java.lang.Runnable
                public final void run() {
                    eddVar.c.b.Q(this.a.f);
                }
            });
        }
    }

    @Override // defpackage.eby
    public final void s(edd eddVar) {
        d(eddVar.c.b.h());
    }
}
