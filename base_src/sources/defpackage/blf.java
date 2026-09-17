package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class blf extends blk {
    private Animatable c;

    public blf(ImageView imageView) {
        super(imageView);
    }

    private final void n(Object obj) {
        l(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.blb, defpackage.blh
    public final void a(Drawable drawable) {
        this.b.c();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        n(null);
        m(drawable);
    }

    @Override // defpackage.blh
    public final void b(Object obj) {
        n(obj);
    }

    @Override // defpackage.blb, defpackage.blh
    public final void e(Drawable drawable) {
        n(null);
        m(drawable);
    }

    @Override // defpackage.blb, defpackage.blh
    public final void f(Drawable drawable) {
        n(null);
        m(drawable);
    }

    @Override // defpackage.blb, defpackage.bjq
    public final void h() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.blb, defpackage.bjq
    public final void i() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    protected abstract void l(Object obj);

    public final void m(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
