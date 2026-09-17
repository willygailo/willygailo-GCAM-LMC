package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jjs implements Runnable {
    public final /* synthetic */ jjv a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ jjs(jjv jjvVar, boolean z, int i) {
        this.c = i;
        this.a = jjvVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                jjv jjvVar = this.a;
                boolean z = this.b;
                if (jjvVar.a.isEnabled() != z) {
                    jjvVar.g(z);
                }
                break;
            default:
                jjv jjvVar2 = this.a;
                boolean z2 = this.b;
                if (jjvVar2.a.isClickEnabled() != z2) {
                    jjvVar2.a.setClickEnabled(z2);
                }
                break;
        }
    }
}
