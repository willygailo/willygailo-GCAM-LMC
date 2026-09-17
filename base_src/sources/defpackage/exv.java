package defpackage;

import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class exv extends CountDownTimer {
    final /* synthetic */ float a;
    final /* synthetic */ exw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exv(exw exwVar, long j, long j2, float f) {
        super(j, j2);
        this.b = exwVar;
        this.a = f;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.b.a.v.r();
        cancel();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        fwl fwlVar = this.b.a.o;
        float f = this.a;
        long seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        jom jomVar = fwlVar.b;
        jomVar.h = seconds;
        jomVar.l = String.format("%01d:%02d", Long.valueOf(seconds / 60), Long.valueOf(seconds % 60));
        jomVar.invalidate();
        if (((int) (f * 100.0f)) >= 100) {
            fwlVar.a.c = true;
        } else {
            fwlVar.a.c = false;
        }
    }
}
