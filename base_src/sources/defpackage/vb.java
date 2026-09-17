package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vb extends vc implements Iterator {
    uz a;
    uz b;

    public vb(uz uzVar, uz uzVar2) {
        this.a = uzVar2;
        this.b = uzVar;
    }

    private final uz d() {
        uz uzVar = this.b;
        uz uzVar2 = this.a;
        if (uzVar == uzVar2 || uzVar2 == null) {
            return null;
        }
        return b(uzVar);
    }

    public abstract uz a(uz uzVar);

    public abstract uz b(uz uzVar);

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        uz uzVar = this.b;
        this.b = d();
        return uzVar;
    }

    @Override // defpackage.vc
    public final void fo(uz uzVar) {
        if (this.a == uzVar && uzVar == this.b) {
            this.b = null;
            this.a = null;
        }
        uz uzVar2 = this.a;
        if (uzVar2 == uzVar) {
            this.a = a(uzVar2);
        }
        if (this.b == uzVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
