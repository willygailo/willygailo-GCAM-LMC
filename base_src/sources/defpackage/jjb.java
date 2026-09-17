package defpackage;

import android.app.NotificationManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class jjb implements jjd {
    private static final ouj a = ouj.h("com/google/android/apps/camera/ui/screenon/DnDRingtoneController");
    private final ScheduledExecutorService b;
    private final NotificationManager c;
    private final Object d = new Object();
    private boolean e;
    private NotificationManager.Policy f;
    private NotificationManager.Policy g;
    private ScheduledFuture h;

    public jjb(ScheduledExecutorService scheduledExecutorService, NotificationManager notificationManager) {
        this.b = scheduledExecutorService;
        this.c = notificationManager;
    }

    @Override // defpackage.jjd
    public final void a() {
        synchronized (this.d) {
            if (this.e) {
                return;
            }
            if (this.c.getCurrentInterruptionFilter() == 1) {
                try {
                    this.f = this.c.getNotificationPolicy();
                    this.c.setNotificationPolicy(new NotificationManager.Policy(192, 0, 0, 0));
                    this.g = this.c.getNotificationPolicy();
                    this.c.setInterruptionFilter(2);
                    this.h = this.b.schedule(isd.i, 100L, TimeUnit.MILLISECONDS);
                    this.e = true;
                } catch (SecurityException e) {
                    ((oug) ((oug) ((oug) a.b()).h(e)).G(3404)).o("Error");
                }
            } else {
                this.e = false;
            }
        }
    }

    @Override // defpackage.jjd
    public final void b() {
    }

    @Override // defpackage.jjd
    public final void c() {
    }

    @Override // defpackage.jjd
    public final void d() {
        synchronized (this.d) {
            ScheduledFuture scheduledFuture = this.h;
            if (scheduledFuture != null) {
                try {
                    scheduledFuture.get(100L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((oug) ((oug) ((oug) a.b()).h(e)).G(3408)).o("Error");
                }
            }
            if (this.e) {
                NotificationManager.Policy notificationPolicy = this.c.getNotificationPolicy();
                NotificationManager.Policy policy = this.g;
                policy.getClass();
                if (notificationPolicy.equals(policy) && this.c.getCurrentInterruptionFilter() == 2) {
                    try {
                        this.c.setInterruptionFilter(1);
                        NotificationManager notificationManager = this.c;
                        NotificationManager.Policy policy2 = this.f;
                        policy2.getClass();
                        notificationManager.setNotificationPolicy(policy2);
                        this.e = false;
                    } catch (SecurityException e2) {
                        ((oug) ((oug) ((oug) a.b()).h(e2)).G(3406)).o("Error");
                    }
                }
            }
        }
    }
}
