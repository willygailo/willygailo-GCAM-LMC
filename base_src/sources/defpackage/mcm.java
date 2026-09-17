package defpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

/* JADX INFO: loaded from: classes2.dex */
class mcm {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public final ReadWriteLock c = new StampedLock().asReadWriteLock();
    public final lis d;
    public final mip e;
    private mcd f;

    public mcm(mip mipVar, mcd mcdVar, lis lisVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = mipVar;
        this.f = mcdVar;
        this.d = lisVar.a("MediaMutex");
    }

    public final FileInputStream b() {
        this.c.readLock().lock();
        try {
            obr.aT(this.f.e(), "Unable to read from %s", this);
            return new mck(this, this.f.b());
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    public final FileOutputStream c() {
        return g();
    }

    public final void d() {
        this.c.writeLock().lock();
        try {
            this.f.d();
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final FileOutputStream g() {
        this.c.writeLock().lock();
        try {
            obr.aT(this.f.f(), "Unable to write to %s", this);
            obr.aT(true, "Unable to append to %s", this);
            return new mcl(this, this.f.g());
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    protected final synchronized mcd l() {
        return this.f;
    }

    final synchronized void m(mcd mcdVar) {
        boolean zIsAssignableFrom = this.f.getClass().isAssignableFrom(mcdVar.getClass());
        String strValueOf = String.valueOf(this.f.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 33);
        sb.append("The new delegate must be of type ");
        sb.append(strValueOf);
        obr.aG(zIsAssignableFrom, sb.toString());
        this.c.writeLock().lock();
        try {
            this.f = mcdVar;
            this.c.writeLock().unlock();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "<MediaMutex: %s>", this.f);
    }
}
