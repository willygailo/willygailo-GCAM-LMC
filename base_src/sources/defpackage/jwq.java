package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jwq implements jwy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/viewfindereffects/ViewfinderEffectsRunner");
    public final CameraActivityTiming b;
    private final Set c;
    private final ddf d;
    private final ljf e;
    private final Executor f;
    private final cvo g;

    public jwq(Set set, ddf ddfVar, ljf ljfVar, Executor executor, CameraActivityTiming cameraActivityTiming, cvo cvoVar) {
        this.c = set;
        this.d = ddfVar;
        this.e = ljfVar;
        this.f = executor;
        this.b = cameraActivityTiming;
        this.g = cvoVar;
    }

    @Override // defpackage.jwy
    public final /* synthetic */ jwx a() {
        Executor executor = this.f;
        cvo cvoVar = this.g;
        ljf ljfVar = this.e;
        boolean zK = this.d.k(ddl.af);
        mrh mrhVar = mrh.a;
        mov movVarO = mwp.o();
        mmt mmtVarB = mmt.b("glvffx", mip.ae());
        mmtVarB.a();
        mpl mplVarM = mwp.m(mmtVarB);
        mplVarM.j(new mrd(mplVarM, mip.X(mplVarM, new mps(mrhVar, movVarO)), null, null));
        mpi mpiVarL = mwp.l(mplVarM);
        mpiVarL.execute(isd.m);
        jwm jwmVar = new jwm(executor, mpiVarL, cvoVar, ljfVar, zK);
        mip.ca(jwmVar.e, new lht() { // from class: jwn
            @Override // defpackage.lht
            public final void a(Object obj) {
                this.a.b.j(ijf.ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED, CameraActivityTiming.a);
            }
        }, pgr.INSTANCE);
        Set set = this.c;
        final jwp jwpVar = new jwp(set, jwmVar, this.e);
        jwpVar.b();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jwpVar.a.add(lci.c(((jwv) it.next()).b).a(new lij() { // from class: jwo
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    jwpVar.b();
                }
            }, pgr.INSTANCE));
        }
        return jwpVar;
    }
}
