package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class mzq implements mwa {
    final /* synthetic */ phw a;
    final /* synthetic */ mzu b;

    public mzq(mzu mzuVar, phw phwVar) {
        this.b = mzuVar;
        this.a = phwVar;
    }

    @Override // defpackage.mwa
    public final void c(Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(3, simpleName);
        this.b.a();
        this.b.c = this.a.d(new Runnable() { // from class: mzp
            @Override // java.lang.Runnable
            public final void run() {
                mzq mzqVar = this.a;
                mzqVar.b.a.a(5, simpleName);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
