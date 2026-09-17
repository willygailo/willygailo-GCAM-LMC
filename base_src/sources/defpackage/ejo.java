package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: loaded from: classes.dex */
public interface ejo {
    float getCaptureProgress();

    Bitmap getPreview(int i);

    Texture getPreviewAsTexture();

    void getTrackerStats(TrackerStats trackerStats);

    void release();

    void setMetaData(float f, int i, boolean z, int i2, boolean z2);

    void startCapture();

    int stopCapture(String str);

    boolean trackTexture(float[] fArr, float[] fArr2);
}
