package androidx.window.layout;

import android.app.Activity;
import android.os.Looper;
import androidx.window.R;
import defpackage.qmj;
import defpackage.qno;
import defpackage.qtr;

/* JADX INFO: loaded from: classes.dex */
public interface WindowInfoRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoRepository$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static WindowInfoRepository getOrCreate(Activity activity) {
            return WindowInfoRepository.Companion.getOrCreate(activity);
        }

        public static void overrideDecorator(WindowInfoRepositoryDecorator windowInfoRepositoryDecorator) {
            WindowInfoRepository.Companion.overrideDecorator(windowInfoRepositoryDecorator);
        }

        public static void reset() {
            WindowInfoRepository.Companion.reset();
        }
    }

    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static WindowInfoRepositoryDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        private final /* synthetic */ Object getOrCreateTag(Activity activity, int i, qmj qmjVar) {
            Object tag = activity.getWindow().getDecorView().getTag(i);
            qno.b();
            if (tag != null) {
                return tag;
            }
            qno.c(Looper.getMainLooper(), Looper.myLooper());
            Object objInvoke = qmjVar.invoke();
            activity.getWindow().getDecorView().setTag(i, objInvoke);
            return objInvoke;
        }

        private final /* synthetic */ Object getTag(Activity activity, int i) {
            Object tag = activity.getWindow().getDecorView().getTag(i);
            qno.b();
            return tag;
        }

        public final WindowInfoRepository getOrCreate(Activity activity) {
            activity.getClass();
            Object tag = activity.getWindow().getDecorView().getTag(R.id.androidx_window_activity_scope);
            if (true != (tag instanceof WindowInfoRepository)) {
                tag = null;
            }
            WindowInfoRepository windowInfoRepository = (WindowInfoRepository) tag;
            if (true != (windowInfoRepository instanceof WindowInfoRepository)) {
                windowInfoRepository = null;
            }
            if (windowInfoRepository == null) {
                int i = R.id.androidx_window_activity_scope;
                Object tag2 = activity.getWindow().getDecorView().getTag(i);
                WindowInfoRepositoryImpl windowInfoRepositoryImpl = (WindowInfoRepositoryImpl) (true == (tag2 instanceof WindowInfoRepositoryImpl) ? tag2 : null);
                if (windowInfoRepositoryImpl == null) {
                    qno.c(Looper.getMainLooper(), Looper.myLooper());
                    WindowInfoRepositoryImpl windowInfoRepositoryImpl2 = new WindowInfoRepositoryImpl(activity, WindowMetricsCalculatorCompat.INSTANCE, ExtensionWindowBackend.Companion.getInstance(activity));
                    activity.getWindow().getDecorView().setTag(i, windowInfoRepositoryImpl2);
                    windowInfoRepository = windowInfoRepositoryImpl2;
                } else {
                    windowInfoRepository = windowInfoRepositoryImpl;
                }
            }
            return decorator.decorate(windowInfoRepository);
        }

        public final void overrideDecorator(WindowInfoRepositoryDecorator windowInfoRepositoryDecorator) {
            windowInfoRepositoryDecorator.getClass();
            decorator = windowInfoRepositoryDecorator;
        }

        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }
    }

    qtr getCurrentWindowMetrics();

    qtr getWindowLayoutInfo();
}
