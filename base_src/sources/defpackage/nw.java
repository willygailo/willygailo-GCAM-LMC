package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes2.dex */
public final class nw extends ToggleButton {
    private final mp a;
    private final nt b;

    public nw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        ri.d(this, getContext());
        mp mpVar = new mp(this);
        this.a = mpVar;
        mpVar.d(attributeSet, R.attr.buttonStyleToggle);
        nt ntVar = new nt(this);
        this.b = ntVar;
        ntVar.b(attributeSet, R.attr.buttonStyleToggle);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.c();
        }
        nt ntVar = this.b;
        if (ntVar != null) {
            ntVar.a();
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.e(i);
        }
    }
}
