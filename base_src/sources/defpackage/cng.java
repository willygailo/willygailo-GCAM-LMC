package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.media.AudioManager;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class cng implements lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/media/audio/AudioDeviceBluetoothManagerImpl");
    public final Activity b;
    public final AudioManager c;
    public final lda f;
    public final lda g;
    public final lda h;
    public final lap d = new lap();
    public final Object e = new Object();
    public boolean i = false;
    public int l = 3;
    public int m = 1;
    public boolean j = false;
    public final BroadcastReceiver k = new cnf(this);

    public cng(Activity activity, AudioManager audioManager, lda ldaVar, lda ldaVar2, lda ldaVar3) {
        this.b = activity;
        this.c = audioManager;
        this.f = ldaVar;
        this.g = ldaVar2;
        this.h = ldaVar3;
    }

    public final void a(String str) {
        synchronized (this.e) {
            if (this.j) {
                ((oug) ((oug) a.c()).G(553)).o("Already closed. Ignore start()");
                return;
            }
            if (str.isEmpty()) {
                return;
            }
            int i = this.l;
            if (i == 0) {
                throw null;
            }
            if (i == 5) {
                return;
            }
            this.m = 5;
            if (i == 2) {
                ((oug) ((oug) a.c()).G(550)).o("Bluetooth audio is disconnecting, retry later");
            } else {
                SystemClock.uptimeMillis();
                this.c.startBluetoothSco();
            }
        }
    }

    public final void b() {
        synchronized (this.e) {
            int i = this.l;
            if (i == 0) {
                throw null;
            }
            if (i == 3) {
                return;
            }
            this.m = 3;
            if (i == 4) {
                ((oug) ((oug) a.c()).G(555)).o("Bluetooth audio is connecting, retry later");
            } else {
                this.l = 2;
                this.c.stopBluetoothSco();
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (this.j) {
                ((oug) ((oug) a.c()).G(545)).o("Already closed");
                return;
            }
            this.c.stopBluetoothSco();
            this.d.close();
            this.b.unregisterReceiver(this.k);
            this.j = true;
        }
    }
}
