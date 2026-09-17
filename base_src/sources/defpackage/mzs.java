package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class mzs implements mwb {
    final /* synthetic */ phw a;
    final /* synthetic */ mzu b;

    public mzs(mzu mzuVar, phw phwVar) {
        this.b = mzuVar;
        this.a = phwVar;
    }

    @Override // defpackage.mwb
    public final void b(Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(4, simpleName);
        this.b.a();
        this.b.b = this.a.d(new Runnable() { // from class: mzr
            @Override // java.lang.Runnable
            public final void run() {
                mzs mzsVar = this.a;
                mzsVar.b.a.a(6, simpleName);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
