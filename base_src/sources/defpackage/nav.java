package defpackage;

import android.os.Process;
import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class nav {
    public static final nav a = new nav();
    public volatile boolean b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public volatile mul k;
    public final nau l = new nau();
    public final nan m = new nan();
    public final nan n = new nan();

    public static void a(String str, long j) {
        Trace.setCounter(str, j - Process.getStartElapsedRealtime());
        Trace.setCounter(str, 0L);
    }
}
