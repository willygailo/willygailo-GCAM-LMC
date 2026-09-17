package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
final class tj extends Property {
    public tj(Class cls) {
        super(cls, "level");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((tk) obj).getLevel());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        tk tkVar = (tk) obj;
        tkVar.setLevel(((Integer) obj2).intValue());
        tkVar.invalidateSelf();
    }
}
