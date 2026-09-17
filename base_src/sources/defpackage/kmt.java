package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class kmt implements Handler.Callback {
    final /* synthetic */ kmr a;

    public kmt(kmr kmrVar) {
        this.a = kmrVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.a.c) {
                    kmq kmqVar = (kmq) message.obj;
                    kms kmsVar = (kms) this.a.c.get(kmqVar);
                    if (kmsVar != null && kmsVar.b()) {
                        if (kmsVar.c) {
                            kmsVar.g.e.removeMessages(1, kmsVar.e);
                            kmr kmrVar = kmsVar.g;
                            kmrVar.f.b(kmrVar.d, kmsVar);
                            kmsVar.c = false;
                            kmsVar.b = 2;
                        }
                        this.a.c.remove(kmqVar);
                    }
                    break;
                }
                return true;
            case 1:
                synchronized (this.a.c) {
                    kmq kmqVar2 = (kmq) message.obj;
                    kms kmsVar2 = (kms) this.a.c.get(kmqVar2);
                    if (kmsVar2 != null && kmsVar2.b == 3) {
                        String strValueOf = String.valueOf(kmqVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(strValueOf);
                        Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName componentName = kmsVar2.f;
                        if (componentName == null) {
                            componentName = null;
                        }
                        if (componentName == null) {
                            componentName = new ComponentName(kmqVar2.c, "unknown");
                        }
                        kmsVar2.onServiceDisconnected(componentName);
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
