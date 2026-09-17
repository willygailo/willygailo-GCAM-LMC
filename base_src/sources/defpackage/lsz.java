package defpackage;

import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class lsz extends lta {
    private final List a;

    public lsz(List list) {
        this.a = list;
    }

    @Override // defpackage.lta
    public final void a(Handler handler) {
        mip.aY(this.a, handler);
    }

    @Override // defpackage.lta
    public final void b(ltd ltdVar) {
        ltdVar.f(this.a);
    }
}
