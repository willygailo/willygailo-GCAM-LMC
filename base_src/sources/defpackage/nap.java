package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nap implements Runnable {
    public final /* synthetic */ nat a;
    private final /* synthetic */ int b;

    public /* synthetic */ nap(nat natVar, int i) {
        this.b = i;
        this.a = natVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                nar.c(this.a);
                break;
            case 1:
                nar.b(this.a);
                break;
            case 2:
                nat natVar = this.a;
                myw.g();
                if (natVar.b.i == 0) {
                    natVar.b.i = SystemClock.elapsedRealtime();
                    natVar.b.l.j = true;
                    break;
                }
                break;
            default:
                nat natVar2 = this.a;
                myw.g();
                if (natVar2.b.h == 0) {
                    natVar2.b.h = SystemClock.elapsedRealtime();
                    natVar2.b.l.i = true;
                    break;
                }
                break;
        }
    }
}
