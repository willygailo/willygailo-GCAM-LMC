package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pfx extends pir implements pht {
    private static final Logger a;
    private static final Object b;
    public static final boolean d;
    public static final pfk e;
    public volatile pfo listeners;
    public volatile Object value;
    public volatile pfw waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        pfk pfrVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e2) {
            z = false;
        }
        d = z;
        a = Logger.getLogger(pfx.class.getName());
        try {
            pfrVar = new pfv();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th = null;
                th2 = th3;
                pfrVar = new pfp(AtomicReferenceFieldUpdater.newUpdater(pfw.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(pfw.class, pfw.class, "next"), AtomicReferenceFieldUpdater.newUpdater(pfx.class, pfw.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(pfx.class, pfo.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(pfx.class, Object.class, "value"));
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                pfrVar = new pfr();
            }
        }
        e = pfrVar;
        if (th != null) {
            Logger logger = a;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        b = new Object();
    }

    protected pfx() {
    }

    private static Object f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void g(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            if (objF == null) {
                sb.append("null");
            } else if (objF == this) {
                sb.append("this future");
            } else {
                sb.append(objF.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objF)));
            }
            sb.append("]");
        } catch (CancellationException e2) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    private final void h(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof pfq) {
            sb.append(", setFuture=[");
            i(sb, ((pfq) obj).b);
            sb.append("]");
        } else {
            try {
                string = ga();
                if (true == oje.d(string)) {
                    string = null;
                }
            } catch (RuntimeException | StackOverflowError e2) {
                String strValueOf = String.valueOf(e2.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(strValueOf);
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            g(sb);
        }
    }

    private final void i(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(pht phtVar) {
        Throwable thK;
        if (phtVar instanceof pfs) {
            Object pflVar = ((pfx) phtVar).value;
            if (pflVar instanceof pfl) {
                pfl pflVar2 = (pfl) pflVar;
                if (pflVar2.c) {
                    Throwable th = pflVar2.d;
                    pflVar = th != null ? new pfl(false, th) : pfl.b;
                }
            }
            pflVar.getClass();
            return pflVar;
        }
        if ((phtVar instanceof pir) && (thK = ((pir) phtVar).k()) != null) {
            return new pfn(thK);
        }
        boolean zIsCancelled = phtVar.isCancelled();
        if ((!d) && zIsCancelled) {
            pfl pflVar3 = pfl.b;
            pflVar3.getClass();
            return pflVar3;
        }
        try {
            Object objF = f(phtVar);
            if (!zIsCancelled) {
                return objF == null ? b : objF;
            }
            String strValueOf = String.valueOf(phtVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new pfl(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new pfl(false, e2);
            }
            String strValueOf2 = String.valueOf(phtVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new pfn(new IllegalArgumentException(sb2.toString(), e2));
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new pfn(e3.getCause());
            }
            String strValueOf3 = String.valueOf(phtVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new pfl(false, new IllegalArgumentException(sb3.toString(), e3));
        } catch (Throwable th2) {
            return new pfn(th2);
        }
    }

    public static void l(pfx pfxVar) {
        pfo pfoVar;
        pfo pfoVar2;
        pfo pfoVar3 = null;
        while (true) {
            pfw pfwVar = pfxVar.waiters;
            if (e.e(pfxVar, pfwVar, pfw.a)) {
                while (pfwVar != null) {
                    Thread thread = pfwVar.thread;
                    if (thread != null) {
                        pfwVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    pfwVar = pfwVar.next;
                }
                pfxVar.c();
                do {
                    pfoVar = pfxVar.listeners;
                } while (!e.c(pfxVar, pfoVar, pfo.a));
                while (true) {
                    pfoVar2 = pfoVar3;
                    pfoVar3 = pfoVar;
                    if (pfoVar3 == null) {
                        break;
                    }
                    pfoVar = pfoVar3.next;
                    pfoVar3.next = pfoVar2;
                }
                while (pfoVar2 != null) {
                    pfoVar3 = pfoVar2.next;
                    Runnable runnable = pfoVar2.b;
                    runnable.getClass();
                    if (runnable instanceof pfq) {
                        pfq pfqVar = (pfq) runnable;
                        pfxVar = pfqVar.a;
                        if (pfxVar.value == pfqVar) {
                            if (e.d(pfxVar, pfqVar, j(pfqVar.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = pfoVar2.c;
                        executor.getClass();
                        q(runnable, executor);
                    }
                    pfoVar2 = pfoVar3;
                }
                return;
            }
        }
    }

    private static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57 + String.valueOf(strValueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e2);
        }
    }

    private final void r(pfw pfwVar) {
        pfwVar.thread = null;
        while (true) {
            pfw pfwVar2 = this.waiters;
            if (pfwVar2 != pfw.a) {
                pfw pfwVar3 = null;
                while (pfwVar2 != null) {
                    pfw pfwVar4 = pfwVar2.next;
                    if (pfwVar2.thread != null) {
                        pfwVar3 = pfwVar2;
                    } else if (pfwVar3 != null) {
                        pfwVar3.next = pfwVar4;
                        if (pfwVar3.thread == null) {
                        }
                    } else if (!e.e(this, pfwVar2, pfwVar4)) {
                    }
                    pfwVar2 = pfwVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object s(Object obj) throws ExecutionException {
        if (obj instanceof pfl) {
            Throwable th = ((pfl) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof pfn) {
            throw new ExecutionException(((pfn) obj).b);
        }
        if (obj == b) {
            return null;
        }
        return obj;
    }

    protected boolean a(Throwable th) {
        th.getClass();
        if (!e.d(this, null, new pfn(th))) {
            return false;
        }
        l(this);
        return true;
    }

    protected void c() {
    }

    public boolean cancel(boolean z) {
        pfl pflVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof pfq)) {
            return false;
        }
        if (d) {
            pflVar = new pfl(z, new CancellationException("Future.cancel() was called."));
        } else {
            pflVar = z ? pfl.a : pfl.b;
            pflVar.getClass();
        }
        boolean z2 = false;
        pfx pfxVar = this;
        while (true) {
            if (e.d(pfxVar, obj, pflVar)) {
                if (z) {
                    pfxVar.m();
                }
                l(pfxVar);
                if (obj instanceof pfq) {
                    pht phtVar = ((pfq) obj).b;
                    if (phtVar instanceof pfs) {
                        pfxVar = (pfx) phtVar;
                        obj = pfxVar.value;
                        if (!(obj == null) && !(obj instanceof pfq)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        phtVar.cancel(z);
                    }
                }
                return true;
            }
            obj = pfxVar.value;
            if (!(obj instanceof pfq)) {
                return z2;
            }
        }
    }

    @Override // defpackage.pht
    public void d(Runnable runnable, Executor executor) {
        pfo pfoVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (pfoVar = this.listeners) != pfo.a) {
            pfo pfoVar2 = new pfo(runnable, executor);
            do {
                pfoVar2.next = pfoVar;
                if (e.c(this, pfoVar, pfoVar2)) {
                    return;
                } else {
                    pfoVar = this.listeners;
                }
            } while (pfoVar != pfo.a);
        }
        q(runnable, executor);
    }

    protected boolean e(pht phtVar) {
        pfn pfnVar;
        phtVar.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (phtVar.isDone()) {
                if (!e.d(this, null, j(phtVar))) {
                    return false;
                }
                l(this);
                return true;
            }
            pfq pfqVar = new pfq(this, phtVar);
            if (e.d(this, null, pfqVar)) {
                try {
                    phtVar.d(pfqVar, pgr.INSTANCE);
                } catch (Throwable th) {
                    try {
                        pfnVar = new pfn(th);
                    } catch (Throwable th2) {
                        pfnVar = pfn.a;
                    }
                    e.d(this, pfqVar, pfnVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof pfl) {
            phtVar.cancel(((pfl) obj).c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String ga() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof pfq))) {
            return s(obj2);
        }
        pfw pfwVar = this.waiters;
        if (pfwVar != pfw.a) {
            pfw pfwVar2 = new pfw();
            do {
                pfwVar2.a(pfwVar);
                if (e.e(this, pfwVar, pfwVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            r(pfwVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof pfq))));
                    return s(obj);
                }
                pfwVar = this.waiters;
            } while (pfwVar != pfw.a);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return s(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof pfq))) {
            return s(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            pfw pfwVar = this.waiters;
            if (pfwVar != pfw.a) {
                pfw pfwVar2 = new pfw();
                while (true) {
                    pfwVar2.a(pfwVar);
                    if (e.e(this, pfwVar, pfwVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                r(pfwVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof pfq))) {
                                return s(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        r(pfwVar2);
                        break;
                    }
                    pfwVar = this.waiters;
                    if (pfwVar == pfw.a) {
                    }
                }
            }
            Object obj3 = this.value;
            obj3.getClass();
            return s(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof pfq))) {
                return s(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String string2 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string2).concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(strValueOf);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string3 = sb2.toString();
                if (z) {
                    string3 = String.valueOf(string3).concat(",");
                }
                strConcat = String.valueOf(string3).concat(" ");
            }
            if (z) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 33);
                sb3.append(strValueOf2);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string2 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string2).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 5 + String.valueOf(string).length());
        sb4.append(string2);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof pfl;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof pfq)) & (obj != null);
    }

    @Override // defpackage.pir
    public final Throwable k() {
        if (!(this instanceof pfs)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof pfn) {
            return ((pfn) obj).b;
        }
        return null;
    }

    protected void m() {
    }

    public final void n(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(p());
        }
    }

    protected boolean o(Object obj) {
        if (obj == null) {
            obj = b;
        }
        if (!e.d(this, null, obj)) {
            return false;
        }
        l(this);
        return true;
    }

    protected final boolean p() {
        Object obj = this.value;
        return (obj instanceof pfl) && ((pfl) obj).c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            g(sb);
        } else {
            h(sb);
        }
        sb.append("]");
        return sb.toString();
    }
}
