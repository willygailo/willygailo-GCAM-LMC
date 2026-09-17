package defpackage;

import android.os.AsyncTask;
import android.os.Process;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class cen extends AsyncTask {
    final /* synthetic */ ceo a;

    public cen(ceo ceoVar) {
        this.a = ceoVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Process.setThreadPriority(11);
        this.a.a.e("RemoveDeletedCacheTask");
        File[] fileArrListFiles = new File(((String[]) objArr)[0]).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                synchronized (this.a.b) {
                    if (file.isDirectory() && !this.a.b.contains(file.toString())) {
                        this.a.b(file);
                    }
                }
                if (isCancelled()) {
                    break;
                }
            }
        }
        this.a.a.f();
        return null;
    }
}
