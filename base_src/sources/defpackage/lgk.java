package defpackage;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lgk implements Runnable {
    public final /* synthetic */ lgo a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgk(lgo lgoVar, int i) {
        this.b = i;
        this.a = lgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Iterator it = Collections.unmodifiableCollection(this.a.a).iterator();
                while (it.hasNext()) {
                    ((lff) it.next()).i();
                }
                break;
            case 1:
                Iterator it2 = Collections.unmodifiableCollection(this.a.a).iterator();
                while (it2.hasNext()) {
                    ((lff) it2.next()).g();
                }
                break;
            case 2:
                lgo lgoVar = this.a;
                if (!lgoVar.b) {
                    Iterator it3 = Collections.unmodifiableCollection(lgoVar.a).iterator();
                    while (it3.hasNext()) {
                        ((lff) it3.next()).h();
                    }
                    lgoVar.b = true;
                    break;
                }
                break;
            case 3:
                lgo lgoVar2 = this.a;
                if (!lgoVar2.b) {
                    Iterator it4 = Collections.unmodifiableCollection(lgoVar2.a).iterator();
                    while (it4.hasNext()) {
                        ((lff) it4.next()).h();
                    }
                    lgoVar2.b = true;
                    break;
                }
                break;
            default:
                lgo lgoVar3 = this.a;
                if (!lgoVar3.c) {
                    Iterator it5 = Collections.unmodifiableCollection(lgoVar3.a).iterator();
                    while (it5.hasNext()) {
                        ((lff) it5.next()).f();
                    }
                    lgoVar3.c = true;
                    break;
                }
                break;
        }
    }
}
