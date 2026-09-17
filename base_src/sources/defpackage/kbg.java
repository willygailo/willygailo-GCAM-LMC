package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes2.dex */
public final class kbg extends View.AccessibilityDelegate {
    final /* synthetic */ kbi a;

    public kbg(kbi kbiVar) {
        this.a = kbiVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        accessibilityNodeInfo.setContentDescription(this.a.F.getText());
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        switch (i) {
            case 4096:
                this.a.A();
                return true;
            case 8192:
                this.a.z();
                return true;
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
