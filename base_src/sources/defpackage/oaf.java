package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oaf {
    public final int a;
    public final int b;
    public int[] c;
    public int d;
    public final int e;
    public final int f;

    protected oaf(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayA = nzw.a(context, attributeSet, obe.a, i, i2, new int[0]);
        int iB = obr.b(context, typedArrayA, 8, dimensionPixelSize);
        this.a = iB;
        this.b = Math.min(obr.b(context, typedArrayA, 7, 0), iB / 2);
        this.e = typedArrayA.getInt(4, 0);
        this.f = typedArrayA.getInt(1, 0);
        if (!typedArrayA.hasValue(2)) {
            this.c = new int[]{ohh.X(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayA.peekValue(2).type != 1) {
            this.c = new int[]{typedArrayA.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayA.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayA.hasValue(6)) {
            this.d = typedArrayA.getColor(6, -1);
        } else {
            this.d = this.c[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.d = ohh.W(this.d, (int) (f * 255.0f));
        }
        typedArrayA.recycle();
    }

    public abstract void a();

    public final boolean b() {
        return this.f != 0;
    }

    public final boolean c() {
        return this.e != 0;
    }
}
