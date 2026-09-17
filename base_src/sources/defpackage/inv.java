package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class inv implements Runnable {
    final /* synthetic */ inx a;
    private final /* synthetic */ int b;

    public inv(inx inxVar, int i) {
        this.b = i;
        this.a = inxVar;
    }

    public /* synthetic */ inv(inx inxVar, int i, byte[] bArr) {
        this.b = i;
        this.a = inxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ScheduledFuture scheduledFuture = this.a.s;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledFuture scheduledFuture2 = this.a.r;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                }
                this.a.b(true, true);
                this.a.t.o(null);
                break;
            default:
                inx inxVar = this.a;
                inxVar.j.a(inxVar.m);
                break;
        }
    }
}
