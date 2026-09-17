package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class czk implements Runnable {
    public final /* synthetic */ czl a;
    private final /* synthetic */ int b;

    public /* synthetic */ czk(czl czlVar, int i) {
        this.b = i;
        this.a = czlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        int i2 = 6;
        switch (this.b) {
            case 0:
                czl czlVar = this.a;
                if (czlVar.f) {
                    czlVar.b.g();
                    break;
                }
                break;
            case 1:
                czl czlVar2 = this.a;
                czlVar2.C = ojc.i(czlVar2.w.schedule(new czk(czlVar2, i2), 1L, TimeUnit.SECONDS));
                break;
            case 2:
                czl czlVar3 = this.a;
                if (czlVar3.f) {
                    czlVar3.b.e();
                    if (czlVar3.F == null) {
                        imr imrVarA = iml.a;
                        if (czlVar3.z.e()) {
                            imv imvVarA = imw.a();
                            imvVarA.c(czlVar3.k);
                            imvVarA.a = "Lens suggestion";
                            imvVarA.d(new czk(czlVar3, 5));
                            imvVarA.e(new czk(czlVar3, i2));
                            imvVarA.f(czlVar3.y);
                            imrVarA = imvVarA.a();
                        }
                        czlVar3.F = imrVarA;
                        czlVar3.a = czlVar3.A.d(imrVarA);
                    }
                    break;
                }
                break;
            case 3:
                czl czlVar4 = this.a;
                czlVar4.i = true;
                czlVar4.g();
                break;
            case 4:
                czl czlVar5 = this.a;
                czlVar5.h = true;
                czlVar5.i = false;
                czlVar5.h();
                break;
            case 5:
                czl czlVar6 = this.a;
                czlVar6.k.execute(new czk(czlVar6, i));
                break;
            default:
                czl czlVar7 = this.a;
                czlVar7.k.execute(new czk(czlVar7, 2));
                break;
        }
    }
}
