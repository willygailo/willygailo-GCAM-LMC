package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lqa implements lie {
    private final oor a;
    private boolean b = false;

    public lqa(oor oorVar) {
        this.a = oorVar;
    }

    public final synchronized lmr a(lqd lqdVar) {
        lmr lmrVar;
        if (!this.b && (lmrVar = (lmr) this.a.get(lqdVar)) != null) {
            return lmrVar.a();
        }
        return null;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        oti otiVarListIterator = this.a.values().listIterator();
        while (otiVarListIterator.hasNext()) {
            ((lmr) otiVarListIterator.next()).close();
        }
    }
}
