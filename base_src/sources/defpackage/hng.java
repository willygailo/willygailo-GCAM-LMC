package defpackage;

import com.google.android.apps.camera.ui.views.ViewfinderCover;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hng implements Runnable {
    public final /* synthetic */ ViewfinderCover a;
    private final /* synthetic */ int b;

    public /* synthetic */ hng(ViewfinderCover viewfinderCover, int i) {
        this.b = i;
        this.a = viewfinderCover;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.k();
                break;
            default:
                this.a.l();
                break;
        }
    }
}
