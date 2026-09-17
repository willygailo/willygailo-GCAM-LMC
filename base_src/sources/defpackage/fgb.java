package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.media.Image;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import com.google.android.libraries.lens.lenslite.api.LinkImage;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fgb implements iaq {
    public final lar A;
    public final ffc B;
    public final khx C;
    private final fgd D;
    public final Context a;
    public final lda b;
    public final ddf c;
    public final Executor d;
    public final Activity f;
    public final boolean g;
    public final boolean h;
    public final dbg i;
    public final dbr j;
    public final hnx k;
    public final fjs l;
    public final fvv m;
    public mgs n;
    public boolean o;
    public boolean q;
    public boolean r;
    public boolean s;
    public final jcw y;
    public final qkg z;
    public int t = 0;
    public int u = 0;
    public String v = "-1";
    public ojc w = oih.a;
    public ojc x = oih.a;
    public boolean p = true;
    public final lap e = new lap();

    public fgb(Context context, bqg bqgVar, lda ldaVar, ddf ddfVar, Context context2, boolean z, boolean z2, dbg dbgVar, dbr dbrVar, jcw jcwVar, fgd fgdVar, hnx hnxVar, fjs fjsVar, fvv fvvVar, Executor executor, qkg qkgVar, lar larVar, khx khxVar, ffc ffcVar, byte[] bArr) {
        this.a = context;
        this.b = ldaVar;
        this.c = ddfVar;
        this.d = plk.M(executor);
        this.q = ((Boolean) ldaVar.fA()).booleanValue();
        this.f = (Activity) context2;
        this.g = z;
        this.h = z2;
        this.i = dbgVar;
        this.j = dbrVar;
        this.y = jcwVar;
        this.m = fvvVar;
        this.D = fgdVar;
        this.k = hnxVar;
        this.l = fjsVar;
        this.z = qkgVar;
        this.A = larVar;
        this.C = khxVar;
        this.B = ffcVar;
        bqgVar.i().c(new lie() { // from class: ffn
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.a.a();
            }
        });
    }

    @Override // defpackage.iat
    public final void a() {
        this.d.execute(new ffi(this, 1));
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
        this.D.d = new ffh(this, iayVar);
        lap lapVar = this.e;
        final fgd fgdVar = this.D;
        lapVar.c(new lie() { // from class: ffs
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                fgdVar.d = null;
            }
        });
        fgd fgdVar2 = this.D;
        ddf ddfVar = fgdVar2.b;
        ddi ddiVar = ddp.a;
        ddfVar.d();
        jcw jcwVar = fgdVar2.c;
        jcwVar.f();
        plk.af(jcwVar.e, new fgc(fgdVar2), pgr.INSTANCE);
    }

    public final mhy c() {
        if (!this.c.k(ddp.k) || this.C.i().startsWith("2.6")) {
            return mhy.DISABLED;
        }
        return this.c.k(ddp.l) ? mhy.PLAYGROUND_ONLY : mhy.ARCORE_ONLY;
    }

    public final void d() {
        if (this.r) {
            mgs mgsVar = this.n;
            mgsVar.getClass();
            mgsVar.a.stop();
            this.r = false;
        }
    }

    public final void e() {
        if (!this.o || !this.q || this.p || this.r) {
            return;
        }
        mgs mgsVar = this.n;
        mgsVar.getClass();
        mgsVar.a.start();
        this.r = true;
    }

    @Override // defpackage.iaq
    public final void f(Point point) {
        final Point point2 = new Point(point);
        this.d.execute(new Runnable() { // from class: ffk
            @Override // java.lang.Runnable
            public final void run() {
                fgb fgbVar = this.a;
                Point point3 = point2;
                if (!fgbVar.r || !fgbVar.s || fgbVar.t <= 0 || fgbVar.u <= 0) {
                    return;
                }
                fgbVar.n.a.setPointOfInterest(new PointF(point3.x / fgbVar.t, point3.y / fgbVar.u));
            }
        });
    }

    public final boolean g() {
        return this.c.k(ddp.p);
    }

    @Override // defpackage.iaq
    public final void h(final mad madVar, final int i) {
        this.d.execute(new Runnable() { // from class: ffm
            @Override // java.lang.Runnable
            public final void run() {
                fgb fgbVar = this.a;
                mad madVar2 = madVar;
                int i2 = i;
                if (!fgbVar.r || !fgbVar.s) {
                    madVar2.close();
                    return;
                }
                mgs mgsVar = fgbVar.n;
                LinkImage linkImageCreate = LinkImage.create(new fey(madVar2), i2);
                switch (linkImageCreate.getType()) {
                    case 1:
                        mgsVar.a.onNewBitmap((Bitmap) linkImageCreate.getBitmap().c(), linkImageCreate.getRotation());
                        break;
                    case 2:
                        mgsVar.a.onNewImage((Image) linkImageCreate.getImage().c(), linkImageCreate.getRotation());
                        break;
                    case 3:
                        mgsVar.a.onNewImage((ImageProxy) linkImageCreate.getImageProxy().c(), linkImageCreate.getRotation());
                        break;
                    default:
                        throw new IllegalStateException(String.format(Locale.US, "Unable to process LinkImage type: %d", Integer.valueOf(linkImageCreate.getType())));
                }
                if (i2 % 180 == 0) {
                    fgbVar.t = madVar2.c();
                    fgbVar.u = madVar2.b();
                } else {
                    fgbVar.t = madVar2.b();
                    fgbVar.u = madVar2.c();
                }
            }
        });
    }

    @Override // defpackage.iat
    public final void u() {
        this.d.execute(new ffi(this, 3));
    }

    @Override // defpackage.iat
    public final void v() {
        this.d.execute(new ffi(this, 4));
    }
}
