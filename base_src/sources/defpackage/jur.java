package defpackage;

import android.view.View;
import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class jur {
    private static final Duration b = Duration.ofMillis(200);
    private static final Duration c = Duration.ofMillis(100);
    public static final Duration a = Duration.ofMillis(150);

    public static void a(final int i, final View view) {
        float f = i == 0 ? 1.0f : 0.0f;
        view.animate().cancel();
        final boolean z = i == 0;
        view.setClickable(false);
        if (z) {
            view.setVisibility(0);
        }
        view.animate().alpha(f).setDuration((z ? b : a).toMillis()).setStartDelay(z ? c.toMillis() : 0L).setInterpolator(new adt()).withEndAction(new Runnable() { // from class: juq
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                boolean z2 = z;
                int i2 = i;
                Duration duration = jur.a;
                view2.setClickable(z2);
                view2.setVisibility(i2);
            }
        }).start();
    }
}
