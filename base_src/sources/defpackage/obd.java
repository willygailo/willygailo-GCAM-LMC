package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class obd extends oaf {
    public final int g;
    public final int h;
    public boolean i;

    public obd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        TypedArray typedArrayA = nzw.a(context, attributeSet, obe.c, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.g = typedArrayA.getInt(0, 1);
        int i = typedArrayA.getInt(1, 0);
        this.h = i;
        typedArrayA.recycle();
        a();
        this.i = i == 1;
    }

    @Override // defpackage.oaf
    public final void a() {
        if (this.g == 0) {
            if (this.b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
