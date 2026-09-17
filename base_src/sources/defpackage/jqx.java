package defpackage;

import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes2.dex */
final class jqx implements ScaleGestureDetector.OnScaleGestureListener {
    final /* synthetic */ kas a;

    public jqx(kas kasVar) {
        this.a = kasVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.a.k(scaleGestureDetector.getScaleFactor());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.a.l();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getScaleFactor();
        kbi kbiVar = (kbi) this.a;
        kbiVar.z.n();
        if (!kbiVar.l) {
            kbiVar.z.w();
        }
        kbiVar.z.z(4, kbiVar.O, ((Float) kbiVar.g.fA()).floatValue());
    }
}
