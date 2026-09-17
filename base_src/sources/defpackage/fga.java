package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;

/* JADX INFO: loaded from: classes.dex */
final class fga implements iar {
    final /* synthetic */ LinkChipResult a;
    final /* synthetic */ ojc b;
    final /* synthetic */ mhe c;
    final /* synthetic */ fgb d;

    public fga(fgb fgbVar, LinkChipResult linkChipResult, ojc ojcVar, mhe mheVar) {
        this.d = fgbVar;
        this.a = linkChipResult;
        this.b = ojcVar;
        this.c = mheVar;
    }

    @Override // defpackage.iar
    public final void a(final Bitmap bitmap) {
        if (bitmap != null) {
            lar larVar = this.d.A;
            final LinkChipResult linkChipResult = this.a;
            final ojc ojcVar = this.b;
            final mhe mheVar = this.c;
            larVar.c(new Runnable() { // from class: ffz
                /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
                /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    pmh pmhVar;
                    fga fgaVar = this.a;
                    Bitmap bitmap2 = bitmap;
                    LinkChipResult linkChipResult2 = linkChipResult;
                    ojc ojcVar2 = ojcVar;
                    mhe mheVar2 = mheVar;
                    jcw jcwVar = fgaVar.d.y;
                    pmr pmrVarB = pms.b();
                    pmrVarB.b = bitmap2;
                    switch (linkChipResult2.getResultType()) {
                        case 11:
                            i = 5;
                            break;
                        case 22:
                            i = 7;
                            break;
                        case 26:
                            i = 3;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    pmrVarB.f = Integer.valueOf(i);
                    if (ojcVar2.g()) {
                        pmhVar = (pmh) ojcVar2.c();
                    } else {
                        int resultType = linkChipResult2.getResultType();
                        plz plzVar = null;
                        if ((mheVar2.a & 4) != 0) {
                            mhb mhbVar = mheVar2.d;
                            if (mhbVar == null) {
                                mhbVar = mhb.b;
                            }
                            for (mha mhaVar : mhbVar.a) {
                                if (mhaVar.a == 7) {
                                    plzVar = (plz) mhaVar.b;
                                }
                            }
                        }
                        poy poyVarM = pmh.c.m();
                        if (resultType != 22) {
                            if (resultType == 11) {
                                pmg pmgVar = pmg.a;
                                if (poyVarM.c) {
                                    poyVarM.m();
                                    poyVarM.c = false;
                                }
                                pmh pmhVar2 = (pmh) poyVarM.b;
                                pmgVar.getClass();
                                pmhVar2.b = pmgVar;
                                pmhVar2.a = 2;
                            } else if (resultType == 26) {
                                pmf pmfVar = pmf.a;
                                if (poyVarM.c) {
                                    poyVarM.m();
                                    poyVarM.c = false;
                                }
                                pmh pmhVar3 = (pmh) poyVarM.b;
                                pmfVar.getClass();
                                pmhVar3.b = pmfVar;
                                pmhVar3.a = 3;
                            }
                        } else if (plzVar != null) {
                            poy poyVarM2 = pmb.c.m();
                            if (poyVarM2.c) {
                                poyVarM2.m();
                                poyVarM2.c = false;
                            }
                            pmb pmbVar = (pmb) poyVarM2.b;
                            pmbVar.b = plzVar;
                            pmbVar.a |= 1;
                            pmb pmbVar2 = (pmb) poyVarM2.j();
                            if (poyVarM.c) {
                                poyVarM.m();
                                poyVarM.c = false;
                            }
                            pmh pmhVar4 = (pmh) poyVarM.b;
                            pmbVar2.getClass();
                            pmhVar4.b = pmbVar2;
                            pmhVar4.a = 1;
                        } else {
                            resultType = 22;
                            if (resultType == 11) {
                                pmg pmgVar2 = pmg.a;
                                if (poyVarM.c) {
                                    poyVarM.m();
                                    poyVarM.c = false;
                                }
                                pmh pmhVar5 = (pmh) poyVarM.b;
                                pmgVar2.getClass();
                                pmhVar5.b = pmgVar2;
                                pmhVar5.a = 2;
                            } else if (resultType == 26) {
                                pmf pmfVar2 = pmf.a;
                                if (poyVarM.c) {
                                    poyVarM.m();
                                    poyVarM.c = false;
                                }
                                pmh pmhVar6 = (pmh) poyVarM.b;
                                pmfVar2.getClass();
                                pmhVar6.b = pmfVar2;
                                pmhVar6.a = 3;
                            }
                        }
                        pmhVar = (pmh) poyVarM.j();
                    }
                    pmrVarB.d = pmhVar;
                    jcwVar.g = pmrVarB.a();
                    if (fgaVar.d.m.b(jrl.LENS)) {
                        return;
                    }
                    fgaVar.d.y.e();
                }
            });
        }
    }
}
