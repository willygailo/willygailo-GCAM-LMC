package defpackage;

import android.app.Application;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class fip extends Application {
    protected static final long j;
    public final fhi k = new fhi();

    static {
        initVM();
        j = SystemClock.elapsedRealtimeNanos();
    }

    public static void initVM() {
    }

    @Override // android.app.Application
    public void onCreate() {
        fhi fhiVar = this.k;
        fhc fhcVar = fhc.c;
        fhiVar.f(fhcVar);
        fhiVar.d = fhcVar;
        super.onCreate();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        fhi fhiVar = this.k;
        fhiVar.a(fhiVar.d);
        for (fik fikVar : fhiVar.a) {
            if (fikVar instanceof fho) {
                ((fho) fikVar).a();
            }
        }
        super.onTerminate();
    }
}
