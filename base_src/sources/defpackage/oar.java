package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
final class oar extends Property {
    public oar(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((oas) obj).c());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((oas) obj).d(((Float) obj2).floatValue());
    }
}
