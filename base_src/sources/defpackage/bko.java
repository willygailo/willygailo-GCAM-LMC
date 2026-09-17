package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bko implements Cloneable {
    public int d;
    public Drawable e;
    public int f;
    public boolean k;
    public boolean p;
    public boolean q;
    public boolean s;
    private int t;
    private Drawable u;
    private Drawable v;
    private int w;
    private boolean x;
    private Resources.Theme y;
    private boolean z;
    public float a = 1.0f;
    public bbr b = bbr.c;
    public ayc c = ayc.NORMAL;
    public boolean g = true;
    public int h = -1;
    public int i = -1;
    public azp j = blm.b;
    public boolean l = true;
    public azt m = new azt();
    public Map n = new bls();
    public Class o = Object.class;
    public boolean r = true;

    private final bko a(bhb bhbVar, azx azxVar, boolean z) {
        bko bkoVarA = z ? A(bhbVar, azxVar) : s(bhbVar, azxVar);
        bkoVarA.r = true;
        return bkoVarA;
    }

    private static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    final bko A(bhb bhbVar, azx azxVar) {
        if (this.p) {
            return h().A(bhbVar, azxVar);
        }
        E(bhbVar);
        return y(azxVar);
    }

    final bko B(Class cls, azx azxVar, boolean z) {
        if (this.p) {
            return h().B(cls, azxVar, z);
        }
        aae.s(cls);
        aae.s(azxVar);
        this.n.put(cls, azxVar);
        int i = this.t;
        this.l = true;
        int i2 = i | 67584;
        this.t = i2;
        this.r = false;
        if (z) {
            this.t = i2 | 131072;
            this.k = true;
        }
        L();
        return this;
    }

    public final boolean C(int i) {
        return b(this.t, i);
    }

    public final boolean D() {
        return bmf.o(this.i, this.h);
    }

    public final void E(bhb bhbVar) {
        azs azsVar = bhb.f;
        aae.s(bhbVar);
        w(azsVar, bhbVar);
    }

    public final bko F() {
        if (this.p) {
            return h().F();
        }
        this.d = R.drawable.quantum_gm_ic_get_app_white_24;
        int i = this.t;
        this.u = null;
        this.t = (i | 32) & (-17);
        L();
        return this;
    }

    public final bko G() {
        if (this.p) {
            return h().G();
        }
        this.q = true;
        this.t |= 524288;
        L();
        return this;
    }

    public final bko H() {
        if (this.p) {
            return h().H();
        }
        this.f = R.color.photo_placeholder;
        int i = this.t;
        this.e = null;
        this.t = (i | 128) & (-65);
        L();
        return this;
    }

    public final bko I() {
        if (this.p) {
            return h().I();
        }
        this.g = false;
        this.t |= 256;
        L();
        return this;
    }

    public final bko J() {
        if (this.p) {
            return h().J();
        }
        this.s = true;
        this.t |= 1048576;
        L();
        return this;
    }

    public final void K() {
        this.x = true;
    }

    protected final void L() {
        if (this.x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final void M() {
        if (this.x && !this.p) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.p = true;
        K();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bko) {
            bko bkoVar = (bko) obj;
            if (Float.compare(bkoVar.a, this.a) == 0 && this.d == bkoVar.d) {
                Drawable drawable = bkoVar.u;
                if (bmf.l(null, null) && this.f == bkoVar.f && bmf.l(this.e, bkoVar.e)) {
                    int i = bkoVar.w;
                    Drawable drawable2 = bkoVar.v;
                    if (bmf.l(null, null) && this.g == bkoVar.g && this.h == bkoVar.h && this.i == bkoVar.i && this.k == bkoVar.k && this.l == bkoVar.l) {
                        boolean z = bkoVar.z;
                        if (this.q == bkoVar.q && this.b.equals(bkoVar.b) && this.c == bkoVar.c && this.m.equals(bkoVar.m) && this.n.equals(bkoVar.n) && this.o.equals(bkoVar.o) && bmf.l(this.j, bkoVar.j)) {
                            Resources.Theme theme = bkoVar.y;
                            if (bmf.l(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public bko g(bko bkoVar) {
        if (this.p) {
            return h().g(bkoVar);
        }
        if (b(bkoVar.t, 2)) {
            this.a = bkoVar.a;
        }
        if (b(bkoVar.t, 262144)) {
            boolean z = bkoVar.z;
            this.z = false;
        }
        if (b(bkoVar.t, 1048576)) {
            this.s = bkoVar.s;
        }
        if (b(bkoVar.t, 4)) {
            this.b = bkoVar.b;
        }
        if (b(bkoVar.t, 8)) {
            this.c = bkoVar.c;
        }
        if (b(bkoVar.t, 16)) {
            Drawable drawable = bkoVar.u;
            this.u = null;
            this.d = 0;
            this.t &= -33;
        }
        if (b(bkoVar.t, 32)) {
            this.d = bkoVar.d;
            this.u = null;
            this.t &= -17;
        }
        if (b(bkoVar.t, 64)) {
            this.e = bkoVar.e;
            this.f = 0;
            this.t &= -129;
        }
        if (b(bkoVar.t, 128)) {
            this.f = bkoVar.f;
            this.e = null;
            this.t &= -65;
        }
        if (b(bkoVar.t, 256)) {
            this.g = bkoVar.g;
        }
        if (b(bkoVar.t, 512)) {
            this.i = bkoVar.i;
            this.h = bkoVar.h;
        }
        if (b(bkoVar.t, 1024)) {
            this.j = bkoVar.j;
        }
        if (b(bkoVar.t, 4096)) {
            this.o = bkoVar.o;
        }
        if (b(bkoVar.t, 8192)) {
            Drawable drawable2 = bkoVar.v;
            this.v = null;
            this.w = 0;
            this.t &= -16385;
        }
        if (b(bkoVar.t, 16384)) {
            int i = bkoVar.w;
            this.w = 0;
            this.v = null;
            this.t &= -8193;
        }
        if (b(bkoVar.t, 32768)) {
            Resources.Theme theme = bkoVar.y;
            this.y = null;
        }
        if (b(bkoVar.t, 65536)) {
            this.l = bkoVar.l;
        }
        if (b(bkoVar.t, 131072)) {
            this.k = bkoVar.k;
        }
        if (b(bkoVar.t, 2048)) {
            this.n.putAll(bkoVar.n);
            this.r = bkoVar.r;
        }
        if (b(bkoVar.t, 524288)) {
            this.q = bkoVar.q;
        }
        if (!this.l) {
            this.n.clear();
            int i2 = this.t;
            this.k = false;
            this.t = i2 & (-133121);
            this.r = true;
        }
        this.t |= bkoVar.t;
        this.m.c(bkoVar.m);
        L();
        return this;
    }

    @Override // 
    public bko h() {
        try {
            bko bkoVar = (bko) super.clone();
            azt aztVar = new azt();
            bkoVar.m = aztVar;
            aztVar.c(this.m);
            bls blsVar = new bls();
            bkoVar.n = blsVar;
            blsVar.putAll(this.n);
            bkoVar.x = false;
            bkoVar.p = false;
            return bkoVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        int iE = bmf.e(null, bmf.d(this.d, bmf.c(this.a)));
        int iE2 = bmf.e(null, bmf.d(0, bmf.e(this.e, bmf.d(this.f, iE))));
        boolean z = this.g;
        int i = this.h;
        int i2 = this.i;
        boolean z2 = this.k;
        boolean z3 = this.l;
        boolean z4 = this.q;
        return bmf.e(null, bmf.e(this.j, bmf.e(this.o, bmf.e(this.n, bmf.e(this.m, bmf.e(this.c, bmf.e(this.b, bmf.d(z4 ? 1 : 0, bmf.d(0, bmf.d(z3 ? 1 : 0, bmf.d(z2 ? 1 : 0, bmf.d(i2, bmf.d(i, bmf.d(z ? 1 : 0, iE2))))))))))))));
    }

    public final bko l() {
        return A(bhb.c, new bgp());
    }

    public final bko m(Class cls) {
        if (this.p) {
            return h().m(cls);
        }
        aae.s(cls);
        this.o = cls;
        this.t |= 4096;
        L();
        return this;
    }

    public final bko n(bbr bbrVar) {
        if (this.p) {
            return h().n(bbrVar);
        }
        aae.s(bbrVar);
        this.b = bbrVar;
        this.t |= 4;
        L();
        return this;
    }

    public final bko o() {
        if (this.p) {
            return h().o();
        }
        this.n.clear();
        int i = this.t;
        this.k = false;
        this.l = false;
        this.t = (i & (-133121)) | 65536;
        this.r = true;
        L();
        return this;
    }

    public final bko p() {
        return a(bhb.a, new bhj(), true);
    }

    public final bko q() {
        return r(bhb.b, new bgq());
    }

    public final bko r(bhb bhbVar, azx azxVar) {
        return a(bhbVar, azxVar, false);
    }

    public final bko s(bhb bhbVar, azx azxVar) {
        if (this.p) {
            return h().s(bhbVar, azxVar);
        }
        E(bhbVar);
        return z(azxVar, false);
    }

    public final bko t(int i, int i2) {
        if (this.p) {
            return h().t(i, i2);
        }
        this.i = i;
        this.h = i2;
        this.t |= 512;
        L();
        return this;
    }

    public final bko u(Drawable drawable) {
        if (this.p) {
            return h().u(drawable);
        }
        this.e = drawable;
        int i = this.t;
        this.f = 0;
        this.t = (i | 64) & (-129);
        L();
        return this;
    }

    public final bko v(ayc aycVar) {
        if (this.p) {
            return h().v(aycVar);
        }
        aae.s(aycVar);
        this.c = aycVar;
        this.t |= 8;
        L();
        return this;
    }

    public final bko w(azs azsVar, Object obj) {
        if (this.p) {
            return h().w(azsVar, obj);
        }
        aae.s(azsVar);
        aae.s(obj);
        this.m.d(azsVar, obj);
        L();
        return this;
    }

    public final bko x(azp azpVar) {
        if (this.p) {
            return h().x(azpVar);
        }
        aae.s(azpVar);
        this.j = azpVar;
        this.t |= 1024;
        L();
        return this;
    }

    public final bko y(azx azxVar) {
        return z(azxVar, true);
    }

    final bko z(azx azxVar, boolean z) {
        if (this.p) {
            return h().z(azxVar, z);
        }
        bhh bhhVar = new bhh(azxVar, z);
        B(Bitmap.class, azxVar, z);
        B(Drawable.class, bhhVar, z);
        B(BitmapDrawable.class, bhhVar, z);
        B(bis.class, new biv(azxVar), z);
        L();
        return this;
    }
}
