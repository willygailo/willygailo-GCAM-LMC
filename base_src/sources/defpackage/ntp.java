package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ntp implements qco {
    final /* synthetic */ nuj a;
    private final /* synthetic */ int b;

    public ntp(nuj nujVar, int i) {
        this.b = i;
        this.a = nujVar;
    }

    @Override // defpackage.qco
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                nqi nqiVar = (nqi) obj;
                nqiVar.getClass();
                return nuj.b(this.a, nqiVar.a, nqiVar.b, null, 121);
            default:
                List list = (List) obj;
                list.getClass();
                return nuj.b(this.a, null, list, null, R.styleable.AppCompatTheme_windowFixedWidthMinor);
        }
    }
}
