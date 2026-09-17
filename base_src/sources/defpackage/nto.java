package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class nto implements qco {
    final /* synthetic */ nuj a;
    final /* synthetic */ List b;
    final /* synthetic */ int c;

    public nto(nuj nujVar, List list, int i) {
        this.a = nujVar;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        npe npeVar = (npe) obj;
        npeVar.getClass();
        nuj nujVar = this.a;
        List listX = qmd.x(this.b);
        listX.set(this.c, npeVar);
        return nuj.b(nujVar, null, null, listX, R.styleable.AppCompatTheme_windowActionModeOverlay);
    }
}
