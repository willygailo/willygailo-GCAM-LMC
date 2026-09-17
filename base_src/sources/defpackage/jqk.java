package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class jqk implements jqn {
    private final qkg a;
    private final hjn b;

    public jqk(hjn hjnVar, qkg qkgVar) {
        this.b = hjnVar;
        this.a = qkgVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        this.b.d((ProgressOverlay) ((jnr) this.a.get()).c.c(R.id.progress_overlay));
    }
}
