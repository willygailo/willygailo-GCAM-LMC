package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqc implements lie {
    public final /* synthetic */ Future a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqc(Future future, int i) {
        this.b = i;
        this.a = future;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                this.a.cancel(true);
                break;
            case 1:
                this.a.cancel(false);
                break;
            default:
                this.a.cancel(false);
                break;
        }
    }
}
