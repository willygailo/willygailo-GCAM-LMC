package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class opv extends okn {
    final /* synthetic */ Iterator a;
    final /* synthetic */ ojf b;

    public opv(Iterator it, ojf ojfVar) {
        this.a = it;
        this.b = ojfVar;
    }

    @Override // defpackage.okn
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
