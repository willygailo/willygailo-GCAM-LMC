package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageButton;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iem implements Consumer {
    public final /* synthetic */ jrz a;
    private final /* synthetic */ int b;

    public /* synthetic */ iem(jrz jrzVar, int i) {
        this.b = i;
        this.a = jrzVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                mip.et((iek) obj, this.a);
                break;
            case 1:
                mip.et(((FrameLayout) obj).getChildAt(0), this.a);
                break;
            default:
                mip.et((ImageButton) obj, this.a);
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
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
