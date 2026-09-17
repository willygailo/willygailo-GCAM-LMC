package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class ps extends qe {
    private pq c;
    private pq d;

    public static final int e(View view, pq pqVar) {
        return (pqVar.d(view) + (pqVar.b(view) / 2)) - (pqVar.j() + (pqVar.k() / 2));
    }

    private static final View g(qc qcVar, pq pqVar) {
        int iAi = qcVar.ai();
        View view = null;
        if (iAi == 0) {
            return null;
        }
        int iJ = pqVar.j() + (pqVar.k() / 2);
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < iAi) {
            View viewAu = qcVar.au(i2);
            int iAbs = Math.abs((pqVar.d(viewAu) + (pqVar.b(viewAu) / 2)) - iJ);
            int i3 = iAbs < i ? iAbs : i;
            if (iAbs < i) {
                view = viewAu;
            }
            i2++;
            i = i3;
        }
        return view;
    }

    public final pq a(qc qcVar) {
        pq pqVar = this.d;
        if (pqVar == null || pqVar.a != qcVar) {
            this.d = pq.p(qcVar);
        }
        return this.d;
    }

    public final pq b(qc qcVar) {
        pq pqVar = this.c;
        if (pqVar == null || pqVar.a != qcVar) {
            this.c = pq.r(qcVar);
        }
        return this.c;
    }

    @Override // defpackage.qe
    public View c(qc qcVar) {
        if (qcVar.V()) {
            return g(qcVar, b(qcVar));
        }
        if (qcVar.U()) {
            return g(qcVar, a(qcVar));
        }
        return null;
    }

    @Override // defpackage.qe
    public final int[] d(qc qcVar, View view) {
        int[] iArr = new int[2];
        if (qcVar.U()) {
            iArr[0] = e(view, a(qcVar));
        } else {
            iArr[0] = 0;
        }
        if (qcVar.V()) {
            iArr[1] = e(view, b(qcVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
