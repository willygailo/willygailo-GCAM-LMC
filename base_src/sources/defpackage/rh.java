package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
public final class rh extends Property {
    public rh(Class cls) {
        super(cls, "thumbPos");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).c);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).d(((Float) obj2).floatValue());
    }
}
