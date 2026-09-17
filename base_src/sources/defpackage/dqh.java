package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public final class dqh {
    private final Deque a = new ArrayDeque();

    public final synchronized dqi a() {
        return (dqi) this.a.peekLast();
    }

    public final synchronized void b() {
        this.a.removeFirst();
        this.a.size();
    }

    public final synchronized void c(dqi dqiVar) {
        this.a.addLast(dqiVar);
        this.a.size();
    }
}
