package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
final class im implements Runnable {
    final /* synthetic */ iy a;
    private final /* synthetic */ int b;

    public im(iy iyVar, int i) {
        this.b = i;
        this.a = iyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                iy iyVar = this.a;
                iyVar.n.showAtLocation(iyVar.m, 55, 0, 0);
                this.a.z();
                if (!this.a.G()) {
                    this.a.m.setAlpha(1.0f);
                    this.a.m.setVisibility(0);
                } else {
                    this.a.m.setAlpha(0.0f);
                    iy iyVar2 = this.a;
                    go goVarP = gl.p(iyVar2.m);
                    goVarP.b(1.0f);
                    iyVar2.p = goVarP;
                    this.a.p.d(new il(this));
                }
                break;
            default:
                iy iyVar3 = this.a;
                if ((iyVar3.F & 1) != 0) {
                    iyVar3.y(0);
                }
                iy iyVar4 = this.a;
                if ((iyVar4.F & 4096) != 0) {
                    iyVar4.y(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
                }
                iy iyVar5 = this.a;
                iyVar5.E = false;
                iyVar5.F = 0;
                break;
        }
    }
}
