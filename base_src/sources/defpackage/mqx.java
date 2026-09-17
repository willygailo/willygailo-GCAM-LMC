package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mqx implements mqw {
    public int b;

    public mqx(int i) {
        this.b = i;
    }

    @Override // defpackage.mls
    public final mne a() {
        close();
        return mnd.a;
    }

    protected abstract void c();

    @Override // defpackage.mls, defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            c();
            this.b = 0;
        }
    }
}
