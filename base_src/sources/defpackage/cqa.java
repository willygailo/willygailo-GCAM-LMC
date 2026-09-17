package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class cqa implements phh {
    final /* synthetic */ pih a;
    final /* synthetic */ lwd b;
    final /* synthetic */ hsq c;
    final /* synthetic */ cqb d;

    public cqa(cqb cqbVar, pih pihVar, lwd lwdVar, hsq hsqVar) {
        this.d = cqbVar;
        this.a = pihVar;
        this.b = lwdVar;
        this.c = hsqVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) cqb.a.b()).h(th)).G((char) 604)).o("Failed to take snapshot.");
        this.a.a(th);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            pih pihVar = this.a;
            cqb cqbVar = this.d;
            cqc cqcVar = cqbVar.b;
            lic licVar = (lic) ((lce) cqbVar.c.n).d;
            lwd lwdVar = this.b;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            cku ckuVarA = cqcVar.a(byteArrayOutputStream.toByteArray(), licVar, lwdVar);
            ckuVarA.g = new lig(bitmap.getWidth(), bitmap.getHeight());
            ckuVarA.c(1);
            ckuVarA.b(System.currentTimeMillis() - this.d.d);
            ckuVarA.j = this.c;
            pihVar.o(ckuVarA.a());
        } catch (Exception e) {
            this.a.a(e);
        }
    }
}
