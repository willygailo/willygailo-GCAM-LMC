package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
final class fve implements fvh {
    private final /* synthetic */ int a;

    public fve(int i) {
        this.a = i;
    }

    @Override // defpackage.fvh
    public final fuz a() {
        switch (this.a) {
            case 0:
                return fuz.CROP_REGION;
            case 1:
                return fuz.ROTATION;
            default:
                return fuz.OUT_OF_FOCUS;
        }
    }

    @Override // defpackage.fvh
    public final boolean b(hjz hjzVar, hjz hjzVar2) {
        switch (this.a) {
            case 0:
                Rect rect = hjzVar.n;
                Rect rect2 = hjzVar2.n;
                return rect == null || rect2 == null || ((float) Math.hypot((double) (rect.width() - rect2.width()), (double) (rect.height() - rect2.height()))) > 1.0E-6f;
            case 1:
                return hjzVar.r != hjzVar2.r;
            default:
                return hjzVar.i == 6;
        }
    }
}
