package defpackage;

import android.graphics.drawable.Drawable;
import android.support.wearable.view.CircledImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class te implements Drawable.Callback {
    final /* synthetic */ CircledImageView a;

    public te(CircledImageView circledImageView) {
        this.a = circledImageView;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidate();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
