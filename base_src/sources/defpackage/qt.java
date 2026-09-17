package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qt extends fg {
    final qu b;
    public final Map c = new WeakHashMap();

    public qt(qu quVar) {
        this.b = quVar;
    }

    @Override // defpackage.fg
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        fg fgVar = (fg) this.c.get(view);
        if (fgVar != null) {
            fgVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.fg
    public final void c(View view, hb hbVar) {
        qc qcVar;
        if (this.b.l() || (qcVar = this.b.b.m) == null) {
            super.c(view, hbVar);
            return;
        }
        qcVar.aG(view, hbVar);
        fg fgVar = (fg) this.c.get(view);
        if (fgVar != null) {
            fgVar.c(view, hbVar);
        } else {
            super.c(view, hbVar);
        }
    }

    @Override // defpackage.fg
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        fg fgVar = (fg) this.c.get(view);
        if (fgVar != null) {
            fgVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.fg
    public final void e(View view, int i) {
        fg fgVar = (fg) this.c.get(view);
        if (fgVar != null) {
            fgVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.fg
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        fg fgVar = (fg) this.c.get(view);
        if (fgVar != null) {
            fgVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.fg
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        fg fgVar = (fg) this.c.get(view);
        return fgVar != null ? fgVar.g(view, accessibilityEvent) : super.g(view, accessibilityEvent);
    }

    @Override // defpackage.fg
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        fg fgVar = (fg) this.c.get(viewGroup);
        return fgVar != null ? fgVar.h(viewGroup, view, accessibilityEvent) : super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.fg
    public final boolean i(View view, int i, Bundle bundle) {
        if (this.b.l() || this.b.b.m == null) {
            return super.i(view, i, bundle);
        }
        fg fgVar = (fg) this.c.get(view);
        if (fgVar != null) {
            if (fgVar.i(view, i, bundle)) {
                return true;
            }
        } else if (super.i(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.b.b.m.q;
        qi qiVar = recyclerView.c;
        qp qpVar = recyclerView.L;
        return false;
    }

    @Override // defpackage.fg
    public final kkm j(View view) {
        fg fgVar = (fg) this.c.get(view);
        return fgVar != null ? fgVar.j(view) : super.j(view);
    }
}
