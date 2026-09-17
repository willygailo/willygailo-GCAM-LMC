package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
final class oak extends Property {
    public oak(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = oal.a;
        return Float.valueOf(((oal) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int[] iArr = oal.a;
        ((oal) obj).h = fFloatValue;
    }
}
