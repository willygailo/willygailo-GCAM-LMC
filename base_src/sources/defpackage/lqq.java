package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lqq implements lmr {
    public final lqd a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private lqh d;
    private lie e;
    private boolean f;

    public lqq(lqd lqdVar) {
        this.a = lqdVar;
    }

    @Override // defpackage.lmr
    public final synchronized lmr a() {
        lqq lqqVar;
        if (this.f) {
            lqqVar = null;
        } else {
            lqh lqhVar = this.d;
            if (lqhVar != null) {
                return lrm.k(lqhVar);
            }
            lqqVar = new lqq(this.a);
            this.c.add(lqqVar);
        }
        return lqqVar;
    }

    @Override // defpackage.lmr
    public final synchronized lmw b() {
        lqh lqhVar = this.d;
        if (lqhVar == null) {
            return null;
        }
        return lqhVar.b;
    }

    @Override // defpackage.lmr
    public final synchronized lzv c() {
        lqh lqhVar = this.d;
        if (lqhVar == null) {
            return null;
        }
        return lqhVar.d();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.b.clear();
        lie lieVar = this.e;
        if (lieVar != null) {
            lieVar.close();
            this.e = null;
        }
    }

    @Override // defpackage.lmr
    public final synchronized mad d(lnx lnxVar) {
        lqh lqhVar;
        lqhVar = this.d;
        return (lqhVar == null || this.f) ? null : lqhVar.e(lnxVar);
    }

    @Override // defpackage.lmr
    public final synchronized boolean e() {
        return this.f;
    }

    @Override // defpackage.lmr
    public final synchronized boolean f() {
        lqh lqhVar;
        lqhVar = this.d;
        return lqhVar != null && lqhVar.k();
    }

    @Override // defpackage.lmr
    public final synchronized boolean g() {
        lqh lqhVar;
        lqhVar = this.d;
        return lqhVar != null && lqhVar.l();
    }

    @Override // defpackage.lmr
    public final synchronized boolean h() {
        lqh lqhVar;
        lqhVar = this.d;
        return lqhVar != null && lqhVar.m();
    }

    @Override // defpackage.lmr
    public final lqd i() {
        return this.a;
    }

    @Override // defpackage.lmr
    public final synchronized void j(mip mipVar) {
        lqh lqhVar = this.d;
        if (lqhVar == null) {
            this.b.add(mipVar);
        } else {
            if (!this.f) {
                lqhVar.o(mipVar);
            }
        }
    }

    public final synchronized void k(lqh lqhVar) {
        lie lieVar;
        lqhVar.getClass();
        obr.aR(this.d == null, "FrameStreamResult was set twice!");
        this.d = lqhVar;
        this.e = lqhVar.b();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            lqhVar.o((mip) it.next());
        }
        this.b.clear();
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((lqq) it2.next()).k(lqhVar);
        }
        this.c.clear();
        if (this.f && (lieVar = this.e) != null) {
            lieVar.close();
            this.e = null;
        }
    }
}
