package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fph implements Runnable {
    public final /* synthetic */ fpi a;
    public final /* synthetic */ Range b;
    private final /* synthetic */ int c;

    public /* synthetic */ fph(fpi fpiVar, Range range, int i) {
        this.c = i;
        this.a = fpiVar;
        this.b = range;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                this.a.c(this.b);
                break;
            default:
                this.a.c(this.b);
                break;
        }
    }
}
