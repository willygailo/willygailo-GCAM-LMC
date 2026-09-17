package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxe {
    final int a;
    int b;
    int c;
    int d;
    long e;

    public cxe(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxe)) {
            return false;
        }
        cxe cxeVar = (cxe) obj;
        return this.a == cxeVar.a && this.b == cxeVar.b && this.c == cxeVar.c && this.d == cxeVar.d && this.e == cxeVar.e;
    }
}
