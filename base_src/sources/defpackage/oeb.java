package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class oeb extends oeg {
    public oeb(oed oedVar, ofi ofiVar) {
        new oxk("OnCompleteUpdateCallback", null);
        super(oedVar, ofiVar);
    }

    @Override // defpackage.oeg
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (oed.a(bundle) != 0) {
            this.b.a(new oej(oed.a(bundle)));
        } else {
            this.b.b(null);
        }
    }
}
