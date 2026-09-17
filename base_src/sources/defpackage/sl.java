package defpackage;

import android.support.wearable.complications.rendering.ComplicationDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class sl implements Runnable {
    final /* synthetic */ ComplicationDrawable a;

    public sl(ComplicationDrawable complicationDrawable) {
        this.a = complicationDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setIsHighlighted(false);
        this.a.invalidateSelf();
    }
}
