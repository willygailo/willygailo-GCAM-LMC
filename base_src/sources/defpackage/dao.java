package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dao implements Runnable {
    public final /* synthetic */ Set a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Map c;
    private final /* synthetic */ int d;

    public /* synthetic */ dao(Set set, long j, Map map, int i) {
        this.d = i;
        this.a = set;
        this.b = j;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Set set = this.a;
                long j = this.b;
                Map map = this.c;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((dbr) it.next()).fL(j, map);
                }
                break;
            default:
                Set set2 = this.a;
                long j2 = this.b;
                Map map2 = this.c;
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    ((dbg) it2.next()).g(j2, map2);
                }
                break;
        }
    }
}
