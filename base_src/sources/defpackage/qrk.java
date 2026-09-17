package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qrk extends qqa implements qqr, qrb {
    public qro b;

    @Override // defpackage.qqr
    public final void e() {
        Object objV;
        qro qroVarF = f();
        do {
            objV = qroVarF.v();
            if (!(objV instanceof qrk)) {
                if (!(objV instanceof qrb) || ((qrb) objV).gZ() == null) {
                    return;
                }
                hb();
                return;
            }
            if (objV != this) {
                return;
            }
        } while (!qroVarF.d.c(objV, qrp.f));
    }

    public final qro f() {
        qro qroVar = this.b;
        if (qroVar != null) {
            return qroVar;
        }
        qkr qkrVar = new qkr(null);
        qno.e(qkrVar, qno.class.getName());
        throw qkrVar;
    }

    @Override // defpackage.qrb
    public final qrr gZ() {
        return null;
    }

    @Override // defpackage.qrb
    public final boolean ha() {
        return true;
    }

    @Override // defpackage.qvh
    public final String toString() {
        return qnm.f(this) + '@' + qnm.g(this) + "[job@" + qnm.g(f()) + ']';
    }
}
