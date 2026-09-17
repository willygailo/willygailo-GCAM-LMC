package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class knk {
    private static knk b = null;
    private static final knl c = new knl(0, false, false, 0, 0);
    public knl a;

    private knk() {
    }

    public static synchronized knk a() {
        if (b == null) {
            b = new knk();
        }
        return b;
    }

    public final synchronized void b(knl knlVar) {
        try {
            if (knlVar == null) {
                this.a = c;
                return;
            }
            knl knlVar2 = this.a;
            if (knlVar2 == null || knlVar2.a < knlVar.a) {
                this.a = knlVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
