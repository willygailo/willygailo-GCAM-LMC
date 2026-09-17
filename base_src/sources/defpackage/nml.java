package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nml implements Callable {
    private final /* synthetic */ qmj a;

    public nml(qmj qmjVar) {
        this.a = qmjVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}
