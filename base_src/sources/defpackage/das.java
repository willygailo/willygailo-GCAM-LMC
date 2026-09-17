package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class das implements pys {
    private final qkg a;
    private final qkg b;

    public das(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dbg get() {
        final Executor executor = (Executor) this.a.get();
        final Set set = ((pyw) this.b).get();
        return new dbg() { // from class: dal
            @Override // defpackage.dbg
            public final void g(long j, Map map) {
                executor.execute(new dao(set, j, map, 1));
            }
        };
    }
}
