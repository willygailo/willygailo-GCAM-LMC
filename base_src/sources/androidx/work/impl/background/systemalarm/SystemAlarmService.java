package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import defpackage.aeh;
import defpackage.aov;
import defpackage.aox;
import defpackage.aru;
import defpackage.kus;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends aeh implements aov {
    private aox a;
    private boolean b;

    static {
        kus.g("SystemAlarmService");
    }

    private final void b() {
        aox aoxVar = new aox(this);
        this.a = aoxVar;
        if (aoxVar.i == null) {
            aoxVar.i = this;
        } else {
            kus.l();
            kus.i(aox.a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        }
    }

    @Override // defpackage.aov
    public final void a() {
        this.b = true;
        kus.l().h(new Throwable[0]);
        aru.b();
        stopSelf();
    }

    @Override // defpackage.aeh, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.b = false;
    }

    @Override // defpackage.aeh, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b = true;
        this.a.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            kus.l();
            kus.j(new Throwable[0]);
            this.a.c();
            b();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.a.f(intent, i2);
        return 3;
    }
}
