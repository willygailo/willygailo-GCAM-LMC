package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class qiw extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final String a;
    final int b;
    final boolean c;

    public qiw(String str) {
        this(str, 5, false);
    }

    public qiw(String str, int i) {
        this(str, i, false);
    }

    public qiw(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread qivVar = this.c ? new qiv(runnable, str) : new Thread(runnable, str);
        qivVar.setPriority(this.b);
        qivVar.setDaemon(true);
        return qivVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17);
        sb.append("RxThreadFactory[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
