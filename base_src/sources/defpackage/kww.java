package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class kww extends Service implements kwk, kwh {
    public kwq a;
    public Intent b;
    public boolean d;
    private ComponentName f;
    private IBinder g;
    private Looper h;
    public final Object c = new Object();
    public final kxg e = new kxg(new mip(), null, null, null, null, null);

    public void a(kyw kywVar) {
        throw null;
    }

    @Override // defpackage.kwh
    public final void b(kxi kxiVar) {
    }

    @Override // defpackage.kwh
    public final void c(kxi kxiVar) {
    }

    @Override // defpackage.kwh
    public final void d(kxi kxiVar) {
    }

    @Override // defpackage.kwh
    public final void e(kxi kxiVar) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.g;
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new ComponentName(this, getClass().getName());
        if (this.h == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.h = handlerThread.getLooper();
        }
        this.a = new kwq(this, this.h);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.b = intent;
        intent.setComponent(this.f);
        this.g = new kwv(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        synchronized (this.c) {
            this.d = true;
            kwq kwqVar = this.a;
            if (kwqVar == null) {
                String strValueOf = String.valueOf(this.f);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 111);
                sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            kwqVar.getLooper().quit();
            kwqVar.a();
        }
        super.onDestroy();
    }
}
