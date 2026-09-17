package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class iry extends iru {
    final /* synthetic */ irz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iry(irz irzVar, Context context, irr irrVar) {
        super(context, irrVar);
        this.d = irzVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jlz jlzVar;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.d.t.close();
            irz irzVar = this.d;
            iqm iqmVarC = irzVar.o.c(irzVar.o.getProgress());
            String strA = irzVar.a(iqmVarC);
            String strA2 = irzVar.a(iqmVarC);
            if (irzVar.q == null || !irzVar.a.get()) {
                return;
            }
            jrz jrzVarA = jrz.a(irzVar.i.getDefaultDisplay(), irzVar.c);
            int dimensionPixelSize = irzVar.g.getDimensionPixelSize(R.dimen.speed_up_seekbar_padding_between_tooltip);
            switch (jrzVarA) {
                case PORTRAIT:
                    jlzVar = new jlz(strA);
                    jlzVar.s(irzVar.q);
                    jlzVar.i();
                    break;
                case LANDSCAPE:
                    jlzVar = new jlz(strA);
                    jlzVar.l(irzVar.q, dimensionPixelSize);
                    jlzVar.j();
                    break;
                case REVERSE_LANDSCAPE:
                    jlzVar = new jlz(strA);
                    jlzVar.h(irzVar.q, dimensionPixelSize);
                    jlzVar.k();
                    break;
                default:
                    return;
            }
            jlzVar.j = irzVar.g.getColor(R.color.google_blue700, null);
            jlzVar.o();
            jlzVar.f = true;
            jlzVar.c = 300;
            jlzVar.d = 3300;
            jlzVar.m = 5;
            jlzVar.e = false;
            jlzVar.i = irzVar.h;
            irzVar.t = jlzVar.a();
            irzVar.q.announceForAccessibility(strA2);
            irzVar.e.c(irzVar.t);
        }
    }
}
