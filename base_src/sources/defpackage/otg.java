package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class otg implements orl {
    public final orj a;
    final /* synthetic */ oth b;

    public otg(oth othVar, orj orjVar) {
        this.b = othVar;
        this.a = orjVar;
    }

    @Override // defpackage.orl
    public final Map b() {
        return new otf(this);
    }

    @Override // defpackage.orl
    public final void c(orj orjVar, Object obj) {
        throw null;
    }

    @Override // defpackage.orl
    public final void d(orl orlVar) {
        throw null;
    }

    @Override // defpackage.orl
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
        return b().toString();
    }
}
