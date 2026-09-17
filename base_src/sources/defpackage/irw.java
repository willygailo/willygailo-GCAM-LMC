package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class irw extends FrameLayout {
    final /* synthetic */ irz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irw(irz irzVar, Context context) {
        super(context);
        this.a = irzVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jrz jrzVarA = jrz.a(this.a.i.getDefaultDisplay(), this.a.c);
        if (z || !((jrz) this.a.b.d).equals(jrzVarA)) {
            this.a.b(jrzVarA);
        }
    }
}
