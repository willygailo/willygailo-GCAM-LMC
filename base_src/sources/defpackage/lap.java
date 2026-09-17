package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lap implements lie {
    private final lap a;
    private final lbu b;
    private List c;

    public lap() {
        this(lbx.a);
    }

    private lap(lap lapVar, lbu lbuVar) {
        this.b = lbuVar;
        this.a = lapVar;
        this.c = new ArrayList();
    }

    public lap(lbu lbuVar) {
        this.b = lbuVar;
        this.a = null;
        this.c = new ArrayList();
    }

    public boolean a() {
        boolean z;
        synchronized (this) {
            z = this.c == null;
        }
        return z;
    }

    public final lap b() {
        lap lapVar = new lap(this, this.b);
        c(lapVar);
        return lapVar;
    }

    public final void c(lie lieVar) {
        boolean z;
        lieVar.getClass();
        synchronized (this) {
            List list = this.c;
            if (list == null) {
                z = true;
            } else {
                list.add(lieVar);
                z = false;
            }
        }
        if (z) {
            this.b.a(lieVar);
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            List list = this.c;
            if (list != null) {
                this.c = null;
                lap lapVar = this.a;
                if (lapVar != null) {
                    synchronized (lapVar) {
                        List list2 = lapVar.c;
                        if (list2 != null) {
                            list2.remove(this);
                        }
                    }
                }
                this.b.b(list);
            }
        }
    }
}
