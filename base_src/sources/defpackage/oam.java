package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oam extends oaf {
    public final int g;
    public final int h;
    public final int i;

    public oam(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayA = nzw.a(context, attributeSet, obe.b, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        int iB = obr.b(context, typedArrayA, 2, dimensionPixelSize);
        int i = this.a;
        this.g = Math.max(iB, i + i);
        this.h = obr.b(context, typedArrayA, 1, dimensionPixelSize2);
        this.i = typedArrayA.getInt(0, 0);
        typedArrayA.recycle();
    }

    @Override // defpackage.oaf
    public final void a() {
    }
}
