package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
final class oay extends Property {
    public oay(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = oaz.f;
        return Float.valueOf(((oaz) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        oaz oazVar = (oaz) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        oazVar.e = fFloatValue;
        oazVar.k[0] = 0.0f;
        float f = oaz.f((int) (fFloatValue * 333.0f), 0, 667);
        float[] fArr = oazVar.k;
        float interpolation = oazVar.a.getInterpolation(f);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = oazVar.k;
        float interpolation2 = oazVar.a.getInterpolation(f + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        float[] fArr3 = oazVar.k;
        fArr3[5] = 1.0f;
        if (oazVar.d && fArr3[3] < 1.0f) {
            int[] iArr = oazVar.l;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = ohh.W(oazVar.b.c[oazVar.c], oazVar.j.i);
            oazVar.d = false;
        }
        oazVar.j.invalidateSelf();
    }
}
