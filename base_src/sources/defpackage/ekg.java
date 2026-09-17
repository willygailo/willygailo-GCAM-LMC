package defpackage;

import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;

/* JADX INFO: loaded from: classes.dex */
public final class ekg {
    private float a;
    private float b;
    private int c;

    public ekg() {
        b();
    }

    public final synchronized void a(TrackerStats trackerStats) {
        this.c++;
        float f = trackerStats.featureMotionInPixels;
        int iMin = Math.min(trackerStats.numActiveTracks, 50);
        float fMin = 1.0f / Math.min(this.c, 5);
        float f2 = 1.0f - fMin;
        this.a = (f * fMin) + (this.a * f2);
        this.b = (fMin * (iMin / 50.0f)) + (f2 * this.b);
    }

    public final synchronized void b() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0;
    }
}
