package defpackage;

import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class icg implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final /* synthetic */ int j;

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i) {
        this.j = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, byte[] bArr) {
        this.j = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.f = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
        this.g = qkgVar6;
        this.i = qkgVar7;
        this.h = qkgVar8;
        this.c = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, char[] cArr) {
        this.j = i;
        this.e = qkgVar;
        this.a = qkgVar2;
        this.g = qkgVar3;
        this.f = qkgVar4;
        this.c = qkgVar5;
        this.d = qkgVar6;
        this.h = qkgVar7;
        this.i = qkgVar8;
        this.b = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, float[] fArr) {
        this.j = i;
        this.a = qkgVar;
        this.e = qkgVar2;
        this.d = qkgVar3;
        this.f = qkgVar4;
        this.h = qkgVar5;
        this.b = qkgVar6;
        this.i = qkgVar7;
        this.g = qkgVar8;
        this.c = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, int[] iArr) {
        this.j = i;
        this.d = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.i = qkgVar4;
        this.h = qkgVar5;
        this.a = qkgVar6;
        this.b = qkgVar7;
        this.e = qkgVar8;
        this.g = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, short[] sArr) {
        this.j = i;
        this.b = qkgVar;
        this.e = qkgVar2;
        this.f = qkgVar3;
        this.d = qkgVar4;
        this.c = qkgVar5;
        this.g = qkgVar6;
        this.a = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, boolean[] zArr) {
        this.j = i;
        this.g = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
        this.c = qkgVar5;
        this.i = qkgVar6;
        this.f = qkgVar7;
        this.h = qkgVar8;
        this.a = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, byte[][] bArr) {
        this.j = i;
        this.h = qkgVar;
        this.g = qkgVar2;
        this.f = qkgVar3;
        this.a = qkgVar4;
        this.c = qkgVar5;
        this.i = qkgVar6;
        this.d = qkgVar7;
        this.b = qkgVar8;
        this.e = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, char[][] cArr) {
        this.j = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.f = qkgVar4;
        this.h = qkgVar5;
        this.i = qkgVar6;
        this.e = qkgVar7;
        this.a = qkgVar8;
        this.g = qkgVar9;
    }

    public icg(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, int i, short[][] sArr) {
        this.j = i;
        this.c = qkgVar;
        this.i = qkgVar2;
        this.g = qkgVar3;
        this.d = qkgVar4;
        this.h = qkgVar5;
        this.b = qkgVar6;
        this.f = qkgVar7;
        this.e = qkgVar8;
        this.a = qkgVar9;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.j) {
            case 0:
                return new icf((idt) this.a.get(), ((emd) this.b).get(), (hnx) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (bue) this.e.get(), (ddf) this.f.get(), (hub) this.g.get(), (huf) this.h.get(), (hug) this.i.get());
            case 1:
                return new iac(((hxg) this.d).get(), (hzo) this.a.get(), ((emd) this.f).get(), ((jnx) this.e).get(), (cvo) this.b.get(), (gvb) this.g.get(), (jng) this.i.get(), (ljf) this.h.get(), (elw) this.c.get());
            case 2:
                return new igu(((emd) this.e).get(), (ojc) this.a.get(), (gtg) this.g.get(), (ddf) this.f.get(), ((bwq) this.c).a(), (elw) this.d.get(), (huf) this.h.get(), (hug) this.i.get(), ((cwo) this.b).get());
            case 3:
                return new inx((gfy) this.b.get(), (dmh) this.e.get(), ((fxn) this.f).a(), (ddf) this.d.get(), ((cjc) this.c).a(), (bod) this.g.get(), (ScheduledExecutorService) this.a.get(), gfp.f(), (iqj) this.h.get(), (ghf) this.i.get(), null, null, null, null);
            case 4:
                return new lue(((lwt) this.d).get(), (mip) this.f.get(), ((liq) this.c).get(), (ljf) this.i.get(), (mos) this.h.get(), ((lry) this.a).get(), (lzh) this.b.get(), ((lpl) this.e).get(), (lxv) this.g.get(), null, null, null, null);
            case 5:
                return new mwr(((mxn) this.g).get(), ((emp) this.e).a(), (mwe) this.b.get(), (phw) this.d.get(), pyr.a(this.c), ((mxb) this.i).get(), ((mwl) this.f).get(), this.h, (Executor) this.a.get());
            case 6:
                return new myi(((mxn) this.a).get(), ((emp) this.e).a(), (Executor) this.d.get(), pyr.a(this.f), ((evv) this.h).a(), (mwe) this.b.get(), ((nch) this.i).get(), (ojc) ((pyt) this.g).a, this.c, null);
            case 7:
                return new myt(((mxn) this.h).get(), ((emp) this.g).a(), (mwe) this.f.get(), (Executor) this.a.get(), ((myp) this.c).get(), this.i, pyr.a(this.d), this.b, this.e);
            case 8:
                return new nog((F250RoomDatabase) this.c.get(), (nov) this.b.get(), (nrm) this.d.get(), (noc) this.f.get(), (nom) this.h.get(), (nox) this.i.get(), (mdf) this.e.get(), (nrk) this.a.get(), (qbt) this.g.get());
            default:
                return new nty((nrm) this.c.get(), (noq) this.i.get(), (ntg) this.g.get(), (nre) this.d.get(), (ohh) this.h.get(), (nov) this.b.get(), (noc) this.f.get(), (mdf) this.e.get(), (nom) this.a.get(), null, null);
        }
    }
}
