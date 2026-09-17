package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jnp implements iho {
    public final /* synthetic */ lar a;
    public final /* synthetic */ fhv b;
    public final /* synthetic */ pyn c;
    private final /* synthetic */ int d;

    public /* synthetic */ jnp(lar larVar, fhv fhvVar, pyn pynVar, int i) {
        this.d = i;
        this.a = larVar;
        this.b = fhvVar;
        this.c = pynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                enl.f(this.a, this.b, (fik) this.c.get());
                break;
            default:
                lar larVar = this.a;
                final fhv fhvVar = this.b;
                final pyn pynVar = this.c;
                larVar.execute(new Runnable() { // from class: enz
                    @Override // java.lang.Runnable
                    public final void run() {
                        fhvVar.e((env) pynVar.get());
                    }
                });
                break;
        }
    }
}
