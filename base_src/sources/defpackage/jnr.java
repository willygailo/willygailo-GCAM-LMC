package defpackage;

import android.support.constraint.ConstraintLayout;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jnr {
    public final ConstraintLayout a;
    public final View b;
    public final jus c;

    public jnr(jus jusVar) {
        lar.a();
        this.c = jusVar;
        this.a = (ConstraintLayout) jusVar.c(R.id.camera_app_root);
        this.b = (View) jusVar.c(R.id.preview_overlay);
    }
}
