package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class eej implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public eej(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public eej(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr) {
        this.e = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
    }

    public eej(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[] cArr) {
        this.e = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
    }

    public static eej a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new eej(qkgVar, qkgVar2, qkgVar3, qkgVar4, 0);
    }

    public final lco b() {
        lco lcoVarG;
        switch (this.e) {
            case 0:
                boolean zBooleanValue = ((ffg) this.a).a().booleanValue();
                lco lcoVar = (lco) this.b.get();
                lco lcoVar2 = (lco) this.c.get();
                ddf ddfVar = (ddf) this.d.get();
                if (!zBooleanValue || kdd.o == null) {
                    lcoVarG = lcv.g(fcy.l());
                } else {
                    ddi ddiVar = ddm.a;
                    ddfVar.d();
                    lcoVarG = fcy.m(kdd.o, lcv.j(lcv.b(lcoVar, lcoVar2), new bxe(18)));
                }
                qmd.ae(lcoVarG);
                return lcoVarG;
            case 1:
                ddf ddfVar2 = (ddf) this.c.get();
                lda ldaVar = (lda) this.a.get();
                boolean zBooleanValue2 = ((Boolean) this.d.get()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) this.b.get()).booleanValue();
                ddi ddiVar2 = dda.a;
                ddfVar2.d();
                lco lcoVarJ = lcv.j(ldaVar, new doo(zBooleanValue2, zBooleanValue3, 2));
                qmd.ae(lcoVarJ);
                return lcoVarJ;
            default:
                lco lcoVar3 = (lco) this.d.get();
                lco lcoVar4 = (lco) this.a.get();
                final WindowManager windowManager = ((emh) this.c).get();
                final Context context = ((emd) this.b).get();
                lco lcoVarI = lcv.i(lcoVar3, lcv.j(lcoVar4, new oiu() { // from class: hxb
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        WindowManager windowManager2 = windowManager;
                        Context context2 = context;
                        boolean z = false;
                        if (((Boolean) obj).booleanValue() && jrz.a(windowManager2.getDefaultDisplay(), context2) == jrz.LANDSCAPE) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }));
                qmd.ae(lcoVarI);
                return lcoVarI;
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return b();
    }
}
