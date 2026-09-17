package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ier implements Consumer {
    public final /* synthetic */ ies a;
    private final /* synthetic */ int b;

    public /* synthetic */ ier(ies iesVar, int i) {
        this.b = i;
        this.a = iesVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                this.a.setVisibility(8);
                break;
            case 1:
                this.a.f(false);
                break;
            case 2:
                ies iesVar = this.a;
                iesVar.setVisibility(0);
                iesVar.f(false);
                iesVar.g(ojc.i(iek.a));
                iesVar.e(iesVar.b.size());
                iesVar.setPadding(0, iesVar.a(R.dimen.social_share_menu_top_padding), 0, iesVar.a(R.dimen.social_share_menu_bottom_padding));
                break;
            case 3:
                ies iesVar2 = this.a;
                iesVar2.f(true);
                iesVar2.g(oih.a);
                break;
            case 4:
                ies iesVar3 = this.a;
                iesVar3.setVisibility(0);
                iesVar3.f(false);
                iesVar3.e(0);
                iesVar3.setPadding(0, 0, 0, 0);
                break;
            default:
                this.a.f(true);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
