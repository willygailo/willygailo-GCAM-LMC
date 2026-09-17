package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class nek extends ner {
    public nek(nep nepVar, String str, Integer num) {
        super(nepVar, str, num, false);
    }

    @Override // defpackage.ner
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (NumberFormatException e) {
            String strF = super.f();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(strF).length() + 24 + str.length());
            sb.append("Invalid int value for ");
            sb.append(strF);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
