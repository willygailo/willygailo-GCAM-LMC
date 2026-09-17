package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dph implements jwu {
    public ojc a = oih.a;
    private final ddf b;
    private final lar c;
    private final ims d;
    private final imt e;
    private jww f;

    public dph(lar larVar, ims imsVar, imt imtVar, ddf ddfVar) {
        this.b = ddfVar;
        this.c = larVar;
        this.d = imsVar;
        this.e = imtVar;
    }

    @Override // defpackage.jwu
    public final jws a(jww jwwVar) {
        if (!this.a.g() || this.f != jwwVar) {
            if (this.a.g()) {
                ((dpy) this.a.c()).close();
            }
            this.f = jwwVar;
            ddf ddfVar = this.b;
            ddi ddiVar = ddl.a;
            ddfVar.e();
            this.a = ojc.i(new dpj(((jwm) jwwVar).b));
        }
        imt imtVar = this.e;
        imv imvVarA = imw.a();
        imvVarA.a = "FaceObfuscation";
        imvVarA.c(this.c);
        imvVarA.f(this.d);
        final int i = 1;
        imvVarA.e(new Runnable(this) { // from class: dpg
            public final /* synthetic */ dph a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        ojc ojcVar = this.a.a;
                        ojcVar.getClass();
                        ((dpy) ojcVar.c()).e(true);
                        break;
                    default:
                        ojc ojcVar2 = this.a.a;
                        ojcVar2.getClass();
                        ((dpy) ojcVar2.c()).e(false);
                        break;
                }
            }
        });
        final int i2 = 0;
        imvVarA.d(new Runnable(this) { // from class: dpg
            public final /* synthetic */ dph a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        ojc ojcVar = this.a.a;
                        ojcVar.getClass();
                        ((dpy) ojcVar.c()).e(true);
                        break;
                    default:
                        ojc ojcVar2 = this.a.a;
                        ojcVar2.getClass();
                        ((dpy) ojcVar2.c()).e(false);
                        break;
                }
            }
        });
        imtVar.d(imvVarA.a());
        return (jws) this.a.c();
    }
}
