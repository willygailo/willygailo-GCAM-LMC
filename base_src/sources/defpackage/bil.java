package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class bil extends bik {
    private bil(Drawable drawable) {
        super(drawable);
    }

    static bcl g(Drawable drawable) {
        if (drawable != null) {
            return new bil(drawable);
        }
        return null;
    }

    @Override // defpackage.bcl
    public final int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.bcl
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.bcl
    public final void e() {
    }
}
