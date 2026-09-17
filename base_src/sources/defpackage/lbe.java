package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class lbe implements ThreadFactory {
    final /* synthetic */ lbd a;
    final /* synthetic */ boolean b;
    private final AtomicInteger c = new AtomicInteger(0);

    public lbe(lbd lbdVar, boolean z) {
        this.a = lbdVar;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String string;
        String strValueOf = String.valueOf(this.a.b);
        if (this.b) {
            string = "";
        } else {
            int iIncrementAndGet = this.c.incrementAndGet();
            StringBuilder sb = new StringBuilder(12);
            sb.append("-");
            sb.append(iIncrementAndGet);
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        return new lab(this.a.c, runnable, strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }
}
