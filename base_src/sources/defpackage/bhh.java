package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class bhh implements azx {
    private final azx b;
    private final boolean c;

    public bhh(azx azxVar, boolean z) {
        this.b = azxVar;
        this.c = z;
    }

    @Override // defpackage.azp
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.azx
    public final bcl b(Context context, bcl bclVar, int i, int i2) {
        bcv bcvVar = axv.b(context).a;
        Drawable drawable = (Drawable) bclVar.c();
        bcl bclVarA = bhg.a(bcvVar, drawable, i, i2);
        if (bclVarA != null) {
            bcl bclVarB = this.b.b(context, bclVarA, i, i2);
            if (!bclVarB.equals(bclVarA)) {
                return bhq.f(context.getResources(), bclVarB);
            }
            bclVarB.e();
            return bclVar;
        }
        if (!this.c) {
            return bclVar;
        }
        String strValueOf = String.valueOf(drawable);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
        sb.append("Unable to convert ");
        sb.append(strValueOf);
        sb.append(" to a Bitmap");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.azp
    public final boolean equals(Object obj) {
        if (obj instanceof bhh) {
            return this.b.equals(((bhh) obj).b);
        }
        return false;
    }

    @Override // defpackage.azp
    public final int hashCode() {
        return this.b.hashCode();
    }
}
