package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class aen extends aem {
    @Override // defpackage.aem
    public final void g(Object obj) {
        aem.a("setValue");
        this.h++;
        this.f = obj;
        b(null);
    }

    public final void h(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.g;
            obj3 = aem.a;
            this.g = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        ut utVarF = ut.f();
        Runnable runnable = this.i;
        hn hnVar = utVarF.b;
        uv uvVar = (uv) hnVar;
        if (uvVar.c == null) {
            synchronized (uvVar.a) {
                if (((uv) hnVar).c == null) {
                    ((uv) hnVar).c = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        uvVar.c.post(runnable);
    }
}
