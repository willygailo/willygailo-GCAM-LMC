package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jmy implements pys {
    private final jmx a;
    private final /* synthetic */ int b;

    public jmy(jmx jmxVar, int i) {
        this.b = i;
        this.a = jmxVar;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                jnl jnlVar = this.a.a;
                qmd.ae(jnlVar);
                return jnlVar;
            default:
                ojc ojcVar = this.a.b;
                qmd.ae(ojcVar);
                return ojcVar;
        }
    }
}
