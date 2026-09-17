package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class arr implements Runnable {
    private final aof a;
    private final String b;
    private final gg c;

    public arr(aof aofVar, String str, gg ggVar, byte[] bArr) {
        this.a = aofVar;
        this.b = str;
        this.c = ggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.g(this.b);
    }
}
