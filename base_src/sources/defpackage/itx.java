package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class itx implements lie {
    public final dvp a;
    private final dyx b;
    private final dvx c;

    public itx(dyx dyxVar, dvx dvxVar, dvp dvpVar) {
        this.b = dyxVar;
        this.c = dvxVar;
        this.a = dvpVar;
        dvxVar.h("tracking-meta");
    }

    public final synchronized void a() {
        this.b.c();
    }

    public final synchronized boolean b(lig ligVar, long j) {
        lig ligVar2 = new lig(ligVar.a, ligVar.b);
        if (!this.b.e()) {
            this.b.f(ligVar2, "trk-gyro-session");
        }
        if (!this.b.e()) {
            return false;
        }
        this.b.b(j, this.a.a(j));
        return true;
    }

    public final synchronized float[] c(long j) {
        if (this.b.e()) {
            return ((mou) this.b.b(j, this.a.a(j)).get(0)).d();
        }
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.i("tracking-meta");
    }
}
