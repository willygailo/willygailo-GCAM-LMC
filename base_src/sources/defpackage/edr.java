package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
final class edr implements phh {
    final /* synthetic */ int a;
    final /* synthetic */ edt b;
    final /* synthetic */ hgk c;
    final /* synthetic */ hsa d;
    final /* synthetic */ UUID e;
    final /* synthetic */ ojc f;
    final /* synthetic */ pih g;
    final /* synthetic */ edu h;

    public edr(edu eduVar, int i, edt edtVar, hgk hgkVar, hsa hsaVar, UUID uuid, ojc ojcVar, pih pihVar) {
        this.h = eduVar;
        this.a = i;
        this.b = edtVar;
        this.c = hgkVar;
        this.d = hsaVar;
        this.e = uuid;
        this.f = ojcVar;
        this.g = pihVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) edu.a.b()).G((char) 1072)).o("Error encoding jpeg image");
        this.g.o(null);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        pht phtVarV;
        edr edrVar = this;
        final gjx gjxVar = (gjx) obj;
        try {
            edu eduVar = edrVar.h;
            gjxVar.getClass();
            int i = edrVar.a;
            edt edtVar = edrVar.b;
            hgk hgkVar = edrVar.c;
            hsa hsaVar = edrVar.d;
            UUID uuid = edrVar.e;
            ojc ojcVar = edrVar.f;
            ExifInterface exifInterface = gjxVar.d;
            long j = gjxVar.a;
            lic licVarB = lic.b(gjxVar.c);
            lig ligVar = gjxVar.e;
            try {
                hpm hpmVar = new hpm(i, j, uuid, licVarB, ligVar.a, ligVar.b, gjxVar.b, exifInterface, hgkVar, hsaVar.i(), eduVar.g);
                ojc ojcVarA = eduVar.f.a(hsaVar.l());
                int i2 = hsaVar.h().a;
                ojc ojcVarB = hsaVar.m().b(bxe.r);
                eduVar.h.a.put(Long.valueOf(gjxVar.a), Float.valueOf(i));
                if (edtVar != edt.PRIMARY) {
                    String str = "";
                    switch (edtVar) {
                        case ORIGINAL:
                            str = "ORIGINAL";
                            break;
                        case SECONDARY:
                            str = "SECONDARY";
                            break;
                        case DEBUG:
                            str = "DEBUG";
                            break;
                    }
                    hsc hscVarH = hsaVar.g().h();
                    hscVarH.a.h(str);
                    phtVarV = plk.V(hpmVar.a(hscVarH, oih.a, oih.a));
                } else if (ojcVar.g()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    hsc hscVarF = hsaVar.f();
                    lig.h(hpmVar.b, hpmVar.c);
                    ikc ikcVar = new ikc(mbs.JPEG);
                    ikcVar.b(hpmVar.a);
                    try {
                        hpmVar.b(ojcVarA, ojcVarB, hscVarF.b, hscVarF.a().c(), byteArrayOutputStream);
                        phtVarV = ((fpl) ojcVar.c()).b(ikcVar, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), hsaVar.f(), oih.a, hsaVar.d(), hsaVar.s(), hsaVar.k());
                    } catch (IOException e) {
                        hscVarF.b();
                        throw new IllegalStateException(e);
                    }
                } else {
                    phtVarV = plk.V(hpmVar.a(hsaVar.f(), ojcVarA, ojcVarB));
                }
                edrVar = this;
                edrVar.g.e(pgb.h(phtVarV, new oiu() { // from class: edq
                    @Override // defpackage.oiu
                    public final Object a(Object obj2) {
                        return gjxVar;
                    }
                }, pgr.INSTANCE));
            } catch (RuntimeException e2) {
                e = e2;
                edrVar = this;
                ((oug) ((oug) ((oug) edu.a.b()).h(e)).G((char) 1073)).r("Error attaching jpeg image to the session %s", edrVar.d.s());
                edrVar.g.o(null);
            }
        } catch (RuntimeException e3) {
            e = e3;
        }
    }
}
