package defpackage;

import android.view.View;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class icy implements Consumer {
    public final /* synthetic */ ida a;
    private final /* synthetic */ int b;

    public /* synthetic */ icy(ida idaVar, int i) {
        this.b = i;
        this.a = idaVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                this.a.g.setVisibility(8);
                break;
            default:
                ida idaVar = this.a;
                idaVar.g.setVisibility(0);
                if (idaVar.g.getWidth() == 0 || idaVar.g.getHeight() == 0) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    idaVar.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                idaVar.g.setRotation(mip.eq(idaVar.h));
                View view = idaVar.g;
                view.setPivotX(view.getMeasuredHeight() / 2.0f);
                View view2 = idaVar.g;
                view2.setPivotY(view2.getMeasuredHeight() / 2.0f);
                if (!idaVar.h.equals(jrz.LANDSCAPE)) {
                    idaVar.g.setTranslationY(0.0f);
                } else {
                    View view3 = idaVar.g;
                    view3.setTranslationY(-(view3.getMeasuredWidth() - idaVar.g.getMeasuredHeight()));
                }
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
