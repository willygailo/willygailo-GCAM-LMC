package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class hab implements goy {
    private final goy a;

    public hab(goy goyVar) {
        this.a = goyVar;
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.a.a();
    }

    @Override // defpackage.goy
    public final lco b() {
        return this.a.b();
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) {
        if (gogVar.b.i() != hsr.LONG_SHOT) {
            this.a.c(goxVar, gogVar);
            return;
        }
        new lig(0, 0);
        ikc ikcVar = new ikc(mbs.JPEG);
        ikcVar.a(new ExifInterface());
        ikcVar.b(lic.b(gogVar.a.a));
        gogVar.b.r(null, ikcVar);
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("delegate", this.a);
        return ojbVarAZ.toString();
    }
}
