package defpackage;

import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hjh implements hjf {
    public final hje a;
    public final Object b;

    public hjh() {
        obr.aF(true);
        this.b = new Object();
        this.a = new hje();
    }

    protected abstract Object a(Object obj);

    protected Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.hjf
    public final hjg c(Object obj) {
        Object objA;
        synchronized (this.b) {
            hje hjeVar = this.a;
            synchronized (hjeVar.a) {
                if (hjeVar.b.removeLastOccurrence(obj)) {
                    Queue queue = (Queue) hjeVar.c.get(obj);
                    queue.getClass();
                    objA = queue.remove();
                    int i = hjeVar.d;
                    hje.a();
                    hjeVar.d = i - 1;
                } else {
                    objA = null;
                }
            }
        }
        if (objA == null) {
            objA = a(obj);
        }
        return new hjg(this, obj, objA);
    }
}
