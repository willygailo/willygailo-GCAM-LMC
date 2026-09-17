package defpackage;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
final class fdc extends AsyncTask {
    final /* synthetic */ fdj a;

    public fdc(fdj fdjVar) {
        this.a = fdjVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        awl awlVar;
        fdj fdjVar = this.a;
        if (fdjVar.s && (awlVar = fdjVar.c.b) != null) {
            awlVar.q(fdjVar.H, null);
            awlVar.p(this.a.H, null);
            fdj fdjVar2 = this.a;
            fdjVar2.i = (float) (Math.asin(-fdjVar2.g.f()[6]) * 57.29577951308232d);
            fdj fdjVar3 = this.a;
            if (fdjVar3.n == 0) {
                fdjVar3.h = fdjVar3.i;
            }
            double dAbs = Math.abs(fdjVar3.i - fdjVar3.h);
            if (this.a.v && (fcv.d(dAbs) || this.a.G)) {
                fdj fdjVar4 = this.a;
                fdjVar4.j = false;
                fdjVar4.k = 0;
                fdjVar4.l.drainPermits();
                for (int i = 0; i < 3; i++) {
                    fdj fdjVar5 = this.a;
                    if (fdjVar5.j) {
                        break;
                    }
                    awlVar.j(fdjVar5.H, new fdb(this, awlVar));
                    try {
                        this.a.l.acquire();
                    } catch (InterruptedException e) {
                    }
                }
            } else {
                this.a.d(awlVar);
            }
        }
        return null;
    }
}
