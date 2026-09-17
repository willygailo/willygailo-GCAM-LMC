package defpackage;

import android.app.job.JobScheduler;

/* JADX INFO: loaded from: classes.dex */
public final class emv implements pys {
    private final qkg a;

    public emv(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JobScheduler get() {
        JobScheduler jobScheduler = (JobScheduler) ((emr) this.a.get()).a(emr.l);
        qmd.ae(jobScheduler);
        return jobScheduler;
    }
}
