package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ngd implements Callable {
    private final /* synthetic */ int d;
    public static final /* synthetic */ ngd c = new ngd(2);
    public static final /* synthetic */ ngd b = new ngd(1);
    public static final /* synthetic */ ngd a = new ngd(0);

    public /* synthetic */ ngd(int i) {
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case 0:
                return null;
            case 1:
                return bxg.f;
            case 2:
            default:
                return null;
        }
    }
}
