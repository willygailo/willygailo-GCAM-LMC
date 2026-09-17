package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class eug implements lij {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ eur b;
    final /* synthetic */ int c;

    public eug(eur eurVar, int i, AtomicReference atomicReference) {
        this.b = eurVar;
        this.c = i;
        this.a = atomicReference;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.b.r.c();
            eur eurVar = this.b;
            fjs fjsVar = eurVar.s;
            int i = this.c;
            ijk ijkVar = eurVar.r;
            fjsVar.X(i, 1, ijkVar.m, ijkVar.g(ijj.MODE_SWITCH_END));
            if (this.a.get() != null) {
                ((lie) this.a.get()).close();
            }
        }
    }
}
