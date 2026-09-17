package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: loaded from: classes.dex */
final class fzw extends BottomBarListener {
    final /* synthetic */ fzx a;

    public fzw(fzx fzxVar) {
        this.a = fzxVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.d();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onPauseButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.e();
            this.a.n.f();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
    public final void onResumeButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.g();
            this.a.n.g();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onSnapshotButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.i();
        }
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.j();
        }
    }
}
