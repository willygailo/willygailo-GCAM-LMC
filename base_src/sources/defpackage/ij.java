package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class ij implements ft {
    final /* synthetic */ iy a;

    public ij(iy iyVar) {
        this.a = iyVar;
    }

    @Override // defpackage.ft
    public final gy a(View view, gy gyVar) {
        boolean z;
        boolean z2;
        int iD = gyVar.d();
        iy iyVar = this.a;
        int iD2 = gyVar.d();
        ActionBarContextView actionBarContextView = iyVar.m;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iyVar.m.getLayoutParams();
            if (iyVar.m.isShown()) {
                if (iyVar.G == null) {
                    iyVar.G = new Rect();
                    iyVar.H = new Rect();
                }
                Rect rect = iyVar.G;
                Rect rect2 = iyVar.H;
                rect.set(gyVar.b(), gyVar.d(), gyVar.c(), gyVar.a());
                ViewGroup viewGroup = iyVar.s;
                if (sd.a != null) {
                    try {
                        sd.a.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                gy gyVarR = gl.r(iyVar.s);
                int iB = gyVarR == null ? 0 : gyVarR.b();
                int iC = gyVarR == null ? 0 : gyVarR.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || iyVar.t != null) {
                    View view2 = iyVar.t;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            iyVar.t.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    iyVar.t = new View(iyVar.f);
                    iyVar.t.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    iyVar.s.addView(iyVar.t, -1, layoutParams);
                }
                View view3 = iyVar.t;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = iyVar.t;
                    view4.setBackgroundColor((gl.k(view4) & 8192) != 0 ? aas.a(iyVar.f, R.color.abc_decor_view_status_guard_light) : aas.a(iyVar.f, R.color.abc_decor_view_status_guard));
                }
                if (!iyVar.w && z) {
                    iD2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                iyVar.m.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = iyVar.t;
        if (view5 != null) {
            view5.setVisibility(true == z ? 0 : 8);
        }
        return gl.s(view, iD != iD2 ? gyVar.k(gyVar.b(), iD2, gyVar.c(), gyVar.a()) : gyVar);
    }
}
