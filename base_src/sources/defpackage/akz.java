package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class akz extends fg {
    @Override // defpackage.fg
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(false);
        accessibilityEvent.getEventType();
    }

    @Override // defpackage.fg
    public final void c(View view, hb hbVar) {
        super.c(view, hbVar);
        hbVar.e("androidx.viewpager.widget.ViewPager");
        hbVar.i(false);
    }

    @Override // defpackage.fg
    public final boolean i(View view, int i, Bundle bundle) {
        return super.i(view, i, bundle);
    }
}
