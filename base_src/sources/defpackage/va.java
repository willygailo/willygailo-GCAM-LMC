package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class va extends vc implements Iterator {
    final /* synthetic */ vd a;
    private uz b;
    private boolean c = true;

    public va(vd vdVar) {
        this.a = vdVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        uz uzVar;
        if (this.c) {
            this.c = false;
            uzVar = this.a.b;
        } else {
            uz uzVar2 = this.b;
            uzVar = uzVar2 != null ? uzVar2.c : null;
        }
        this.b = uzVar;
        return this.b;
    }

    @Override // defpackage.vc
    public final void fo(uz uzVar) {
        uz uzVar2 = this.b;
        if (uzVar == uzVar2) {
            uz uzVar3 = uzVar2.d;
            this.b = uzVar3;
            this.c = uzVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        uz uzVar = this.b;
        return (uzVar == null || uzVar.c == null) ? false : true;
    }
}
