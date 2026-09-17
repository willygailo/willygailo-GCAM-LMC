package defpackage;

import android.util.ArraySet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bph implements bnf {
    private final lap a;
    private final jxb b;
    private final jwz c;
    private final bmt d;
    private final /* synthetic */ int e;

    public bph(bmt bmtVar, mbg mbgVar, final bnl bnlVar, bnv bnvVar, jxb jxbVar, jwz jwzVar, lar larVar, Set set, jxh jxhVar, kas kasVar, jac jacVar, iud iudVar, ddf ddfVar, dmh dmhVar, bmq bmqVar, lvp lvpVar, lco lcoVar, lco lcoVar2, boolean z, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        bnw bnwVar;
        lap lapVar;
        this.e = i;
        lap lapVar2 = new lap();
        this.a = lapVar2;
        boolean z2 = lvpVar.E() || lvpVar.D();
        obr.aF(z2);
        this.d = bmtVar;
        this.b = jxbVar;
        this.c = jwzVar;
        bni bniVarC = mbgVar.c(bmqVar);
        if (lvpVar.E()) {
            bnw bnwVarA = bnvVar.a(lcoVar, lvpVar);
            lapVar2.c(bnwVarA);
            bnwVar = bnwVarA;
        } else {
            bnwVar = null;
        }
        lwd lwdVarK = lvpVar.k();
        if (z) {
            lapVar = lapVar2;
            jxbVar.d(new bpf(lapVar2, bniVarC, bnlVar, lwdVarK, set, bnwVar, kasVar, jacVar, iudVar, ddfVar, dmhVar));
        } else {
            lapVar = lapVar2;
            jxbVar.d(new bou(lapVar, bniVarC, bnlVar, lwdVarK, set, kasVar, jacVar, iudVar, ddfVar));
        }
        jwzVar.f(jxhVar);
        bmtVar.b();
        lap lapVar3 = lapVar;
        lapVar3.c(bmtVar.a(lcoVar));
        final int i2 = 1;
        lapVar3.c(lcoVar2.a(new lij() { // from class: bpg
            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        bnlVar.j(!((Boolean) obj).booleanValue());
                        break;
                    default:
                        bnlVar.j(!((Boolean) obj).booleanValue());
                        break;
                }
            }
        }, larVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bph(bmt bmtVar, mbg mbgVar, bnl bnlVar, bnv bnvVar, jxb jxbVar, jwz jwzVar, lar larVar, Set set, jxh jxhVar, kas kasVar, jac jacVar, iud iudVar, ddf ddfVar, dmh dmhVar, bmq bmqVar, lvp lvpVar, lco lcoVar, lco lcoVar2, boolean z, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this(bmtVar, mbgVar, bnlVar, bnvVar, jxbVar, jwzVar, larVar, set, jxhVar, kasVar, jacVar, iudVar, ddfVar, dmhVar, bmqVar, lvpVar, lcoVar, lcoVar2, z, 1, null, null, null);
        this.e = i;
        jwzVar.e();
    }

    public bph(bmt bmtVar, mbg mbgVar, final bnl bnlVar, jxb jxbVar, jwz jwzVar, lar larVar, kas kasVar, jac jacVar, iud iudVar, ddf ddfVar, dmh dmhVar, bmq bmqVar, lvp lvpVar, lco lcoVar, lco lcoVar2, boolean z, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        final int i2;
        this.e = i;
        lap lapVar = new lap();
        this.a = lapVar;
        boolean z2 = true;
        if (!lvpVar.E() && !lvpVar.D()) {
            z2 = false;
        }
        obr.aF(z2);
        this.d = bmtVar;
        this.b = jxbVar;
        this.c = jwzVar;
        bni bniVarC = mbgVar.c(bmqVar);
        lwd lwdVarK = lvpVar.k();
        if (z) {
            i2 = 0;
            jxbVar.d(new bpf(lapVar, bniVarC, bnlVar, lwdVarK, new ArraySet(), null, kasVar, jacVar, iudVar, ddfVar, dmhVar));
        } else {
            i2 = 0;
            jxbVar.d(new bou(lapVar, bniVarC, bnlVar, lwdVarK, orx.a, kasVar, jacVar, iudVar, ddfVar));
        }
        bmtVar.b();
        lapVar.c(bmtVar.a(lcoVar));
        lapVar.c(lcoVar2.a(new lij() { // from class: bpg
            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        bnlVar.j(!((Boolean) obj).booleanValue());
                        break;
                    default:
                        bnlVar.j(!((Boolean) obj).booleanValue());
                        break;
                }
            }
        }, larVar));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        switch (this.e) {
            case 0:
                this.a.close();
                this.d.b();
                this.b.c();
                this.c.e();
                break;
            default:
                this.a.close();
                this.d.b();
                this.b.c();
                this.c.e();
                break;
        }
    }
}
