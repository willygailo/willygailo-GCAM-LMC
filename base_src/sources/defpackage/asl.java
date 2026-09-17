package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class asl implements pht {
    static final asc b;
    public static final Object c;
    volatile Object d;
    volatile asg e;
    volatile ask f;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger g = Logger.getLogger(asl.class.getName());

    static {
        asc asjVar;
        try {
            asjVar = new ash(AtomicReferenceFieldUpdater.newUpdater(ask.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ask.class, ask.class, "c"), AtomicReferenceFieldUpdater.newUpdater(asl.class, ask.class, "f"), AtomicReferenceFieldUpdater.newUpdater(asl.class, asg.class, "e"), AtomicReferenceFieldUpdater.newUpdater(asl.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            asjVar = new asj();
        }
        b = asjVar;
        if (th != null) {
            g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        c = new Object();
    }

    protected asl() {
    }

    static Object a(pht phtVar) {
        if (phtVar instanceof asl) {
            Object obj = ((asl) phtVar).d;
            if (!(obj instanceof asd)) {
                return obj;
            }
            asd asdVar = (asd) obj;
            if (!asdVar.c) {
                return obj;
            }
            Throwable th = asdVar.d;
            return th != null ? new asd(false, th) : asd.b;
        }
        boolean zIsCancelled = phtVar.isCancelled();
        if ((!a) && zIsCancelled) {
            return asd.b;
        }
        try {
            Object objI = i(phtVar);
            return objI == null ? c : objI;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new asd(false, e);
            }
            return new asf(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + phtVar, e));
        } catch (ExecutionException e2) {
            return new asf(e2.getCause());
        } catch (Throwable th2) {
            return new asf(th2);
        }
    }

    static void b(asl aslVar) {
        asg asgVar;
        asg asgVar2;
        asg asgVar3 = null;
        while (true) {
            ask askVar = aslVar.f;
            if (b.e(aslVar, askVar, ask.a)) {
                while (askVar != null) {
                    Thread thread = askVar.b;
                    if (thread != null) {
                        askVar.b = null;
                        LockSupport.unpark(thread);
                    }
                    askVar = askVar.c;
                }
                do {
                    asgVar = aslVar.e;
                } while (!b.c(aslVar, asgVar, asg.a));
                while (true) {
                    asgVar2 = asgVar3;
                    asgVar3 = asgVar;
                    if (asgVar3 == null) {
                        break;
                    }
                    asgVar = asgVar3.d;
                    asgVar3.d = asgVar2;
                }
                while (asgVar2 != null) {
                    asgVar3 = asgVar2.d;
                    Runnable runnable = asgVar2.b;
                    if (runnable instanceof asi) {
                        asi asiVar = (asi) runnable;
                        aslVar = asiVar.a;
                        if (aslVar.d == asiVar) {
                            if (b.d(aslVar, asiVar, a(asiVar.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        l(runnable, asgVar2.c);
                    }
                    asgVar2 = asgVar3;
                }
                return;
            }
        }
    }

    static void c(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    public static asl h() {
        return new asl();
    }

    private static Object i(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
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

    private final String j(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void k(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(j(objI));
            sb.append("]");
        } catch (CancellationException e) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    private final void m(ask askVar) {
        askVar.b = null;
        while (true) {
            ask askVar2 = this.f;
            if (askVar2 != ask.a) {
                ask askVar3 = null;
                while (askVar2 != null) {
                    ask askVar4 = askVar2.c;
                    if (askVar2.b != null) {
                        askVar3 = askVar2;
                    } else if (askVar3 != null) {
                        askVar3.c = askVar4;
                        if (askVar3.b == null) {
                        }
                    } else if (!b.e(this, askVar2, askVar4)) {
                    }
                    askVar2 = askVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object n(Object obj) throws ExecutionException {
        if (obj instanceof asd) {
            Throwable th = ((asd) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof asf) {
            throw new ExecutionException(((asf) obj).b);
        }
        if (obj == c) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        asd asdVar;
        Object obj = this.d;
        if (!(obj == null) && !(obj instanceof asi)) {
            return false;
        }
        if (a) {
            asdVar = new asd(z, new CancellationException("Future.cancel() was called."));
        } else {
            asdVar = z ? asd.a : asd.b;
        }
        boolean z2 = false;
        pht phtVar = this;
        while (true) {
            asl aslVar = (asl) phtVar;
            if (b.d(aslVar, obj, asdVar)) {
                b(aslVar);
                if (obj instanceof asi) {
                    phtVar = ((asi) obj).b;
                    if (phtVar instanceof asl) {
                        obj = ((asl) phtVar).d;
                        if (!(obj == null) && !(obj instanceof asi)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        phtVar.cancel(z);
                    }
                }
                return true;
            }
            obj = aslVar.d;
            if (!(obj instanceof asi)) {
                return z2;
            }
        }
    }

    @Override // defpackage.pht
    public final void d(Runnable runnable, Executor executor) {
        c(runnable);
        c(executor);
        asg asgVar = this.e;
        if (asgVar != asg.a) {
            asg asgVar2 = new asg(runnable, executor);
            do {
                asgVar2.d = asgVar;
                if (b.c(this, asgVar, asgVar2)) {
                    return;
                } else {
                    asgVar = this.e;
                }
            } while (asgVar != asg.a);
        }
        l(runnable, executor);
    }

    public final void e(Object obj) {
        if (obj == null) {
            obj = c;
        }
        if (b.d(this, null, obj)) {
            b(this);
        }
    }

    public final void f(Throwable th) {
        c(th);
        if (b.d(this, null, new asf(th))) {
            b(this);
        }
    }

    public final void g(pht phtVar) {
        asf asfVar;
        c(phtVar);
        Object obj = this.d;
        if (obj == null) {
            if (phtVar.isDone()) {
                if (b.d(this, null, a(phtVar))) {
                    b(this);
                    return;
                }
                return;
            }
            asi asiVar = new asi(this, phtVar);
            if (b.d(this, null, asiVar)) {
                try {
                    phtVar.d(asiVar, asm.INSTANCE);
                    return;
                } catch (Throwable th) {
                    try {
                        asfVar = new asf(th);
                    } catch (Throwable th2) {
                        asfVar = asf.a;
                    }
                    b.d(this, asiVar, asfVar);
                    return;
                }
            }
            obj = this.d;
        }
        if (obj instanceof asd) {
            phtVar.cancel(((asd) obj).c);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.d;
        if ((obj2 != null) && (!(obj2 instanceof asi))) {
            return n(obj2);
        }
        ask askVar = this.f;
        if (askVar != ask.a) {
            ask askVar2 = new ask();
            do {
                askVar2.a(askVar);
                if (b.e(this, askVar, askVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m(askVar2);
                            throw new InterruptedException();
                        }
                        obj = this.d;
                    } while (!((obj != null) & (!(obj instanceof asi))));
                    return n(obj);
                }
                askVar = this.f;
            } while (askVar != ask.a);
        }
        return n(this.d);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof asi))) {
            return n(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ask askVar = this.f;
            if (askVar != ask.a) {
                ask askVar2 = new ask();
                while (true) {
                    askVar2.a(askVar);
                    if (b.e(this, askVar, askVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m(askVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if ((obj2 != null) && (!(obj2 instanceof asi))) {
                                return n(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m(askVar2);
                        break;
                    }
                    askVar = this.f;
                    if (askVar == ask.a) {
                    }
                }
            }
            return n(this.d);
        }
        while (nanos > 0) {
            Object obj3 = this.d;
            if ((obj3 != null) && (!(obj3 instanceof asi))) {
                return n(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof asd;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.d;
        return (!(obj instanceof asi)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            try {
                Object obj = this.d;
                if (obj instanceof asi) {
                    str = "setFuture=[" + j(((asi) obj).b) + "]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                k(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
