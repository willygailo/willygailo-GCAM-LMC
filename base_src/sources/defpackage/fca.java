package defpackage;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;

/* JADX INFO: loaded from: classes.dex */
final class fca extends Preference {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fca(Context context, int i, int i2) {
        super(context);
        this.a = i;
        this.b = i2;
    }

    @Override // android.preference.Preference
    protected final void onBindView(View view) {
        super.onBindView(view);
        if (CameraSettingsActivity.p) {
            return;
        }
        if (this.a == this.b) {
            view.setBackgroundResource(R.drawable.rounded_rect_grey_bottom_inset);
        } else {
            view.setBackgroundResource(R.drawable.rounded_rect_grey_middle_inset);
        }
    }
}
