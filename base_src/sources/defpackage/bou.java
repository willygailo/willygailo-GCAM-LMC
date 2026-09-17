package defpackage;

import android.graphics.PointF;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bou extends jxi implements lie {
    public final bnl a;
    public final ddf b;
    private final bni e;
    private final lwd f;
    private final Set g;
    private final kas h;
    private final jac i;
    private final iud j;
    private lap k;
    private lie l;
    public jsj c = null;
    public jsj d = null;
    private boolean m = false;
    private final lak n = new bot(this);

    public bou(lap lapVar, bni bniVar, bnl bnlVar, lwd lwdVar, Set set, kas kasVar, jac jacVar, iud iudVar, ddf ddfVar) {
        this.e = bniVar;
        this.a = bnlVar;
        this.f = lwdVar;
        this.g = set;
        this.h = kasVar;
        this.i = jacVar;
        this.j = iudVar;
        this.b = ddfVar;
        lapVar.c(this);
    }

    @Override // defpackage.jxj
    public final synchronized boolean a(PointF pointF) {
        if (!this.m && !this.i.e()) {
            jsj jsjVar = this.c;
            if (jsjVar != null) {
                jsjVar.c();
            }
            jsj jsjVar2 = this.d;
            if (jsjVar2 != null) {
                jsjVar2.c();
            }
            lap lapVar = this.k;
            if (lapVar != null) {
                lapVar.close();
            }
            lie lieVar = this.l;
            if (lieVar != null) {
                lieVar.close();
            }
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((jxi) it.next()).a(pointF);
            }
            final bpn bpnVarA = this.j.a();
            kas kasVar = this.h;
            if (!((kbi) kasVar).L) {
                kasVar.h();
            } else if (kasVar.C()) {
                this.h.x();
            }
            jsj jsjVarC = this.a.c(pointF);
            this.c = jsjVarC;
            jsjVarC.b(new jsi() { // from class: bop
                @Override // defpackage.jsi
                public final void a() {
                    this.a.c = null;
                }
            });
            lap lapVar2 = new lap();
            this.k = lapVar2;
            final bpt bptVarA = this.e.a(lapVar2, this.f, pointF, bpnVarA);
            mip.cb(((jsp) this.c).b, bptVarA.b(), this.n, mip.bS());
            this.l = ((bpr) bpnVarA).a.a(new lij() { // from class: bor
                @Override // defpackage.lij
                public final void fB(Object obj) {
                    bou bouVar = this.a;
                    bpt bptVar = bptVarA;
                    bpo bpoVar = (bpo) obj;
                    if (bouVar.b.k(ddl.br)) {
                        if (bpoVar.equals(bpo.AE_LOCKED)) {
                            bptVar.d();
                            return;
                        } else {
                            if (bpoVar.equals(bpo.UNLOCKED)) {
                                bptVar.e();
                                return;
                            }
                            return;
                        }
                    }
                    if (bpoVar.equals(bpo.AE_AF_LOCKED)) {
                        bptVar.d();
                    } else if (bpoVar.equals(bpo.UNLOCKED)) {
                        bptVar.f();
                    }
                }
            }, pgr.INSTANCE);
            mip.ca(bptVarA.c(), new lht() { // from class: boq
                @Override // defpackage.lht
                public final void a(Object obj) {
                    bou bouVar = this.a;
                    bpn bpnVar = bpnVarA;
                    bpt bptVar = bptVarA;
                    bpo bpoVar = (bpo) ((lce) ((bpr) bpnVar).a).d;
                    if (bpoVar.equals(bpo.AE_AF_LOCKED)) {
                        return;
                    }
                    if (bpoVar.equals(bpo.AE_LOCKED) && bouVar.b.k(ddl.br)) {
                        bptVar.g();
                    } else {
                        bptVar.f();
                    }
                }
            }, pgr.INSTANCE);
            return true;
        }
        return false;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.m = true;
        lap lapVar = this.k;
        if (lapVar != null) {
            lapVar.close();
        }
        lie lieVar = this.l;
        if (lieVar != null) {
            lieVar.close();
        }
    }
}
