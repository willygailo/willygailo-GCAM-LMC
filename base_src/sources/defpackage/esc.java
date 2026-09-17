package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class esc implements pys {
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
    private final /* synthetic */ int l;

    public esc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i) {
        this.l = i;
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
    }

    public esc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, byte[] bArr) {
        this.l = i;
        this.g = qkgVar;
        this.f = qkgVar2;
        this.k = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
        this.c = qkgVar6;
        this.j = qkgVar7;
        this.a = qkgVar8;
        this.e = qkgVar9;
        this.i = qkgVar10;
        this.h = qkgVar11;
    }

    public esc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, char[] cArr) {
        this.l = i;
        this.h = qkgVar;
        this.j = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
        this.g = qkgVar5;
        this.e = qkgVar6;
        this.k = qkgVar7;
        this.i = qkgVar8;
        this.c = qkgVar9;
        this.b = qkgVar10;
        this.f = qkgVar11;
    }

    public esc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, float[] fArr) {
        this.l = i;
        this.c = qkgVar;
        this.f = qkgVar2;
        this.j = qkgVar3;
        this.g = qkgVar4;
        this.d = qkgVar5;
        this.i = qkgVar6;
        this.h = qkgVar7;
        this.k = qkgVar8;
        this.b = qkgVar9;
        this.e = qkgVar10;
        this.a = qkgVar11;
    }

    public esc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, int[] iArr) {
        this.l = i;
        this.h = qkgVar;
        this.c = qkgVar2;
        this.j = qkgVar3;
        this.k = qkgVar4;
        this.d = qkgVar5;
        this.b = qkgVar6;
        this.f = qkgVar7;
        this.a = qkgVar8;
        this.i = qkgVar9;
        this.g = qkgVar10;
        this.e = qkgVar11;
    }

    public esc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, short[] sArr) {
        this.l = i;
        this.g = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.i = qkgVar4;
        this.h = qkgVar5;
        this.e = qkgVar6;
        this.k = qkgVar7;
        this.b = qkgVar8;
        this.d = qkgVar9;
        this.j = qkgVar10;
        this.a = qkgVar11;
    }

    public esc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11, int i, boolean[] zArr) {
        this.l = i;
        this.e = qkgVar;
        this.c = qkgVar2;
        this.i = qkgVar3;
        this.f = qkgVar4;
        this.g = qkgVar5;
        this.h = qkgVar6;
        this.d = qkgVar7;
        this.j = qkgVar8;
        this.a = qkgVar9;
        this.b = qkgVar10;
        this.k = qkgVar11;
    }

    public static esc a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, qkg qkgVar11) {
        return new esc(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, qkgVar11, 5, (boolean[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.l) {
            case 0:
                return new esb(((emn) this.a).get(), (fvv) this.b.get(), (lda) this.c.get(), (ojz) this.d.get(), (lco) this.e.get(), (ScheduledExecutorService) this.f.get(), ((etg) this.g).get(), (ljf) this.h.get(), ((cbi) this.i).get(), (huj) this.j.get(), (ddf) this.k.get());
            case 1:
                dqw dqwVar = (dqw) this.g.get();
                dqw dqwVar2 = (dqw) this.f.get();
                dqw dqwVar3 = (dqw) this.k.get();
                dqw dqwVar4 = (dqw) this.d.get();
                dqw dqwVar5 = (dqw) this.b.get();
                dqw dqwVar6 = (dqw) this.c.get();
                dqw dqwVar7 = (dqw) this.j.get();
                dqw dqwVar8 = (dqw) this.a.get();
                dqw dqwVar9 = (dqw) this.e.get();
                dqw dqwVar10 = (dqw) this.i.get();
                dqw dqwVar11 = (dqw) this.h.get();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.derived.topshot-quality")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.derived.topshot-quality'!");
                }
                arrayList.add(dqwVar);
                arrayList.add(dqwVar2);
                arrayList.add(dqwVar3);
                arrayList.add(dqwVar4);
                arrayList.add(dqwVar5);
                arrayList.add(dqwVar6);
                arrayList.add(dqwVar7);
                arrayList.add(dqwVar8);
                arrayList.add(dqwVar9);
                arrayList.add(dqwVar10);
                arrayList.add(dqwVar11);
                return enl.J("feature.acmi.derived.topshot-quality", arrayList, arrayList2);
            case 2:
                return new esu((jlb) this.h.get(), (jje) this.j.get(), (gtg) this.a.get(), (jgq) this.d.get(), (BottomBarController) this.g.get(), ((iwi) this.e).get(), (lda) this.k.get(), (jbq) this.i.get(), (ojc) this.c.get(), (ojc) this.b.get(), (elw) this.f.get());
            case 3:
                return new fzh((btt) this.g.get(), ((cff) this.f).get(), ((emf) this.c).get(), (BottomBarController) this.i.get(), this.h, (cpm) this.e.get(), this.k, ((cjc) this.b).a(), (ddf) this.d.get(), (lce) this.j.get(), ((Boolean) this.a.get()).booleanValue());
            case 4:
                return new fzn(this.h, this.c, this.j, (ixx) this.k.get(), (lar) this.d.get(), ((cjc) this.b).a(), this.f, (cqq) this.a.get(), (cka) this.i.get(), (lda) this.g.get(), ((iwi) this.e).get());
            case 5:
                return new gwi((ljf) this.e.get(), ((dgb) this.c).get(), (imy) this.i.get(), ((gqz) this.f).a(), (lco) this.g.get(), (jth) this.h.get(), (ddf) this.d.get(), ((gjo) this.j).get(), this.a, (gvm) this.b.get(), (lap) this.k.get(), null);
            default:
                return new hmz((fix) this.c.get(), ((ikk) this.f).get(), ((hrj) this.j).get(), (hpu) this.g.get(), (hql) this.d.get(), (lda) this.i.get(), (huf) this.h.get(), (hsh) this.k.get(), (lda) this.b.get(), (lco) this.e.get(), (lda) this.a.get(), null, null);
        }
    }
}
