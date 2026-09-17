package defpackage;

import android.hardware.Sensor;
import android.os.Handler;
import android.util.Log;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class jhe implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[][] fArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][] iArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][][] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][][] iArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public jhe(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][][] sArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public static jhe a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new jhe(qkgVar, qkgVar2, qkgVar3, 9, (char[][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Sensor defaultSensor;
        switch (this.d) {
            case 0:
                return new jhd((ddf) this.b.get(), ((emd) this.c).get());
            case 1:
                final fhv fhvVarB = ((etj) this.c).get();
                final lar larVar = (lar) this.b.get();
                final jbh jbhVar = (jbh) this.a.get();
                return new iho() { // from class: jbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        enl.f(larVar, fhvVarB, jbhVar);
                    }
                };
            case 2:
                return new jhj(((emd) this.c).get(), (elw) this.b.get(), (ddf) this.a.get());
            case 3:
                return !((ddf) this.b.get()).k(ddl.am) ? ((jmw) this.a).get() : ((jmu) this.c).get();
            case 4:
                final pyn pynVarA = pyr.a(this.c);
                final ljf ljfVar = (ljf) this.a.get();
                Object objH = !((ddf) this.b.get()).k(ddo.c) ? orx.a : ope.H(jwv.a(new jwu() { // from class: jnq
                    @Override // defpackage.jwu
                    public final jws a(jww jwwVar) {
                        pyn pynVar = pynVarA;
                        return new jno(jwwVar.b(), (jnn) pynVar.get(), ljfVar);
                    }
                }, ((jnn) pynVarA.get()).a, jwt.BLUR));
                qmd.ae(objH);
                return objH;
            case 5:
                return new jpg((ojc) this.c.get(), this.b, ((emd) this.a).get());
            case 6:
                return new jpt((ojc) this.a.get(), (jbq) this.b.get(), this.c);
            case 7:
                return new jqz(((iwi) this.a).get(), this.c, ((emp) this.b).a());
            case 8:
                return new jtb(((eme) this.b).get(), (lar) this.a.get(), ((etf) this.c).get());
            case 9:
                return new jth(((lhr) this.b).get(), (lvp) this.c.get(), (ddf) this.a.get());
            case 10:
                return new lld((ScheduledExecutorService) this.a.get(), ((liq) this.b).get(), ((evv) this.c).a());
            case 11:
                return new lot((lxv) this.b.get(), (lrq) this.a.get(), ((lqi) this.c).get(), null, null);
            case 12:
                Object obj = this.a.get();
                lvq lvqVar = ((lhr) this.b).get();
                return new lqv((lqw) obj, lvqVar);
            case 13:
                lap lapVar = (lap) this.b.get();
                ltc ltcVar = new ltc((Handler) this.c.get(), ((liq) this.a).get());
                lapVar.c(ltcVar);
                return ltcVar;
            case 14:
                return (((lzh) this.c.get()).d && (defaultSensor = ((ena) this.a).get().getDefaultSensor(4)) != null && defaultSensor.isDirectChannelTypeSupported(2) && defaultSensor.getHighestDirectReportRateLevel() >= 2 && ReadHardwareBufferJniFunctions.isSupported()) ? ojc.i((lxb) this.b.get()) : oih.a;
            case 15:
                lzh lzhVar = (lzh) this.a.get();
                qkg qkgVar = this.c;
                qkg qkgVar2 = this.b;
                if (!lzhVar.f) {
                    return ((mbx) qkgVar).get();
                }
                Log.w("MediaFsQModule", "Returning Q MediaFs implementation");
                return ((mca) qkgVar2).get();
            case 16:
                Executor executor = ((mux) this.a.get()).d ? (Executor) this.c.get() : (Executor) this.b.get();
                qmd.ae(executor);
                return executor;
            case 17:
                return new mvj(this.b, this.a, ((pyw) this.c).get());
            case 18:
                return new mxq(((emp) this.c).a(), ((fsr) this.b).b(), (String) this.a.get());
            case 19:
                return new mzi(null);
            default:
                Object objH2 = (((ojc) ((pyt) this.a).a).g() || ((ojc) ((pyt) this.b).a).g()) ? ope.H((mxo) this.c.get()) : orx.a;
                qmd.ae(objH2);
                return objH2;
        }
    }
}
