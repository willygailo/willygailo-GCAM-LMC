package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lbz implements lbu {
    private final ljf a;

    public lbz(ljf ljfVar) {
        this.a = ljfVar;
    }

    @Override // defpackage.lbu
    public final void a(lie lieVar) {
        if (!(lieVar instanceof lby)) {
            lieVar.close();
            return;
        }
        try {
            this.a.e(((lby) lieVar).b());
            lieVar.close();
        } finally {
            this.a.f();
        }
    }

    @Override // defpackage.lbu
    public final void b(Iterable iterable) {
        try {
            this.a.e("Lifetime#close");
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a((lie) it.next());
            }
            this.a.f();
        } catch (Throwable th) {
            this.a.f();
            throw th;
        }
    }
}
