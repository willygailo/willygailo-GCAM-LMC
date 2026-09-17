package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lje implements AutoCloseable {
    private final ljf a;

    public lje(ljf ljfVar, String str) {
        this.a = ljfVar;
        ljfVar.e(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.f();
    }
}
