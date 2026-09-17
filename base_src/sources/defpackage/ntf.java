package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ntf implements qco {
    final /* synthetic */ nuj a;
    final /* synthetic */ int b;

    public ntf(nuj nujVar, int i) {
        this.a = nujVar;
        this.b = i;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        nsy nsyVar = (nsy) obj;
        nsyVar.getClass();
        nuj nujVar = this.a;
        int i = this.b;
        nqh nqhVar = nsyVar.b;
        List listX = qmd.x(nujVar.d);
        listX.set(i, nsyVar.c);
        return nuj.b(nujVar, nqhVar, null, listX, R.styleable.AppCompatTheme_windowActionBar);
    }
}
