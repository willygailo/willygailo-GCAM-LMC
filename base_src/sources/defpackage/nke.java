package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nke extends nks {
    public static final nks a = new nke();

    private nke() {
    }

    @Override // defpackage.nks
    public final /* bridge */ /* synthetic */ nkr a(njv njvVar, String str, Executor executor, nio nioVar) {
        return new nkg(str, plk.V(njvVar.a), new nkx(njvVar.b, njvVar.e ? pos.b() : pos.a()), executor, nioVar, njvVar.c, njvVar.f ? ogb.d() : ogb.c());
    }
}
