package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class pwf {
    public final int a;
    public final pwg b;
    public final float[] c;
    public volatile SurfaceTexture g;
    public volatile Surface h;
    private final int l;
    private final int m;
    private final boolean n;
    private HandlerThread o;
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final int[] f = new int[1];
    public volatile boolean i = false;
    public volatile boolean j = false;
    public final Object k = new Object();

    public pwf(int i, int i2, int i3, pwg pwgVar, boolean z) {
        float[] fArr = new float[16];
        this.c = fArr;
        this.a = i;
        this.l = i2;
        this.m = i3;
        this.b = pwgVar;
        this.n = z;
        Matrix.setIdentityM(fArr, 0);
        if (z) {
            HandlerThread handlerThread = new HandlerThread("SurfaceTexture Callback Thread");
            this.o = handlerThread;
            handlerThread.start();
        }
    }

    public final void a() {
        if (this.i) {
            return;
        }
        GLES20.glGenTextures(1, this.f, 0);
        b(this.f[0]);
    }

    public final void b(int i) {
        if (this.i) {
            return;
        }
        this.f[0] = i;
        Handler handler = this.n ? new Handler(this.o.getLooper()) : new Handler(Looper.getMainLooper());
        if (this.g == null) {
            this.g = new SurfaceTexture(this.f[0]);
            if (this.l > 0 && this.m > 0) {
                this.g.setDefaultBufferSize(this.l, this.m);
            }
            this.g.setOnFrameAvailableListener(new pwe(this), handler);
            this.h = new Surface(this.g);
        } else {
            this.g.attachToGLContext(this.f[0]);
        }
        this.i = true;
        pwg pwgVar = this.b;
        if (pwgVar != null) {
            pwgVar.c();
        }
    }

    public final void c(pwc pwcVar) {
        synchronized (this.k) {
            this.j = true;
        }
        if (this.e.getAndSet(true)) {
            return;
        }
        pwg pwgVar = this.b;
        if (pwgVar != null) {
            pwgVar.a();
        }
        if (this.g != null) {
            this.g.release();
            this.g = null;
            if (this.h != null) {
                this.h.release();
            }
            this.h = null;
        }
        pwcVar.a(this.a, 0, 0L, this.c);
    }
}
