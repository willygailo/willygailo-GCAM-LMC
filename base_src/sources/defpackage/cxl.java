package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxl {
    public final String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;

    public cxl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxl)) {
            return false;
        }
        cxl cxlVar = (cxl) obj;
        return this.a.equals(cxlVar.a) && this.d == cxlVar.d && this.e == cxlVar.e && this.c == cxlVar.c && this.b == cxlVar.b && this.f == cxlVar.f && this.g == cxlVar.g;
    }
}
