package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public final class nyv {
    final /* synthetic */ FloatingActionButton a;

    public nyv(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            super/*oaa*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean b() {
        return this.a.b;
    }
}
