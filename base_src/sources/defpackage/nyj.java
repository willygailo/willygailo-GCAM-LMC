package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nyj extends id {
    public Drawable b;
    private final Rect c;

    /* JADX WARN: Illegal instructions before constructor call */
    public nyj(Context context, int i) {
        int iV = v(context);
        Context contextA = odn.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        super(iV != 0 ? new us(contextA, iV) : contextA, i == 0 ? v(context) : i);
        Context contextA2 = a();
        Resources.Theme theme = contextA2.getTheme();
        TypedArray typedArrayA = nzw.a(contextA2, null, nyk.a, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(2, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(3, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(1, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(0, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayA.recycle();
        int layoutDirection = contextA2.getResources().getConfiguration().getLayoutDirection();
        this.c = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection == 1 ? dimensionPixelSize : dimensionPixelSize3, dimensionPixelSize4);
        int iF = obr.f(contextA2, R.attr.colorSurface, getClass().getCanonicalName());
        obu obuVar = new obu(obz.a(contextA2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents).a());
        obuVar.f(contextA2);
        obuVar.h(ColorStateList.valueOf(iF));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(a().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            obuVar.b(obuVar.a.a.d(dimension));
        }
        this.b = obuVar;
    }

    private static int v(Context context) {
        TypedValue typedValueG = obr.g(context, R.attr.materialAlertDialogTheme);
        if (typedValueG == null) {
            return 0;
        }
        return typedValueG.data;
    }

    @Override // defpackage.id
    public final ie b() {
        ie ieVarB = super.b();
        Window window = ieVarB.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.b;
        if (drawable instanceof obu) {
            ((obu) drawable).g(gl.a(decorView));
        }
        Drawable drawable2 = this.b;
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new nyi(ieVarB, this.c));
        return ieVarB;
    }

    public final void k(boolean z) {
        this.a.k = z;
    }

    public final void l(int i) {
        hz hzVar = this.a;
        hzVar.f = hzVar.a.getText(i);
    }

    public final void m(CharSequence charSequence) {
        super.e(charSequence);
    }

    public final void n(int i, DialogInterface.OnClickListener onClickListener) {
        hz hzVar = this.a;
        hzVar.i = hzVar.a.getText(i);
        this.a.j = onClickListener;
    }

    public final void o(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.f(charSequence, onClickListener);
    }

    public final void p(DialogInterface.OnKeyListener onKeyListener) {
        super.g(onKeyListener);
    }

    public final void q(int i, DialogInterface.OnClickListener onClickListener) {
        hz hzVar = this.a;
        hzVar.g = hzVar.a.getText(i);
        this.a.h = onClickListener;
    }

    public final void r(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.h(charSequence, onClickListener);
    }

    public final void s(int i) {
        hz hzVar = this.a;
        hzVar.d = hzVar.a.getText(i);
    }

    public final void t(CharSequence charSequence) {
        super.i(charSequence);
    }

    public final void u(View view) {
        super.j(view);
    }
}
