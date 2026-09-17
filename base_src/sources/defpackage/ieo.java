package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ieo implements Consumer {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ ieo(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((iek) obj).setEnabled(this.a);
                break;
            default:
                boolean z = this.a;
                fik fikVar = (fik) obj;
                int i = fhv.k;
                if (fikVar instanceof fgx) {
                    ((fgx) fikVar).C(z);
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
