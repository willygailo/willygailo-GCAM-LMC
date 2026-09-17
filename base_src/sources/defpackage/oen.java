package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oen implements Runnable {
    public final ofi d;

    public oen() {
        this.d = null;
    }

    public oen(ofi ofiVar) {
        this.d = ofiVar;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        ofi ofiVar = this.d;
        if (ofiVar != null) {
            ofiVar.a(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            b(e);
        }
    }
}
