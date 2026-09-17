package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class ahk extends fg {
    final /* synthetic */ ahl b;

    public ahk(ahl ahlVar) {
        this.b = ahlVar;
    }

    @Override // defpackage.fg
    public final void c(View view, hb hbVar) {
        this.b.e.c(view, hbVar);
        int iC = this.b.d.c(view);
        pu puVar = this.b.d.l;
        if (puVar instanceof ahe) {
            ((ahe) puVar).j(iC);
        }
    }

    @Override // defpackage.fg
    public final boolean i(View view, int i, Bundle bundle) {
        return this.b.e.i(view, i, bundle);
    }
}
