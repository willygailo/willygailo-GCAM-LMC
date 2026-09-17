package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lbl {
    private final lar a;

    public lbl(lar larVar) {
        this.a = larVar;
    }

    public static void a(Throwable th) {
        new lbl(new lar()).b(th);
    }

    public final void b(Throwable th) {
        this.a.execute(new kqn(th, 4, (char[]) null));
    }
}
