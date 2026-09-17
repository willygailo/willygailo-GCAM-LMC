package defpackage;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class jxm implements epi {
    final /* synthetic */ jxn a;

    public jxm(jxn jxnVar) {
        this.a = jxnVar;
    }

    @Override // defpackage.epi
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.epi
    public final void c() {
        View viewFindViewById = this.a.i.findViewById(R.id.preview_overlay);
        if (viewFindViewById != null) {
            Point pointEl = mip.el(viewFindViewById);
            this.a.f.e(new PointF(pointEl.x + (viewFindViewById.getWidth() / 2), pointEl.y + (viewFindViewById.getHeight() / 2)));
        }
    }

    @Override // defpackage.epi
    public final /* synthetic */ void d(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void e(boolean z) {
    }

    @Override // defpackage.epi
    public final /* synthetic */ void f(boolean z) {
    }
}
