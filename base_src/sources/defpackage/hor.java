package defpackage;

import android.content.Context;
import android.view.Choreographer;
import android.view.MotionEvent;
import com.google.android.apps.camera.ui.layout.GcaLayout;

/* JADX INFO: loaded from: classes2.dex */
final class hor extends GcaLayout {
    public hor(Context context) {
        super(context);
        setTag(toString());
        setVisibility(8);
    }

    public static final pht d() {
        pih pihVarF = pih.f();
        Choreographer.getInstance().postFrameCallback(new hoq(pihVarF, 0));
        return pihVarF;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
