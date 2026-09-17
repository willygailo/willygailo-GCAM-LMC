package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.aae;
import defpackage.aah;
import defpackage.nyu;
import defpackage.nzi;
import defpackage.nzj;
import defpackage.nzo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends aae {
    private Rect a;
    private boolean b;
    private boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nzj.a);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final boolean A(View view, nyu nyuVar) {
        return (this.b || this.c) && ((aah) nyuVar.getLayoutParams()).f == view.getId();
    }

    private final boolean B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, nyu nyuVar) {
        if (!A(appBarLayout, nyuVar)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        nzo.a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.d()) {
            y(nyuVar);
            return true;
        }
        x(nyuVar);
        return true;
    }

    private final boolean C(View view, nyu nyuVar) {
        if (!A(view, nyuVar)) {
            return false;
        }
        if (view.getTop() < (nyuVar.getHeight() / 2) + ((aah) nyuVar.getLayoutParams()).topMargin) {
            y(nyuVar);
            return true;
        }
        x(nyuVar);
        return true;
    }

    private static boolean z(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof aah) {
            return ((aah) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    @Override // defpackage.aae
    public final void a(aah aahVar) {
        if (aahVar.h == 0) {
            aahVar.h = 80;
        }
    }

    @Override // defpackage.aae
    public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        nyu nyuVar = (nyu) view;
        List listH = coordinatorLayout.h(nyuVar);
        int size = listH.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listH.get(i2);
            if (!(view2 instanceof AppBarLayout)) {
                if (z(view2) && C(view2, nyuVar)) {
                    break;
                }
            } else {
                if (B(coordinatorLayout, (AppBarLayout) view2, nyuVar)) {
                    break;
                }
            }
        }
        coordinatorLayout.l(nyuVar, i);
        return true;
    }

    @Override // defpackage.aae
    public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        nyu nyuVar = (nyu) view;
        if (view2 instanceof AppBarLayout) {
            B(coordinatorLayout, (AppBarLayout) view2, nyuVar);
        } else if (z(view2)) {
            C(view2, nyuVar);
        }
    }

    @Override // defpackage.aae
    public final /* bridge */ /* synthetic */ boolean r(View view, Rect rect) {
        return false;
    }

    protected final void x(nyu nyuVar) {
        if (this.c) {
            int i = nyu.f;
            nzi nziVar = nyuVar.c;
        } else {
            int i2 = nyu.f;
            nzi nziVar2 = nyuVar.d;
        }
        throw null;
    }

    protected final void y(nyu nyuVar) {
        if (this.c) {
            int i = nyu.f;
            nzi nziVar = nyuVar.b;
        } else {
            int i2 = nyu.f;
            nzi nziVar2 = nyuVar.e;
        }
        throw null;
    }
}
