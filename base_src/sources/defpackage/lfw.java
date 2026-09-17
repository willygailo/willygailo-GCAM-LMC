package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class lfw implements phh {
    final /* synthetic */ lfy a;

    public lfw(lfy lfyVar) {
        this.a = lfyVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        Log.e("AudioEncoder", "Stopping recording due to: ", th);
        this.a.m.a(lga.OTHER);
    }

    @Override // defpackage.phh
    public final void b(Object obj) {
    }
}
