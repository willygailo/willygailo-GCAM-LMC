package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jle implements Runnable {
    public final /* synthetic */ jlh a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ jle(jlh jlhVar, boolean z, int i) {
        this.c = i;
        this.a = jlhVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                jlh jlhVar = this.a;
                boolean z = this.b;
                if (jlhVar.a.isEnabled() != z) {
                    jlhVar.g(z);
                }
                break;
            default:
                jlh jlhVar2 = this.a;
                boolean z2 = this.b;
                if (jlhVar2.a.isClickEnabled() != z2) {
                    jlhVar2.a.setClickEnabled(z2);
                }
                break;
        }
    }
}
