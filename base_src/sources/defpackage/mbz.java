package defpackage;

import android.content.ContentValues;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mbz implements mch {
    public final lis a;
    private final mip b;

    public mbz(mip mipVar, lis lisVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = mipVar;
        this.a = lisVar.a("MediaFS-Q");
    }

    @Override // defpackage.mch
    public final mce a(mcn mcnVar, mcc mccVar) {
        if (!mcnVar.a.b()) {
            return new mcp(this.b, mcs.l(mcnVar, mccVar, this.a), this.a, null, null, null);
        }
        mip mipVar = this.b;
        obr.aF(mcnVar.d());
        ContentValues contentValues = new ContentValues();
        contentValues.put(mccVar.e, String.format(Locale.ROOT, "%s.%s", mcnVar.c, mcnVar.d));
        contentValues.put(mccVar.f, mcnVar.e);
        contentValues.put(mccVar.j, String.format(Locale.ROOT, "%s/%s", mcnVar.a.a(mccVar.a).getName(), mcnVar.b));
        if (mip.K(mcnVar.e)) {
            contentValues.put(mccVar.k, Integer.valueOf(mccVar.l));
        } else if (mip.L(mcnVar.e)) {
            contentValues.put(mccVar.k, Integer.valueOf(mccVar.m));
        }
        contentValues.put(mccVar.g, Integer.valueOf(mccVar.h));
        return new mco(mipVar, new mcq(mcnVar, mccVar.a.getContentResolver(), contentValues, mccVar), this.a, null, null, null);
    }

    @Override // defpackage.mch
    public final mcg b(mcc mccVar) {
        return new mby(this, mccVar);
    }
}
