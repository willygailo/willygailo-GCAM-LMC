package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class luc extends maa {
    boolean a;
    final /* synthetic */ lug b;
    private final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luc(lug lugVar, mad madVar, lmw lmwVar) {
        super(madVar);
        this.b = lugVar;
        this.a = false;
        lugVar.g.a.i.a(Integer.valueOf(madVar.c()), Integer.valueOf(madVar.b()), Integer.valueOf(madVar.a()));
        lugVar.h.b();
        this.c = lmwVar.b;
    }

    @Override // defpackage.maa, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b.g.a.j.a(Integer.valueOf(c()), Integer.valueOf(b()), Integer.valueOf(a()));
            this.b.h.a();
            super.close();
            this.b.b();
        }
    }

    @Override // defpackage.maa, defpackage.mad
    public final long d() {
        return this.c;
    }
}
