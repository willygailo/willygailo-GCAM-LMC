package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class nat implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ nav b;

    public nat(nav navVar, Application application) {
        this.b = navVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        nan nanVar = this.b.m.b == null ? this.b.m : this.b.n;
        nanVar.a = activity.getClass().getSimpleName();
        nanVar.b = Long.valueOf(jElapsedRealtime);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        nan nanVar = this.b.n.b == null ? this.b.m : this.b.n;
        if (nanVar.d == null) {
            nanVar.d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        try {
            View viewFindViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new nar(this, viewFindViewById, null));
            viewTreeObserver.addOnPreDrawListener(new nas(this, viewFindViewById));
        } catch (RuntimeException e) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        nan nanVar = this.b.n.b == null ? this.b.m : this.b.n;
        if (nanVar.c == null) {
            nanVar.c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
