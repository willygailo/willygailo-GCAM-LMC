package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
final class faa extends gfx {
    final /* synthetic */ fah a;

    public faa(fah fahVar) {
        this.a = fahVar;
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void B() {
        this.a.f.b(R.raw.camera_shutter);
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void D(float f) {
        if (f == 1.0f) {
            this.a.f.b(R.raw.camera_shutter);
        }
    }
}
