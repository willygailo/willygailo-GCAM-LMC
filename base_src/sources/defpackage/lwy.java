package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class lwy implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public lwy(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, float[][] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, boolean[][] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, byte[][][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public lwy(qkg qkgVar, qkg qkgVar2, int i, char[][][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                ojc ojcVar = (ojc) this.a.get();
                lxb lxbVar = (lxb) (ojcVar.g() ? ojcVar.c() : this.b.get());
                qmd.ae(lxbVar);
                return lxbVar;
            case 1:
                return new lww(((ena) this.b).get(), ((liq) this.a).get());
            case 2:
                mek mekVar = new mek((Context) ((pyt) this.b).a, ((mef) this.a).get(), null);
                HandlerThread handlerThread = new HandlerThread("CheckboxObserverThread");
                handlerThread.start();
                mekVar.a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("multi_cb"), false, new mej(mekVar, new ksg(handlerThread.getLooper())));
                return mekVar;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) ((ojz) ((hlj) this.b).a().e(new ndq(((emp) this.a).a(), 1))).a();
                qmd.ae(sharedPreferences);
                return sharedPreferences;
            case 4:
                return new muh((phw) this.a.get(), (mwe) this.b.get());
            case 5:
                mux muxVar = (mux) this.b.get();
                mdk mdkVar = ((mdl) this.a).get();
                phw phwVarL = muxVar.a;
                if (phwVarL == null) {
                    int i = muxVar.c;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new muv(muxVar.b), new mut());
                    scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                    phwVarL = plk.L(scheduledThreadPoolExecutor);
                    mdm mdmVar = mdkVar.a;
                    if (mdmVar != null) {
                        phwVarL = mdmVar.a();
                    }
                }
                qmd.ae(phwVarL);
                return phwVarL;
            case 6:
                return new mvi(((emp) this.a).a(), (Executor) this.b.get());
            case 7:
                return new mwe(((emp) this.a).a(), (mwg) this.b.get());
            case 8:
                ((evv) this.b).a();
                return ope.H((mxo) this.a.get());
            case 9:
                Object objH = !((ojc) ((pyt) this.b).a).g() ? orx.a : ope.H((mxo) this.a.get());
                qmd.ae(objH);
                return objH;
            case 10:
                ((evv) this.b).a();
                return ope.H((mxo) this.a.get());
            case 11:
                return new myl(pyr.a(this.a), ((emp) this.b).a());
            case 12:
                Object objH2 = ((ojc) ((pyt) this.b).a).g() ? ope.H((mxo) this.a.get()) : orx.a;
                qmd.ae(objH2);
                return objH2;
            case 13:
                return new mzu((mwe) this.a.get(), (phw) this.b.get());
            case 14:
                Object objH3 = ((ojc) ((pyt) this.b).a).g() ? ope.H((nai) this.a.get()) : orx.a;
                qmd.ae(objH3);
                return objH3;
            case 15:
                return new naj(pyr.a(this.a), ((emp) this.b).a(), ojq.b('/').a());
            case 16:
                return new nbi(pyr.a(this.a), ((emp) this.b).a(), ojq.b('/').a());
            case 17:
                ((evv) this.b).a();
                return ope.H((mxo) this.a.get());
            case 18:
                return new nbp(((ewk) this.b).b());
            case 19:
                Object objH4 = nds.c((ojc) ((pyt) this.b).a) ? ope.H(((ndp) this.a).get()) : orx.a;
                qmd.ae(objH4);
                return objH4;
            default:
                return new nou((nql) this.b.get(), (nrm) this.a.get());
        }
    }
}
