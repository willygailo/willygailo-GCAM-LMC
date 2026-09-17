package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class imf {
    public final lce a;
    public boolean b;
    private final ddf c;
    private final hug d;
    private final lar e;
    private final lco f;
    private lie g;
    private final bui h;

    public imf(ddf ddfVar, hug hugVar, lda ldaVar, ims imsVar, imt imtVar, bui buiVar, lar larVar) {
        final int i = 1;
        lce lceVar = new lce(true);
        this.a = lceVar;
        final int i2 = 0;
        this.b = false;
        this.c = ddfVar;
        this.d = hugVar;
        this.h = buiVar;
        this.e = larVar;
        ddi ddiVar = dee.a;
        ddfVar.d();
        lap lapVar = buiVar.b;
        imv imvVarA = imw.a();
        imvVarA.a = "Swiss";
        imvVarA.c(larVar);
        imvVarA.f(imsVar);
        imvVarA.e(new Runnable(this) { // from class: ime
            public final /* synthetic */ imf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.a.a.fB(false);
                        break;
                    default:
                        this.a.a.fB(true);
                        break;
                }
            }
        });
        imvVarA.d(new Runnable(this) { // from class: ime
            public final /* synthetic */ imf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.a.a.fB(false);
                        break;
                    default:
                        this.a.a.fB(true);
                        break;
                }
            }
        });
        lapVar.c(imtVar.d(imvVarA.a()));
        this.f = lcv.j(lcv.b(ldaVar, lceVar), new imc(ddfVar, 0));
    }

    public final lco a() {
        return lcv.j(lcv.b(this.f, b()), imd.a);
    }

    public final lda b() {
        ddf ddfVar = this.c;
        ddi ddiVar = dee.a;
        ddfVar.d();
        return this.d.b(htu.X);
    }

    public final synchronized void c() {
        if (((Boolean) this.f.fA()).booleanValue()) {
            d();
            return;
        }
        if (!this.b) {
            this.b = true;
            if (this.g == null) {
                lie lieVarA = this.f.a(new lij() { // from class: imb
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        imf imfVar = this.a;
                        Boolean bool = (Boolean) obj;
                        synchronized (imfVar) {
                            if (bool.booleanValue() && imfVar.b) {
                                imfVar.d();
                            }
                        }
                    }
                }, this.e);
                this.g = lieVarA;
                this.h.b.c(lieVarA);
            }
        }
    }

    public final synchronized void d() {
        b().fB(Integer.valueOf(hls.c(1)));
        this.b = false;
        lie lieVar = this.g;
        if (lieVar != null) {
            lieVar.close();
            this.g = null;
        }
    }
}
