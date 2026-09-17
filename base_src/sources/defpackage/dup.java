package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: loaded from: classes.dex */
public final class dup {
    public final Context a;
    public final Resources b;
    public final FocusIndicatorRingView c;
    public final TextView d;
    public final FocusIndicatorView e;

    public dup(Context context, FocusIndicatorView focusIndicatorView) {
        this.a = context;
        this.e = focusIndicatorView;
        this.b = context.getResources();
        this.c = (FocusIndicatorRingView) focusIndicatorView.findViewById(R.id.focus_indicator_ring);
        this.d = (TextView) focusIndicatorView.findViewById(R.id.focus_indicator_debug_hud);
    }
}
