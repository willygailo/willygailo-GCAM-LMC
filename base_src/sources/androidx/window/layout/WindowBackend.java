package androidx.window.layout;

import android.app.Activity;
import defpackage.fb;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, fb fbVar);

    void unregisterLayoutChangeCallback(fb fbVar);
}
