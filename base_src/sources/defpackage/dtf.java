package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dtf implements drf {
    public long a;
    final /* synthetic */ long b;
    final /* synthetic */ dtg c;

    public dtf(dtg dtgVar, long j) {
        this.c = dtgVar;
        this.b = j;
        this.a = j;
    }

    @Override // defpackage.drf
    public final long a() {
        return this.a;
    }

    @Override // defpackage.drf
    public final boolean b() {
        synchronized (this.c.a) {
            dtg dtgVar = this.c;
            long j = this.a;
            if (j != Long.MAX_VALUE) {
                j++;
            }
            int iD = dtgVar.d(j);
            if (iD < 0) {
                return false;
            }
            this.a = this.c.h(iD);
            return true;
        }
    }

    @Override // defpackage.drf
    public final boolean c() {
        synchronized (this.c.a) {
            dtg dtgVar = this.c;
            long j = this.a;
            if (j != Long.MIN_VALUE) {
                j--;
            }
            int iC = dtgVar.c(j);
            if (iC < 0) {
                return false;
            }
            this.a = this.c.h(iC);
            return true;
        }
    }
}
