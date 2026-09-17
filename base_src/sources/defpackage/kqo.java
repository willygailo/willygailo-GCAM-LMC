package defpackage;

import android.app.job.JobParameters;

/* JADX INFO: loaded from: classes2.dex */
final class kqo implements phh {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ kqp b;

    public kqo(kqp kqpVar, JobParameters jobParameters) {
        this.b = kqpVar;
        this.a = jobParameters;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        if (th instanceof krb) {
            return;
        }
        kqp kqpVar = this.b;
        kqpVar.a(kqpVar.getApplicationContext()).c.execute(new kqn(th, 0));
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.jobFinished(this.a, false);
    }
}
