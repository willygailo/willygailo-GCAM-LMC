package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class grn implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;

    public grn(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    public static grn a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new grn(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ojz get() {
        boolean z;
        ddf ddfVar = (ddf) this.a.get();
        imt imtVar = (imt) this.b.get();
        jrl jrlVar = ((giv) this.c).get();
        ims imsVarA = ((ing) this.d).a();
        lap lapVar = (lap) this.e.get();
        final eam eamVar = (eam) this.f.get();
        final int iIntValue = ((Integer) ddfVar.a(ddu.f).c()).intValue();
        final int i = 1;
        final int i2 = 0;
        final boolean z2 = jrlVar == jrl.LONG_EXPOSURE;
        if (jrlVar == jrl.PHOTO && ddfVar.k(ddm.aa)) {
            z = true;
        } else {
            z = jrlVar == jrl.PORTRAIT && ddfVar.k(ddm.ab);
        }
        if (!z2 && !z) {
            return obr.av(Integer.valueOf(iIntValue));
        }
        final int iIntValue2 = ((Integer) ddfVar.a(ddu.g).c()).intValue();
        final int iIntValue3 = ((Integer) ddfVar.a(ddu.h).c()).intValue();
        final lce lceVar = new lce(Integer.valueOf(iIntValue2));
        final Consumer consumer = new Consumer() { // from class: grm
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                lceVar.fB((Integer) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer.CC.$default$andThen(this, consumer2);
            }
        };
        imv imvVarA = imw.a();
        imvVarA.a = "SmartMeteringExtendedPeriod";
        imvVarA.c(pgr.INSTANCE);
        imvVarA.f(imsVarA);
        imvVarA.e(new Runnable() { // from class: grl
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        consumer.accept(Integer.valueOf(iIntValue2));
                        break;
                    default:
                        consumer.accept(Integer.valueOf(iIntValue2));
                        break;
                }
            }
        });
        imvVarA.d(new Runnable() { // from class: grl
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        consumer.accept(Integer.valueOf(iIntValue3));
                        break;
                    default:
                        consumer.accept(Integer.valueOf(iIntValue3));
                        break;
                }
            }
        });
        lapVar.c(imtVar.d(imvVarA.a()));
        return new ojz() { // from class: grk
            @Override // defpackage.ojz
            public final Object a() {
                boolean z3 = z2;
                eam eamVar2 = eamVar;
                lce lceVar2 = lceVar;
                int iIntValue4 = iIntValue;
                if (z3 || ((Boolean) eamVar2.a().fA()).booleanValue()) {
                    iIntValue4 = ((Integer) lceVar2.d).intValue();
                }
                return Integer.valueOf(iIntValue4);
            }
        };
    }
}
