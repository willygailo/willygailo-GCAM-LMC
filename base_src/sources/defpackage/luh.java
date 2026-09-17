package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class luh implements lun, lie {
    private final lnx a;
    private final lup c;
    private lmw d = null;
    private mad e = null;
    private boolean f = false;
    private boolean g = false;
    private final List b = new ArrayList();

    public luh(lnx lnxVar, lup lupVar) {
        this.a = lnxVar;
        this.c = lupVar;
    }

    public static lun e(lnx lnxVar, lup lupVar) {
        lupVar.getClass();
        luh luhVar = new luh(lnxVar, lupVar);
        lupVar.e(luhVar);
        return luhVar;
    }

    private final synchronized void f() {
        if (this.g) {
            return;
        }
        this.g = true;
        if (!this.b.isEmpty()) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((lum) it.next()).h();
            }
            this.b.clear();
        }
    }

    @Override // defpackage.lun
    public final lie a() {
        return this.c.a();
    }

    @Override // defpackage.lun
    public final lie b() {
        return this.c.b();
    }

    @Override // defpackage.lun
    public final synchronized lmw c() {
        return this.d;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        f();
        this.e = null;
    }

    @Override // defpackage.lun
    public final lnx d() {
        return this.a;
    }

    @Override // defpackage.lun
    public final synchronized mad h() {
        lie lieVarB;
        mad madVar = this.e;
        lup lupVar = this.c;
        if (madVar == null || (lieVarB = lupVar.b()) == null) {
            return null;
        }
        return new luq(madVar, lieVarB);
    }

    @Override // defpackage.lun
    public final synchronized void i(lum lumVar) {
        if (this.g) {
            lumVar.h();
        } else {
            this.b.add(lumVar);
        }
    }

    @Override // defpackage.lun
    public final synchronized void j(lmw lmwVar) {
        obr.as(!this.f, "An image was already set for frame %s on %s!", lmwVar, this.a);
        this.d = lmwVar;
    }

    @Override // defpackage.lun
    public final synchronized void k(mad madVar) {
        boolean z;
        if (madVar != null) {
            try {
                z = this.d != null;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = true;
        }
        obr.ap(z);
        boolean z2 = this.f;
        if (!z2 || madVar != null) {
            obr.as(!z2, "An image was already set for frame %s on %s!", this.d, this.a);
            this.f = true;
            if (madVar != null) {
                this.d.getClass();
                this.c.e(madVar);
                if (!this.c.d()) {
                    this.e = madVar;
                }
            }
            f();
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        lmw lmwVar = this.d;
        String strValueOf = String.valueOf(lmwVar == null ? null : Long.valueOf(lmwVar.c));
        sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
        sb.append("ImageStreamResult-");
        sb.append(strValueOf);
        return sb.toString();
    }
}
