package defpackage;

import android.support.wearable.complications.rendering.ComplicationDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class sm implements so {
    final /* synthetic */ ComplicationDrawable a;

    public sm(ComplicationDrawable complicationDrawable) {
        this.a = complicationDrawable;
    }

    @Override // defpackage.so
    public final void a() {
        this.a.invalidateSelf();
    }
}
