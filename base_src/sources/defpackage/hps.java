package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.DebugParams;
import j$.util.function.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hps implements hsa {
    private static final ouj x = ouj.h("com/google/android/apps/camera/session/CaptureSessionBase");
    private hho A;
    private final List B;
    private boolean C;
    private final hhl D;
    private final hgz E;
    public final dib a;
    public final hsr b;
    public hrb d;
    public final Executor e;
    public final hsq f;
    public final hqb g;
    public final hrc h;
    public final bww i;
    public final jtx j;
    public final iij k;
    public final pih l;
    public final pih m;
    public boolean n;
    public lzv o;
    public final ojc p;
    public final hsg q;
    public hsc r;
    public final pih s;
    public volatile ojc t;
    public int u;
    public int v;
    public final jtl w;
    private final hrx z;
    private jmo y = jmq.a;
    public lif c = lif.c;

    public hps(Executor executor, hrc hrcVar, hqb hqbVar, iij iijVar, dib dibVar, hrx hrxVar, jtx jtxVar, hsr hsrVar, String str, bww bwwVar, hsg hsgVar, hhl hhlVar, ojc ojcVar) {
        pih pihVarF = pih.f();
        this.l = pihVarF;
        this.m = pih.f();
        this.B = new ArrayList();
        this.C = false;
        this.n = false;
        this.u = 1;
        this.v = 1;
        this.s = pih.f();
        this.e = executor;
        this.z = hrxVar;
        this.q = hsgVar;
        this.g = hqbVar;
        this.h = hrcVar;
        this.i = bwwVar;
        this.j = jtxVar;
        this.k = iijVar;
        this.a = dibVar;
        this.D = hhlVar;
        this.p = ojcVar;
        this.b = hsrVar;
        this.w = new jtl(null);
        hsq hsqVarA = hsq.a(hsp.a(), hsgVar.b, str, hsrVar);
        this.f = hsqVarA;
        this.E = new hik(this);
        hrxVar.h(hsqVarA.a, pihVarF, hsgVar.d);
        this.t = oih.a;
    }

    @Override // defpackage.hsa
    public final void A() {
        T("finalizeSession");
        this.h.a(this.d);
        this.g.a();
        this.E.h();
    }

    @Override // defpackage.hsa
    public final /* synthetic */ void B() {
        hls.j();
    }

    @Override // defpackage.hsa
    public final void C(jmo jmoVar, Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        E(strValueOf.length() != 0 ? "finishWithFailure, throwable message = ".concat(strValueOf) : new String("finishWithFailure, throwable message = "));
        if (this.w.c()) {
            E("Ignoring finishWithFailure. CaptureSession already saved/canceled or failed.");
            return;
        }
        this.w.g(4);
        this.y = jmoVar;
        t();
        J(jmoVar);
        hrc hrcVar = this.h;
        hrb hrbVar = this.d;
        hrbVar.getClass();
        hrcVar.a(hrbVar);
        this.g.g(this.u, this.v, th);
        this.a.e(this.f.b);
    }

    @Override // defpackage.hsa
    public final void D(boolean z) {
        if (z) {
            ojc ojcVar = this.p;
            if (!ojcVar.g()) {
                return;
            }
            ijp ijpVar = (ijp) ojcVar.c();
            ijpVar.i(ijo.FRAMES_TAKEN);
            lji ljiVar = ijpVar.a;
            if (ljiVar != null) {
                ljiVar.a();
                ijpVar.a = null;
            }
        }
        this.a.c(this.f.b, "onFramesRequested");
    }

    final void E(String str) {
        ((oug) ((oug) x.c()).G(2588)).y("[%s] %s", h(), str);
    }

    final synchronized void F(final Bitmap bitmap, final int i) {
        final hrx hrxVar = this.z;
        final hsp hspVarH = h();
        Runnable runnable = new Runnable() { // from class: hrr
            @Override // java.lang.Runnable
            public final void run() {
                hrx hrxVar2 = hrxVar;
                final hsp hspVar = hspVarH;
                final Bitmap bitmap2 = bitmap;
                final int i2 = i;
                hrxVar2.d(new Consumer() { // from class: hrn
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        ((hsb) obj).k(hspVar, bitmap2, i2);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
            }
        };
        String strValueOf = String.valueOf(hspVarH);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 33);
        sb.append("#onSessionCaptureIndicatorUpdate ");
        sb.append(strValueOf);
        hrxVar.e(hspVarH, runnable, sb.toString());
    }

    final synchronized void G(hsp hspVar) {
        T("notifySessionUpdated");
        hrx hrxVar = this.z;
        hrq hrqVar = new hrq(hrxVar, hspVar, 1);
        String strValueOf = String.valueOf(hspVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
        sb.append("#onSessionUpdated ");
        sb.append(strValueOf);
        hrxVar.e(hspVar, hrqVar, sb.toString());
    }

    final synchronized void H() {
        this.l.cancel(true);
        hrx hrxVar = this.z;
        hsp hspVarH = h();
        pht phtVar = (pht) hrxVar.d.get(hspVarH);
        if (phtVar == null) {
            ((oug) ((oug) hrx.a.b()).G((char) 2633)).r("%s: No queued future found, maybe shot already finalized?: notifyTaskCanceled", hspVarH);
        } else {
            phtVar.d(new hrq(hrxVar, hspVarH, 0), pgr.INSTANCE);
        }
    }

    final synchronized void I() {
        this.z.g(h());
    }

    final synchronized void J(jmo jmoVar) {
        hrx hrxVar = this.z;
        hsp hspVarH = h();
        pht phtVar = (pht) hrxVar.d.get(hspVarH);
        if (phtVar == null) {
            ((oug) ((oug) hrx.a.b()).G((char) 2639)).r("%s: No queued future found, maybe shot already finalized?: notifyTaskFailed", hspVarH);
        } else {
            phtVar.d(new hrq(hrxVar, hspVarH, 3), pgr.INSTANCE);
        }
    }

    final synchronized void K(final lif lifVar) {
        S(Integer.valueOf(lifVar.e));
        final hrx hrxVar = this.z;
        final hsp hspVarH = h();
        Runnable runnable = new Runnable() { // from class: hrs
            @Override // java.lang.Runnable
            public final void run() {
                hrx hrxVar2 = hrxVar;
                final hsp hspVar = hspVarH;
                final lif lifVar2 = lifVar;
                hrxVar2.d(new Consumer() { // from class: hrp
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        ((hsb) obj).o(hspVar, lifVar2);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
            }
        };
        String strValueOf = String.valueOf(hspVarH);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 19);
        sb.append("#onSessionProgress ");
        sb.append(strValueOf);
        hrxVar.e(hspVarH, runnable, sb.toString());
    }

    @Override // defpackage.hsa
    public final void L(lzv lzvVar) {
        lzv lzvVar2 = this.o;
        boolean z = false;
        if (lzvVar2 != null && lzvVar.b() > lzvVar2.b()) {
            z = true;
        }
        if (this.o == null || z) {
            this.o = lzvVar;
        }
    }

    @Override // defpackage.hsa
    public final void M(DebugParams debugParams) {
        this.t = ojc.i(debugParams);
    }

    public final synchronized void N(lif lifVar, boolean z) {
        boolean z2 = true;
        if (!z) {
            try {
                if (lifVar == lif.a) {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        obr.aG(z2, "Cannot set progress to 100% before persisting images.");
        this.c = lifVar;
        if (this.q.d == hss.MARS_STORE) {
            lif lifVar2 = (this.n || lifVar.compareTo(lif.d) < 0) ? lifVar : lif.d;
            hsg hsgVar = this.q;
            Executor executor = this.e;
            if (hsgVar.d == hss.MARS_STORE) {
                if (lifVar2.d()) {
                    plk.af(hsgVar.c().c(), new hse(hsgVar, lifVar2), executor);
                } else {
                    lis lisVar = hsgVar.g;
                    String strValueOf = String.valueOf(hsgVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 59);
                    sb.append("Skipping progress update for not yet started GcaMediaGroup ");
                    sb.append(strValueOf);
                    lisVar.b(sb.toString());
                }
            }
        }
        K(lifVar);
        hho hhoVar = this.A;
        if (hhoVar != null) {
            hhoVar.a(lifVar);
        }
    }

    @Override // defpackage.hsa
    public final synchronized void O(jmo jmoVar) {
        if (!this.w.e() && !this.w.d()) {
            String strValueOf = String.valueOf(mip.bo());
            E(strValueOf.length() != 0 ? "Ignoring setProgressMessage - state is !started && !finishing: ".concat(strValueOf) : new String("Ignoring setProgressMessage - state is !started && !finishing: "));
            return;
        }
        T("setProgressMessage");
        this.y = jmoVar;
        if (!mip.ez(jmoVar) && this.c == lif.c) {
            this.c = lif.b;
        }
        hho hhoVar = this.A;
        if (hhoVar != null) {
            hhoVar.b(jmoVar);
        }
    }

    @Override // defpackage.hsa
    public final void P(lig ligVar) {
        throw null;
    }

    @Override // defpackage.hsa
    public final void Q(final long j) {
        this.z.d(new Consumer() { // from class: hrv
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((hsb) obj).m(j);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.hsa
    public final /* synthetic */ void R() {
        hls.i(this);
    }

    @Override // defpackage.hsa
    public final void S(Integer num) {
        this.a.g(this.f.b, num);
    }

    final void T(String str) {
        this.a.c(this.f.b, str);
    }

    @Override // defpackage.hsa
    public final void U(Bitmap bitmap, int i) {
        T("updateCaptureIndicatorThumbnail");
        if (this.C) {
            return;
        }
        F(bitmap, i);
        this.g.e(this.p);
        this.C = true;
    }

    @Override // defpackage.hsa
    public final void V(Bitmap bitmap) {
        this.z.f(bitmap);
    }

    @Override // defpackage.hsa
    public final void W(final Bitmap bitmap) {
        if (this.w.c()) {
            return;
        }
        T("updateThumbnail");
        hrc hrcVar = this.h;
        hrb hrbVar = this.d;
        hrbVar.getClass();
        biu biuVar = new biu(new BitmapDrawable(hrcVar.a.getResources(), bitmap), 1);
        ikp ikpVar = hrcVar.b;
        hsp hspVar = hrbVar.a;
        ikpVar.b.size();
        if (biuVar.a() > 20971520) {
            biuVar.a();
        } else {
            Drawable drawableC = biuVar.c();
            ikpVar.c.put(hspVar, lig.h(drawableC.getIntrinsicWidth(), drawableC.getIntrinsicHeight()));
            ikpVar.b.put(hspVar, biuVar);
            Integer num = (Integer) ikpVar.d.get(hspVar);
            ikpVar.d.put(hspVar, Integer.valueOf(num == null ? 0 : num.intValue() + 1));
        }
        G(h());
        if (this.q.d == hss.MARS_STORE) {
            T("Writing out thumbnail");
            final hsg hsgVar = this.q;
            Executor executor = this.e;
            obr.aR(hsgVar.d == hss.MARS_STORE, "Thumbnail can be written to store only when using private store API");
            plk.af(pgb.h(hsgVar.c().c(), new oiu() { // from class: hsd
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    hsg hsgVar2 = hsgVar;
                    Bitmap bitmap2 = bitmap;
                    Uri uri = (Uri) obj;
                    uri.getClass();
                    Uri uriBuild = uri.buildUpon().appendPath("thumbnail").build();
                    lis lisVar = hsgVar2.g;
                    String strValueOf = String.valueOf(uriBuild);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
                    sb.append("Writing to URI ");
                    sb.append(strValueOf);
                    lisVar.f(sb.toString());
                    boolean z = true;
                    try {
                        Context context = hsgVar2.e;
                        nhw nhwVarA = nhx.a();
                        nhwVarA.b();
                        nhwVarA.c = true;
                        nib nibVar = new nib(null);
                        nhwVarA.b.getClass();
                        nhwVarA.a.g(nibVar);
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(nhy.b(context, uriBuild, "w", nhwVarA.a()).getParcelFileDescriptor());
                        try {
                            bitmap2.compress(Bitmap.CompressFormat.JPEG, 90, autoCloseOutputStream);
                            autoCloseOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                autoCloseOutputStream.close();
                            } catch (Throwable th2) {
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        lis lisVar2 = hsgVar2.g;
                        String strValueOf2 = String.valueOf(uriBuild);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 25);
                        sb2.append("Failed to save bitmap to ");
                        sb2.append(strValueOf2);
                        lisVar2.e(sb2.toString(), e);
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, executor), new hpq(this), pgr.INSTANCE);
        }
        this.g.d(bitmap);
    }

    final void X() {
        ((oug) ((oug) x.b()).G(2586)).y("[%s] %s", h(), "Failed to write out thumbnail for MARS shot");
    }

    @Override // defpackage.hsa
    public final void Y(int i) {
        if (this.u == 1) {
            this.u = i;
        }
        this.v = i;
    }

    @Override // defpackage.hhm
    public final lif a() {
        return this.c;
    }

    @Override // defpackage.hhm
    public final synchronized void b(lif lifVar) {
        N(lifVar, false);
    }

    @Override // defpackage.hhm
    public final void c(hho hhoVar) {
        if (!mip.ez(this.y)) {
            hhoVar.b(this.y);
        }
        hhoVar.a(this.c);
        this.A = hhoVar;
    }

    @Override // defpackage.hsa
    public final long d() {
        return this.q.b;
    }

    public final hhl e() {
        hhl hhlVar = this.D;
        hhlVar.getClass();
        return hhlVar;
    }

    @Override // defpackage.hsa
    public final hsc f() {
        hsc hscVar = this.r;
        hscVar.getClass();
        return hscVar;
    }

    @Override // defpackage.hsa
    public final hsg g() {
        return this.q;
    }

    @Override // defpackage.hsa
    public final hsp h() {
        return this.f.a;
    }

    @Override // defpackage.hsa
    public final hsr i() {
        return this.b;
    }

    @Override // defpackage.hsa
    public final hss j() {
        return this.q.d;
    }

    @Override // defpackage.hsa
    public final iij k() {
        return this.k;
    }

    @Override // defpackage.hsa
    public final lzv l() {
        return this.o;
    }

    @Override // defpackage.hsa
    public final ojc m() {
        return this.t;
    }

    @Override // defpackage.hsa
    public final ojc n() {
        return this.p;
    }

    final ojc o(final ikc ikcVar, final hlv hlvVar) {
        return ikcVar.c.b(new oiu() { // from class: hpn
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                lmg lmgVarK;
                hps hpsVar = this.a;
                ikc ikcVar2 = ikcVar;
                hlv hlvVar2 = hlvVar;
                ExifInterface exifInterface = (ExifInterface) obj;
                if (ikcVar2.a.equals(mbs.JPEG)) {
                    lmi lmiVar = new lmi(exifInterface);
                    lmiVar.g(hpsVar.d());
                    if (ikcVar2.e && (lmgVarK = lmiVar.a.k(ExifInterface.Y)) != null) {
                        int[] iArrN = lmgVarK.n();
                        int i = 0;
                        if (iArrN != null && iArrN.length > 0) {
                            i = iArrN[0];
                        }
                        lmgVarK.h(i | 1);
                        lmiVar.a.y(lmgVarK);
                    }
                    if (ikcVar2.d.g()) {
                        lmiVar.d((Location) ikcVar2.d.c());
                    }
                    if (ikcVar2.f == gqx.OFF) {
                        lmiVar.a.p(ExifInterface.TAG_SOFTWARE);
                    }
                    if (hlvVar2 != null) {
                        if (hlvVar2.d()) {
                            float f = hlvVar2.d;
                            StringBuilder sb = new StringBuilder(38);
                            sb.append("Writing water depth: ");
                            sb.append(f);
                            sb.append(" m");
                            sb.toString();
                            lmiVar.c(ExifInterface.aQ, lmi.i(Float.valueOf(f), 10L));
                        }
                        if (System.currentTimeMillis() <= hlvVar2.g + 5000) {
                            float f2 = hlvVar2.f;
                            StringBuilder sb2 = new StringBuilder(38);
                            sb2.append("Writing temperature: ");
                            sb2.append(f2);
                            sb2.append(" C");
                            sb2.toString();
                            lmiVar.c(ExifInterface.aP, lmi.i(Float.valueOf(f2), 10L));
                        }
                    }
                    exifInterface = lmiVar.a;
                }
                hpsVar.j.a(exifInterface);
                ((iik) hpsVar.k).g = exifInterface;
                ikcVar2.a(exifInterface);
                return exifInterface;
            }
        });
    }

    @Override // defpackage.hsa
    public final pht p() {
        return this.s;
    }

    @Override // defpackage.hsa
    public final pht q() {
        return plk.W(this.l);
    }

    @Override // defpackage.hsa
    public final /* synthetic */ pht r(byte[] bArr, ikc ikcVar) {
        return hls.k();
    }

    @Override // defpackage.hsa
    public final String s() {
        return this.f.c;
    }

    final synchronized void t() {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        x();
        this.q.d();
    }

    public final String toString() {
        return this.f.toString();
    }

    @Override // defpackage.hsa
    public final void u(hsn hsnVar) {
        hqb hqbVar = this.g;
        synchronized (hqbVar.a) {
            hqbVar.a.add(hsnVar);
        }
    }

    final synchronized void v(Runnable runnable) {
        this.B.add(runnable);
    }

    @Override // defpackage.hsa
    public final void w(Throwable th) {
        if (this.C && !(th instanceof dmb)) {
            T("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            C(jmq.a, new dmd("cancel invoked, but user already notified.", th));
            return;
        }
        if (this.w.c()) {
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 72);
            sb.append("Ignoring cancel. CaptureSession already saved/canceled or failed. Cause:");
            sb.append(strValueOf);
            E(sb.toString());
            return;
        }
        T("cancel");
        this.w.g(4);
        t();
        H();
        hrb hrbVar = this.d;
        if (hrbVar != null) {
            this.h.a(hrbVar);
            this.d = null;
        }
        this.g.f(this.u, this.v, new dmb(th));
        this.a.e(this.f.b);
    }

    final void x() {
        synchronized (this.l) {
            if (!this.l.cancel(true)) {
                E("Could not cancel MediaStore insertion");
            }
        }
    }

    @Override // defpackage.hsa
    public final void y() {
        this.g.i(this.u, this.v);
    }

    public final void z() {
        e().a(this.E);
    }
}
