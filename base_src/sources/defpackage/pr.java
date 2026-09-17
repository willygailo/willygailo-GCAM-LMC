package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class pr extends qo {
    final /* synthetic */ ps a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(ps psVar, Context context) {
        super(context);
        this.a = psVar;
    }

    @Override // defpackage.qo
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.qo
    protected final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.qo
    protected final void c(View view, qm qmVar) {
        ps psVar = this.a;
        int[] iArrD = psVar.d(psVar.a.m, view);
        int i = iArrD[0];
        int i2 = iArrD[1];
        int iG = g(Math.max(Math.abs(i), Math.abs(i2)));
        if (iG > 0) {
            qmVar.b(i, i2, iG, this.j);
        }
    }
}
