package defpackage;

import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ciu implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public ciu(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static ciu a(qkg qkgVar) {
        return new ciu(qkgVar, 18);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return new cit((cin) this.a.get());
            case 1:
                evl evlVarA = ((evf) this.a).get();
                ewb ewbVar = evlVarA.a;
                evc evcVar = evlVarA.b;
                evh evhVar = evlVarA.c;
                qkg qkgVarB = pyr.b(new jrk(ewbVar.cZ, 7));
                qkg qkgVarB2 = pyr.b(lem.a);
                cjq cjqVar = new cjq(qkgVarB, qkgVarB2, ewbVar.ac);
                cnb cnbVar = new cnb(evcVar.Y, qkgVarB, new lev(qkgVarB2), new let(qkgVarB2));
                qkg qkgVarB3 = pyr.b(cfh.a);
                cfi cfiVar = (cfi) pyr.b(new bng(cjqVar, cnbVar, pyr.b(new dua(ewbVar.fq, evhVar.L, evhVar.M, evhVar.N, evhVar.C, pyr.b(new bqr(qkgVarB3, 20)), qkgVarB3, evcVar.Y, ewbVar.k, new cnz(ewbVar.fs), ewbVar.ep, evhVar.A, evhVar.D, ewbVar.gb, evcVar.aJ, ewbVar.i, new cnv(ewbVar.fu, evhVar.u), 1, (byte[]) null)), 19, (char[][][]) null)).get();
                qmd.ae(cfiVar);
                return cfiVar;
            case 2:
                ((fzo) this.a).get();
                return new jry();
            case 3:
                return new cmm((nvb) this.a.get(), null, null);
            case 4:
                return new col((ddf) this.a.get(), 1);
            case 5:
                return new col((ddf) this.a.get(), 0);
            case 6:
                return new cpe((hup) this.a.get());
            case 7:
                lco lcoVar = ((csq) this.a.get()).f;
                qmd.ae(lcoVar);
                return lcoVar;
            case 8:
                return ((coo) this.a).get().e.c();
            case 9:
                return new ctb((lco) this.a.get());
            case 10:
                return new cve((ifn) this.a.get());
            case 11:
                aig aigVarI = fw.i(((emp) this.a).a(), CameraFatalErrorTrackerDatabase.class, "CameraFatalErrorTracker_db");
                aigVarI.d();
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = (CameraFatalErrorTrackerDatabase) aigVarI.a();
                qmd.ae(cameraFatalErrorTrackerDatabase);
                return cameraFatalErrorTrackerDatabase;
            case 12:
                return new cyp((fjs) this.a.get());
            case 13:
                return new mgo(((emp) this.a).a(), new dae(), null);
            case 14:
                return new nlo(((emp) this.a).a(), Locale.getDefault().getCountry());
            case 15:
                return new dcj((ddf) this.a.get());
            case 16:
                dep depVar = (dep) this.a.get();
                qmd.ae(depVar);
                return depVar;
            case 17:
                return new dfm(((emm) this.a).get());
            case 18:
                Set setA = dgh.a((ddf) this.a.get());
                qmd.ae(setA);
                return setA;
            case 19:
                return new dgv((ddf) this.a.get());
            default:
                dij dijVar = ((dik) this.a).get();
                dijVar.n();
                return dijVar;
        }
    }
}
