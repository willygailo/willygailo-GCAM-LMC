package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ltz implements lun {
    private static final lie a = new jmf(3);
    private final lnx b;
    private final lup c;
    private lmw d = null;

    public ltz(lnx lnxVar, lup lupVar) {
        this.b = lnxVar;
        this.c = lupVar;
    }

    public static lun e(lnx lnxVar, lup lupVar) {
        lupVar.getClass();
        return new ltz(lnxVar, lupVar);
    }

    public static lun f(lnx lnxVar) {
        return (!(lnxVar instanceof lui) || ((lui) lnxVar).f() <= 0) ? g(lnxVar) : new ltz(lnxVar, lup.g());
    }

    public static lun g(lnx lnxVar) {
        boolean z = true;
        if ((lnxVar instanceof lui) && ((lui) lnxVar).f() > 0) {
            z = false;
        }
        obr.aG(z, "Cannot create a streamResult from a stream that uses more than 0 bytesPerImage");
        return new ltz(lnxVar, null);
    }

    @Override // defpackage.lun
    public final lie a() {
        lup lupVar = this.c;
        return lupVar != null ? lupVar.a() : a;
    }

    @Override // defpackage.lun
    public final lie b() {
        lup lupVar = this.c;
        return lupVar != null ? lupVar.b() : a;
    }

    @Override // defpackage.lun
    public final synchronized lmw c() {
        return this.d;
    }

    @Override // defpackage.lun
    public final lnx d() {
        return this.b;
    }

    @Override // defpackage.lun
    public final synchronized mad h() {
        return null;
    }

    @Override // defpackage.lun
    public final synchronized void i(lum lumVar) {
        lumVar.h();
    }

    @Override // defpackage.lun
    public final synchronized void j(lmw lmwVar) {
        this.d = lmwVar;
    }

    @Override // defpackage.lun
    public final synchronized void k(mad madVar) {
        if (madVar != null) {
            madVar.close();
            throw new IllegalStateException("External results must never receive images.");
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        lmw lmwVar = this.d;
        String strValueOf = String.valueOf(lmwVar == null ? null : Long.valueOf(lmwVar.c));
        sb = new StringBuilder(String.valueOf(strValueOf).length() + 21);
        sb.append("ExternalStreamResult-");
        sb.append(strValueOf);
        return sb.toString();
    }
}
