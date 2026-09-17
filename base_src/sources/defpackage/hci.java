package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hci implements hcl {
    public final lda a;
    private final lda b = new lce(false);
    private final lda c = new lce(false);
    private final lda d;
    private final lda e;

    public hci() {
        lce lceVar = new lce(0);
        this.d = lceVar;
        Float fValueOf = Float.valueOf(0.0f);
        lce lceVar2 = new lce(fValueOf);
        this.e = lceVar2;
        this.a = new lce(hck.a(((Integer) lceVar.d).intValue(), oom.n((Float) lceVar2.d, fValueOf)));
    }

    @Override // defpackage.hcl
    public final lda a() {
        return this.c;
    }

    @Override // defpackage.hcl
    public final lda b() {
        return this.a;
    }

    @Override // defpackage.hcl
    public final pcu c() {
        poy poyVarM = pcu.c.m();
        float fFloatValue = ((Float) ((hck) ((lce) this.a).d).b.get(0)).floatValue();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcu pcuVar = (pcu) poyVarM.b;
        pcuVar.a |= 1;
        pcuVar.b = fFloatValue;
        return (pcu) poyVarM.j();
    }

    @Override // defpackage.hcl
    public final Set d(hck hckVar) {
        return ope.I(mip.be(kdd.a, Integer.valueOf(hckVar.a)), mip.be(kdd.b, oxh.L(hckVar.b)));
    }

    @Override // defpackage.hcl
    public final void e(boolean z) {
        this.b.fB(Boolean.valueOf(z));
    }

    public final void f(int i) {
        this.d.fB(Integer.valueOf(i));
        this.c.fB(false);
    }

    @Override // defpackage.hcl
    public final void g(float f) {
        this.e.fB(Float.valueOf(f));
        boolean z = false;
        if (((Boolean) ((lce) this.b).d).booleanValue() || f != 0.0f) {
            f(1);
        } else {
            f(0);
            z = true;
        }
        if (((Boolean) ((lce) this.c).d).booleanValue() != z) {
            this.c.fB(Boolean.valueOf(z));
        }
    }

    @Override // defpackage.hcl
    public final void h(bqg bqgVar) {
        bqgVar.i().c(lcv.b(this.d, this.e).a(new lij() { // from class: hch
            @Override // defpackage.lij
            public final void fB(Object obj) {
                List list = (List) obj;
                this.a.a.fB(hck.a(((Integer) list.get(0)).intValue(), oom.n(Float.valueOf(((Float) list.get(1)).floatValue()), Float.valueOf(0.0f))));
            }
        }, pgr.INSTANCE));
    }
}
