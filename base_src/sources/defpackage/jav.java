package defpackage;

import android.text.format.DateUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
final class jav extends View.AccessibilityDelegate {
    final /* synthetic */ jay a;

    public jav(jay jayVar) {
        this.a = jayVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c.setContentDescription(view.getResources().getString(R.string.accessibility_elapsed_recording_time_description, DateUtils.formatElapsedTime(Duration.ofMillis(this.a.e).getSeconds())));
        if (this.a.a.k(dcu.J)) {
            this.a.d.setContentDescription(view.getResources().getString(R.string.accessibility_video_output_length_description, DateUtils.formatElapsedTime(Duration.ofMillis(this.a.f).getSeconds())));
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
