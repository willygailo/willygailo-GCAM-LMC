package defpackage;

import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes2.dex */
final class ms {
    private final CompoundButton a;
    private boolean b;

    public ms(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    final void a(AttributeSet attributeSet, int i) {
        int iF;
        int iF2;
        rn rnVarQ = rn.q(this.a.getContext(), attributeSet, jq.l, i);
        CompoundButton compoundButton = this.a;
        gl.E(compoundButton, compoundButton.getContext(), jq.l, attributeSet, rnVarQ.b, i, 0);
        try {
            if (rnVarQ.p(1) && (iF2 = rnVarQ.f(1, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.a;
                    compoundButton2.setButtonDrawable(jr.b(compoundButton2.getContext(), iF2));
                } catch (Resources.NotFoundException e) {
                    if (rnVarQ.p(0)) {
                        CompoundButton compoundButton3 = this.a;
                        compoundButton3.setButtonDrawable(jr.b(compoundButton3.getContext(), iF));
                    }
                }
            } else if (rnVarQ.p(0) && (iF = rnVarQ.f(0, 0)) != 0) {
                CompoundButton compoundButton4 = this.a;
                compoundButton4.setButtonDrawable(jr.b(compoundButton4.getContext(), iF));
            }
            if (rnVarQ.p(2)) {
                this.a.setButtonTintList(rnVarQ.g(2));
            }
            if (rnVarQ.p(3)) {
                this.a.setButtonTintMode(oj.a(rnVarQ.c(3, -1), null));
            }
        } finally {
            rnVarQ.n();
        }
    }

    final void b() {
        if (this.b) {
            this.b = false;
        } else {
            this.b = true;
            this.a.getButtonDrawable();
        }
    }
}
