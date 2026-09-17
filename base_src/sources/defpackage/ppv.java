package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ppv {
    protected volatile pqm a;
    public volatile poc b;

    static {
        pos.a();
    }

    public final poc a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = poc.b;
            } else {
                this.b = this.a.d();
            }
            return this.b;
        }
    }

    public final pqm b(pqm pqmVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = pqmVar;
                        this.b = poc.b;
                    } catch (ppp e) {
                        this.a = pqmVar;
                        this.b = poc.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppv)) {
            return false;
        }
        ppv ppvVar = (ppv) obj;
        pqm pqmVar = this.a;
        pqm pqmVar2 = ppvVar.a;
        if (pqmVar == null && pqmVar2 == null) {
            return a().equals(ppvVar.a());
        }
        if (pqmVar == null || pqmVar2 == null) {
            return pqmVar != null ? pqmVar.equals(ppvVar.b(pqmVar.l())) : b(pqmVar2.l()).equals(pqmVar2);
        }
        return pqmVar.equals(pqmVar2);
    }

    public int hashCode() {
        return 1;
    }
}
