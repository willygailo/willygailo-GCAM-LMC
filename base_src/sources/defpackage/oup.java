package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oup implements ova, ovq {
    private static final String a = new String();
    public final long b;
    public ouo c;
    private final Level d;
    private ous e;
    private owr f;
    private Object[] g;

    protected oup(Level level) {
        long jB = owp.b();
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        oxh.x(level, "level");
        this.d = level;
        this.b = jB;
    }

    private final void K(String str, Object... objArr) {
        this.g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof ouk) {
                objArr[i] = ((ouk) obj).a();
            }
        }
        if (str != a) {
            this.f = new owr(a(), str);
        }
        oxp oxpVarK = owp.k();
        if (!oxpVarK.a()) {
            oxp oxpVar = (oxp) j().d(oun.f);
            if (oxpVar != null && !oxpVar.a()) {
                oxpVarK = oxpVarK.a() ? oxpVar : new oxp(new oxn(oxpVarK.c, oxpVar.c));
            }
            n(oun.f, oxpVarK);
        }
        oue oueVarC = c();
        try {
            oyd oydVar = (oyd) oyd.a.get();
            int i2 = oydVar.b + 1;
            oydVar.b = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    oueVarC.a.c(this);
                } else {
                    oue.e("unbounded recursion in log statement", this);
                }
                if (oydVar != null) {
                    oydVar.close();
                }
            } catch (Throwable th) {
                if (oydVar != null) {
                    try {
                        oydVar.close();
                    } catch (Throwable th2) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            try {
                oueVarC.a.b(e, this);
            } catch (ovs e2) {
                throw e2;
            } catch (RuntimeException e3) {
                String name = e3.getClass().getName();
                String message = e3.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 2 + String.valueOf(message).length());
                sb.append(name);
                sb.append(": ");
                sb.append(message);
                oue.e(sb.toString(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException e4) {
                }
            }
        }
    }

    private final boolean L() {
        out outVarB;
        if (this.e == null) {
            this.e = owp.g().a(oup.class, 1);
        }
        if (this.e != ous.a) {
            outVarB = this.e;
            ouo ouoVar = this.c;
            if (ouoVar != null && ouoVar.b > 0) {
                oxh.x(outVarB, "logSiteKey");
                int i = ouoVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (oun.d.equals(ouoVar.c(i2))) {
                        Object objE = ouoVar.e(i2);
                        outVarB = objE instanceof ovb ? ((ovb) objE).b() : new ove(outVarB, objE);
                    }
                }
            }
        } else {
            outVarB = null;
        }
        return b(outVarB);
    }

    @Override // defpackage.ova
    public final void A(String str, Object obj, Object obj2, Object obj3) {
        if (L()) {
            K(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.ova
    public final void B(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (L()) {
            K(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.ova
    public final void C(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (L()) {
            K(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.ovq
    public final boolean D() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(oun.e));
    }

    @Override // defpackage.ovq
    public final Object[] E() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // defpackage.ova
    public final void F(float f, Object obj) {
        if (L()) {
            K("Focal length needed = %g / available: %s", Float.valueOf(f), obj);
        }
    }

    @Override // defpackage.ova
    public final ova G(int i) {
        our ourVar = new our(i);
        if (this.e == null) {
            this.e = ourVar;
        }
        return d();
    }

    @Override // defpackage.ova
    public final ova H(TimeUnit timeUnit) {
        if (D()) {
            return d();
        }
        n(oun.c, ouy.a(timeUnit));
        return d();
    }

    @Override // defpackage.ova
    public final void I(float f, float f2) {
        if (L()) {
            K("Avoiding b/115930193, modeListWidth=%g myWidth=%g", Float.valueOf(f), Float.valueOf(f2));
        }
    }

    @Override // defpackage.ova
    public final void J(int i, long j) {
        if (L()) {
            K("Not restoring video id %d since it is too small (size: %d)", Integer.valueOf(i), Long.valueOf(j));
        }
    }

    protected abstract oxy a();

    protected boolean b(out outVar) {
        throw null;
    }

    protected abstract oue c();

    protected abstract ova d();

    @Override // defpackage.ovq
    public final long e() {
        return this.b;
    }

    @Override // defpackage.ovq
    public final ous f() {
        ous ousVar = this.e;
        if (ousVar != null) {
            return ousVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.ova
    public final ova g(ovd ovdVar, Object obj) {
        oxh.x(ovdVar, "metadata key");
        if (obj != null) {
            n(ovdVar, obj);
        }
        return d();
    }

    @Override // defpackage.ova
    public final ova h(Throwable th) {
        return g(oun.a, th);
    }

    @Override // defpackage.ova
    public final ova i(ovf ovfVar) {
        oxh.x(ovfVar, "stack size");
        if (ovfVar != ovf.NONE) {
            n(oun.g, ovfVar);
        }
        return d();
    }

    @Override // defpackage.ovq
    public final ovv j() {
        ouo ouoVar = this.c;
        return ouoVar != null ? ouoVar : ovu.a;
    }

    @Override // defpackage.ovq
    public final owr k() {
        return this.f;
    }

    @Override // defpackage.ovq
    public final Object l() {
        if (this.f == null) {
            return this.g[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    @Override // defpackage.ovq
    public final Level m() {
        return this.d;
    }

    protected final void n(ovd ovdVar, Object obj) {
        int iA;
        if (this.c == null) {
            this.c = new ouo();
        }
        ouo ouoVar = this.c;
        if (!ovdVar.b && (iA = ouoVar.a(ovdVar)) != -1) {
            Object[] objArr = ouoVar.a;
            oxh.x(obj, "metadata value");
            objArr[iA + iA + 1] = obj;
            return;
        }
        int i = ouoVar.b + 1;
        Object[] objArr2 = ouoVar.a;
        int length = objArr2.length;
        if (i + i > length) {
            ouoVar.a = Arrays.copyOf(objArr2, length + length);
        }
        Object[] objArr3 = ouoVar.a;
        int i2 = ouoVar.b;
        oxh.x(ovdVar, "metadata key");
        objArr3[i2 + i2] = ovdVar;
        Object[] objArr4 = ouoVar.a;
        int i3 = ouoVar.b;
        oxh.x(obj, "metadata value");
        objArr4[i3 + i3 + 1] = obj;
        ouoVar.b++;
    }

    @Override // defpackage.ova
    public final void o(String str) {
        if (L()) {
            K(a, str);
        }
    }

    @Override // defpackage.ova
    public final void p(String str, int i) {
        if (L()) {
            K(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ova
    public final void q(String str, long j) {
        if (L()) {
            K(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.ova
    public final void r(String str, Object obj) {
        if (L()) {
            K(str, obj);
        }
    }

    @Override // defpackage.ova
    public final void s(String str, int i, int i2) {
        if (L()) {
            K(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.ova
    public final void t(String str, int i, Object obj) {
        if (L()) {
            K(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.ova
    public final void u(String str, long j, long j2) {
        if (L()) {
            K(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // defpackage.ova
    public final void v(String str, long j, Object obj) {
        if (L()) {
            K(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.ova
    public final void w(String str, Object obj, int i) {
        if (L()) {
            K(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ova
    public final void x(String str, Object obj, long j) {
        if (L()) {
            K(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.ova
    public final void y(String str, Object obj, Object obj2) {
        if (L()) {
            K(str, obj, obj2);
        }
    }

    @Override // defpackage.ova
    public final void z(String str, Object obj, boolean z) {
        if (L()) {
            K(str, obj, Boolean.valueOf(z));
        }
    }
}
