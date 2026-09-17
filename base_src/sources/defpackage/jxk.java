package defpackage;

import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes2.dex */
final class jxk implements ScaleGestureDetector.OnScaleGestureListener {
    final /* synthetic */ ScaleGestureDetector.OnScaleGestureListener a;
    final /* synthetic */ jxg b;
    final /* synthetic */ jxn c;

    public jxk(jxn jxnVar, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, jxg jxgVar) {
        this.c = jxnVar;
        this.a = onScaleGestureListener;
        this.b = jxgVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.a.onScale(scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.c.k = true;
        this.a.onScaleBegin(scaleGestureDetector);
        this.b.g();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.a.onScaleEnd(scaleGestureDetector);
    }
}
