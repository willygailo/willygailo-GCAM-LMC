package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class mk extends pa {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public mk() {
        super(-2);
        this.a = false;
    }

    public mk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public mk(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public mk(mk mkVar) {
        super(mkVar);
        this.a = mkVar.a;
    }
}
