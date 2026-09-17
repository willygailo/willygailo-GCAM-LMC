package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.security.SecureRandom;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class iaa implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final /* synthetic */ int f;

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i) {
        this.f = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[] bArr) {
        this.f = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.d = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[] cArr) {
        this.f = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
        this.e = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[] fArr) {
        this.f = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[] iArr) {
        this.f = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[] sArr) {
        this.f = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[] zArr) {
        this.f = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[][] bArr) {
        this.f = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
        this.e = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[][] cArr) {
        this.f = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[][] fArr) {
        this.f = i;
        this.e = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[][] iArr) {
        this.f = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.d = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[][] sArr) {
        this.f = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[][][] cArr) {
        this.f = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[][][] fArr) {
        this.f = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.d = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[][][] iArr) {
        this.f = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[][][] sArr) {
        this.f = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
        this.b = qkgVar5;
    }

    public iaa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.f) {
            case 0:
                return new hzz((lar) this.a.get(), (fjs) this.b.get(), ((iug) this.c).get(), (huq) this.d.get(), (ddf) this.e.get(), null);
            case 1:
                return new hwt((hwp) this.b.get(), this.c, this.e, this.a, (lar) this.d.get());
            case 2:
                return new ifq((ifs) this.a.get(), (ljf) this.b.get(), (lar) this.d.get(), ((etf) this.c).get(), (hug) this.e.get());
            case 3:
                qkg qkgVar = this.d;
                dei deiVarA = dug.a();
                Context contextA = ((emp) this.c).a();
                Executor executor = (Executor) this.e.get();
                PackageInfo packageInfoA = ((jtn) this.a).get();
                return new iiw(fkc.a(), contextA, new SecureRandom().nextLong(), TimeZone.getDefault().getID(), Build.DISPLAY, executor, deiVarA, ActivityManager.isRunningInTestHarness(), qkgVar, ((dlp) this.b).get(), packageInfoA.versionName);
            case 4:
                return new ilx((iki) this.d.get(), (Executor) this.e.get(), (ljf) this.b.get(), (lzh) this.c.get(), (ddf) this.a.get());
            case 5:
                return new imq((fjs) this.b.get(), (imo) this.a.get(), ((fhq) this.c).get(), (lar) this.e.get(), (ddf) this.d.get());
            case 6:
                return new irz(((emd) this.d).get(), (lap) this.a.get(), (lda) this.c.get(), (elw) this.e.get(), ((emh) this.b).get());
            case 7:
                return new ist(((emk) this.c).get(), ((emy) this.a).get(), (btt) this.d.get(), (fjs) this.b.get(), (elw) this.e.get());
            case 8:
                return new izx((BottomBarController) this.d.get(), (jlb) this.b.get(), (gtg) this.a.get(), (jjp) this.e.get(), (gfy) this.c.get());
            case 9:
                return new jql((jiy) this.b.get(), this.d, (ddf) this.e.get(), ((etf) this.c).get(), (elw) this.a.get());
            case 10:
                return new mbg(this.a, this.b, this.e, this.c, this.d, (char[]) null);
            case 11:
                return new lhm(((lhq) this.d).get(), ((lvr) this.e).get(), (lzh) this.c.get(), ((liq) this.a).get(), (ljf) this.b.get());
            case 12:
                return new loy(((liq) this.e).get(), (Executor) this.c.get(), (lqk) this.d.get(), ((lry) this.a).get(), (ljf) this.b.get());
            case 13:
                return new ltv((luk) this.a.get(), (lap) this.d.get(), (Executor) this.c.get(), ((liq) this.e).get(), (ljf) this.b.get());
            case 14:
                Context contextA2 = ((mbn) this.a).get();
                return new maq(contextA2, contextA2.getContentResolver(), ((ikv) this.c).get(), (ScheduledExecutorService) this.b.get(), (ExecutorService) this.d.get(), ((liq) this.e).get());
            case 15:
                return new nay(((mxn) this.a).get(), (phw) this.e.get(), (Executor) this.d.get(), pyr.a(this.c), this.b);
            case 16:
                mxm mxmVar = ((mxn) this.d).get();
                return new nbr(mxmVar, pyr.a(this.b), this.a, ((nch) this.e).get(), null);
            case 17:
                ((nrj) this.b).get();
                return new nre((nri) this.a.get(), (mdf) this.c.get(), (nrm) this.e.get(), (qbt) this.d.get());
            default:
                return new ntg((nov) this.c.get(), (ohh) this.a.get(), (noc) this.e.get(), (noq) this.b.get(), (mdf) this.d.get(), null, null);
        }
    }
}
