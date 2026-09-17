package defpackage;

import android.widget.SeekBar;
import com.google.android.apps.camera.zoomui.ZoomKnob;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
public class kcb extends kby {
    public final ZoomUi d;
    public final SeekBar e;
    public final ZoomKnob f;

    public kcb(ZoomUi zoomUi) {
        lar.a();
        this.d = zoomUi;
        this.e = zoomUi.g();
        this.f = zoomUi.n();
    }
}
