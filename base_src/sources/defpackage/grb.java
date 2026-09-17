package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class grb implements lby, lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/one/smartmetering/LazySmartMeteringProcessor");
    public final ebe b;
    public final ojz c;
    public final Object d = new Object();
    public lwk e = null;
    public lzv f = null;
    public boolean g = false;

    public grb(ebe ebeVar, ojz ojzVar) {
        this.b = ebeVar;
        this.c = ojzVar;
    }

    public final synchronized ojc a() {
        ojc ojcVarH;
        synchronized (this.d) {
            lwk lwkVar = this.e;
            if (lwkVar != null) {
                ojcVarH = ojc.h(lwkVar.k());
                lwkVar.l();
            } else {
                ojcVarH = oih.a;
            }
        }
        return ojcVarH;
    }

    @Override // defpackage.lby
    public final String b() {
        return "LazySmartMeteringProcessor";
    }

    public final void c() {
        synchronized (this.d) {
            lwk lwkVar = this.e;
            if (lwkVar != null) {
                lwkVar.l();
                this.e = null;
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.g) {
                return;
            }
            this.g = true;
            lzv lzvVar = this.f;
            if (lzvVar != null) {
                this.b.w(this.b.a(lzvVar));
            }
            c();
            this.f = null;
        }
    }
}
