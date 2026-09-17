package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lkr implements lkq {
    private final lhx a;
    private final lkq b;
    private boolean c = true;
    private boolean d = false;

    public lkr(lkq lkqVar, lhx lhxVar) {
        this.b = lkqVar;
        this.a = lhxVar;
    }

    @Override // defpackage.lkq
    public final lvp a() {
        if (this.c) {
            this.c = false;
            lvp lvpVarA = this.b.a();
            while (lvpVarA != null) {
                if (((Boolean) this.a.a(lvpVarA)).booleanValue()) {
                    this.d = true;
                    return lvpVarA;
                }
                lvpVarA = this.b.a();
            }
            this.b.b();
        }
        if (!this.d) {
            return this.b.a();
        }
        lvp lvpVarA2 = this.b.a();
        while (lvpVarA2 != null) {
            if (((Boolean) this.a.a(lvpVarA2)).booleanValue()) {
                return lvpVarA2;
            }
            lvpVarA2 = this.b.a();
        }
        return null;
    }

    @Override // defpackage.lkq
    public final void b() {
        this.b.b();
    }
}
