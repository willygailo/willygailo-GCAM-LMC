package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class nwo implements ft {
    final /* synthetic */ AppBarLayout a;

    public nwo(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.ft
    public final gy a(View view, gy gyVar) {
        AppBarLayout appBarLayout = this.a;
        gy gyVar2 = true != gl.R(appBarLayout) ? null : gyVar;
        if (!Objects.equals(appBarLayout.c, gyVar2)) {
            appBarLayout.c = gyVar2;
            appBarLayout.j();
            appBarLayout.requestLayout();
        }
        return gyVar;
    }
}
