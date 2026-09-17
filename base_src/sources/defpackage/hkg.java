package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hkg {
    private final float a;
    private final float b;
    private final boolean c;
    private final boolean d;

    public hkg(boolean z, boolean z2, boolean z3) {
        this.c = z;
        this.d = z2;
        this.a = true != z3 ? 4.666667f : 1.4f;
        this.b = true != z3 ? 3.5f : 1.2727273f;
    }

    public final hkm a(hkn hknVar, Collection collection, boolean z) {
        float f;
        float f2;
        float fSqrt;
        float fMax;
        float fB = hls.b(hknVar, collection) * 5.0E-4f;
        if (this.c) {
            Iterator it = collection.iterator();
            f = Float.MAX_VALUE;
            while (it.hasNext()) {
                hkn hknVar2 = (hkn) it.next();
                if (hknVar != hknVar2) {
                    ojc ojcVar = hknVar.p;
                    ojc ojcVar2 = hknVar2.p;
                    if ((ojcVar.g() || ojcVar2.g()) && ojcVar.g() && ojcVar2.g()) {
                        HashMap mapS = fcy.s(((hla) ojcVar.c()).a);
                        HashMap mapS2 = fcy.s(((hla) ojcVar2.c()).a);
                        if (!mapS.keySet().equals(mapS2.keySet()) || mapS.isEmpty()) {
                            fMax = 10.0f;
                        } else {
                            fMax = 0.0f;
                            for (Integer num : mapS.keySet()) {
                                ((List) mapS.get(num)).getClass();
                                ((List) mapS2.get(num)).getClass();
                                List list = (List) mapS.get(num);
                                List list2 = (List) mapS2.get(num);
                                obr.aR(list.size() == list2.size(), "The vector sizes are different.");
                                int size = list.size();
                                float f3 = 0.0f;
                                for (int i = 0; i <= size - 1; i++) {
                                    float fFloatValue = ((Float) list.get(i)).floatValue() - ((Float) list2.get(i)).floatValue();
                                    f3 += fFloatValue * fFloatValue;
                                }
                                fMax = Math.max(fMax, f3);
                            }
                        }
                    } else {
                        fMax = 10.0f;
                    }
                    if (fMax < f) {
                        f = fMax;
                    }
                }
            }
        } else {
            f = Float.MAX_VALUE;
        }
        float f4 = z ? this.b : this.a;
        if (this.d) {
            Iterator it2 = collection.iterator();
            float f5 = Float.MAX_VALUE;
            while (it2.hasNext()) {
                hkn hknVar3 = (hkn) it2.next();
                if (hknVar != hknVar3) {
                    ojc ojcVar3 = hknVar.r;
                    ojc ojcVar4 = hknVar3.r;
                    if (ojcVar3.g() && ojcVar4.g()) {
                        float[] fArr = (float[]) ojcVar3.c();
                        float[] fArr2 = (float[]) ojcVar4.c();
                        int length = fArr.length;
                        obr.aR(length == fArr2.length, "The vector sizes are different.");
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        for (int i2 = 0; i2 < length; i2++) {
                            float f9 = fArr[i2];
                            float f10 = fArr2[i2];
                            f6 += f9 * f10;
                            f7 += f9 * f9;
                            f8 += f10 * f10;
                        }
                        fSqrt = 1.0f - (f6 / (((float) Math.sqrt(f7)) * ((float) Math.sqrt(f8))));
                    } else {
                        fSqrt = 10.0f;
                    }
                    if (fSqrt < f5) {
                        f5 = fSqrt;
                    }
                }
            }
            f2 = f5 * f4;
        } else {
            f2 = Float.MAX_VALUE;
        }
        float fI = oxh.I(fB, f, f2);
        long j = hknVar.a;
        return new hkm(fI, fB);
    }
}
