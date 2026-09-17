package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lmw implements Comparable {
    public static final lmw a = new lmw(-1, -1, -1);
    public final long b;
    public final long c;
    public final long d;

    public lmw(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(lmw lmwVar) {
        return (this.d > lmwVar.d ? 1 : (this.d == lmwVar.d ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lmw)) {
            return false;
        }
        lmw lmwVar = (lmw) obj;
        return this.d == lmwVar.d && this.b == lmwVar.b && this.c == lmwVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.f("timestamp", this.b);
        ojbVarAZ.f("onStartedId", this.d);
        ojbVarAZ.f("frameNumber", this.c);
        return ojbVarAZ.toString();
    }
}
