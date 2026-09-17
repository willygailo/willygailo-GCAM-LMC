package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lua {
    public final long a;
    public volatile long b;

    public lua(long j, long j2) {
        this.b = j;
        this.a = j2;
    }

    public final boolean a(long j, long j2) {
        long j3 = this.b;
        long j4 = (j - j2) + j3;
        if (j4 == 0) {
            return true;
        }
        long j5 = this.a;
        if (j5 == 0 || j4 >= j5 || j4 <= (-j5)) {
            return false;
        }
        this.b = j3 - j4;
        return true;
    }

    public final boolean b(long j, long j2) {
        return ((j2 - j) - this.b) + this.a < 0;
    }
}
