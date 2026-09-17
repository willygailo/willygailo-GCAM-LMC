package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: loaded from: classes.dex */
final class ecf implements phh {
    final /* synthetic */ hin a;
    final /* synthetic */ ExifInterface b;
    final /* synthetic */ String c;
    final /* synthetic */ gog d;
    final /* synthetic */ ecg e;

    public ecf(ecg ecgVar, hin hinVar, ExifInterface exifInterface, String str, gog gogVar) {
        this.e = ecgVar;
        this.a = hinVar;
        this.b = exifInterface;
        this.c = str;
        this.d = gogVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.a.a.close();
        this.d.c.f();
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        gjx gjxVar = (gjx) obj;
        this.a.a.close();
        String tagStringValue = this.b.getTagStringValue(ExifInterface.TAG_SOFTWARE);
        tagStringValue.getClass();
        ExifInterface exifInterface = this.b;
        int i = ExifInterface.TAG_SOFTWARE;
        String str = this.c;
        exifInterface.y(exifInterface.i(i, str.length() != 0 ? tagStringValue.concat(str) : new String(tagStringValue)));
        gjxVar.getClass();
        ExifInterface exifInterface2 = gjxVar.d;
        lmi lmiVar = new lmi(this.b);
        lmg lmgVarK = exifInterface2.k(ExifInterface.a);
        lmgVarK.getClass();
        long jO = lmgVarK.o();
        lmg lmgVarK2 = exifInterface2.k(ExifInterface.b);
        lmgVarK2.getClass();
        lmiVar.f((int) jO, (int) lmgVarK2.o(), lmb.a(lmb.c(exifInterface2)), oih.a);
        ecg ecgVar = this.e;
        gog gogVar = this.d;
        ecgVar.c(gogVar, gogVar.a.f, gjxVar.b, gjxVar.c, this.b);
    }
}
