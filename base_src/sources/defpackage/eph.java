package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class eph extends BroadcastReceiver {
    final /* synthetic */ epj a;

    public eph(epj epjVar) {
        this.a = epjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.apps.camera.remotecontrol.remotekey")) {
            return;
        }
        int intExtra = intent.getIntExtra("key_value", 0);
        boolean booleanExtra = intent.getBooleanExtra("key_down", false);
        switch (intExtra) {
            case 1:
                if (action.equals("com.google.android.apps.camera.remotecontrol.remotekey")) {
                    this.a.d.ak(3);
                }
                synchronized (this.a.e) {
                    Iterator it = this.a.b.iterator();
                    while (it.hasNext()) {
                        ((epi) it.next()).d(booleanExtra);
                    }
                    break;
                }
                break;
            case 2:
                if (booleanExtra) {
                    epj epjVar = this.a;
                    synchronized (epjVar.e) {
                        Iterator it2 = epjVar.b.iterator();
                        while (it2.hasNext()) {
                            ((epi) it2.next()).c();
                        }
                        break;
                    }
                }
                break;
            case 3:
                synchronized (this.a.e) {
                    Iterator it3 = this.a.b.iterator();
                    while (it3.hasNext()) {
                        ((epi) it3.next()).b(booleanExtra);
                    }
                    break;
                }
                break;
            case 4:
                synchronized (this.a.e) {
                    Iterator it4 = this.a.b.iterator();
                    while (it4.hasNext()) {
                        ((epi) it4.next()).b(booleanExtra);
                    }
                    break;
                }
                break;
            case 5:
                synchronized (this.a.e) {
                    Iterator it5 = this.a.b.iterator();
                    while (it5.hasNext()) {
                        ((epi) it5.next()).e(booleanExtra);
                    }
                    break;
                }
                break;
            case 6:
                synchronized (this.a.e) {
                    Iterator it6 = this.a.b.iterator();
                    while (it6.hasNext()) {
                        ((epi) it6.next()).f(booleanExtra);
                    }
                    break;
                }
                break;
            case 7:
                this.a.h(booleanExtra);
                break;
            default:
                ((oug) ((oug) epj.a.b()).G((char) 1337)).o("Unknown Key event received. Ignoring it.");
                break;
        }
        epj epjVar2 = this.a;
        synchronized (epjVar2.e) {
            Iterator it7 = epjVar2.c.iterator();
            while (it7.hasNext()) {
                ((jjg) it7.next()).a.a();
            }
        }
    }
}
