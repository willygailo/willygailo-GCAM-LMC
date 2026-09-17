package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lpa implements Runnable {
    public boolean a;
    public boolean b;
    public boolean d;
    public boolean f;
    public boolean g;
    private final lpb i;
    public mip h = null;
    public lmw c = null;
    public lzv e = null;

    public lpa(lpb lpbVar) {
        this.i = lpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mip mipVar = this.h;
        mipVar.getClass();
        if (this.a) {
            mipVar.fx();
        }
        if (this.b) {
            mip mipVar2 = this.h;
            this.c.getClass();
            mipVar2.gi();
        }
        if (this.d) {
            this.h.fG(this.e);
        }
        if (this.f) {
            this.h.fF();
        }
        if (this.g) {
            this.h.fy();
        }
        this.h = null;
        this.a = false;
        this.b = false;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = false;
        this.g = false;
        lpb lpbVar = this.i;
        synchronized (lpbVar.a) {
            lpbVar.a.add(this);
        }
    }
}
