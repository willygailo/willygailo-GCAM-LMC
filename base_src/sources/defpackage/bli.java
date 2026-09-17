package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class bli implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public bli(blj bljVar) {
        this.a = new WeakReference(bljVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        blj bljVar = (blj) this.a.get();
        if (bljVar == null || bljVar.c.isEmpty()) {
            return true;
        }
        int iB = bljVar.b();
        int iA = bljVar.a();
        if (!blj.d(iB, iA)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(bljVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((blg) arrayList.get(i)).g(iB, iA);
        }
        bljVar.c();
        return true;
    }
}
