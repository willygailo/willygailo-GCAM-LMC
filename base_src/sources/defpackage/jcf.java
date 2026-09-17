package defpackage;

import android.app.Activity;
import android.graphics.RectF;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class jcf {
    private static final ouj a = ouj.h("com/google/android/apps/camera/ui/layout/legacy/CaptureLayoutHelper");
    private final Activity b;

    public jcf(Activity activity) {
        this.b = activity;
    }

    public final RectF a() {
        jbw jbwVar = (jbw) b().r.get();
        if (jbwVar != null) {
            return new RectF(jbwVar.b.e);
        }
        ((oug) ((oug) a.c()).G((char) 3245)).o("Preview rectangle is not available now");
        return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    }

    public final MainActivityLayout b() {
        return (MainActivityLayout) this.b.findViewById(R.id.activity_root_view);
    }

    public final boolean c() {
        return this.b.isInMultiWindowMode();
    }
}
