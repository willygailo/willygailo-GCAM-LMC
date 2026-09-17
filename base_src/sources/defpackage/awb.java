package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class awb implements avw {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final avw b;

    private awb(avw avwVar) {
        this.b = avwVar;
    }

    public static awb e(Handler handler, avw avwVar) {
        if (handler != null) {
            return new awb(avwVar);
        }
        return null;
    }

    @Override // defpackage.avw
    public final void a(int i) {
        this.a.post(new avy(this, i));
    }

    @Override // defpackage.avw
    public final void b(awl awlVar) {
        this.a.post(new avx(this, awlVar));
    }

    @Override // defpackage.avw
    public final void c(int i, String str) {
        this.a.post(new avz(this, i, str, 1));
    }

    @Override // defpackage.avw
    public final void d(int i, String str) {
        this.a.post(new avz(this, i, str, 0));
    }
}
