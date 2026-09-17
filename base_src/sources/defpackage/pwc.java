package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;

/* JADX INFO: loaded from: classes2.dex */
public final class pwc {
    public final /* synthetic */ long a;

    public pwc(long j) {
        this.a = j;
    }

    public final void a(int i, int i2, long j, float[] fArr) {
        ExternalSurfaceManager.nativeUpdateSurface(this.a, i, i2, j, fArr);
    }
}
