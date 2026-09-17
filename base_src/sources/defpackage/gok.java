package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gok implements goh {
    public final hsa a;
    private final lar b;
    private final Object c = new Object();
    private final nvb d = new nvb((byte[]) null, (byte[]) null, (byte[]) null);

    public gok(hsa hsaVar, lar larVar) {
        this.a = hsaVar;
        this.b = larVar;
    }

    @Override // defpackage.goh
    public final void a(jti jtiVar, float f) {
        synchronized (this.c) {
            this.b.execute(new goj(this, this.d.e(jtiVar, f)));
        }
    }
}
