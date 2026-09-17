package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class glt implements Runnable {
    final /* synthetic */ Exception a;
    private final /* synthetic */ int b;

    public glt(Exception exc, int i) {
        this.b = i;
        this.a = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                throw new RuntimeException(this.a);
            default:
                throw new RuntimeException(this.a);
        }
    }
}
