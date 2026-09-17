package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
final class fxz implements Runnable {
    final /* synthetic */ fyr a;
    private final /* synthetic */ int b;

    public fxz(fyr fyrVar, int i) {
        this.b = i;
        this.a = fyrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                nyj nyjVar = new nyj(this.a.s.s(), this.a.F);
                nyjVar.q(R.string.dialog_ok, new fxy(this));
                nyjVar.n(R.string.dialog_cancel, new fyb(1));
                if (this.a.D.fA() == jrl.PHOTO_SPHERE) {
                    nyjVar.l(R.string.cancel_photo_sphere);
                } else {
                    nyjVar.l(R.string.cancel_panorama);
                }
                nyjVar.k(true);
                this.a.J = nyjVar.b();
                this.a.J.show();
                break;
            case 1:
                fyr fyrVar = this.a;
                if (!fyrVar.l) {
                    fyrVar.A.gm();
                }
                break;
            case 2:
                nyj nyjVar2 = new nyj(this.a.s.s(), this.a.F);
                nyjVar2.q(R.string.dialog_ok, new fya(this, null));
                nyjVar2.n(R.string.dialog_cancel, new fyb(0));
                nyjVar2.l(R.string.photosphere_fisheye_confirm_dialog);
                nyjVar2.k(true);
                this.a.K = nyjVar2.b();
                this.a.K.show();
                break;
            case 3:
                this.a.A.c();
                break;
            case 4:
                this.a.A.a();
                break;
            default:
                ie ieVar = this.a.J;
                if (ieVar != null) {
                    ieVar.dismiss();
                }
                ie ieVar2 = this.a.K;
                if (ieVar2 != null) {
                    ieVar2.dismiss();
                }
                break;
        }
    }
}
