package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.aeh;
import defpackage.aof;
import defpackage.apy;
import defpackage.apz;
import defpackage.aqa;
import defpackage.aqb;
import defpackage.aqc;
import defpackage.aqd;
import defpackage.arh;
import defpackage.kus;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends aeh implements apz {
    aqa a;
    public NotificationManager b;
    private Handler c;
    private boolean d;

    static {
        kus.g("SystemFgService");
    }

    private final void e() {
        this.c = new Handler(Looper.getMainLooper());
        this.b = (NotificationManager) getApplicationContext().getSystemService("notification");
        aqa aqaVar = new aqa(getApplicationContext());
        this.a = aqaVar;
        if (aqaVar.i == null) {
            aqaVar.i = this;
        } else {
            kus.l();
            kus.i(aqa.a, "A callback already exists.", new Throwable[0]);
        }
    }

    @Override // defpackage.apz
    public final void a(int i) {
        this.c.post(new aqd(this, i));
    }

    @Override // defpackage.apz
    public final void b(int i, Notification notification) {
        this.c.post(new aqc(this, i, notification));
    }

    @Override // defpackage.apz
    public final void c(int i, int i2, Notification notification) {
        this.c.post(new aqb(this, i, notification, i2));
    }

    @Override // defpackage.apz
    public final void d() {
        this.d = true;
        kus.l().h(new Throwable[0]);
        stopForeground(true);
        stopSelf();
    }

    @Override // defpackage.aeh, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.aeh, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            kus.l();
            kus.j(new Throwable[0]);
            this.a.d();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        aqa aqaVar = this.a;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            kus.l();
            String.format("Started foreground service %s", intent);
            kus.j(new Throwable[0]);
            aqaVar.j.a(new apy(aqaVar, aqaVar.b.d, intent.getStringExtra("KEY_WORKSPEC_ID")));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if (!"ACTION_CANCEL_WORK".equals(action)) {
                if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                    return 3;
                }
                kus.l();
                kus.j(new Throwable[0]);
                apz apzVar = aqaVar.i;
                if (apzVar == null) {
                    return 3;
                }
                apzVar.d();
                return 3;
            }
            kus.l();
            String.format("Stopping foreground work for %s", intent);
            kus.j(new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            aof aofVar = aqaVar.b;
            aofVar.i.a(new arh(aofVar, UUID.fromString(stringExtra)));
            return 3;
        }
        aqaVar.c(intent);
        return 3;
    }
}
