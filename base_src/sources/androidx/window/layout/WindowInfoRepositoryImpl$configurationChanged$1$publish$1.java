package androidx.window.layout;

import defpackage.qks;
import defpackage.qmj;
import defpackage.qnp;
import defpackage.qsu;

/* JADX INFO: loaded from: classes.dex */
final class WindowInfoRepositoryImpl$configurationChanged$1$publish$1 extends qnp implements qmj {
    final /* synthetic */ qsu $channel;
    final /* synthetic */ qmj $producer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$configurationChanged$1$publish$1(qsu qsuVar, qmj qmjVar) {
        super(0);
        this.$channel = qsuVar;
        this.$producer = qmjVar;
    }

    @Override // defpackage.qmj
    public /* bridge */ /* synthetic */ Object invoke() {
        m0invoke();
        return qks.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m0invoke() {
        this.$channel.s(this.$producer.invoke());
    }
}
