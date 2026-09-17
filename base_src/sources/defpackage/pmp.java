package defpackage;

import android.app.KeyguardManager;
import android.util.Log;
import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public final class pmp extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ Runnable a;
    final /* synthetic */ LensApi.LensLaunchStatusCallback b;

    public pmp(Runnable runnable, LensApi.LensLaunchStatusCallback lensLaunchStatusCallback) {
        this.a = runnable;
        this.b = lensLaunchStatusCallback;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
        Log.e("LensApi", "Error dismissing keyguard");
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        this.a.run();
        LensApi.LensLaunchStatusCallback lensLaunchStatusCallback = this.b;
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(0);
        }
    }
}
