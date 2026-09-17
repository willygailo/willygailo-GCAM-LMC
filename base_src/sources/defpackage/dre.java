package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dre implements drf {
    final /* synthetic */ long a;
    private long b;

    public dre(long j) {
        this.a = j;
        this.b = j;
    }

    @Override // defpackage.drf
    public final long a() {
        return this.b;
    }

    @Override // defpackage.drf
    public final boolean b() {
        long j = this.b;
        long jMin = j >= 1 ? Math.min(j + 1, Long.MAX_VALUE) : 1L;
        if (jMin <= this.b) {
            return false;
        }
        this.b = jMin;
        return true;
    }

    @Override // defpackage.drf
    public final boolean c() {
        long jMax = Math.max(this.b - 1, 1L);
        if (jMax >= this.b) {
            return false;
        }
        this.b = jMax;
        return true;
    }
}
