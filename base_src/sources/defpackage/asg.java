package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class asg {
    static final asg a = new asg(null, null);
    final Runnable b;
    final Executor c;
    asg d;

    public asg(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
