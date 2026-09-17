package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: loaded from: classes2.dex */
public final class jpi implements jqn {
    private final daf a;
    private final elw b;
    private final qkg c;
    private final ddf d;

    public jpi(daf dafVar, elw elwVar, qkg qkgVar, ddf ddfVar) {
        this.a = dafVar;
        this.b = elwVar;
        this.c = qkgVar;
        this.d = ddfVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) ((jnr) this.c.get()).c.c(R.id.coach_hud);
        ddf ddfVar = this.d;
        ddi ddiVar = dcv.a;
        ddfVar.d();
        ojc ojcVarA = this.d.a(dcv.a);
        if (ojcVarA.g()) {
            int iIntValue = ((Integer) ojcVarA.c()).intValue();
            if (cameraCoachHudView.d.g()) {
                ((dbc) cameraCoachHudView.d.c()).m = iIntValue;
            }
        }
        if (this.d.k(dcv.o) && cameraCoachHudView.b.g()) {
            ((dbq) cameraCoachHudView.b.c()).m = true;
        }
        daf dafVar = this.a;
        elw elwVar = this.b;
        final dah dahVar = dafVar.f;
        dahVar.d = ojc.i(cameraCoachHudView);
        final gvb gvbVar = dahVar.a;
        bqg bqgVar = dahVar.e;
        gvbVar.g(dahVar);
        bqgVar.i().c(new lie() { // from class: dag
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                gvbVar.h(dahVar);
            }
        });
        if (dahVar.d.g()) {
            ((CameraCoachHudView) dahVar.d.c()).a = gvbVar.c().e;
        }
        dbl dblVar = dafVar.a;
        dah dahVar2 = dafVar.f;
        dblVar.h = ojc.i(elwVar);
        dblVar.g = ojc.i(dahVar2);
        dch dchVar = dafVar.b;
        dah dahVar3 = dafVar.f;
        dchVar.e = ojc.i(elwVar);
        dchVar.f = ojc.i(dahVar3);
        dafVar.c.h = ojc.i(dafVar.d);
        dba dbaVar = dafVar.e;
        dah dahVar4 = dafVar.f;
        dbaVar.l = ojc.i(elwVar);
        dbaVar.m = ojc.i(dahVar4);
    }
}
