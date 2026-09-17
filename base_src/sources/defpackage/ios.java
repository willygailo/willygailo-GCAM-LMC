package defpackage;

import android.text.format.DateUtils;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ios {
    public final /* synthetic */ iqj a;

    public final void a(final long j, final float f) {
        final iqj iqjVar = this.a;
        iqjVar.m.c(new Runnable() { // from class: ipz
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                iqj iqjVar2 = iqjVar;
                long j2 = j;
                float f2 = f;
                if (iqjVar2.k.k(dcu.J)) {
                    long millis = (long) (TimeUnit.SECONDS.toMillis(j2) / f2);
                    iqjVar2.j.g(millis);
                    iqjVar2.B.g("/video_state_recording_output", millis);
                } else {
                    iro iroVar = iqjVar2.i;
                    iroVar.b.set((long) (TimeUnit.SECONDS.toMillis(j2) / f2));
                    if (TimeUnit.MILLISECONDS.toHours(iroVar.b.get()) > 0) {
                        int dimensionPixelSize = iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_expand_width);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iroVar.f.getLayoutParams();
                        int width = iroVar.f.getWidth();
                        if (iroVar.m) {
                            z = false;
                        } else {
                            width += dimensionPixelSize;
                            iroVar.m = true;
                            z = true;
                        }
                        if (z) {
                            layoutParams.width = width;
                            iroVar.f.setLayoutParams(layoutParams);
                            iroVar.f.b(false, true);
                            iroVar.f.requestLayout();
                        }
                    }
                    iroVar.f.d(DateUtils.formatElapsedTime(Duration.ofMillis(iroVar.b.get()).getSeconds()));
                }
                if (iqjVar2.b.get() != j2) {
                    iqjVar2.t.am();
                    iqjVar2.b.set(j2);
                }
            }
        });
    }
}
