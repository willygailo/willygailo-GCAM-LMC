package defpackage;

import com.google.android.apps.camera.imax.cyclops.processing.NativeCaptureImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ejn implements ejp {
    public static int a = 8192;
    public static float b = 60.0f;

    @Override // defpackage.ejp
    public final ejo a() {
        return new NativeCaptureImpl(a, b);
    }
}
