package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class rq implements View.OnClickListener {
    final /* synthetic */ Toolbar a;

    public rq(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i();
    }
}
