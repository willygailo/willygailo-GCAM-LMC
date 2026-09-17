package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mel implements mec {
    private final mee a;
    private final psj b;
    private final mdo c;

    public mel(mee meeVar, psj psjVar, mdo mdoVar) {
        this.a = meeVar;
        this.b = psjVar;
        this.c = mdoVar;
    }

    private final boolean b(psh pshVar) {
        int i = 0;
        while (true) {
            if (i >= pshVar.a.size()) {
                Iterator it = pshVar.b.iterator();
                while (it.hasNext()) {
                    if (!c((psi) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            int iB = psg.b(pshVar.a.d(i));
            if (!this.a.a(iB != 0 ? iB : 1, this.c).a()) {
                return false;
            }
            i++;
        }
    }

    private final boolean c(psi psiVar) {
        for (int i = 0; i < psiVar.a.size(); i++) {
            int iB = psg.b(psiVar.a.d(i));
            if (iB == 0) {
                iB = 1;
            }
            if (this.a.a(iB, this.c).a()) {
                return true;
            }
        }
        Iterator it = psiVar.b.iterator();
        while (it.hasNext()) {
            if (b((psh) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mec
    public final boolean a() {
        Boolean boolValueOf;
        int iB;
        psj psjVar = this.b;
        int i = psjVar.a;
        if (i == 2) {
            boolValueOf = Boolean.valueOf(b((psh) psjVar.b));
        } else if (i == 3) {
            boolValueOf = Boolean.valueOf(c((psi) psjVar.b));
        } else {
            mee meeVar = this.a;
            int i2 = 1;
            if (i == 1 && (iB = psg.b(((Integer) psjVar.b).intValue())) != 0) {
                i2 = iB;
            }
            boolValueOf = Boolean.valueOf(meeVar.a(i2, this.c).a());
        }
        return boolValueOf.booleanValue();
    }
}
