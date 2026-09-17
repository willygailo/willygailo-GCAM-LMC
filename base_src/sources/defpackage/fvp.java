package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fvp {
    private fsa b = null;
    public final juj a = mip.ec(new hmg(1));

    public final int a() {
        int i;
        juj jujVar = this.a;
        synchronized (jujVar.a) {
            i = ((old) jujVar.c).b;
        }
        return i;
    }

    public final boolean b(long j, fvo fvoVar) {
        synchronized (this.a) {
            fsa fsaVar = (fsa) this.a.a(j);
            if (fsaVar == null) {
                return false;
            }
            fvoVar.a(fsaVar.a);
            this.b = fsaVar;
            while (true) {
                fsa fsaVar2 = (fsa) this.a.b();
                if (fsaVar2 == null || !fsaVar2.e(fsaVar)) {
                    break;
                    break;
                }
                fsa fsaVar3 = (fsa) this.a.c();
                if (fsaVar3 != null) {
                    fsaVar3.b();
                }
            }
            return true;
        }
    }

    public final void c(fsa fsaVar) {
        synchronized (this.a) {
            fsa fsaVar2 = this.b;
            if (fsaVar2 == null || !fsaVar.e(fsaVar2)) {
                this.a.e(fsaVar.a(), fsaVar);
            } else {
                fsaVar.b();
            }
        }
    }
}
