package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes2.dex */
final class nxz extends nxr {
    private final boolean a;
    private final boolean b;
    private final gy c;

    public nxz(View view, gy gyVar) {
        this.c = gyVar;
        boolean z = (view.getSystemUiVisibility() & 8192) != 0;
        this.b = z;
        obu obuVar = BottomSheetBehavior.z(view).c;
        ColorStateList colorStateListL = obuVar != null ? obuVar.a.d : gl.l(view);
        if (colorStateListL != null) {
            this.a = ohh.Z(colorStateListL.getDefaultColor());
        } else if (view.getBackground() instanceof ColorDrawable) {
            this.a = ohh.Z(((ColorDrawable) view.getBackground()).getColor());
        } else {
            this.a = z;
        }
    }

    private final void c(View view) {
        if (view.getTop() < this.c.d()) {
            nya.e(view, this.a);
            view.setPadding(view.getPaddingLeft(), this.c.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            nya.e(view, this.b);
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.nxr
    public final void a(View view, int i) {
        c(view);
    }

    @Override // defpackage.nxr
    public final void b(View view) {
        c(view);
    }
}
