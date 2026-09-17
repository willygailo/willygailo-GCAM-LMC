package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
final class nyy extends nwl {
    final /* synthetic */ nzf a;

    public nyy(nzf nzfVar) {
        this.a = nzfVar;
    }

    @Override // defpackage.nwl
    /* JADX INFO: renamed from: a */
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.a.u = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.nwl, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
