package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class igo implements phh {
    private final /* synthetic */ int a;

    public igo(int i) {
        this.a = i;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                ((oug) ((oug) ((oug) igq.a.b()).h(th)).G((char) 2892)).o("Failed to submit a task to the executor.");
                break;
            default:
                ((oug) ((oug) ((oug) cja.a.b()).h(th)).G((char) 433)).o("Failed to submit a task to the executor.");
                break;
        }
    }

    @Override // defpackage.phh
    public final void b(Object obj) {
        int i = this.a;
    }
}
