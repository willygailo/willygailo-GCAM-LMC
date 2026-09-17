package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lwr extends mab {
    public final Object a;
    public int b;

    public lwr(mag magVar) {
        super(magVar);
        this.a = new Object();
        this.b = 0;
    }

    private final mad j(mad madVar) {
        if (madVar == null) {
            return null;
        }
        this.b++;
        return new lwq(this, madVar);
    }

    @Override // defpackage.mab, defpackage.mag
    public final mad f() {
        synchronized (this.a) {
            if (this.b == c()) {
                return null;
            }
            return j(super.f());
        }
    }

    @Override // defpackage.mab, defpackage.mag
    public final mad g() {
        synchronized (this.a) {
            if (this.b == c()) {
                return null;
            }
            return j(super.g());
        }
    }
}
