package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class nej extends ner {
    public nej(nep nepVar, String str, Long l, boolean z) {
        super(nepVar, str, l, z);
    }

    @Override // defpackage.ner
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException e) {
            String strF = super.f();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(strF);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
