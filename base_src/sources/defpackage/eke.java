package defpackage;

import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: loaded from: classes.dex */
public final class eke implements AutoCloseable, ejy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/capture/CaptureModule");
    public final ekg b;
    public final ekb c;
    public final ejo d;
    public ekf e;
    public boolean f;
    public boolean g;
    public ejx h;
    public Texture i;
    public double j;
    public int k;
    public egy l;
    private final float[] m;
    private final float[] n;
    private final TrackerStats o;

    public eke() {
        ekb ekbVar = new ekb();
        ekg ekgVar = new ekg();
        this.m = new float[]{0.0f, 0.0f, 0.0f};
        this.n = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.o = new TrackerStats();
        this.d = ((ejp) ekh.a(ejp.class)).a();
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = null;
        this.i = null;
        this.l = null;
        this.j = 3.4028234663852886E38d;
        this.k = 0;
        this.c = ekbVar;
        this.b = ekgVar;
    }

    @Override // defpackage.ejy
    public final synchronized void a(float[] fArr, long j) {
        if (this.f && !this.g) {
            this.e.d(this.n);
            double dA = this.e.a();
            if (Math.abs(dA - this.j) < 0.5d) {
                this.k++;
                return;
            }
            this.j = dA;
            this.d.trackTexture(this.m, this.n);
            this.d.getTrackerStats(this.o);
            this.b.a(this.o);
            this.c.a(fArr, j);
        }
    }

    @Override // defpackage.ejy
    public final void b(int i, int i2) {
    }

    @Override // defpackage.ejy
    public final void c(Texture texture, ejx ejxVar) {
        this.i = texture;
        this.h = ejxVar;
        this.c.c(texture, ejxVar);
        int i = ejxVar.a;
        float f = ejxVar.d;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.release();
    }

    @Override // defpackage.ejy
    public final synchronized void d() {
        if (this.f && !this.g) {
            this.c.d();
        }
    }

    @Override // defpackage.ejy
    public final void e(egy egyVar) {
        this.l = egyVar;
        this.c.g = egyVar;
    }

    public final void f() {
        this.c.f = 24000000;
    }

    public final void g(String str) {
        synchronized (this) {
            if (this.f) {
                this.f = false;
                this.g = false;
                ekb ekbVar = this.c;
                eky ekyVar = ekbVar.b;
                if (ekyVar != null) {
                    ekyVar.f = false;
                    ekx ekxVar = ekyVar.e;
                    ekxVar.sendMessage(ekxVar.obtainMessage(2));
                    ekx ekxVar2 = ekyVar.e;
                    ekxVar2.sendMessage(ekxVar2.obtainMessage(3));
                    try {
                        ekyVar.d.getThread().join();
                    } catch (InterruptedException e) {
                        ((oug) ((oug) ((oug) eky.a.b()).h(e)).G((char) 1260)).r("%s", e.getMessage());
                    }
                }
                ejv ejvVar = ekbVar.d;
                if (ejvVar != null) {
                    ejvVar.a();
                }
                ekbVar.g.a(new ejz(ekbVar));
                eka ekaVar = new eka();
                eky ekyVar2 = ekbVar.b;
                if (ekyVar2 != null) {
                    ekaVar.a = ekyVar2.a();
                    ekaVar.b = ekbVar.b.c.k;
                } else {
                    ekaVar.a = 0;
                    ekaVar.b = 0;
                }
                ekbVar.b = null;
                ekbVar.d = null;
                int iStopCapture = this.d.stopCapture(str);
                this.l.a(new ekd(this, 1));
                if (ekaVar.a != iStopCapture || ekaVar.b > 0) {
                    ((oug) ((oug) a.b().g(ovl.a, "ImaxCaptureModule")).G(1218)).A("Recorded video stream is out-of-sync with tracking\n%d frames recorded with %d packets dropped, but %d frames tracked", Integer.valueOf(ekaVar.a), Integer.valueOf(ekaVar.b), Integer.valueOf(iStopCapture));
                } else if (this.k > 0) {
                    ovd ovdVar = ovl.a;
                }
            }
        }
    }
}
