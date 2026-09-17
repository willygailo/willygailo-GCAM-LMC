package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class iee extends View.AccessibilityDelegate {
    final /* synthetic */ ief a;

    public iee(ief iefVar) {
        this.a = iefVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        iby ibyVar;
        if ((accessibilityEvent.getEventType() == 128 || accessibilityEvent.getEventType() == 32768) && (ibyVar = this.a.d) != null) {
            ((icw) ibyVar.a.c.get()).p(ibyVar.a.a.getInteger(R.integer.accessibility_social_handle_close_timeout));
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
}
