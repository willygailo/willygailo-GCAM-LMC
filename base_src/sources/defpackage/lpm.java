package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lpm implements pys {
    private final lpj a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public lpm(lpj lpjVar, qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = lpjVar;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        lpj lpjVar = this.a;
        Set set = ((pyw) this.b).get();
        Executor executor = (Executor) this.c.get();
        ljf ljfVar = (ljf) this.d.get();
        HashSet hashSet = new HashSet(set);
        hashSet.add(lpjVar.a.n);
        return new loi(lnb.b(hashSet), new ljl(executor, ljfVar, "FrameListeners"), null, null, null);
    }
}
