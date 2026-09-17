package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: loaded from: classes.dex */
public final class duw implements pys {
    private final qkg a;

    public duw(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bnl get() {
        return (FocusIndicatorView) ((jnr) this.a.get()).c.c(R.id.focus_indicator_view);
    }
}
