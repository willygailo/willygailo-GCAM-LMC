package defpackage;

import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lsc implements lso {
    public final ltv a;
    public final lis b;
    public final ljf c;
    private final luk d;

    public lsc(luk lukVar, ltv ltvVar, lis lisVar, ljf ljfVar) {
        this.d = lukVar;
        this.a = ltvVar;
        this.b = lisVar.a("HfrCCSOpener");
        this.c = ljfVar;
    }

    @Override // defpackage.lso
    public final void d(lzp lzpVar, lsp lspVar, lap lapVar, Handler handler) {
        obr.aG(this.d.b.isEmpty(), "Cannot create a ConstrainedHighSpeedCaptureSession with buffered streams!");
        obr.aG(!this.d.c.isEmpty(), "Cannot create a ConstrainedHighSpeedCaptureSession without streams!");
        obr.aG(this.d.c.size() <= 2, "Cannot create a ConstrainedHighSpeedCaptureSession with more than two streams!");
        ArrayList arrayList = new ArrayList();
        oom oomVarS = oom.s(lsx.a, this.d.c);
        int i = ((orr) oomVarS).c;
        for (int i2 = 0; i2 < i; i2++) {
            lty ltyVar = (lty) oomVarS.get(i2);
            Surface surfaceG = ltyVar.g();
            if (surfaceG != null) {
                arrayList.add(plk.V(surfaceG));
            } else {
                final pih pihVarF = pih.f();
                pihVarF.d(new gng(ltyVar.a.a(new lij() { // from class: lsa
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        pih pihVar = pihVarF;
                        ojc ojcVar = (ojc) obj;
                        if (ojcVar.g()) {
                            pihVar.o((Surface) ojcVar.c());
                        }
                    }
                }, pgr.INSTANCE), 3), pgr.INSTANCE);
                arrayList.add(pihVarF);
            }
        }
        obr.aG(!arrayList.isEmpty(), "Surface cannot be null");
        obr.aG(arrayList.size() <= 2, "No more than two surfaces can be accepted");
        plk.af(plk.R(arrayList), new lsb(this, lspVar, lzpVar, handler, lapVar), pgr.INSTANCE);
    }
}
