package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class ltb extends lta {
    private final ltm a;

    public ltb(ltm ltmVar) {
        this.a = ltmVar;
    }

    @Override // defpackage.lta
    public final void a(Handler handler) {
        mip.aX(this.a, handler);
    }

    @Override // defpackage.lta
    public final void b(ltd ltdVar) {
        ltdVar.e(this.a);
    }
}
