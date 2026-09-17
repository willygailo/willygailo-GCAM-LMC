package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.CountDownTimer;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class hzm extends CountDownTimer {
    final /* synthetic */ PointF a;
    final /* synthetic */ hzo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzm(hzo hzoVar, long j, long j2, PointF pointF) {
        super(j, j2);
        this.b = hzoVar;
        this.a = pointF;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Callable callable;
        hzo hzoVar = this.b;
        if (hzoVar.j) {
            return;
        }
        hzoVar.k = null;
        hzoVar.c.a();
        hzo hzoVar2 = this.b;
        ojc ojcVarI = oih.a;
        synchronized (hzoVar2) {
            callable = hzoVar2.i;
        }
        if (callable != null) {
            try {
                ojc ojcVar = (ojc) callable.call();
                if (ojcVar.g()) {
                    ojcVarI = ojc.i(((jnm) ojcVar.c()).a);
                }
            } catch (Exception e) {
                ((oug) ((oug) ((oug) hzo.a.b()).h(e)).G((char) 2734)).o("Grabbing viewfinder screenshot failed.");
            }
        }
        if (ojcVarI.g()) {
            this.b.b.W(26, 8);
            this.b.f.c(0);
            jcw jcwVar = this.b.d;
            pmr pmrVarB = pms.b();
            pmrVarB.b = (Bitmap) ojcVarI.c();
            pmrVarB.g = this.a;
            jcwVar.g = pmrVarB.a();
            if (this.b.e.b(jrl.LENS)) {
                return;
            }
            this.b.d.e();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
