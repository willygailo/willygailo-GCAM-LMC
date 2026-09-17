package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jzd implements Runnable {
    public final /* synthetic */ jzf a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    private final /* synthetic */ int d;

    public /* synthetic */ jzd(jzf jzfVar, boolean z, boolean z2, int i) {
        this.d = i;
        this.a = jzfVar;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                jzf jzfVar = this.a;
                boolean z = this.b;
                boolean z2 = this.c;
                if (!z) {
                    jzfVar.f.b(z2);
                } else {
                    jzfVar.f();
                    jzfVar.f.a(z2);
                }
                break;
            default:
                jzf jzfVar2 = this.a;
                boolean z3 = this.b;
                boolean z4 = this.c;
                if (!z3) {
                    jzfVar2.f.gt(z4);
                } else {
                    jzfVar2.f.c(z4);
                    jzfVar2.f();
                }
                break;
        }
    }
}
