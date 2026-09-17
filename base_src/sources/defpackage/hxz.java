package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* JADX INFO: loaded from: classes2.dex */
public final class hxz extends iue {
    final /* synthetic */ SmartsChipView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxz(SmartsChipView smartsChipView, View.AccessibilityDelegate accessibilityDelegate) {
        super(accessibilityDelegate);
        this.a = smartsChipView;
    }

    @Override // defpackage.iue, android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 2048) {
            CharSequence contentDescription = view.getContentDescription();
            boolean zEquals = TextUtils.equals(this.a.h, contentDescription);
            this.a.h = contentDescription;
            if (zEquals) {
                return;
            }
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
