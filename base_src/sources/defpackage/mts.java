package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class mts implements mtu {
    private final AtomicReference a;
    private final moa b;
    private final mne c;

    public mts(Object obj) {
        moa moaVarI = moa.i();
        this.b = moaVarI;
        this.c = mne.i(moaVarI);
        obj.getClass();
        this.a = new AtomicReference(obj);
    }

    @Override // defpackage.mtu, defpackage.mls
    public final mne a() {
        Object objD = d();
        if (objD != null) {
            moa moaVar = this.b;
            ((mls) objD).a().c(pgr.INSTANCE, new mnj(moaVar), new mni(moaVar)).h(mmg.a);
        }
        return this.c;
    }

    @Override // defpackage.mtu
    public final Object c() {
        Object obj = this.a.get();
        if (obj != null) {
            return obj;
        }
        throw new mtx();
    }

    @Override // defpackage.mtu, defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mip.ac(a());
    }

    protected final Object d() {
        return this.a.getAndSet(null);
    }

    @Override // defpackage.mtu
    public final Object gx() {
        Object objD = d();
        if (objD == null) {
            throw new mtx();
        }
        this.b.k(mlt.a);
        mip.ac(this.c);
        return objD;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a.get());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 14);
        sb.append("single-owner[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
