package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class ng extends ot {
    final /* synthetic */ nn a;
    final /* synthetic */ nq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(nq nqVar, View view, nn nnVar) {
        super(view);
        this.b = nqVar;
        this.a = nnVar;
    }

    @Override // defpackage.ot
    public final lo a() {
        return this.a;
    }

    @Override // defpackage.ot
    public final boolean b() {
        if (this.b.b.u()) {
            return true;
        }
        this.b.b();
        return true;
    }
}
