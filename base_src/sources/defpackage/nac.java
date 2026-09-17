package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* JADX INFO: loaded from: classes2.dex */
public final class nac implements mwi {
    private final int a;
    private final boolean b;
    private final ojc c;
    private final int d;

    public nac() {
    }

    public nac(int i, boolean z, ojc ojcVar) {
        this.d = 2;
        this.a = i;
        this.b = z;
        this.c = ojcVar;
    }

    @Override // defpackage.mwi
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nac)) {
            return false;
        }
        nac nacVar = (nac) obj;
        int i = this.d;
        int i2 = nacVar.d;
        if (i != 0) {
            return i == i2 && this.a == nacVar.a && this.b == nacVar.b && this.c.equals(nacVar.c);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        mwj.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * (-721379959)) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String strA = mwj.a(this.d);
        int i = this.a;
        String strValueOf = String.valueOf((Object) null);
        boolean z = this.b;
        String strValueOf2 = String.valueOf(this.c);
        int length = strA.length();
        int length2 = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + ScriptIntrinsicBLAS.NON_UNIT + length2 + String.valueOf(strValueOf2).length());
        sb.append("NetworkConfigurations{enablement=");
        sb.append(strA);
        sb.append(", batchSize=");
        sb.append(i);
        sb.append(", urlSanitizer=");
        sb.append(strValueOf);
        sb.append(", enableUrlAutoSanitization=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
