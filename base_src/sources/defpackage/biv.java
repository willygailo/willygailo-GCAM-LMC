package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class biv implements azx {
    private final azx b;

    public biv(azx azxVar) {
        aae.s(azxVar);
        this.b = azxVar;
    }

    @Override // defpackage.azp
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.azx
    public final bcl b(Context context, bcl bclVar, int i, int i2) {
        bis bisVar = (bis) bclVar.c();
        bcl bgnVar = new bgn(bisVar.a(), axv.b(context).a);
        bcl bclVarB = this.b.b(context, bgnVar, i, i2);
        if (!bgnVar.equals(bclVarB)) {
            bgnVar.e();
        }
        Bitmap bitmap = (Bitmap) bclVarB.c();
        bisVar.a.a.e(this.b, bitmap);
        return bclVar;
    }

    @Override // defpackage.azp
    public final boolean equals(Object obj) {
        if (obj instanceof biv) {
            return this.b.equals(((biv) obj).b);
        }
        return false;
    }

    @Override // defpackage.azp
    public final int hashCode() {
        return this.b.hashCode();
    }
}
