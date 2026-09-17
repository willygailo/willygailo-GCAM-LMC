package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class md extends ot {
    final /* synthetic */ me a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(me meVar, View view) {
        super(view);
        this.a = meVar;
    }

    @Override // defpackage.ot
    public final lo a() {
        mf mfVar = this.a.a.i;
        if (mfVar == null) {
            return null;
        }
        return mfVar.a();
    }

    @Override // defpackage.ot
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.ot
    public final boolean c() {
        mh mhVar = this.a.a;
        if (mhVar.k != null) {
            return false;
        }
        mhVar.k();
        return true;
    }
}
