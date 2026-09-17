package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
final class fxt extends BottomBarListener {
    final /* synthetic */ fyr a;

    public fxt(fyr fyrVar) {
        this.a = fyrVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCancelButtonPressed() {
        this.a.y();
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onRetakeButtonPressed() {
        fyr fyrVar = this.a;
        fyrVar.N++;
        if (fyrVar.p == 0) {
            ((oug) ((oug) fyr.b.b()).G((char) 1974)).o("Can't undo capture, no images captured.");
            return;
        }
        if (!fcz.r() || this.a.i.b.g().a() == 8) {
            ((oug) ((oug) fyr.b.b()).G((char) 1973)).o("Can't undo capture, LightCycle not ready to undo.");
            return;
        }
        fyr fyrVar2 = this.a;
        int i = fyrVar2.p;
        if (i > 0) {
            fyrVar2.p = i - 1;
            fyrVar2.q.d();
            this.a.B.sendEmptyMessage(R.styleable.AppCompatTheme_switchStyle);
        }
        fyr fyrVar3 = this.a;
        if (fyrVar3.p == 0) {
            fyrVar3.v();
        }
    }
}
