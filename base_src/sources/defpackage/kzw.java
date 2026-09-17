package defpackage;

import android.content.ContentResolver;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class kzw extends kzy {
    public kzw(String str, Boolean bool) {
        super(str, bool);
    }

    @Override // defpackage.kzy
    public final /* synthetic */ Object a() {
        boolean zBooleanValue;
        ContentResolver contentResolver = kzy.a;
        String str = this.b;
        boolean zBooleanValue2 = ((Boolean) this.c).booleanValue();
        Object objC = kzv.c(contentResolver);
        Boolean bool = (Boolean) kzv.b(kzv.g, str, Boolean.valueOf(zBooleanValue2));
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            String strF = kzv.f(contentResolver, str);
            if (strF != null && !strF.equals("")) {
                if (kzv.c.matcher(strF).matches()) {
                    bool = true;
                    zBooleanValue2 = true;
                } else if (kzv.d.matcher(strF).matches()) {
                    bool = false;
                    zBooleanValue2 = false;
                } else {
                    Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + strF + "\") as boolean");
                }
            }
            kzv.e(objC, kzv.g, str, bool);
            zBooleanValue = zBooleanValue2;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
