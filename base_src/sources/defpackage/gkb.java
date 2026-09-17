package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gkb implements gmu {
    public final Set a;
    private final gmu b;

    public gkb(gmu gmuVar, Set set) {
        this.b = gmuVar;
        this.a = set;
    }

    @Override // defpackage.gmu
    public final gmt a(gog gogVar) {
        return new gka(this, this.b.a(gogVar));
    }

    @Override // defpackage.gmu
    public final gmt b(gog gogVar) {
        gmt gmtVarB = this.b.b(gogVar);
        if (gmtVarB == null) {
            return null;
        }
        return new gka(this, gmtVarB);
    }
}
