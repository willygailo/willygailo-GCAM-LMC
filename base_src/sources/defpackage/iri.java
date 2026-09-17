package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class iri extends View.AccessibilityDelegate {
    final /* synthetic */ irj a;

    public iri(irj irjVar) {
        this.a = irjVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        String string = this.a.b.getString(R.string.accessibility_output_time_during_video_recording);
        String strValueOf = String.valueOf(this.a.d.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + String.valueOf(strValueOf).length());
        sb.append(string);
        sb.append(strValueOf);
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }
}
