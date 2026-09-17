package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class mbl implements mbk {
    final mbg a;
    public final mcc b;
    final mxm c;

    public mbl(mbj mbjVar, mxm mxmVar, mbg mbgVar, byte[] bArr) {
        this.c = mxmVar;
        this.a = mbgVar;
        this.b = mbjVar.o;
    }

    @Override // defpackage.mbk
    public final mas a(mcc mccVar, String str, long j) {
        mbg mbgVar = this.a;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) mbgVar.a.get();
        scheduledExecutorService.getClass();
        Object obj = mbgVar.b.get();
        mbj mbjVarA = ((ikv) mbgVar.c).get();
        ljf ljfVar = (ljf) mbgVar.d.get();
        ljfVar.getClass();
        mbf mbfVar = new mbf(scheduledExecutorService, (maz) obj, mbjVarA, ljfVar, ((liq) mbgVar.e).get());
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        mxm mxmVar = this.c;
        mch mchVar = (mch) mxmVar.d.get();
        mchVar.getClass();
        mbj mbjVarA2 = ((ikv) mxmVar.e).get();
        man manVar = (man) mxmVar.a.get();
        manVar.getClass();
        fnl fnlVar = fnl.b;
        jun junVar = jun.a;
        lis lisVar = ((liq) mxmVar.b).get();
        ljf ljfVar2 = (ljf) mxmVar.c.get();
        ljfVar2.getClass();
        maq maqVar = (maq) mxmVar.f.get();
        maqVar.getClass();
        mccVar.getClass();
        return new mau(mchVar, mbjVarA2, manVar, fnlVar, junVar, lisVar, ljfVar2, maqVar, mccVar, mbfVar, str, jElapsedRealtimeNanos, j);
    }
}
