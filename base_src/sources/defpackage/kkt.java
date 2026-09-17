package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class kkt {
    public volatile Object a;
    public volatile kkr b;
    private final Executor c;

    public kkt(Looper looper, Object obj, String str) {
        this.c = new kvn(looper, 1);
        this.a = obj;
        mip.ds(str);
        this.b = new kkr(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(final kks kksVar) {
        mip.du(kksVar, "Notifier must not be null");
        this.c.execute(new Runnable() { // from class: kkq
            @Override // java.lang.Runnable
            public final void run() {
                kkt kktVar = this.a;
                kks kksVar2 = kksVar;
                Object obj = kktVar.a;
                if (obj == null) {
                    kksVar2.b();
                    return;
                }
                try {
                    kksVar2.a(obj);
                } catch (RuntimeException e) {
                    kksVar2.b();
                    throw e;
                }
            }
        });
    }
}
