package defpackage;

import android.R;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes2.dex */
public final class ho extends fg {
    @Override // defpackage.fg
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.h() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.h());
    }

    @Override // defpackage.fg
    public final void c(View view, hb hbVar) {
        int iH;
        super.c(view, hbVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        hbVar.e(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (iH = nestedScrollView.h()) <= 0) {
            return;
        }
        hbVar.i(true);
        if (nestedScrollView.getScrollY() > 0) {
            hbVar.c(ha.c);
            hbVar.c(ha.g);
        }
        if (nestedScrollView.getScrollY() < iH) {
            hbVar.c(ha.b);
            hbVar.c(ha.h);
        }
    }

    @Override // defpackage.fg
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        switch (i) {
            case 4096:
            case R.id.accessibilityActionScrollDown:
                int height = nestedScrollView.getHeight();
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int iMin = Math.min(nestedScrollView.getScrollY() + ((height - paddingBottom) - nestedScrollView.getPaddingTop()), nestedScrollView.h());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(iMin);
                return true;
            case 8192:
            case R.id.accessibilityActionScrollUp:
                int height2 = nestedScrollView.getHeight();
                int paddingBottom2 = nestedScrollView.getPaddingBottom();
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height2 - paddingBottom2) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(iMax);
                return true;
            default:
                return false;
        }
    }
}
