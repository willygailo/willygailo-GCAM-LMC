package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class ckh {
    public final cpm a;
    public final Context b;
    public final coh c;
    public final csh d;
    public final cpp e;
    public final cqq f;
    public final cfg g;
    public final emb h;
    private final cvo i;
    private final ddf j;
    private final dkm k;
    private final lwf l;

    public ckh(cvo cvoVar, lwf lwfVar, ddf ddfVar, dkm dkmVar, cpm cpmVar, csh cshVar, emb embVar, Context context, coh cohVar, cpp cppVar, cfg cfgVar, cqq cqqVar, byte[] bArr, byte[] bArr2) {
        this.i = cvoVar;
        this.l = lwfVar;
        this.j = ddfVar;
        this.k = dkmVar;
        this.a = cpmVar;
        this.h = embVar;
        this.b = context;
        this.c = cohVar;
        this.d = cshVar;
        this.e = cppVar;
        this.g = cfgVar;
        this.f = cqqVar;
    }

    public final jrl a() {
        return this.c.a();
    }

    public final lvs b() {
        return this.k.b(this.l, this.j, this.i.d());
    }

    public final lvs c() {
        lvs lvsVarB = b();
        if (lvsVarB == null) {
            return null;
        }
        lvp lvpVarA = this.l.a(lvsVarB);
        if (lvpVarA.k() == lwd.FRONT && lvpVarA.L() && this.j.k(ddl.U)) {
            Rect rect = new Rect(0, 0, 0, 0);
            for (lvs lvsVar : ((lvo) lvpVarA).b) {
                lvp lvpVarA2 = this.l.a(lvsVar);
                if (lvpVarA2.h().right > rect.right) {
                    rect = lvpVarA2.h();
                    lvsVarB = lvsVar;
                }
            }
        }
        return lvsVarB;
    }
}
