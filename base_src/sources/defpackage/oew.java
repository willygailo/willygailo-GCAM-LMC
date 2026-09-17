package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class oew {
    private static final Map l = new HashMap();
    public final Context a;
    public boolean e;
    public final Intent f;
    public ServiceConnection i;
    public IInterface j;
    public final oxk k;
    public final List b = new ArrayList();
    public final Set c = new HashSet();
    public final Object d = new Object();
    public final IBinder.DeathRecipient h = new IBinder.DeathRecipient() { // from class: oeo
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            oew oewVar = this.a;
            oes oesVar = (oes) oewVar.g.get();
            if (oesVar != null) {
                oesVar.a();
            } else {
                Iterator it = oewVar.b.iterator();
                while (it.hasNext()) {
                    ((oen) it.next()).b(oewVar.a());
                }
                oewVar.b.clear();
            }
            oewVar.c();
        }
    };
    private final AtomicInteger n = new AtomicInteger(0);
    private final String m = "AppUpdateService";
    public final WeakReference g = new WeakReference(null);

    public oew(Context context, oxk oxkVar, Intent intent, byte[] bArr) {
        this.a = context;
        this.k = oxkVar;
        this.f = intent;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.m).concat(" : Binder has died."));
    }

    public final void b(oen oenVar, ofi ofiVar) {
        synchronized (this.d) {
            this.c.add(ofiVar);
            off offVar = ofiVar.a;
            oep oepVar = new oep(this, ofiVar);
            offVar.b.a(new oez(ofl.a, oepVar));
            offVar.a();
        }
        synchronized (this.d) {
            this.n.getAndIncrement();
        }
        d(new oeq(this, oenVar.d, oenVar));
    }

    public final void c() {
        synchronized (this.d) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ofi) it.next()).a(a());
            }
            this.c.clear();
        }
    }

    public final void d(oen oenVar) {
        Handler handler;
        Map map = l;
        synchronized (map) {
            if (!map.containsKey(this.m)) {
                HandlerThread handlerThread = new HandlerThread(this.m, 10);
                handlerThread.start();
                map.put(this.m, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.m);
        }
        handler.post(oenVar);
    }

    public final void e(ofi ofiVar) {
        synchronized (this.d) {
            this.c.remove(ofiVar);
        }
        synchronized (this.d) {
            if (this.n.decrementAndGet() > 0) {
                return;
            }
            d(new oer(this));
        }
    }
}
