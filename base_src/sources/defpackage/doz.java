package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes.dex */
public class doz extends SurfaceView {
    public final ljm a;

    public doz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ljm();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        ljm ljmVar = this.a;
        lic.e(nle.g(getContext()));
        ljmVar.b(i, i2, i3, i4);
    }
}
