package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class ack extends acs {
    @Override // defpackage.acw
    public final /* synthetic */ float a(Object obj) {
        return ((View) obj).getTranslationY();
    }

    @Override // defpackage.acw
    public final /* synthetic */ void b(Object obj, float f) {
        ((View) obj).setTranslationY(f);
    }
}
