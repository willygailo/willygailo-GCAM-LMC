package defpackage;

import android.app.job.JobParameters;

/* JADX INFO: loaded from: classes.dex */
final class cbx implements phh {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ cby b;

    public cbx(cby cbyVar, JobParameters jobParameters) {
        this.b = cbyVar;
        this.a = jobParameters;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            int i = cby.e;
        }
        this.b.jobFinished(this.a, false);
    }
}
