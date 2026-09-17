package defpackage;

import android.os.Handler;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
final class awj implements Runnable {
    final /* synthetic */ Handler a;
    final /* synthetic */ awm b;
    final /* synthetic */ awl c;

    public awj(awl awlVar, Handler handler, awm awmVar) {
        this.c = awlVar;
        this.a = handler;
        this.b = awmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handlerC = this.c.c();
        Handler handler = this.a;
        awm awmVar = this.b;
        awo awoVar = null;
        if (handler != null && awmVar != null) {
            awoVar = new awo(handler, awmVar);
        }
        handlerC.obtainMessage(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, awoVar).sendToTarget();
    }
}
