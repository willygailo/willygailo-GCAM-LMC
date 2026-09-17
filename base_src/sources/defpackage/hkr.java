package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class hkr implements hko {
    public final dtg a;
    private final hkn[] b;
    private final Object c;

    public hkr() {
        int iConvert = (int) (TimeUnit.SECONDS.convert(30000L, TimeUnit.MILLISECONDS) * 30);
        this.c = new Object();
        this.a = new dtg(iConvert);
        this.b = new hkn[iConvert];
    }

    @Override // defpackage.hko
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.hko
    public final drc b() {
        return this.a;
    }

    @Override // defpackage.hko
    public final hkn c(long j) {
        hkn hknVar;
        synchronized (this.c) {
            int iG = this.a.g(j);
            hknVar = iG >= 0 ? this.b[iG] : null;
        }
        return hknVar;
    }

    @Override // defpackage.hko
    public final hkn d(long j) {
        synchronized (this.c) {
            if (this.a.e() <= 0) {
                return null;
            }
            dtg dtgVar = this.a;
            int iF = dtgVar.f(dtgVar.c(j));
            dtg dtgVar2 = this.a;
            int iF2 = dtgVar2.f(dtgVar2.d(j));
            hkn hknVar = iF >= 0 ? this.b[iF] : null;
            hkn hknVar2 = iF2 >= 0 ? this.b[iF2] : null;
            if (hknVar == null) {
                return hknVar2;
            }
            if (hknVar2 == null) {
                return hknVar;
            }
            if (j - hknVar.a >= hknVar2.a - j) {
                hknVar = hknVar2;
            }
            return hknVar;
        }
    }

    @Override // defpackage.hko
    public final void e() {
    }

    public final void f(hkn hknVar) {
        try {
            synchronized (this.c) {
                this.b[this.a.b(hknVar.a)] = hknVar;
            }
        } catch (IllegalArgumentException e) {
        }
    }
}
