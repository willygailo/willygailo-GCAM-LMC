package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bus implements Iterable {
    public final List a = new ArrayList();

    public final synchronized lie a(final bur burVar) {
        this.a.add(burVar);
        return new lie() { // from class: buq
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                bus busVar = this.a;
                bur burVar2 = burVar;
                synchronized (busVar) {
                    busVar.a.remove(burVar2);
                }
            }
        };
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator iterator() {
        return new ArrayList(this.a).iterator();
    }
}
