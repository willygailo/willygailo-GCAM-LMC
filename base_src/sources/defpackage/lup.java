package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lup {
    public int a = 0;
    public int b = 0;
    public boolean c;
    public final lap d;
    private final lxu e;
    private final lxu f;

    public lup(lxu lxuVar, lxu lxuVar2, lap lapVar) {
        this.c = false;
        this.d = lapVar;
        this.e = lxuVar;
        this.f = lxuVar2;
        this.c = lapVar.a();
    }

    public static lup f(lxu lxuVar, lxu lxuVar2) {
        lap lapVar = new lap();
        if (lxuVar != null) {
            lapVar.c(lxuVar);
        }
        if (lxuVar2 != null) {
            lapVar.c(lxuVar2);
        }
        if (lxuVar == null && lxuVar2 == null) {
            lapVar.close();
        }
        return new lup(lxuVar, lxuVar2, lapVar);
    }

    public static lup g() {
        return f(null, null);
    }

    public final lie a() {
        boolean z;
        synchronized (this) {
            boolean z2 = this.c;
            if (!z2) {
                this.a++;
            }
            z = !z2;
        }
        c();
        if (z) {
            return new luo(this, 1);
        }
        return null;
    }

    public final lie b() {
        boolean z;
        synchronized (this) {
            boolean z2 = this.c;
            if (!z2) {
                this.b++;
            }
            z = !z2;
        }
        c();
        if (z) {
            return new luo(this, 0);
        }
        return null;
    }

    public final synchronized void c() {
        boolean z = false;
        if (!this.c && this.b == 0 && this.a > 0) {
            z = true;
        }
        lxu lxuVar = this.e;
        if (lxuVar != null) {
            lxuVar.a(z);
        }
        lxu lxuVar2 = this.f;
        if (lxuVar2 != null) {
            lxuVar2.a(z);
        }
    }

    public final synchronized boolean d() {
        return this.c;
    }

    public final void e(lie lieVar) {
        this.d.c(lieVar);
    }
}
