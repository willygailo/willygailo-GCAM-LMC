package defpackage;

import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

/* JADX INFO: loaded from: classes.dex */
public final class fes implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ PhotoSphereMessageOverlay c;

    public fes(PhotoSphereMessageOverlay photoSphereMessageOverlay, boolean z, int i) {
        this.c = photoSphereMessageOverlay;
        this.a = z;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = (TextView) this.c.findViewById(R.id.long_message_overlay);
        if (!this.a) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        switch (this.b) {
            case 0:
                textView.setText(R.string.photosphere_calibration_step_one);
                break;
            case 1:
                textView.setText(R.string.photosphere_calibration_step_two);
                break;
            case 2:
                textView.setText(R.string.photosphere_calibration_step_three);
                break;
            case 3:
                textView.setText(R.string.photosphere_calibration_finished);
                break;
        }
    }
}
