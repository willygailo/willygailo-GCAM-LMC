package defpackage;

import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ltn implements lte {
    private final lzo a;

    public ltn(lzo lzoVar) {
        this.a = lzoVar;
    }

    @Override // defpackage.lte
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.lte
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.lte
    public final luz c(ltm ltmVar) {
        return this.a.a().h(ltmVar.a);
    }

    @Override // defpackage.lte
    public final int d(lzq lzqVar, lts ltsVar, Handler handler, boolean z) {
        return this.a.e(lzqVar, ltsVar, handler);
    }

    @Override // defpackage.lte
    public final int e(List list, lts ltsVar, Handler handler, boolean z) {
        return this.a.f(list, ltsVar, handler);
    }

    @Override // defpackage.lte
    public final int f(lzq lzqVar, lts ltsVar, Handler handler, boolean z) {
        return this.a.g(lzqVar, ltsVar, handler);
    }
}
