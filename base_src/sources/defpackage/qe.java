package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qe {
    public RecyclerView a;
    public final gg b = new qz(this);

    public abstract View c(qc qcVar);

    public abstract int[] d(qc qcVar, View view);

    public final void f() {
        qc qcVar;
        View viewC;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (qcVar = recyclerView.m) == null || (viewC = c(qcVar)) == null) {
            return;
        }
        int[] iArrD = d(qcVar, viewC);
        int i = 0;
        int i2 = iArrD[0];
        if (i2 != 0) {
            i = i2;
        } else if (iArrD[1] == 0) {
            return;
        }
        this.a.X(i, iArrD[1]);
    }
}
