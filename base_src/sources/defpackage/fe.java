package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe extends fd {
    private final Object a;

    public fe(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.fd, defpackage.fc
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.fd, defpackage.fc
    public final boolean b(Object obj) {
        boolean zB;
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
