package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qja {
    public static final boolean a;
    public static final int b;
    static final AtomicReference c = new AtomicReference();
    public static final Map d = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f A[LOOP:0: B:16:0x004f->B:23:0x007c, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c A[LOOP:0: B:16:0x004f->B:23:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[SYNTHETIC] */
    static {
        boolean z;
        AtomicReference atomicReference;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        Properties properties = System.getProperties();
        qiz qizVar = new qiz();
        if (properties.containsKey("rx2.purge-enabled")) {
            boolean z2 = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            qizVar.a = z2;
            if (!z2) {
                qizVar.b = 1;
            }
            z = qizVar.a;
            a = z;
            b = qizVar.b;
            if (z) {
                return;
            }
            while (true) {
                atomicReference = c;
                if (((ScheduledExecutorService) atomicReference.get()) != null) {
                    return;
                }
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new qiw("RxSchedulerPurge"));
                if (atomicReference.compareAndSet(null, scheduledExecutorServiceNewScheduledThreadPool)) {
                    oge ogeVar = new oge(7);
                    int i = b;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(ogeVar, i, i, TimeUnit.SECONDS);
                    return;
                }
                scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
            }
        } else {
            qizVar.a = true;
        }
        if (properties.containsKey("rx2.purge-period-seconds")) {
            try {
                qizVar.b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException e) {
                qizVar.b = 1;
            }
        } else {
            qizVar.b = 1;
        }
        z = qizVar.a;
        a = z;
        b = qizVar.b;
        if (z) {
            return;
        }
        while (true) {
            atomicReference = c;
            if (((ScheduledExecutorService) atomicReference.get()) != null) {
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new qiw("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(null, scheduledExecutorServiceNewScheduledThreadPool)) {
                oge ogeVar2 = new oge(7);
                int i2 = b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(ogeVar2, i2, i2, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }
}
