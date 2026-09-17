package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mmb implements mls {
    private final Object a = new Object();
    private volatile mne b = null;

    @Override // defpackage.mls
    public final mne a() {
        mne mneVarB = this.b;
        if (mneVarB == null) {
            synchronized (this.a) {
                mneVarB = this.b;
                if (mneVarB == null) {
                    mneVarB = b();
                    this.b = mneVarB;
                }
            }
        }
        return mneVarB;
    }

    protected abstract mne b();

    @Override // defpackage.mls, defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mne mneVar = this.b;
        if (mneVar == null) {
            synchronized (this.a) {
                mneVar = this.b;
                if (mneVar == null) {
                    gy();
                    mneVar = mnd.a;
                    this.b = mneVar;
                }
            }
        }
        mip.ac(mneVar);
    }

    protected abstract void gy();
}
