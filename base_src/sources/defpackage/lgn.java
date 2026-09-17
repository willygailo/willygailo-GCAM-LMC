package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class lgn implements phh {
    final /* synthetic */ lgo a;

    public lgn(lgo lgoVar) {
        this.a = lgoVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        Log.w("Failed to get MediaLimit. Stick with the default.", th);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.q((lfa) obj);
    }
}
