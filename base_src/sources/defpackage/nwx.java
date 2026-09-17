package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class nwx implements ft {
    final /* synthetic */ CollapsingToolbarLayout a;

    public nwx(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.ft
    public final gy a(View view, gy gyVar) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        gy gyVar2 = true != gl.R(collapsingToolbarLayout) ? null : gyVar;
        if (!Objects.equals(collapsingToolbarLayout.e, gyVar2)) {
            collapsingToolbarLayout.e = gyVar2;
            collapsingToolbarLayout.requestLayout();
        }
        return gyVar.i();
    }
}
