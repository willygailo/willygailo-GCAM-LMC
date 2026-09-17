package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.time.Duration;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class iro {
    public final AtomicLong a = new AtomicLong(0);
    public final AtomicLong b = new AtomicLong(0);
    public final AtomicLong c = new AtomicLong(0);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicLong e = new AtomicLong(0);
    public final irj f;
    public final Resources g;
    public final jun h;
    public jns i;
    public Timer j;
    public View k;
    public boolean l;
    public boolean m;
    private final lar n;

    public iro(Context context, irj irjVar, lar larVar, jun junVar) {
        this.f = irjVar;
        this.n = larVar;
        this.h = junVar;
        this.g = context.getResources();
    }

    public final void a() {
        this.l = false;
        this.m = false;
        this.b.set(0L);
        this.a.set(0L);
        irj irjVar = this.f;
        irjVar.a();
        irjVar.d(DateUtils.formatElapsedTime(0L));
        irjVar.c(DateUtils.formatElapsedTime(0L));
        this.e.set(0L);
        this.d.set(0L);
        this.c.set(0L);
    }

    public final void b(final long j) {
        this.n.c(new Runnable() { // from class: irm
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                iro iroVar = this.a;
                iroVar.a.set(j);
                if (TimeUnit.MILLISECONDS.toHours(iroVar.a.get()) > 0) {
                    int dimensionPixelSize = iroVar.g.getDimensionPixelSize(R.dimen.frame_based_timer_expand_width);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iroVar.f.getLayoutParams();
                    int width = iroVar.f.getWidth();
                    if (iroVar.l) {
                        z = false;
                    } else {
                        width += dimensionPixelSize;
                        iroVar.l = true;
                        z = true;
                    }
                    if (z) {
                        layoutParams.width = width;
                        iroVar.f.setLayoutParams(layoutParams);
                        iroVar.f.b(true, false);
                        iroVar.f.requestLayout();
                    }
                }
                iroVar.f.c(DateUtils.formatElapsedTime(Duration.ofMillis(iroVar.a.get()).getSeconds()));
            }
        });
    }
}
