package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class ahw extends qnp implements qmu {
    final /* synthetic */ CancellationSignal a;
    final /* synthetic */ qrg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahw(CancellationSignal cancellationSignal, qrg qrgVar) {
        super(1);
        this.a = cancellationSignal;
        this.b = qrgVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        this.a.cancel();
        this.b.q(null);
        return qks.a;
    }
}
