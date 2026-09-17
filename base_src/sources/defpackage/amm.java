package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class amm {
    public final Uri a;
    public final boolean b;

    public amm(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        amm ammVar = (amm) obj;
        return this.b == ammVar.b && this.a.equals(ammVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }
}
