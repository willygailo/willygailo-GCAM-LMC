package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class idz implements Consumer {
    public final /* synthetic */ iec a;
    private final /* synthetic */ int b;

    public /* synthetic */ idz(iec iecVar, int i) {
        this.b = i;
        this.a = iecVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                this.a.c.l((String) obj, true);
                break;
            default:
                this.a.c.l((String) obj, false);
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
