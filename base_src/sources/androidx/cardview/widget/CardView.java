package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.gl;
import defpackage.wo;
import defpackage.wp;
import defpackage.wq;
import defpackage.wr;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] e = {R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    private final wp f;

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.GoogleCameraEngR18F1.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        wp wpVar = new wp(this);
        this.f = wpVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wo.a, i, com.google.android.GoogleCameraEngR18F1.R.style.CardView);
        gl.E(this, context, wo.a, attributeSet, typedArrayObtainStyledAttributes, i, com.google.android.GoogleCameraEngR18F1.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(e);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.google.android.GoogleCameraEngR18F1.R.color.cardview_light_background) : getResources().getColor(com.google.android.GoogleCameraEngR18F1.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        wq wqVar = new wq(colorStateListValueOf, dimension);
        wpVar.a = wqVar;
        wpVar.b.setBackgroundDrawable(wqVar);
        CardView cardView = wpVar.b;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        Drawable drawable = wpVar.a;
        boolean zC = wpVar.c();
        boolean zB = wpVar.b();
        wq wqVar2 = (wq) drawable;
        if (dimension3 != wqVar2.b || wqVar2.c != zC || wqVar2.d != zB) {
            wqVar2.b = dimension3;
            wqVar2.c = zC;
            wqVar2.d = zB;
            wqVar2.a(null);
            wqVar2.invalidateSelf();
        }
        if (!wpVar.c()) {
            wpVar.a(0, 0, 0, 0);
            return;
        }
        wq wqVar3 = (wq) wpVar.a;
        float f = wqVar3.b;
        float f2 = wqVar3.a;
        int iCeil = (int) Math.ceil(wr.a(f, f2, wpVar.b()));
        int iCeil2 = (int) Math.ceil(wr.b(f, f2, wpVar.b()));
        wpVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
