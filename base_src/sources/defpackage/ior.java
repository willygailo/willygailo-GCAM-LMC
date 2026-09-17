package defpackage;

import android.media.AudioManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ior implements pys {
    private final qkg A;
    private final qkg B;
    private final qkg C;
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final qkg j;
    private final qkg k;
    private final qkg l;
    private final qkg m;
    private final qkg n;
    private final qkg o;
    private final qkg p;
    private final qkg q;
    private final qkg r;
    private final qkg s;
    private final qkg t;
    private final qkg u;
    private final qkg v;
    private final qkg w;
    private final qkg x;
    private final qkg y;
    private final qkg z;

    public ior(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, qkg qkgVar13, qkg qkgVar14, qkg qkgVar15, qkg qkgVar16, qkg qkgVar17, qkg qkgVar18, qkg qkgVar19, qkg qkgVar20, qkg qkgVar21, qkg qkgVar22, qkg qkgVar23, qkg qkgVar24, qkg qkgVar25, qkg qkgVar26, qkg qkgVar27, qkg qkgVar28, qkg qkgVar29) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
        this.j = qkgVar10;
        this.k = qkgVar11;
        this.l = qkgVar12;
        this.m = qkgVar13;
        this.n = qkgVar14;
        this.o = qkgVar15;
        this.p = qkgVar16;
        this.q = qkgVar17;
        this.r = qkgVar18;
        this.s = qkgVar19;
        this.t = qkgVar20;
        this.u = qkgVar21;
        this.v = qkgVar22;
        this.w = qkgVar23;
        this.x = qkgVar24;
        this.y = qkgVar25;
        this.z = qkgVar26;
        this.A = qkgVar27;
        this.B = qkgVar28;
        this.C = qkgVar29;
    }

    @Override // defpackage.qkg
    public final /* bridge */ /* synthetic */ Object get() {
        lzh lzhVar = (lzh) this.a.get();
        AudioManager audioManager = ((emt) this.b).get();
        ddf ddfVar = (ddf) this.c.get();
        ckh ckhVar = (ckh) this.d.get();
        ldt ldtVarB = iiy.b();
        mip mipVarC = iiy.c();
        cvo cvoVar = (cvo) this.e.get();
        lvq lvqVar = ((lhr) this.f).get();
        lzi lziVar = (lzi) this.g.get();
        Executor executor = (Executor) this.h.get();
        ink inkVar = (ink) this.i.get();
        fix fixVar = (fix) this.j.get();
        lar larVar = (lar) this.k.get();
        gvb gvbVar = (gvb) this.l.get();
        mip mipVar = (mip) this.m.get();
        lqv lqvVar = (lqv) this.n.get();
        lco lcoVar = (lco) this.o.get();
        lco lcoVar2 = (lco) this.p.get();
        bod bodVar = (bod) this.q.get();
        bta btaVar = (bta) this.r.get();
        inx inxVar = (inx) this.s.get();
        iod iodVar = (iod) this.t.get();
        ljf ljfVar = (ljf) this.u.get();
        cpj cpjVar = ((cpk) this.v).get();
        cvh cvhVar = (cvh) this.w.get();
        cpp cppVar = (cpp) this.x.get();
        kas kasVar = ((iwi) this.y).get();
        boolean zBooleanValue = ((Boolean) this.z.get()).booleanValue();
        dib dibVar = (dib) this.A.get();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.B.get();
        return new ioq(lzhVar, audioManager, ddfVar, ckhVar, ldtVarB, mipVarC, cvoVar, lvqVar, lziVar, executor, inkVar, fixVar, larVar, gvbVar, mipVar, lqvVar, lcoVar, lcoVar2, bodVar, btaVar, inxVar, iodVar, ljfVar, cpjVar, cvhVar, cppVar, kasVar, zBooleanValue, dibVar, scheduledExecutorService, null, null, null);
    }
}
