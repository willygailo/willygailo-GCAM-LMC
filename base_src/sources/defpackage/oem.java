package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class oem {
    protected final Set a;
    private final IntentFilter b;
    private final Context c;
    private oel d;
    private volatile boolean e;

    public oem(Context context) {
        new oxk("AppUpdateListenerRegistry", null);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.a = new HashSet();
        this.d = null;
        this.e = false;
        this.b = intentFilter;
        this.c = ohh.f(context);
    }

    private final void d() {
        oel oelVar;
        if (!this.a.isEmpty() && this.d == null) {
            oel oelVar2 = new oel(this);
            this.d = oelVar2;
            this.c.registerReceiver(oelVar2, this.b);
        }
        if (!this.a.isEmpty() || (oelVar = this.d) == null) {
            return;
        }
        this.c.unregisterReceiver(oelVar);
        this.d = null;
    }

    public final synchronized void a(Object obj) {
        for (jta jtaVar : new HashSet(this.a)) {
            int i = ((oei) obj).a;
            if (i == 2) {
                long j = ((oei) obj).c;
                jtaVar.a.c.s(j != 0 ? (int) ((((oei) obj).b * 100) / j) : 0);
            } else if (i == 11) {
                jtaVar.a.b.c(jtaVar);
                jtaVar.a.c.r();
            } else if (i == 6 || i == 5) {
                ((oug) ((oug) jtb.a.c()).G(3502)).p("Update failed. Error code: %s", ((oei) obj).d);
                jtaVar.a.b.c(jtaVar);
                jtaVar.a.c.y(4, ((oei) obj).d);
            }
        }
    }

    public final synchronized void b(jta jtaVar) {
        this.a.add(jtaVar);
        d();
    }

    public final synchronized void c(jta jtaVar) {
        this.a.remove(jtaVar);
        d();
    }
}
