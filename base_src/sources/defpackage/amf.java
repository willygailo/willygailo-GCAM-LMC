package defpackage;

import androidx.wear.widget.drawer.PageIndicatorView;

/* JADX INFO: loaded from: classes.dex */
public final class amf extends ame {
    final /* synthetic */ PageIndicatorView a;

    public amf(PageIndicatorView pageIndicatorView) {
        this.a = pageIndicatorView;
    }

    @Override // defpackage.ame
    public final void a() {
        PageIndicatorView pageIndicatorView = this.a;
        pageIndicatorView.c = false;
        pageIndicatorView.animate().alpha(0.0f).setListener(null).setStartDelay(this.a.a).setDuration(this.a.b).start();
    }
}
