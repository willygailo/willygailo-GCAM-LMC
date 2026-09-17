package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ach {
    public static final ThreadLocal a = new ThreadLocal();
    public final xf b = new xf();
    final ArrayList c = new ArrayList();
    public final acd d = new acd(this);
    public final Runnable e = new Runnable() { // from class: acc
        @Override // java.lang.Runnable
        public final void run() {
            acd acdVar = this.a.d;
            acdVar.a.f = SystemClock.uptimeMillis();
            ach achVar = acdVar.a;
            long j = achVar.f;
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < achVar.c.size(); i++) {
                ace aceVar = (ace) achVar.c.get(i);
                if (aceVar != null) {
                    Long l = (Long) achVar.b.get(aceVar);
                    if (l == null) {
                        aceVar.a(j);
                    } else if (l.longValue() < jUptimeMillis) {
                        achVar.b.remove(aceVar);
                        aceVar.a(j);
                    }
                }
            }
            if (achVar.g) {
                for (int size = achVar.c.size() - 1; size >= 0; size--) {
                    if (achVar.c.get(size) == null) {
                        achVar.c.remove(size);
                    }
                }
                achVar.g = false;
            }
            if (acdVar.a.c.size() > 0) {
                ach achVar2 = acdVar.a;
                achVar2.h.a(achVar2.e);
            }
        }
    };
    long f = 0;
    public boolean g = false;
    public final acg h;

    public ach(acg acgVar) {
        this.h = acgVar;
    }

    public final boolean a() {
        return Thread.currentThread() == this.h.a.getThread();
    }
}
