package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class jmg implements ViewTreeObserver.OnGlobalLayoutListener, lie {
    public final AtomicReference a;
    public lie f = jmf.a;
    private final AtomicInteger g = new AtomicInteger(-1);
    public final Object d = new Object();
    public final List b = Collections.synchronizedList(new ArrayList());
    public final List c = Collections.synchronizedList(new ArrayList());
    public boolean e = false;

    public jmg(View view) {
        this.a = new AtomicReference(view);
    }

    public final void a() {
        synchronized (this.d) {
            View view = (View) this.a.get();
            if (this.e && view != null) {
                this.f.close();
                this.f = jmf.c;
                this.e = false;
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        a();
        this.b.clear();
        this.c.clear();
        this.a.set(null);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int andSet;
        View view = (View) this.a.get();
        if (view == null) {
            return;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            if (!view.isShown()) {
                return;
            } else {
                visibility = 0;
            }
        }
        if (visibility == 4) {
            if (view.isShown()) {
                return;
            } else {
                visibility = 4;
            }
        }
        if ((visibility == 8 && view.isShown()) || (andSet = this.g.getAndSet(visibility)) == visibility) {
            return;
        }
        if (visibility == 0) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } else if (andSet >= 0) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }
    }
}
