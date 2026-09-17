package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class bpk implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public bpk(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static bpk b(qkg qkgVar) {
        return new bpk(qkgVar, 1);
    }

    public final Boolean a() {
        boolean z = true;
        switch (this.b) {
            case 0:
                ddf ddfVar = (ddf) this.a.get();
                return Boolean.valueOf(ddfVar.k(dde.c) && ddfVar.k(ddl.ax));
            case 1:
                return Boolean.valueOf((!((ddf) this.a.get()).k(dde.g) || kdc.i == null || kdc.j == null || kdc.k == null || kdc.l == null) ? false : true);
            case 2:
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar = ddl.a;
                ddfVar2.f();
                return false;
            case 3:
                ddf ddfVar3 = (ddf) this.a.get();
                ddi ddiVar2 = ddl.a;
                ddfVar3.d();
                return false;
            case 4:
                ddf ddfVar4 = (ddf) this.a.get();
                return Boolean.valueOf(ddfVar4.k(dcv.b) && ddfVar4.k(dcv.g));
            case 5:
                ddf ddfVar5 = (ddf) this.a.get();
                return Boolean.valueOf(ddfVar5.k(dcv.b) && ddfVar5.k(dcv.f));
            case 6:
                ddf ddfVar6 = (ddf) this.a.get();
                ddi ddiVar3 = ddl.a;
                ddfVar6.d();
                return false;
            case 7:
                ddf ddfVar7 = (ddf) this.a.get();
                ddi ddiVar4 = ddl.a;
                ddfVar7.d();
                return false;
            case 8:
                lzh lzhVar = (lzh) this.a.get();
                if (!lzhVar.h && (!lzhVar.i || Build.ID.startsWith("RP1") || Build.ID.startsWith("RD1"))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return Boolean.valueOf(enl.d((ddf) this.a.get(), dug.a()));
            case 10:
                return Boolean.valueOf(((ddf) this.a.get()).k(dds.i));
            case 11:
                ddf ddfVar8 = (ddf) this.a.get();
                return Boolean.valueOf(ddfVar8.k(dds.C) && ddfVar8.k(dds.D));
            case 12:
                ddf ddfVar9 = (ddf) this.a.get();
                if (ddfVar9.k(dds.a)) {
                    ddfVar9.d();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                ddf ddfVar10 = (ddf) this.a.get();
                return Boolean.valueOf(ddfVar10.k(dds.A) && ddfVar10.k(dds.B));
            case 14:
                return Boolean.valueOf(((ddf) this.a.get()).k(dds.H));
            case 15:
                return Boolean.valueOf(((ddf) this.a.get()).k(dds.G));
            case 16:
                return Boolean.valueOf(((ddf) this.a.get()).k(dds.L));
            case 17:
                return Boolean.valueOf(fcy.w((ddf) this.a.get()));
            case 18:
                ddf ddfVar11 = (ddf) this.a.get();
                ddi ddiVar5 = ddl.a;
                ddfVar11.f();
                return false;
            case 19:
                ddf ddfVar12 = (ddf) this.a.get();
                return Boolean.valueOf(ddfVar12.k(dcu.ac) && ddfVar12.k(dcu.ab));
            default:
                return Boolean.valueOf(mip.eG((ddf) this.a.get()));
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return a();
    }
}
