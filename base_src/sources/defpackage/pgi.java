package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
abstract class pgi extends pft {
    private static final Logger a = Logger.getLogger(pgi.class.getName());
    public static final pgf b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        pgf pghVar;
        Throwable th;
        try {
            pghVar = new pgg(AtomicReferenceFieldUpdater.newUpdater(pgi.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(pgi.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            pghVar = new pgh();
            th = th2;
        }
        b = pghVar;
        if (th != null) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public pgi(int i) {
        this.remaining = i;
    }

    public abstract void f(Set set);
}
