package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class aeh extends Service implements aee {
    private final aet a = new aet(this);

    @Override // defpackage.aee
    public final aeb C() {
        return this.a.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.a.a(adz.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.a(adz.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        aet aetVar = this.a;
        aetVar.a(adz.ON_STOP);
        aetVar.a(adz.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.a(adz.ON_START);
        super.onStart(intent, i);
    }
}
