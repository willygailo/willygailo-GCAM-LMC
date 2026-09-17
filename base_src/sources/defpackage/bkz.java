package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bkz implements bks, blg, bky {
    private final Object a;
    private final bkw b;
    private final bku c;
    private final Context d;
    private final aya e;
    private final Object f;
    private final Class g;
    private final bko h;
    private final int i;
    private final int j;
    private final ayc k;
    private final blh l;
    private final List m;
    private final Executor n;
    private bcl o;
    private bbx p;
    private long q;
    private volatile bby r;
    private Drawable s;
    private Drawable t;
    private int u;
    private int v;
    private boolean w;
    private RuntimeException x;
    private final fuo z = fuo.d();
    private int y = 1;

    public bkz(Context context, aya ayaVar, Object obj, Object obj2, Class cls, bko bkoVar, int i, int i2, ayc aycVar, blh blhVar, bkw bkwVar, List list, bku bkuVar, bby bbyVar, Executor executor) {
        this.a = obj;
        this.d = context;
        this.e = ayaVar;
        this.f = obj2;
        this.g = cls;
        this.h = bkoVar;
        this.i = i;
        this.j = i2;
        this.k = aycVar;
        this.l = blhVar;
        this.b = bkwVar;
        this.m = list;
        this.c = bkuVar;
        this.r = bbyVar;
        this.n = executor;
        if (this.x == null && ayaVar.h.m(axx.class)) {
            this.x = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        int i;
        if (this.t == null) {
            bko bkoVar = this.h;
            Drawable drawable = bkoVar.e;
            this.t = drawable;
            if (drawable == null && (i = bkoVar.f) > 0) {
                this.t = o(i);
            }
        }
        return this.t;
    }

    private final Drawable o(int i) {
        Resources.Theme theme = this.d.getTheme();
        aya ayaVar = this.e;
        return bij.a(ayaVar, ayaVar, i, theme);
    }

    private final void p() {
        if (this.w) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final boolean q() {
        bku bkuVar = this.c;
        return bkuVar == null || bkuVar.h(this);
    }

    private final void r() {
        bku bkuVar = this.c;
        if (bkuVar != null) {
            bkuVar.a().j();
        }
    }

    private final void s(bcg bcgVar) {
        this.z.c();
        synchronized (this.a) {
            String strValueOf = String.valueOf(this.f);
            int i = this.u;
            int i2 = this.v;
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 52);
            sb.append("Load failed for ");
            sb.append(strValueOf);
            sb.append(" with size [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("]");
            Log.w("Glide", sb.toString(), bcgVar);
            List listA = bcgVar.a();
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
            }
            this.p = null;
            this.y = 5;
            this.w = true;
            try {
                List<bkw> list = this.m;
                if (list != null) {
                    for (bkw bkwVar : list) {
                        r();
                        bkwVar.l(bcgVar);
                    }
                }
                bkw bkwVar2 = this.b;
                if (bkwVar2 != null) {
                    r();
                    bkwVar2.l(bcgVar);
                }
                if (q()) {
                    if (this.s == null) {
                        this.s = null;
                        int i4 = this.h.d;
                        if (i4 > 0) {
                            this.s = o(i4);
                        }
                    }
                    Drawable drawableI = this.s;
                    if (drawableI == null) {
                        drawableI = i();
                    }
                    this.l.e(drawableI);
                }
                this.w = false;
                bku bkuVar = this.c;
                if (bkuVar != null) {
                    bkuVar.d(this);
                }
            } catch (Throwable th) {
                this.w = false;
                throw th;
            }
        }
    }

    @Override // defpackage.bky
    public final Object a() {
        this.z.c();
        return this.a;
    }

    @Override // defpackage.bks
    public final void b() {
        synchronized (this.a) {
            p();
            this.z.c();
            this.q = blz.b();
            if (this.f == null) {
                if (bmf.o(this.i, this.j)) {
                    this.u = this.i;
                    this.v = this.j;
                }
                s(new bcg("Received null model"));
                return;
            }
            int i = this.y;
            if (i == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i == 4) {
                e(this.o, 5);
                return;
            }
            this.y = 3;
            if (bmf.o(this.i, this.j)) {
                g(this.i, this.j);
            } else {
                this.l.d(this);
            }
            int i2 = this.y;
            if ((i2 == 2 || i2 == 3) && q()) {
                this.l.f(i());
            }
        }
    }

    @Override // defpackage.bks
    public final void c() {
        synchronized (this.a) {
            p();
            this.z.c();
            if (this.y != 6) {
                p();
                this.z.c();
                this.l.j(this);
                bbx bbxVar = this.p;
                bcl bclVar = null;
                if (bbxVar != null) {
                    synchronized (bbxVar.c) {
                        bbxVar.a.g(bbxVar.b);
                    }
                    this.p = null;
                }
                bcl bclVar2 = this.o;
                if (bclVar2 != null) {
                    this.o = null;
                    bclVar = bclVar2;
                }
                bku bkuVar = this.c;
                if (bkuVar == null || bkuVar.g(this)) {
                    this.l.a(i());
                }
                this.y = 6;
                if (bclVar != null) {
                    ((bce) bclVar).f();
                }
            }
        }
    }

    @Override // defpackage.bky
    public final void d(bcg bcgVar) {
        s(bcgVar);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01c3 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r11 = (defpackage.bce) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b5, code lost:
    
        r11 = (defpackage.bce) r11;
     */
    @Override // defpackage.bky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.bcl r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkz.e(bcl, int):void");
    }

    @Override // defpackage.bks
    public final void f() {
        synchronized (this.a) {
            if (n()) {
                c();
            }
        }
    }

    @Override // defpackage.blg
    public final void g(int i, int i2) throws Throwable {
        bce bceVarA;
        bkz bkzVar;
        bbx bbxVar;
        this.z.c();
        synchronized (this.a) {
            try {
                if (this.y != 3) {
                    return;
                }
                this.y = 2;
                float f = this.h.a;
                this.u = h(i, f);
                this.v = h(i2, f);
                bby bbyVar = this.r;
                aya ayaVar = this.e;
                Object obj = this.f;
                bko bkoVar = this.h;
                azp azpVar = bkoVar.j;
                int i3 = this.u;
                int i4 = this.v;
                Class cls = bkoVar.o;
                Class cls2 = this.g;
                ayc aycVar = this.k;
                bbr bbrVar = bkoVar.b;
                Map map = bkoVar.n;
                boolean z = bkoVar.k;
                boolean z2 = bkoVar.r;
                azt aztVar = bkoVar.m;
                boolean z3 = bkoVar.g;
                boolean z4 = bkoVar.s;
                boolean z5 = bkoVar.q;
                Executor executor = this.n;
                try {
                    bcd bcdVar = new bcd(obj, azpVar, i3, i4, map, cls, cls2, aztVar);
                    synchronized (bbyVar) {
                        try {
                            if (z3) {
                                try {
                                    bceVarA = bbyVar.e.a(bcdVar);
                                    if (bceVarA != null) {
                                        bceVarA.d();
                                    }
                                    if (bceVarA == null) {
                                        bcl bclVarB = bbyVar.f.b(bcdVar);
                                        if (bclVarB == null) {
                                            bceVarA = null;
                                        } else {
                                            bceVarA = bclVarB instanceof bce ? (bce) bclVarB : new bce(bclVarB, true, bcdVar, bbyVar);
                                        }
                                        if (bceVarA != null) {
                                            bceVarA.d();
                                            bbyVar.e.b(bcdVar, bceVarA);
                                        }
                                        if (bceVarA == null) {
                                            bceVarA = null;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } else {
                                bceVarA = null;
                            }
                            if (bceVarA == null) {
                                bcc bccVar = (bcc) bbyVar.a.a(z5).get(bcdVar);
                                if (bccVar != null) {
                                    bkzVar = this;
                                    bccVar.b(bkzVar, executor);
                                    bbxVar = new bbx(bbyVar, bkzVar, bccVar);
                                } else {
                                    bcc bccVar2 = (bcc) bbyVar.b.d.a();
                                    aae.s(bccVar2);
                                    bccVar2.i(bcdVar, z3, z4, z5);
                                    bbt bbtVar = bbyVar.d;
                                    bbm bbmVar = (bbm) bbtVar.a.a();
                                    aae.s(bbmVar);
                                    int i5 = bbtVar.b;
                                    bbtVar.b = i5 + 1;
                                    bbi bbiVar = bbmVar.a;
                                    bbw bbwVar = bbmVar.r;
                                    bbiVar.c = ayaVar;
                                    bbiVar.d = obj;
                                    bbiVar.m = azpVar;
                                    bbiVar.e = i3;
                                    bbiVar.f = i4;
                                    bbiVar.o = bbrVar;
                                    bbiVar.g = cls;
                                    bbiVar.r = bbwVar;
                                    bbiVar.j = cls2;
                                    bbiVar.n = aycVar;
                                    bbiVar.h = aztVar;
                                    bbiVar.i = map;
                                    bbiVar.p = z;
                                    bbiVar.q = z2;
                                    bbmVar.d = ayaVar;
                                    bbmVar.e = azpVar;
                                    bbmVar.f = aycVar;
                                    bbmVar.g = i3;
                                    bbmVar.h = i4;
                                    bbmVar.i = bbrVar;
                                    bbmVar.m = z5;
                                    bbmVar.j = aztVar;
                                    bbmVar.k = bccVar2;
                                    bbmVar.l = i5;
                                    bbmVar.q = 1;
                                    bbyVar.a.a(bccVar2.d).put(bcdVar, bccVar2);
                                    bkzVar = this;
                                    bccVar2.b(bkzVar, executor);
                                    bccVar2.h(bbmVar);
                                    bbxVar = new bbx(bbyVar, bkzVar, bccVar2);
                                }
                            } else {
                                bkzVar = this;
                                bkzVar.e(bceVarA, 5);
                                bbxVar = null;
                            }
                            bkzVar.p = bbxVar;
                            if (bkzVar.y != 2) {
                                bkzVar.p = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // defpackage.bks
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.y == 4;
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.y == 6;
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.y == 4;
        }
        return z;
    }

    @Override // defpackage.bks
    public final boolean m(bks bksVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        bko bkoVar;
        ayc aycVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        bko bkoVar2;
        ayc aycVar2;
        int size2;
        if (!(bksVar instanceof bkz)) {
            return false;
        }
        synchronized (this.a) {
            i = this.i;
            i2 = this.j;
            obj = this.f;
            cls = this.g;
            bkoVar = this.h;
            aycVar = this.k;
            List list = this.m;
            size = list != null ? list.size() : 0;
        }
        bkz bkzVar = (bkz) bksVar;
        synchronized (bkzVar.a) {
            i3 = bkzVar.i;
            i4 = bkzVar.j;
            obj2 = bkzVar.f;
            cls2 = bkzVar.g;
            bkoVar2 = bkzVar.h;
            aycVar2 = bkzVar.k;
            List list2 = bkzVar.m;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i == i3 && i2 == i4 && bmf.k(obj, obj2) && cls.equals(cls2) && bkoVar.equals(bkoVar2) && aycVar == aycVar2 && size == size2;
    }

    @Override // defpackage.bks
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            int i = this.y;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.a) {
            obj = this.f;
            cls = this.g;
        }
        String string = super.toString();
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(cls);
        int length = String.valueOf(string).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(strValueOf).length() + String.valueOf(strValueOf2).length());
        sb.append(string);
        sb.append("[model=");
        sb.append(strValueOf);
        sb.append(", transcodeClass=");
        sb.append(strValueOf2);
        sb.append("]");
        return sb.toString();
    }
}
