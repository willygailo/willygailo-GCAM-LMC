package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final class jqy implements jqn {
    private final qkg a;
    private final Context b;
    private final jxb c;
    private final jwz d;
    private final kas e;
    private final jfn f;
    private final BottomBarController g;
    private final epj h;
    private final ddf i;
    private final huf j;
    private final iud k;

    public jqy(qkg qkgVar, Context context, jxb jxbVar, jwz jwzVar, kas kasVar, epj epjVar, jfn jfnVar, BottomBarController bottomBarController, ddf ddfVar, huf hufVar, iud iudVar) {
        this.a = qkgVar;
        this.b = context;
        this.c = jxbVar;
        this.d = jwzVar;
        this.e = kasVar;
        this.f = jfnVar;
        this.g = bottomBarController;
        this.h = epjVar;
        this.i = ddfVar;
        this.j = hufVar;
        this.k = iudVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        PreviewOverlay previewOverlay = (PreviewOverlay) ((jnr) this.a.get()).c.c(R.id.preview_overlay);
        Context context = this.b;
        jxn jxnVar = new jxn(new jqw(context, mip.bV(context.getMainLooper())), new jqr(this.f.w(), this.k), new jqt(this.f.w(), this.k), this.d, new jqu(this.c), new jqx(this.e), new jqv(this.e, this.g), new jqs(this.f.w()), this.j.a(htu.e), previewOverlay.getRootView(), this.b, this.i);
        this.h.a(jxnVar.p);
        previewOverlay.e = new jqq(jxnVar);
    }
}
