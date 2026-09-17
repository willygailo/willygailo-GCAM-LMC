package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import com.google.android.apps.camera.ui.elapsedtimeui.LongPressElapsedTimeView;

/* JADX INFO: loaded from: classes2.dex */
public final class jpo implements jqn {
    private final jas a;
    private final jas b;
    private final qkg c;
    private final ddf d;

    public jpo(jas jasVar, jas jasVar2, qkg qkgVar, ddf ddfVar) {
        this.a = jasVar;
        this.b = jasVar2;
        this.c = qkgVar;
        this.d = ddfVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        jus jusVar = ((jnr) this.c.get()).c;
        ElapsedTimerView elapsedTimerView = (ElapsedTimerView) jusVar.c(R.id.elapsed_timer_view);
        LongPressElapsedTimeView longPressElapsedTimeView = (LongPressElapsedTimeView) jusVar.c(R.id.long_press_elapsed_timer_view);
        if (this.d.k(ddr.n)) {
            this.b.i(longPressElapsedTimeView);
        } else {
            this.b.i(elapsedTimerView);
        }
        this.a.i(elapsedTimerView);
    }
}
