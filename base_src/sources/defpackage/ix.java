package defpackage;

import android.view.Window;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
final class ix implements lj {
    final /* synthetic */ iy a;
    private final /* synthetic */ int b;

    public ix(iy iyVar, int i) {
        this.b = i;
        this.a = iyVar;
    }

    @Override // defpackage.lj
    public final void a(kw kwVar, boolean z) {
        switch (this.b) {
            case 0:
                kw kwVarA = kwVar.a();
                iw iwVarS = this.a.s(kwVarA != kwVar ? kwVarA : kwVar);
                if (iwVarS != null) {
                    if (kwVarA == kwVar) {
                        this.a.x(iwVarS, z);
                    } else {
                        this.a.v(iwVarS.a, iwVarS, kwVarA);
                        this.a.x(iwVarS, true);
                    }
                }
                break;
            default:
                this.a.w(kwVar);
                break;
        }
    }

    @Override // defpackage.lj
    public final boolean b(kw kwVar) {
        Window.Callback callbackT;
        switch (this.b) {
            case 0:
                if (kwVar == kwVar.a()) {
                    iy iyVar = this.a;
                    if (iyVar.u && (callbackT = iyVar.t()) != null && !this.a.C) {
                        callbackT.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, kwVar);
                    }
                }
                break;
            default:
                Window.Callback callbackT2 = this.a.t();
                if (callbackT2 != null) {
                    callbackT2.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, kwVar);
                }
                break;
        }
        return true;
    }
}
