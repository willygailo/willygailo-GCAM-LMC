package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ifq implements ifn {
    public final ifs a;
    public boolean b;
    private final ljf c;
    private final hug d;
    private final Handler e = mip.bV(Looper.getMainLooper());

    public ifq(ifs ifsVar, ljf ljfVar, lar larVar, fhv fhvVar, hug hugVar) {
        this.a = ifsVar;
        this.c = ljfVar;
        this.d = hugVar;
        enl.f(larVar, fhvVar, new ifp(this));
    }

    private final void g(int i, float f) {
        if (this.b) {
            this.a.e(i, f);
        }
        if (i == R.raw.camera_shutter || i == R.raw.video_stop || i == R.raw.longexposure_stop) {
            this.e.postDelayed(new Runnable() { // from class: ifo
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            }, 100L);
        }
    }

    @Override // defpackage.ifn
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.ifn
    public final void b(int i) {
        g(i, 0.6f);
    }

    @Override // defpackage.ifn
    public final void c(int i) {
        g(i, 1.0f);
    }

    @Override // defpackage.ifn
    public final void d() {
        this.c.e("Sounds#shutter");
        this.a.a(R.raw.camera_shutter);
        this.c.g("Sounds#video_start");
        this.a.a(R.raw.video_start);
        this.c.f();
    }

    @Override // defpackage.ifn
    public final void e() {
        this.a.c();
    }

    public final void f() {
        this.d.e(htu.h, false);
    }
}
