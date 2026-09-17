package defpackage;

import android.net.Uri;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* JADX INFO: loaded from: classes2.dex */
public final class njv {
    public final Uri a;
    public final pqm b;
    public final njo c;
    public final oom d;
    public final boolean e;
    public final boolean f;
    private final njy g;

    public njv() {
    }

    public njv(Uri uri, pqm pqmVar, njo njoVar, oom oomVar, njy njyVar, boolean z, boolean z2) {
        this.a = uri;
        this.b = pqmVar;
        this.c = njoVar;
        this.d = oomVar;
        this.g = njyVar;
        this.e = z;
        this.f = z2;
    }

    public static nju a() {
        nju njuVar = new nju();
        njuVar.b = njy.a;
        njuVar.c(nkt.a);
        njuVar.b();
        njuVar.a = true;
        return njuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof njv) {
            njv njvVar = (njv) obj;
            if (this.a.equals(njvVar.a) && this.b.equals(njvVar.b) && this.c.equals(njvVar.c) && obr.an(this.d, njvVar.d) && this.g.equals(njvVar.g) && this.e == njvVar.e && this.f == njvVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.g);
        boolean z = this.e;
        boolean z2 = this.f;
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        StringBuilder sb = new StringBuilder(length + ScriptIntrinsicBLAS.UNIT + length2 + length3 + length4 + String.valueOf(strValueOf5).length());
        sb.append("ProtoDataStoreConfig{uri=");
        sb.append(strValueOf);
        sb.append(", schema=");
        sb.append(strValueOf2);
        sb.append(", handler=");
        sb.append(strValueOf3);
        sb.append(", migrations=");
        sb.append(strValueOf4);
        sb.append(", variantConfig=");
        sb.append(strValueOf5);
        sb.append(", useGeneratedExtensionRegistry=");
        sb.append(z);
        sb.append(", enableTracing=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
