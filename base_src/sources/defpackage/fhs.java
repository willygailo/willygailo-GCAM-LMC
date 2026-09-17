package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fhs implements Consumer {
    public final /* synthetic */ fik a;
    private final /* synthetic */ int b;

    public /* synthetic */ fhs(fik fikVar, int i) {
        this.b = i;
        this.a = fikVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                fik fikVar = this.a;
                int i = fhv.k;
                ((fhu) obj).a(fikVar);
                break;
            default:
                ((fhu) obj).a(this.a);
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
