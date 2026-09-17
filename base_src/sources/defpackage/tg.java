package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes2.dex */
final class tg extends ViewOutlineProvider {
    final /* synthetic */ th a;

    public tg(th thVar) {
        this.a = thVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a.d;
        outline.setOval(0, 0, i, i);
    }
}
