package androidx.window.layout;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: androidx.window.layout.WindowMetricsCalculator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static WindowMetricsCalculator getOrCreate() {
            return WindowMetricsCalculator.Companion.getOrCreate();
        }
    }

    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final WindowMetricsCalculator getOrCreate() {
            return WindowMetricsCalculatorCompat.INSTANCE;
        }
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);
}
