package defpackage;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class aqc implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Notification b;
    final /* synthetic */ SystemForegroundService c;

    public aqc(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.c = systemForegroundService;
        this.a = i;
        this.b = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.notify(this.a, this.b);
    }
}
