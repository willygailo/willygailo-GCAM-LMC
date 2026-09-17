package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
final class amc extends Property {
    public amc(Class cls) {
        super(cls, "level");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((amd) obj).getLevel());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        amd amdVar = (amd) obj;
        amdVar.setLevel(((Integer) obj2).intValue());
        amdVar.invalidateSelf();
    }
}
