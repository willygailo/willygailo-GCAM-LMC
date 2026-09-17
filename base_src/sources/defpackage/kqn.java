package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kqn implements Runnable {
    public final /* synthetic */ Throwable a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqn(Throwable th, int i) {
        this.b = i;
        this.a = th;
    }

    public kqn(Throwable th, int i, byte[] bArr) {
        this.b = i;
        this.a = th;
    }

    public kqn(Throwable th, int i, char[] cArr) {
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.b) {
            case 0:
                throw new piq(this.a);
            case 1:
                throw new RuntimeException(this.a);
            case 2:
                throw this.a;
            case 3:
                throw new laz(this.a);
            default:
                throw new RuntimeException(this.a);
        }
    }
}
