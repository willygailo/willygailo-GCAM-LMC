package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
final class fzf extends BottomBarListener {
    final /* synthetic */ fzh a;

    public fzf(fzh fzhVar) {
        this.a = fzhVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onFpsSwitch(int i) {
        synchronized (this.a.e) {
            this.a.c.setClickable(false);
            this.a.u(i);
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onPauseButtonClicked() {
        synchronized (this.a.e) {
            this.a.b.e();
            this.a.d.f();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onResumeButtonClicked() {
        synchronized (this.a.e) {
            this.a.b.g();
            this.a.d.g();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onSnapshotButtonClicked() {
        synchronized (this.a.e) {
            this.a.b.i();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
        synchronized (this.a.e) {
            this.a.b.j();
        }
    }
}
