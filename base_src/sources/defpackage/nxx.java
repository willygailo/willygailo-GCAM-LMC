package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class nxx extends fg {
    final /* synthetic */ nya b;

    public nxx(nya nyaVar) {
        this.b = nyaVar;
    }

    @Override // defpackage.fg
    public final void c(View view, hb hbVar) {
        super.c(view, hbVar);
        if (!this.b.d) {
            hbVar.h(false);
        } else {
            hbVar.b(1048576);
            hbVar.h(true);
        }
    }

    @Override // defpackage.fg
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            nya nyaVar = this.b;
            if (nyaVar.d) {
                nyaVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.i(view, i, bundle);
    }
}
