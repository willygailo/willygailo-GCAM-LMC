package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class nbb implements Comparable {
    final qyd a;
    final File b;
    final nbb c;
    final int d;
    final boolean e;
    final String f;
    long g;

    public nbb(nbb nbbVar, boolean z, String str) {
        this.g = 0L;
        this.a = nbbVar.a;
        this.b = nbbVar.b;
        this.c = nbbVar;
        this.d = nbbVar.d + 1;
        this.e = z;
        if (nbbVar.d != 0) {
            String str2 = nbbVar.f;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append('/');
            sb.append(str);
            str = sb.toString();
        }
        this.f = str;
    }

    public nbb(qyd qydVar, File file) {
        this.g = 0L;
        this.a = qydVar;
        this.b = file;
        this.c = null;
        this.d = 0;
        this.e = true;
        this.f = "";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nbb nbbVar = (nbb) obj;
        int i = this.d;
        int i2 = nbbVar.d;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        boolean z = this.e;
        if (z != nbbVar.e) {
            return !z ? 1 : -1;
        }
        return this.f.compareTo(nbbVar.f);
    }
}
