package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public class mq extends CheckBox {
    private final ms a;
    private final mp b;
    private final nt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        rk.a(context);
        ri.d(this, getContext());
        ms msVar = new ms(this);
        this.a = msVar;
        msVar.a(attributeSet, R.attr.checkboxStyle);
        mp mpVar = new mp(this);
        this.b = mpVar;
        mpVar.d(attributeSet, R.attr.checkboxStyle);
        nt ntVar = new nt(this);
        this.c = ntVar;
        ntVar.b(attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        mp mpVar = this.b;
        if (mpVar != null) {
            mpVar.c();
        }
        nt ntVar = this.c;
        if (ntVar != null) {
            ntVar.a();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        mp mpVar = this.b;
        if (mpVar != null) {
            mpVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        mp mpVar = this.b;
        if (mpVar != null) {
            mpVar.e(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(jr.b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ms msVar = this.a;
        if (msVar != null) {
            msVar.b();
        }
    }
}
