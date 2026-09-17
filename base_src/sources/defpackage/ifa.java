package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ifa implements Consumer {
    public final /* synthetic */ ife a;
    private final /* synthetic */ int b;

    public /* synthetic */ ifa(ife ifeVar, int i) {
        this.b = i;
        this.a = ifeVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                this.a.i.run();
                break;
            case 1:
                this.a.k();
                break;
            default:
                this.a.k();
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
