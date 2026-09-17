package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class obz {
    public static final obp a = new obw(0.5f);
    public final obp b;
    final obp c;
    final obp d;
    final obp e;
    final obr f;
    final obr g;
    final obr h;
    final obr i;
    final obr j;
    final obr k;
    final obr l;
    final obr m;

    public obz() {
        this.j = obr.q();
        this.k = obr.q();
        this.l = obr.q();
        this.m = obr.q();
        this.b = new obn(0.0f);
        this.c = new obn(0.0f);
        this.d = new obn(0.0f);
        this.e = new obn(0.0f);
        this.f = obr.k();
        this.g = obr.k();
        this.h = obr.k();
        this.i = obr.k();
    }

    public obz(oby obyVar) {
        this.j = obyVar.i;
        this.k = obyVar.j;
        this.l = obyVar.k;
        this.m = obyVar.l;
        this.b = obyVar.a;
        this.c = obyVar.b;
        this.d = obyVar.c;
        this.e = obyVar.d;
        this.f = obyVar.e;
        this.g = obyVar.f;
        this.h = obyVar.g;
        this.i = obyVar.h;
    }

    public static oby a(Context context, AttributeSet attributeSet, int i, int i2) {
        return b(context, attributeSet, i, i2, new obn(0.0f));
    }

    public static oby b(Context context, AttributeSet attributeSet, int i, int i2, obp obpVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, obv.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            context = new ContextThemeWrapper(context, resourceId);
            resourceId = resourceId2;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, obv.b);
        try {
            int i3 = typedArrayObtainStyledAttributes2.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes2.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes2.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes2.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes2.getInt(1, i3);
            obp obpVarF = f(typedArrayObtainStyledAttributes2, 5, obpVar);
            obp obpVarF2 = f(typedArrayObtainStyledAttributes2, 8, obpVarF);
            obp obpVarF3 = f(typedArrayObtainStyledAttributes2, 9, obpVarF);
            obp obpVarF4 = f(typedArrayObtainStyledAttributes2, 7, obpVarF);
            obp obpVarF5 = f(typedArrayObtainStyledAttributes2, 6, obpVarF);
            oby obyVar = new oby();
            obr obrVarP = obr.p(i4);
            obyVar.i = obrVarP;
            oby.b(obrVarP);
            obyVar.a = obpVarF2;
            obr obrVarP2 = obr.p(i5);
            obyVar.j = obrVarP2;
            oby.b(obrVarP2);
            obyVar.b = obpVarF3;
            obr obrVarP3 = obr.p(i6);
            obyVar.k = obrVarP3;
            oby.b(obrVarP3);
            obyVar.c = obpVarF4;
            obr obrVarP4 = obr.p(i7);
            obyVar.l = obrVarP4;
            oby.b(obrVarP4);
            obyVar.d = obpVarF5;
            return obyVar;
        } finally {
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    private static obp f(TypedArray typedArray, int i, obp obpVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return obpVar;
        }
        if (typedValuePeekValue.type == 5) {
            return new obn(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return typedValuePeekValue.type == 6 ? new obw(typedValuePeekValue.getFraction(1.0f, 1.0f)) : obpVar;
    }

    public final oby c() {
        return new oby(this);
    }

    public final obz d(float f) {
        oby obyVarC = c();
        obyVarC.a = new obn(f);
        obyVarC.b = new obn(f);
        obyVarC.c = new obn(f);
        obyVarC.d = new obn(f);
        return obyVarC.a();
    }

    public final boolean e(RectF rectF) {
        boolean z = this.i.getClass().equals(obr.class) && this.g.getClass().equals(obr.class) && this.f.getClass().equals(obr.class) && this.h.getClass().equals(obr.class);
        float fA = this.b.a(rectF);
        return z && ((this.c.a(rectF) > fA ? 1 : (this.c.a(rectF) == fA ? 0 : -1)) == 0 && (this.e.a(rectF) > fA ? 1 : (this.e.a(rectF) == fA ? 0 : -1)) == 0 && (this.d.a(rectF) > fA ? 1 : (this.d.a(rectF) == fA ? 0 : -1)) == 0) && ((this.k instanceof obx) && (this.j instanceof obx) && (this.l instanceof obx) && (this.m instanceof obx));
    }
}
