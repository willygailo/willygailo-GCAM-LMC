package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class opb implements Serializable, orl {
    public static final opb a = new opb(oom.l(), oom.l());
    private static final long serialVersionUID = 0;
    private final transient oom b;
    private final transient oom c;

    public opb(oom oomVar, oom oomVar2) {
        this.b = oomVar;
        this.c = oomVar2;
    }

    @Override // defpackage.orl
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final oor b() {
        return this.b.isEmpty() ? orw.a : new opj(new ory(this.b, orj.c()), this.c);
    }

    @Override // defpackage.orl
    @Deprecated
    public final void c(orj orjVar, Object obj) {
        throw null;
    }

    @Override // defpackage.orl
    @Deprecated
    public final void d(orl orlVar) {
        throw null;
    }

    @Override // defpackage.orl
    @Deprecated
    public final void e(orj orjVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof orl) {
            return b().equals(((orl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return obr.aa(b());
    }

    Object writeReplace() {
        return new opa(b());
    }
}
