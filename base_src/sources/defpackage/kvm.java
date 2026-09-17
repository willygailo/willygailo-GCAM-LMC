package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kvm {
    public final kvp a = new kvp();

    public final void a(Exception exc) {
        this.a.k(exc);
    }

    public final void b(Object obj) {
        this.a.l(obj);
    }

    public final void c(Exception exc) {
        kvp kvpVar = this.a;
        mip.du(exc, "Exception must not be null");
        synchronized (kvpVar.a) {
            if (kvpVar.b) {
                return;
            }
            kvpVar.b = true;
            kvpVar.e = exc;
            kvpVar.f.d(kvpVar);
        }
    }
}
