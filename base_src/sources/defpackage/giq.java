package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class giq extends mip {
    public final ReentrantLock a;
    public final Condition b;
    public long c;
    private final TreeMap d;
    private long g;
    private final Set h;

    public giq() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.d = new TreeMap();
        this.c = -1L;
        this.g = -1L;
        this.h = new HashSet();
    }

    @Override // defpackage.mip
    public final void fJ(lmw lmwVar) {
        this.a.lock();
        try {
            long j = lmwVar.d;
            if (this.c < j) {
                this.c = j;
                this.g = lmwVar.b;
                this.b.signal();
                while (!this.d.isEmpty() && ((Long) this.d.firstKey()).longValue() >= this.c) {
                    Map.Entry entryPollFirstEntry = this.d.pollFirstEntry();
                    entryPollFirstEntry.getClass();
                    ((Runnable) entryPollFirstEntry.getValue()).run();
                }
                for (gip gipVar : this.h) {
                    long j2 = this.c;
                    long j3 = gipVar.a;
                    long j4 = gipVar.b;
                    if (j2 % 0 == 0) {
                        Runnable runnable = gipVar.c;
                        throw null;
                    }
                }
            }
            this.a.unlock();
        } catch (Throwable th) {
            this.a.unlock();
            throw th;
        }
    }

    public final long h() {
        this.a.lock();
        try {
            return this.g;
        } finally {
            this.a.unlock();
        }
    }
}
