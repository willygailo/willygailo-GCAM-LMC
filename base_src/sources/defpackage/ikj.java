package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ikj {
    private final Map a = new HashMap();
    private final nez b;

    public ikj(nez nezVar, byte[] bArr) {
        this.b = nezVar;
    }

    public final kme a(iki ikiVar) {
        synchronized (this.a) {
            String strB = ikiVar.b();
            if (this.a.containsKey(strB)) {
                return (kme) this.a.get(strB);
            }
            boolean z = this.b.a;
            kme kmeVar = new kme(ikiVar);
            this.a.put(strB, kmeVar);
            return kmeVar;
        }
    }
}
