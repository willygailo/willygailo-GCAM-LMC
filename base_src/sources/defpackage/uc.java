package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class uc {
    final /* synthetic */ cu c;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public boolean a = false;

    public uc() {
    }

    public uc(cu cuVar) {
        this.c = cuVar;
    }

    public final void a(tu tuVar) {
        this.b.add(tuVar);
    }

    public final void b(tu tuVar) {
        this.b.remove(tuVar);
    }
}
