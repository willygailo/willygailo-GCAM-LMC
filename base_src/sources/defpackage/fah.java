package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class fah extends buf implements jad {
    public static final ouj b = ouj.h("com/google/android/apps/camera/legacy/app/module/pckimageintent/PckImageIntentModule");
    private final Context A;
    private final Resources B;
    private final ezr C;
    private final iyb D;
    private final iij E;
    private final fix F;
    private final bqa G;
    private final hsb H;
    private final kme I;
    public final jli c;
    public final kas d;
    public final lda e;
    public final ifn f;
    public final lar g;
    public final gvb h;
    public final izr i;
    public final bne j;
    public final ghg k;
    public final cvo l;
    public final ghu m;
    public fwb n;
    public final iwt o;
    public final jhd p;
    public pih q;
    public final ezn r;
    public lap s;
    public final fxf t;
    public final ddf u;
    public fwc v;
    private final BottomBarListener w;
    private final jlb x;
    private final epj y;
    private final epi z;

    public fah(lar larVar, gvb gvbVar, cvo cvoVar, ghg ghgVar, ghu ghuVar, Resources resources, BottomBarController bottomBarController, jlb jlbVar, epj epjVar, kas kasVar, ifn ifnVar, lda ldaVar, ezr ezrVar, iwt iwtVar, izr izrVar, iyb iybVar, ikj ikjVar, iij iijVar, hrx hrxVar, qkg qkgVar, bne bneVar, emb embVar, Context context, ezn eznVar, jhd jhdVar, fxf fxfVar, bqa bqaVar, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        ezx ezxVar = new ezx(this);
        this.w = ezxVar;
        this.c = new ezy(this);
        this.z = new ezz(this);
        fag fagVar = new fag(this);
        this.H = fagVar;
        this.g = larVar;
        this.h = gvbVar;
        this.e = ldaVar;
        this.D = iybVar;
        this.f = ifnVar;
        this.A = context;
        this.B = resources;
        this.l = cvoVar;
        this.k = ghgVar;
        this.m = ghuVar;
        this.x = jlbVar;
        this.y = epjVar;
        this.d = kasVar;
        this.C = ezrVar;
        this.o = iwtVar;
        this.i = izrVar;
        this.E = iijVar;
        this.r = eznVar;
        this.j = bneVar;
        this.p = jhdVar;
        this.t = fxfVar;
        this.G = bqaVar;
        this.u = ddfVar;
        if (embVar.a().getBooleanExtra("include_location_in_exif", false)) {
            this.F = (fix) qkgVar.get();
        } else {
            this.F = new fjc();
        }
        pih pihVarF = pih.f();
        this.q = pihVarF;
        pihVarF.a(new IllegalStateException("No image has been captured"));
        String strValueOf = String.valueOf(context.getExternalCacheDir());
        String str = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 11 + String.valueOf(str).length());
        sb.append(strValueOf);
        sb.append(str);
        sb.append("ImageIntent");
        this.I = ikjVar.a(new iki(new File(sb.toString())));
        bottomBarController.addListener(ezxVar);
        hrxVar.a(fagVar);
    }

    @Override // defpackage.jad
    public final void C(int i) {
        if (i == 1) {
            this.f.c(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.f.c(R.raw.timer_increment);
        }
    }

    @Override // defpackage.buf
    public final String c() {
        return this.B.getString(R.string.photo_accessibility_peek);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.buf
    public final void d(awl awlVar) {
    }

    @Override // defpackage.buf
    public final void e(Configuration configuration) {
    }

    @Override // defpackage.buf
    public final ojc fQ() {
        return ojc.h(this.v);
    }

    @Override // defpackage.buf
    protected final void gf() {
        w();
    }

    @Override // defpackage.buf
    protected final void k() {
        ojc ojcVar = this.C.d;
        if (!ojcVar.g() || bqe.h(this.A, (Uri) ojcVar.c())) {
            this.t.a();
        } else {
            final bqa bqaVar = this.G;
            bqaVar.b.c(new Runnable() { // from class: bpz
                @Override // java.lang.Runnable
                public final void run() {
                    final bqa bqaVar2 = bqaVar;
                    nyj nyjVar = new nyj(bqaVar2.a, bqaVar2.d);
                    nyjVar.k(false);
                    nyjVar.s(R.string.cant_save_photo_dialog_title);
                    nyjVar.l(R.string.cant_save_photo_dialog_message);
                    nyjVar.r(bqaVar2.a.getResources().getString(R.string.dialog_ok), new DialogInterface.OnClickListener() { // from class: bpy
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            bqaVar2.c.a("ImageIntent: No write permission to intent media output uri.");
                        }
                    });
                    nyjVar.c();
                }
            });
        }
    }

    @Override // defpackage.buf
    protected final void m() {
        this.s = new lap();
        this.r.a(false);
        this.y.a(this.z);
        this.s.c(this.x.d(this.c));
        lap lapVar = this.s;
        lda ldaVar = this.e;
        jlb jlbVar = this.x;
        jlbVar.getClass();
        lapVar.c(ldaVar.a(new ezv(jlbVar, 0), this.g));
        this.s.c(this.l.a(new lij() { // from class: ezu
            @Override // defpackage.lij
            public final void fB(Object obj) {
                fah fahVar = this.a;
                fwc fwcVar = fahVar.v;
                if (fwcVar != null) {
                    fwcVar.close();
                }
                fahVar.v = null;
                fwb fwbVar = fahVar.n;
                if (fwbVar != null) {
                    fwbVar.cancel(true);
                    fahVar.n = null;
                }
                fahVar.p.a();
                fahVar.n = fahVar.k.a(fahVar.l, fahVar.m, jrl.IMAGE_INTENT);
                kas kasVar = fahVar.d;
                if (((kbi) kasVar).L) {
                    kasVar.h();
                }
                if (fahVar.u.k(ddl.X)) {
                    fahVar.d.o();
                    fahVar.d.p(false);
                }
                fwb fwbVar2 = fahVar.n;
                if (fwbVar2 != null) {
                    plk.af(fwbVar2, new faf(fahVar), fahVar.g);
                }
            }
        }, pgr.INSTANCE));
        this.n.getClass();
    }

    @Override // defpackage.buf
    protected final void o() {
        fwb fwbVar = this.n;
        if (fwbVar != null) {
            fwbVar.cancel(true);
            this.n = null;
        }
        this.p.a();
        this.s.close();
    }

    @Override // defpackage.buf
    public final boolean q() {
        if (!this.r.g) {
            return w();
        }
        this.w.onRetakeButtonPressed();
        return true;
    }

    @Override // defpackage.buf
    public final boolean r() {
        return true;
    }

    public final synchronized void u() {
        try {
            try {
                byte[] bArr = (byte[]) this.q.get();
                bArr.getClass();
                final byte[] bArr2 = bArr;
                final ezr ezrVar = this.C;
                if (ezrVar.d.g()) {
                    final Uri uri = (Uri) ezrVar.d.c();
                    plk.af(plk.Y(new Runnable() { // from class: ezp
                        @Override // java.lang.Runnable
                        public final void run() {
                            ezr ezrVar2 = ezrVar;
                            Uri uri2 = uri;
                            byte[] bArr3 = bArr2;
                            Activity activity = (Activity) ezrVar2.b.get();
                            activity.getClass();
                            try {
                                try {
                                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(nhy.a(activity, uri2, "w").getParcelFileDescriptor());
                                    try {
                                        System.identityHashCode(bArr3);
                                        autoCloseOutputStream.write(bArr3);
                                        autoCloseOutputStream.close();
                                    } catch (Throwable th) {
                                        try {
                                            autoCloseOutputStream.close();
                                        } catch (Throwable th2) {
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    throw new IllegalStateException(e);
                                }
                            } catch (FileNotFoundException e2) {
                                throw new IllegalArgumentException(obr.aw("Could not open output uri %s for writing. Called from %s ", uri2, activity.getReferrer()), e2);
                            }
                        }
                    }, ezrVar.f), new ezq(ezrVar, uri), ezrVar.c);
                    return;
                }
                Trace.beginSection("ImageIntent:CompressingImageIntoIntentExtra");
                Bitmap bitmapA = jte.a(bArr2);
                bitmapA.getClass();
                Trace.endSection();
                final Intent intentPutExtra = new Intent("inline-data").putExtra("data", bitmapA);
                ezrVar.c.execute(new Runnable() { // from class: ezo
                    @Override // java.lang.Runnable
                    public final void run() {
                        ezr ezrVar2 = ezrVar;
                        ezrVar2.e.n(intentPutExtra);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("Couldn't get image data from Future", e);
        }
    }

    public final synchronized void v() {
        ((oug) ((oug) b.c()).G((char) 1603)).o("takePictureInvoked");
        fwc fwcVar = this.v;
        fwcVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = this.I.a(jCurrentTimeMillis);
        this.q = pih.f();
        hqf hqfVar = new hqf(strA, jCurrentTimeMillis, this.F.c(), this.E, this.q);
        ghx ghxVar = fwcVar.c;
        plk.af(fwcVar.f(new gfs(this.h.c().a(), new faa(this), -1, ghxVar.k(), ghxVar.N(), new lce(false), false, false), hqfVar), new fab(this), this.g);
    }

    public final boolean w() {
        if (!this.r.c()) {
            return false;
        }
        ezn eznVar = this.r;
        lar.a();
        eznVar.c.a();
        this.D.b();
        return true;
    }

    @Override // defpackage.jad
    public final void y() {
        this.D.b();
        v();
    }

    @Override // defpackage.jad
    public final void z() {
        this.f.c(R.raw.timer_start);
        this.D.a();
    }
}
