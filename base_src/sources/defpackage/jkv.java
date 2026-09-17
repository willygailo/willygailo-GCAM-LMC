package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jkv implements Consumer {
    public final /* synthetic */ jky a;
    public final /* synthetic */ ojc b;
    private final /* synthetic */ int c;

    public /* synthetic */ jkv(jky jkyVar, ojc ojcVar, int i) {
        this.c = i;
        this.a = jkyVar;
        this.b = ojcVar;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.c) {
            case 0:
                jky jkyVar = this.a;
                jkyVar.a.b.inFlightSpecBuilder.h(this.b);
                break;
            default:
                jky jkyVar2 = this.a;
                jkyVar2.a.b.inFlightSpecBuilder.h(this.b);
                break;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
            case 0:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
