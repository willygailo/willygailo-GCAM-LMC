package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes2.dex */
public class qu extends fg {
    final RecyclerView b;
    public final qt c;

    public qu(RecyclerView recyclerView) {
        this.b = recyclerView;
        fg fgVarK = k();
        if (fgVarK == null || !(fgVarK instanceof qt)) {
            this.c = new qt(this);
        } else {
            this.c = (qt) fgVarK;
        }
    }

    @Override // defpackage.fg
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        qc qcVar;
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || l() || (qcVar = ((RecyclerView) view).m) == null) {
            return;
        }
        qcVar.P(accessibilityEvent);
    }

    @Override // defpackage.fg
    public final void c(View view, hb hbVar) {
        qc qcVar;
        super.c(view, hbVar);
        if (l() || (qcVar = this.b.m) == null) {
            return;
        }
        RecyclerView recyclerView = qcVar.q;
        qcVar.aF(recyclerView.c, recyclerView.L, hbVar);
    }

    @Override // defpackage.fg
    public final boolean i(View view, int i, Bundle bundle) {
        qc qcVar;
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (l() || (qcVar = this.b.m) == null) {
            return false;
        }
        RecyclerView recyclerView = qcVar.q;
        return qcVar.aW(recyclerView.c, recyclerView.L, i, bundle);
    }

    public fg k() {
        return this.c;
    }

    final boolean l() {
        return this.b.af();
    }
}
