package defpackage;

import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;

/* JADX INFO: loaded from: classes2.dex */
public final class mhv {
    public final DLEngineApi a;
    public final String b;

    public mhv() {
    }

    public mhv(DLEngineApi dLEngineApi, String str) {
        if (dLEngineApi == null) {
            throw new NullPointerException("Null dlEngineApi");
        }
        this.a = dLEngineApi;
        if (str == null) {
            throw new NullPointerException("Null hostPackageName");
        }
        this.b = str;
    }

    public static mhv a(DLEngineApi dLEngineApi, String str) {
        return new mhv(dLEngineApi, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mhv) {
            mhv mhvVar = (mhv) obj;
            if (this.a.equals(mhvVar.a) && this.b.equals(mhvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47 + str.length());
        sb.append("EngineApiBundle{dlEngineApi=");
        sb.append(strValueOf);
        sb.append(", hostPackageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
