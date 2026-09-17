package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class mms implements Runnable {
    final /* synthetic */ mmt a;
    final /* synthetic */ mmv b;

    public mms(mmt mmtVar, mmv mmvVar) {
        this.a = mmtVar;
        this.b = mmvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        moa moaVar = this.a.a;
        mmv mmvVar = this.b;
        mmvVar.b = true;
        while (mmvVar.b) {
            try {
                Runnable runnable = (Runnable) mmvVar.a.take();
                if (runnable != null) {
                    runnable.run();
                }
            } catch (InterruptedException e) {
                String strValueOf = String.valueOf(Thread.currentThread());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
                sb.append("Event loop on ");
                sb.append(strValueOf);
                sb.append(" interrupted.");
                Log.w("BlockingEventLoop", sb.toString());
            }
        }
        ArrayList arrayList = new ArrayList(mmvVar.a.size());
        mmvVar.a.drainTo(arrayList);
        moaVar.k(arrayList);
    }
}
