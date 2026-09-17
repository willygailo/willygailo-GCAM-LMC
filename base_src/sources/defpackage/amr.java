package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class amr extends ani {
    private static final String b = kus.g("DelegatingWkrFctry");
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.ani
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerA = ((ani) it.next()).a(context, str, workerParameters);
                if (listenableWorkerA != null) {
                    return listenableWorkerA;
                }
            } catch (Throwable th) {
                String str2 = String.format("Unable to instantiate a ListenableWorker (%s)", str);
                kus.l();
                kus.i(b, str2, th);
                throw th;
            }
        }
        return null;
    }
}
