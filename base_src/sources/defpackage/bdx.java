package defpackage;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bdx {
    public String a;
    private final boolean b;
    private int c;
    private int d;
    private final ThreadFactory e = new bdz(0);

    public bdx(boolean z) {
        this.b = z;
    }

    public final bec a() {
        if (!TextUtils.isEmpty(this.a)) {
            return new bec(new ThreadPoolExecutor(this.c, this.d, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new beb(this.e, this.a, this.b)));
        }
        String strValueOf = String.valueOf(this.a);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Name must be non-null and non-empty, but given: ".concat(strValueOf) : new String("Name must be non-null and non-empty, but given: "));
    }

    public final void b(int i) {
        this.c = i;
        this.d = i;
    }
}
