package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gac extends buf implements chy {
    public static final ouj b = ouj.h("com/google/android/apps/camera/modules/videointent/VideoIntentModule");
    public final cfe c;
    public final cgx d;
    public final ckh e;
    public final btt g;
    public ckd j;
    private final Resources k;
    private final BottomBarController l;
    private final cof m;
    private final Executor o;
    private final dib p;
    public final Object f = new Object();
    public ojc h = oih.a;
    public boolean i = false;
    private final BottomBarListener n = new gab(this);

    public gac(btt bttVar, cfe cfeVar, Resources resources, BottomBarController bottomBarController, qkg qkgVar, ckh ckhVar, Executor executor, cof cofVar, dib dibVar) {
        this.g = bttVar;
        this.c = cfeVar;
        this.k = resources;
        this.l = bottomBarController;
        this.d = (cgx) qkgVar.get();
        this.m = cofVar;
        this.e = ckhVar;
        this.o = executor;
        this.p = dibVar;
    }

    @Override // defpackage.buf
    public final String c() {
        return this.k.getString(R.string.video_accessibility_peek);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.o.execute(new fzz(this, 1));
    }

    @Override // defpackage.chy
    public final void f() {
    }

    @Override // defpackage.chy
    public final void g() {
        synchronized (this.f) {
            if (this.c.a() != null) {
                this.j = this.c.a().v;
            }
        }
    }

    @Override // defpackage.chy
    public final void gb() {
    }

    @Override // defpackage.buf
    public final void ge() {
        synchronized (this.f) {
            this.d.c(this.g.g(), jrl.VIDEO_INTENT);
            this.c.c();
        }
    }

    @Override // defpackage.buf
    public final void gf() {
        synchronized (this.f) {
            this.d.e();
            this.c.n();
        }
    }

    @Override // defpackage.chy
    public final void h() {
    }

    @Override // defpackage.chy
    public final void i(clf clfVar) {
        synchronized (this.f) {
            if (clfVar.a.isEmpty()) {
                mip.bS().execute(new fzz(this, 0));
            } else {
                ckw ckwVar = (ckw) clfVar.a.get(0);
                ckd ckdVar = this.j;
                if (ckdVar == null) {
                    ((oug) ((oug) b.b()).G(2039)).o("Session config is null.");
                    this.p.e(ckwVar.t.b);
                    return;
                }
                ojc ojcVar = ckdVar.j;
                this.h = ojcVar;
                if (ojcVar.g()) {
                    this.p.h(ckwVar.t.b);
                } else {
                    ojc ojcVarI = ojc.i(((hsc) ckwVar.a.c().c()).a.b());
                    this.h = ojcVarI;
                    ((Uri) ojcVarI.c()).getPath();
                    this.m.d(ckwVar);
                }
                cgx cgxVar = this.d;
                Bitmap bitmap = clfVar.c;
                bitmap.getClass();
                cgxVar.i.b(bitmap);
                this.d.j(true);
            }
        }
    }

    @Override // defpackage.chy
    public final void j(boolean z) {
        this.d.o();
        synchronized (this.f) {
            if (this.d.o() == 4) {
                obr.aR(this.h.g(), "URI not set.");
                Intent intent = new Intent();
                intent.setData((Uri) this.h.c());
                intent.addFlags(1);
                this.i = true;
                this.g.n(intent);
            } else {
                this.c.h(z);
            }
        }
    }

    @Override // defpackage.buf
    public final void k() {
        synchronized (this.f) {
            this.c.m(this.d.o() != 4);
        }
    }

    @Override // defpackage.buf
    public final void m() {
        synchronized (this.f) {
            this.l.addListener(this.n);
            this.d.h();
            this.c.b(this);
        }
    }

    @Override // defpackage.buf
    public final void o() {
        synchronized (this.f) {
            this.d.i();
            this.c.l(this);
            this.l.removeListener(this.n);
        }
    }

    @Override // defpackage.buf
    public final boolean q() {
        if (this.d.o() != 4) {
            return this.c.o();
        }
        v();
        return true;
    }

    public final void u() {
        if (this.h.g()) {
            final Uri uri = (Uri) this.h.c();
            this.o.execute(new Runnable() { // from class: gaa
                @Override // java.lang.Runnable
                public final void run() {
                    gac gacVar = this.a;
                    Uri uri2 = uri;
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(nhy.a(gacVar.e.b, uri2, "wt").getParcelFileDescriptor());
                        try {
                            autoCloseOutputStream.flush();
                            autoCloseOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                autoCloseOutputStream.close();
                            } catch (Throwable th2) {
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        ((oug) ((oug) ((oug) gac.b.b()).h(e)).G((char) 2036)).r("Failed to truncate contents of %s", uri2);
                    }
                    gacVar.h = oih.a;
                }
            });
        }
    }

    public final void v() {
        u();
        this.d.i.a();
        mip.bS().execute(new cgt(this.d, 3));
        this.c.p(2);
    }
}
