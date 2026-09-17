package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
final class oo extends gg {
    final /* synthetic */ or a;

    public oo(or orVar) {
        this.a = orVar;
    }

    @Override // defpackage.gg
    public final void c(RecyclerView recyclerView, int i, int i2) {
        or orVar = this.a;
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = orVar.l.computeVerticalScrollRange();
        int i3 = orVar.k;
        orVar.m = iComputeVerticalScrollRange - i3 > 0 && i3 >= orVar.a;
        int iComputeHorizontalScrollRange = orVar.l.computeHorizontalScrollRange();
        int i4 = orVar.j;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= orVar.a;
        orVar.n = z;
        if (orVar.m) {
            float f = i3;
            orVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            orVar.d = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (orVar.o != 0) {
                orVar.e(0);
                return;
            }
            return;
        }
        if (orVar.n) {
            float f2 = i4;
            orVar.h = (int) ((f2 * (iComputeHorizontalScrollOffset + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            orVar.g = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = orVar.o;
        if (i5 == 0 || i5 == 1) {
            orVar.e(1);
        }
    }
}
