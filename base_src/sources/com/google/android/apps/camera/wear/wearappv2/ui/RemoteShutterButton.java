package com.google.android.apps.camera.wear.wearappv2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* JADX INFO: loaded from: classes.dex */
public class RemoteShutterButton extends ShutterButton {
    public RemoteShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    protected final float getDefaultScale() {
        return getResources().getDisplayMetrics().widthPixels * 0.001875f;
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        for (AccessibilityNodeInfo.AccessibilityAction accessibilityAction : accessibilityNodeInfo.getActionList()) {
            if (accessibilityAction.getId() == 32) {
                accessibilityNodeInfo.removeAction(accessibilityAction);
                return;
            }
        }
    }
}
