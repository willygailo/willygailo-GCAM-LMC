package defpackage;

import j$.util.function.Supplier;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class dzd implements Supplier {
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public ecb b = ecb.REGULAR;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;

    public dzd(ddf ddfVar) {
        float fFloatValue = ((Float) ddfVar.g(ddm.ac).c()).floatValue();
        this.c = fFloatValue;
        float fMax = Math.max(((Float) ddfVar.g(ddm.ad).c()).floatValue(), fFloatValue);
        this.d = fMax;
        float fFloatValue2 = ((Float) ddfVar.g(ddm.ae).c()).floatValue();
        this.e = fFloatValue2;
        this.f = Math.max(((Float) ddfVar.g(ddm.af).c()).floatValue(), fFloatValue2);
        this.g = Math.min(((Float) ddfVar.g(ddm.ag).c()).floatValue(), fMax);
    }

    @Override // j$.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        ReentrantReadWriteLock.ReadLock lock = this.a.readLock();
        lock.lock();
        try {
            ecb ecbVar = this.b;
            lock.unlock();
            return new dzc(ecbVar == ecb.PORTRAIT ? this.e : this.c, ecbVar == ecb.PORTRAIT ? this.f : this.d, this.g);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
