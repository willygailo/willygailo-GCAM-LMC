package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class klv {
    public Object d;
    public boolean e = false;
    final /* synthetic */ kmb f;

    public klv(kmb kmbVar, Object obj) {
        this.f = kmbVar;
        this.d = obj;
    }

    protected abstract void b();

    protected abstract void d();

    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void f() {
        e();
        synchronized (this.f.h) {
            this.f.h.remove(this);
        }
    }
}
