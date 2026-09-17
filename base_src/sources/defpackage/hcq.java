package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class hcq implements lij {
    final /* synthetic */ Map a;
    final /* synthetic */ hcr b;
    private String c;

    public hcq(hcr hcrVar, Map map) {
        this.b = hcrVar;
        this.a = map;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        lqd lqdVar;
        String str = (String) obj;
        if (str.equals(this.c) || (lqdVar = (lqd) this.a.get(str)) == null) {
            return;
        }
        synchronized (this.b) {
            this.c = str;
            this.b.b = lqdVar;
        }
    }
}
