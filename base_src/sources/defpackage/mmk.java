package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mmk implements mmn {
    private final mlu a;

    public mmk(mlu mluVar) {
        this.a = mluVar;
    }

    @Override // defpackage.mmn
    public final void a(Object obj, Executor executor, moa moaVar) {
        moaVar.k(this.a.a(obj));
    }

    public final String toString() {
        return this.a.toString();
    }
}
