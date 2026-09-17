package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class mf extends li {
    final /* synthetic */ mh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(mh mhVar, Context context, kw kwVar, View view) {
        super(context, kwVar, view, true);
        this.d = mhVar;
        this.b = 8388613;
        e(mhVar.l);
    }

    @Override // defpackage.li
    protected final void c() {
        kw kwVar = this.d.c;
        if (kwVar != null) {
            kwVar.close();
        }
        this.d.i = null;
        super.c();
    }
}
