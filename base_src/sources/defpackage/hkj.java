package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hkj implements pys {
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
    private final /* synthetic */ int m;

    public hkj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i) {
        this.m = i;
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
    }

    public hkj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12, int i, byte[] bArr) {
        this.m = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.f = qkgVar3;
        this.i = qkgVar4;
        this.j = qkgVar5;
        this.b = qkgVar6;
        this.h = qkgVar7;
        this.k = qkgVar8;
        this.l = qkgVar9;
        this.g = qkgVar10;
        this.c = qkgVar11;
        this.a = qkgVar12;
    }

    public static hkj a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, qkg qkgVar12) {
        return new hkj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, qkgVar12, 0);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.m) {
            case 0:
                return new hki((hld) this.a.get(), (hky) this.b.get(), (hle) this.c.get(), (hkk) this.d.get(), ((hkf) this.e).get(), ((hkx) this.f).get(), ((evv) this.g).a(), ((Boolean) this.h.get()).booleanValue(), ((bpk) this.i).a().booleanValue(), ((bpk) this.j).a().booleanValue(), ((bpk) this.k).a().booleanValue(), (lap) this.l.get(), null);
            default:
                return new heg((hgm) this.d.get(), (dkq) this.e.get(), (DynamicDepthUtils) this.f.get(), (hcg) this.i.get(), ((dzw) this.j).get(), (Executor) this.b.get(), ((hoi) this.h).get(), ((brh) this.k).get(), ((gsi) this.l).get(), (hvj) this.g.get(), (ljf) this.c.get(), (nvb) this.a.get(), null, null);
        }
    }
}
