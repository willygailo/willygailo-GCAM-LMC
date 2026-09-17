package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afe extends aeu {
    public static final aev a = new afd(0);
    public final xg b = new xg();
    public boolean c = false;

    public final afb a(int i) {
        return (afb) this.b.d(i);
    }

    final void b() {
        this.c = false;
    }

    @Override // defpackage.aeu
    public final void c() {
        int iB = this.b.b();
        for (int i = 0; i < iB; i++) {
            ((afb) this.b.e(i)).j();
        }
        xg xgVar = this.b;
        int i2 = xgVar.e;
        Object[] objArr = xgVar.d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        xgVar.e = 0;
        xgVar.b = false;
    }
}
