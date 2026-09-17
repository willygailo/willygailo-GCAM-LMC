package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mug implements Callable {
    public final /* synthetic */ muh a;
    private final /* synthetic */ int b;

    public /* synthetic */ mug(muh muhVar, int i) {
        this.b = i;
        this.a = muhVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            default:
                this.a.a();
                break;
        }
        return null;
    }
}
