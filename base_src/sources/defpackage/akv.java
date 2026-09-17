package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public final class akv implements ft {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public akv(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.ft
    public final gy a(View view, gy gyVar) {
        gy gyVarS = gl.s(view, gyVar);
        if (gyVarS.r()) {
            return gyVarS;
        }
        Rect rect = this.b;
        rect.left = gyVarS.b();
        rect.top = gyVarS.d();
        rect.right = gyVarS.c();
        rect.bottom = gyVarS.a();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            gy gyVarQ = gl.q(this.a.getChildAt(i), gyVarS);
            rect.left = Math.min(gyVarQ.b(), rect.left);
            rect.top = Math.min(gyVarQ.d(), rect.top);
            rect.right = Math.min(gyVarQ.c(), rect.right);
            rect.bottom = Math.min(gyVarQ.a(), rect.bottom);
        }
        gr grVar = new gr(gyVarS);
        fx.m(el.b(rect.left, rect.top, rect.right, rect.bottom), grVar);
        return fx.l(grVar);
    }
}
