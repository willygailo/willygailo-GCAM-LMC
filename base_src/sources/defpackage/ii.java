package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ii {
    public static final xa a = new xa();
    public static final Object b = new Object();

    public static void h(ii iiVar) {
        synchronized (b) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                ii iiVar2 = (ii) ((WeakReference) it.next()).get();
                if (iiVar2 == iiVar || iiVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract hu a();

    public abstract View b(int i);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void i(int i);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);

    public abstract void m();

    public abstract void n(int i);
}
