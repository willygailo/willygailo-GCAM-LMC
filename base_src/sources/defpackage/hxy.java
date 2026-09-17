package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: loaded from: classes2.dex */
public final class hxy extends View.AccessibilityDelegate {
    final /* synthetic */ SmartsChipView a;

    public hxy(SmartsChipView smartsChipView) {
        this.a = smartsChipView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            SmartsChipView smartsChipView = this.a;
            if (!smartsChipView.d) {
                smartsChipView.d = true;
            }
        } else if (accessibilityEvent.getEventType() == 65536) {
            if (!this.a.a.isAccessibilityFocused() && !this.a.c.isAccessibilityFocused()) {
                SmartsChipView smartsChipView2 = this.a;
                smartsChipView2.d = false;
                if (smartsChipView2.e) {
                    smartsChipView2.b();
                }
            }
        } else if (accessibilityEvent.getEventType() == 1) {
            view.performAccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS.getId(), null);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
