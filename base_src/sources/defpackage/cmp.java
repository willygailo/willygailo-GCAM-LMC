package defpackage;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class cmp extends TimerTask {
    final /* synthetic */ cmq a;

    public cmp(cmq cmqVar) {
        this.a = cmqVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        cmq cmqVar = this.a;
        if (cmqVar.d.a) {
            cmqVar.c.execute(new Runnable() { // from class: cmo
                @Override // java.lang.Runnable
                public final void run() {
                    cmp cmpVar = this.a;
                    long jA = cmpVar.a.d.a(TimeUnit.MILLISECONDS) + 10;
                    cmpVar.a.a.h(jA);
                    cmpVar.a.b.g("/video_state_recording", jA);
                    if (cmpVar.a.e.k(dcu.J) && cmpVar.a.f.g()) {
                        int iA = ((ldz) cmpVar.a.f.c()).a();
                        long j = ((long) iA) * jA;
                        cmpVar.a.a.g(j);
                        if (iA != 1) {
                            cmpVar.a.b.g("/video_state_recording_output", j);
                        }
                    }
                }
            });
        }
    }
}
