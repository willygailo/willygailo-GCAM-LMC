package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class imj implements img, fik, fig, fie, fgx {
    public final Window a;
    public boolean b = false;
    public int c = 1797;
    private int e = 0;
    public final View.OnSystemUiVisibilityChangeListener d = new imi(this);

    public imj(lar larVar, final Window window) {
        this.a = window;
        larVar.execute(new Runnable() { // from class: imh
            @Override // java.lang.Runnable
            public final void run() {
                window.getDecorView().setOnSystemUiVisibilityChangeListener(this.a.d);
            }
        });
    }

    @Override // defpackage.fgx
    public final void C(boolean z) {
        if (this.b || !z) {
            return;
        }
        e();
    }

    @Override // defpackage.img
    public final void a(int i) {
        this.c = i;
        e();
    }

    @Override // defpackage.img
    public final void d(int i) {
        this.e = i;
        e();
    }

    public final void e() {
        if (this.b) {
            return;
        }
        int i = this.c;
        this.a.getDecorView().setSystemUiVisibility(((i == 1797 || i == 1812) ? this.e : 0) | this.c);
    }

    @Override // defpackage.fie
    public final void fU() {
        this.b = true;
    }

    @Override // defpackage.fig
    public final void fV() {
        this.b = false;
        e();
    }
}
