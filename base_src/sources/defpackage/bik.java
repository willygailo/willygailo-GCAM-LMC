package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class bik implements bcl, bch {
    protected final Drawable a;

    public bik(Drawable drawable) {
        aae.s(drawable);
        this.a = drawable;
    }

    @Override // defpackage.bch
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof bis) {
            ((bis) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.bcl
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }
}
