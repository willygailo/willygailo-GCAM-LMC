package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
abstract class it {
    private BroadcastReceiver a;
    final /* synthetic */ iy c;

    public it(iy iyVar) {
        this.c = iyVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.f.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
            }
            this.a = null;
        }
    }

    final void d() {
        c();
        IntentFilter intentFilterA = a();
        if (intentFilterA.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new is(this);
        }
        this.c.f.registerReceiver(this.a, intentFilterA);
    }
}
