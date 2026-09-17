package defpackage;

import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class nys extends Property {
    public nys(Class cls) {
        super(cls, "paddingStart");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(gl.j((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        gl.O(view, ((Float) obj2).intValue(), view.getPaddingTop(), gl.i(view), view.getPaddingBottom());
    }
}
