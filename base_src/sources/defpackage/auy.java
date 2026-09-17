package defpackage;

import android.os.Handler;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
final class auy implements Runnable {
    final /* synthetic */ Handler a;
    final /* synthetic */ avf b;
    final /* synthetic */ fde c;
    private final /* synthetic */ int d;

    public auy(avf avfVar, Handler handler, fde fdeVar, int i, byte[] bArr) {
        this.d = i;
        this.b = avfVar;
        this.a = handler;
        this.c = fdeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.b.a.d.obtainMessage(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, avl.a(this.a, this.c)).sendToTarget();
                break;
            default:
                this.b.a.d.obtainMessage(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, avl.a(this.a, this.c)).sendToTarget();
                break;
        }
    }
}
