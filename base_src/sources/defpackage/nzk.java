package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes2.dex */
public final class nzk extends fg {
    final /* synthetic */ CheckableImageButton b;

    public nzk(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    @Override // defpackage.fg
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.a);
    }

    @Override // defpackage.fg
    public final void c(View view, hb hbVar) {
        super.c(view, hbVar);
        hbVar.d(this.b.b);
        hbVar.a.setChecked(this.b.a);
    }
}
