package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class go {
    public final WeakReference a;

    public go(View view) {
        this.a = new WeakReference(view);
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(gp gpVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (gpVar != null) {
                view.animate().setListener(new gm(gpVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(jn jnVar) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(jnVar != null ? new gn(jnVar) : null);
        }
    }

    public final void f(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
