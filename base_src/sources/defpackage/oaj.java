package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
final class oaj extends Property {
    public oaj(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = oal.a;
        return Float.valueOf(((oal) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        oal oalVar = (oal) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        oalVar.g = fFloatValue;
        int i = (int) (5400.0f * fFloatValue);
        float[] fArr = oalVar.k;
        float f = fFloatValue * 1520.0f;
        fArr[0] = (-20.0f) + f;
        fArr[1] = f;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = oal.a[i2];
            float[] fArr2 = oalVar.k;
            fArr2[1] = fArr2[1] + (oalVar.d.getInterpolation(oal.f(i, i3, 667)) * 250.0f);
            int i4 = oal.b[i2];
            float[] fArr3 = oalVar.k;
            fArr3[0] = fArr3[0] + (oalVar.d.getInterpolation(oal.f(i, i4, 667)) * 250.0f);
        }
        float[] fArr4 = oalVar.k;
        float f2 = fArr4[0];
        fArr4[0] = (f2 + ((fArr4[1] - f2) * oalVar.h)) / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
        for (int i5 = 0; i5 < 4; i5++) {
            float f3 = oal.f(i, oal.c[i5], 333);
            if (f3 >= 0.0f && f3 <= 1.0f) {
                int i6 = oalVar.f;
                int[] iArr = oalVar.e.c;
                int length = iArr.length;
                int i7 = (i5 + i6) % length;
                int i8 = (i7 + 1) % length;
                int iW = ohh.W(iArr[i7], oalVar.j.i);
                int iW2 = ohh.W(oalVar.e.c[i8], oalVar.j.i);
                float interpolation = oalVar.d.getInterpolation(f3);
                int[] iArr2 = oalVar.l;
                Integer numValueOf = Integer.valueOf(iW);
                Integer numValueOf2 = Integer.valueOf(iW2);
                int iIntValue = numValueOf.intValue();
                float f4 = ((iIntValue >> 24) & 255) / 255.0f;
                int iIntValue2 = numValueOf2.intValue();
                float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                iArr2[0] = Integer.valueOf((Math.round((f4 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f4) * interpolation)) * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow + ((((float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d)) - fPow) * interpolation), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * interpolation), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow3 + (interpolation * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3)), 0.45454545454545453d)) * 255.0f)).intValue();
                break;
            }
        }
        oalVar.j.invalidateSelf();
    }
}
