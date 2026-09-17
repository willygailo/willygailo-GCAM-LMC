package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ewq implements Runnable {
    public final /* synthetic */ exi a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewq(exi exiVar, int i) {
        this.b = i;
        this.a = exiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                exi exiVar = this.a;
                exiVar.S.b(exiVar.ai, exiVar.Q);
                break;
            case 1:
                this.a.G(false);
                break;
            case 2:
                this.a.w(true);
                break;
            case 3:
                exi exiVar2 = this.a;
                ddf ddfVar = exiVar2.W;
                ddi ddiVar = ddm.a;
                ddfVar.b();
                exiVar2.y.g().l();
                if (!((fnj) exiVar2.w.get()).o) {
                    exiVar2.z.b(R.raw.camera_shutter);
                }
                break;
            default:
                this.a.J();
                break;
        }
    }
}
