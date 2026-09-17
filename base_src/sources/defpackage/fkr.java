package defpackage;

import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class fkr extends CountDownTimer {
    int a;
    long b;
    final /* synthetic */ fks c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkr(fks fksVar) {
        super(2147483647L, 12000L);
        this.c = fksVar;
        this.a = 0;
        this.b = -1L;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        fks fksVar = this.c;
        fksVar.b.remove(fksVar.f);
        bro broVar = (bro) mip.bY(this.c.i);
        if (broVar != null) {
            broVar.c();
        }
        if (this.c.j.f()) {
            return;
        }
        this.c.j.e();
    }

    @Override // android.os.CountDownTimer
    public final synchronized void onTick(long j) {
        if (this.b == -1) {
            this.b = j;
            return;
        }
        fks fksVar = this.c;
        if (!fksVar.b.contains(fksVar.f) && this.b - j >= TimeUnit.SECONDS.toMillis(30L)) {
            fks fksVar2 = this.c;
            fksVar2.b.add(fksVar2.f);
            this.a = this.c.b.size() - 1;
        }
        final jgu jguVar = (jgu) this.c.b.get(this.a);
        int i = this.a + 1;
        this.a = i;
        this.a = i % this.c.b.size();
        this.c.a.execute(new Runnable() { // from class: fkq
            @Override // java.lang.Runnable
            public final void run() {
                fkr fkrVar = this.a;
                fkrVar.c.g(jguVar);
            }
        });
    }
}
