package defpackage;

import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;

/* JADX INFO: loaded from: classes.dex */
public final class feo implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ PhotoSphereMessageOverlay b;

    public feo(PhotoSphereMessageOverlay photoSphereMessageOverlay, int i) {
        this.b = photoSphereMessageOverlay;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = (TextView) this.b.findViewById(R.id.short_info_message);
        textView.setText(this.a);
        textView.setVisibility(0);
        textView.announceForAccessibility(this.b.getResources().getString(this.a));
    }
}
