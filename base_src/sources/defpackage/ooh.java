package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ooh extends ooc {
    public ooh() {
        super(4);
    }

    public ooh(int i) {
        super(i);
    }

    @Override // defpackage.ooc
    public final /* synthetic */ void d(Object obj) {
        super.c(obj);
    }

    public final oom f() {
        this.c = true;
        return oom.h(this.a, this.b);
    }

    public final void g(Object obj) {
        super.c(obj);
    }

    public final void h(Iterable iterable) {
        super.e(iterable);
    }

    public final void i(Iterator it) {
        while (it.hasNext()) {
            super.c(it.next());
        }
    }
}
