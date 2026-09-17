package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class jrk implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public jrk(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        final byte[] bArr = null;
        switch (this.b) {
            case 0:
                lda ldaVar = (lda) this.a.get();
                qmd.ae(ldaVar);
                return ldaVar;
            case 1:
                return new lce(((jrj) this.a).get());
            case 2:
                return new jtd(((evw) this.a).get());
            case 3:
                return new jtx((ddf) this.a.get());
            case 4:
                ddf ddfVar = (ddf) this.a.get();
                ddi ddiVar = ddl.a;
                ddfVar.e();
                orx orxVar = orx.a;
                qmd.ae(orxVar);
                return orxVar;
            case 5:
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar2 = ddl.a;
                ddfVar2.b();
                return new lce(Float.valueOf(1.0f));
            case 6:
                return new lce((Float) ((lco) this.a.get()).fA());
            case 7:
                return new leg((nvb) this.a.get(), null, null);
            case 8:
                return new vh(new vf(((emo) this.a).get(), new vg(null)));
            case 9:
                return new lom((lqp) this.a.get());
            case 10:
                return new lam((Handler) this.a.get());
            case 11:
                ope opeVar = ((lpn) this.a).get().m;
                qmd.ae(opeVar);
                return opeVar;
            case 12:
                return new lpz(((liq) this.a).get());
            case 13:
                return lxv.f((lxx) this.a.get());
            case 14:
                return new lqw(this.a);
            case 15:
                return new lam((Handler) this.a.get());
            case 16:
                return new mip((lnd) this.a.get());
            case 17:
                final mip mipVar = (mip) this.a.get();
                return lnb.c(new lij(bArr, bArr) { // from class: lus
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        mip mipVar2 = this.a;
                        if (((Rect) ((lzr) obj).d(CaptureResult.SCALER_CROP_REGION)) == null) {
                            return;
                        }
                        mipVar2.aV();
                    }
                });
            case 18:
                return new lxg(((ena) this.a).get());
            case 19:
                return new lys(((lyn) this.a).get());
            default:
                return new man(((ikv) this.a).get());
        }
    }
}
