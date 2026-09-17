package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class njz implements pgj {
    public final /* synthetic */ nkg a;
    private final /* synthetic */ int b;

    public /* synthetic */ njz(nkg nkgVar, int i) {
        this.b = i;
        this.a = nkgVar;
    }

    @Override // defpackage.pgj
    public final pht a() {
        switch (this.b) {
            case 0:
                nkg nkgVar = this.a;
                try {
                    return plk.V(nkgVar.b((Uri) plk.ad(nkgVar.b)));
                } catch (IOException e) {
                    return ((e instanceof niw) || (e.getCause() instanceof niw)) ? plk.U(e) : pgb.i(nkgVar.e.a(e, new nkf(nkgVar)), ogl.b(new nkb(nkgVar, 3)), nkgVar.c);
                }
            default:
                nkg nkgVar2 = this.a;
                return plk.W(pgb.i(nkgVar2.b, ogl.b(new nkb(nkgVar2, 2)), nkgVar2.c));
        }
    }
}
