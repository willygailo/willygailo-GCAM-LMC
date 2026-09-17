package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class etb implements iho {
    private final qkg a;

    public etb(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ojc ojcVarA = ((cjc) this.a).a();
        if (ojcVarA.g()) {
            ((etc) ojcVarA.c()).a();
        }
    }
}
