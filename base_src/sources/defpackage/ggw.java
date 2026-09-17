package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: loaded from: classes.dex */
public final class ggw implements ggy {
    public static final MeteringRectangle[] a = {new MeteringRectangle(0, 0, 0, 0, 0)};

    public static ggy c() {
        return ggv.a;
    }

    @Override // defpackage.ggy
    public final MeteringRectangle[] a(Rect rect) {
        return a;
    }

    @Override // defpackage.ggy
    public final MeteringRectangle[] b(Rect rect) {
        return a;
    }
}
