package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class irq extends View.AccessibilityDelegate {
    final /* synthetic */ irr a;

    public irq(irr irrVar) {
        this.a = irrVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        irr irrVar = this.a;
        accessibilityNodeInfo.setContentDescription(irrVar.d(irrVar.getProgress()));
    }
}
