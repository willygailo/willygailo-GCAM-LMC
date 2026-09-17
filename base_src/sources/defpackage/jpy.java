package defpackage;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuViewContainer;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class jpy implements jqn {
    private final ojc a;
    private final qkg b;
    private final /* synthetic */ int c;

    public jpy(ojc ojcVar, qkg qkgVar, int i) {
        this.c = i;
        this.a = ojcVar;
        this.b = qkgVar;
    }

    public jpy(ojc ojcVar, qkg qkgVar, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = ojcVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        switch (this.c) {
            case 0:
                if (this.a.g()) {
                    jns jnsVar = ((jnw) this.b).get();
                    ((ctm) this.a.c()).e((ViewStub) jnsVar.k.c(R.id.mode_slider_ui_stub));
                    MainActivityLayout mainActivityLayout = jnsVar.c;
                    mainActivityLayout.n = this.a;
                    mainActivityLayout.o(mainActivityLayout.d().h);
                }
                break;
            case 1:
                if (this.a.g()) {
                    jns jnsVar2 = ((jnw) this.b).get();
                    ((jzr) this.a.c()).e(((ViewStub) jnsVar2.k.c(R.id.chameleon_ui_stub)).inflate());
                    MainActivityLayout mainActivityLayout2 = jnsVar2.c;
                    mainActivityLayout2.p = this.a;
                    mainActivityLayout2.m(mainActivityLayout2.d().h);
                    break;
                }
                break;
            case 2:
                if (this.a.g()) {
                    jus jusVar = ((jnw) this.b).get().k;
                    ((hnj) this.a.c()).x((ViewGroup) jusVar.c(R.id.mcfly_preview), (ViewGroup) jusVar.c(R.id.mcfly_controller_view));
                    MainActivityLayout mainActivityLayout3 = (MainActivityLayout) jusVar.c(R.id.activity_root_view);
                    mainActivityLayout3.i = this.a;
                    mainActivityLayout3.q();
                }
                break;
            default:
                if (this.a.g()) {
                    jns jnsVar3 = ((jnw) this.b).get();
                    jus jusVar2 = jnsVar3.k;
                    cuu cuuVarA = ((cuj) this.a.c()).a();
                    ViewStub viewStub = (ViewStub) jusVar2.c(R.id.washington_menu_ui);
                    cus cusVar = (cus) cuuVarA;
                    if (cusVar.c == null) {
                        cusVar.c = (PopupMenuViewContainer) viewStub.inflate();
                        cusVar.b = (PopupMenuView) cusVar.c.findViewById(R.id.washington_menu_view);
                    }
                    cusVar.b.c(R.string.stab_menu_header, cusVar.g, 80, cusVar.a.k(ddl.ay));
                    cusVar.g.e(cuv.STANDARD);
                    cusVar.f.c(cusVar.a(new cur(cusVar)));
                    if (cusVar.a.k(dcu.M)) {
                        cusVar.b.b.setVisibility(0);
                    }
                    jnsVar3.c.u(new jqm(cuuVarA));
                    ((cuj) this.a.c()).e((ViewStub) jusVar2.c(R.id.washington_ui));
                    MainActivityLayout mainActivityLayout4 = jnsVar3.c;
                    mainActivityLayout4.o = this.a;
                    mainActivityLayout4.s(mainActivityLayout4.d().h);
                    break;
                }
                break;
        }
    }
}
