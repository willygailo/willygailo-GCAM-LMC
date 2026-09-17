package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nkb implements pgk {
    public final /* synthetic */ nkg a;
    private final /* synthetic */ int b;

    public /* synthetic */ nkb(nkg nkgVar, int i) {
        this.b = i;
        this.a = nkgVar;
    }

    @Override // defpackage.pgk
    public final pht a(Object obj) throws IOException {
        pht phtVar;
        switch (this.b) {
            case 0:
                nkg nkgVar = this.a;
                nkgVar.c((Uri) plk.ad(nkgVar.b), obj);
                return phq.a;
            case 1:
                nkg nkgVar2 = this.a;
                synchronized (nkgVar2.f) {
                    phtVar = nkgVar2.g;
                    break;
                }
                return phtVar;
            case 2:
                nkg nkgVar3 = this.a;
                Uri uri = (Uri) obj;
                Uri uriI = mzi.i(uri, ".bak");
                try {
                    if (nkgVar3.d.d(uriI)) {
                        nkgVar3.d.c(uriI, uri);
                        break;
                    }
                    return phq.a;
                } catch (IOException e) {
                    return plk.U(e);
                }
            default:
                nkg nkgVar4 = this.a;
                return plk.V(nkgVar4.b((Uri) plk.ad(nkgVar4.b)));
        }
    }
}
