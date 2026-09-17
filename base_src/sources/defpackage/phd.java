package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class phd extends phe {
    private final Future a;

    protected phd(Future future) {
        future.getClass();
        this.a = future;
    }

    @Override // defpackage.phe, defpackage.onj
    protected final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.phe
    protected final Future b() {
        return this.a;
    }
}
