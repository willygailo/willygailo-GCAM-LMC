package defpackage;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ouf extends oup implements ova {
    protected ouf(Level level) {
        super(level);
    }

    @Override // defpackage.oup
    protected final oxy a() {
        return oxw.a;
    }

    @Override // defpackage.oup
    protected final boolean b(out outVar) {
        int iA;
        int i;
        ovv ovvVarJ = j();
        int iB = ovvVarJ.b();
        for (int i2 = 0; i2 < iB; i2++) {
            if (ovvVarJ.c(i2).a == "eye3tag") {
                if (ovvVarJ.d(oun.a) != null || ovvVarJ.d(oun.g) != null) {
                    break;
                    break;
                }
                n(oun.g, ovf.SMALL);
                break;
            }
        }
        ouo ouoVar = this.c;
        if (ouoVar == null) {
            return true;
        }
        if (outVar != null) {
            Integer num = (Integer) ouoVar.d(oun.b);
            oux ouxVar = (oux) this.c.d(oun.c);
            ouo ouoVar2 = this.c;
            ouv ouvVar = ouy.a;
            Object ouyVar = ouvVar.a.get(outVar);
            if (ouyVar == null) {
                ouyVar = new ouy();
                Object objPutIfAbsent = ouvVar.a.putIfAbsent(outVar, ouyVar);
                if (objPutIfAbsent != null) {
                    ouyVar = objPutIfAbsent;
                } else {
                    int i3 = ouoVar2.b;
                    ouu ouuVar = null;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (oun.d.equals(ouoVar2.c(i4))) {
                            Object objE = ouoVar2.e(i4);
                            if (objE instanceof ovb) {
                                if (ouuVar == null) {
                                    ouuVar = new ouu(ouvVar, outVar);
                                }
                                ((ovb) objE).a();
                            }
                        }
                    }
                }
            }
            ouy ouyVar2 = (ouy) ouyVar;
            if (num != null) {
                if (ouyVar2.b.getAndIncrement() % ((long) num.intValue()) != 0) {
                    return false;
                }
            }
            if (ouxVar != null) {
                long j = this.b;
                long j2 = ouyVar2.c.get();
                long nanos = ouxVar.a.toNanos(10000L) + j2;
                if (nanos < 0 || ((j < nanos && j2 != 0) || !ouyVar2.c.compareAndSet(j2, j))) {
                    ouyVar2.d.incrementAndGet();
                    return false;
                }
                ouxVar.b = ouyVar2.d.getAndSet(0);
            }
        }
        ovf ovfVar = (ovf) this.c.d(oun.g);
        if (ovfVar != null) {
            ovd ovdVar = oun.g;
            ouo ouoVar3 = this.c;
            if (ouoVar3 != null && (iA = ouoVar3.a(ovdVar)) >= 0) {
                int i5 = iA + iA;
                int i6 = i5 + 2;
                while (true) {
                    i = ouoVar3.b;
                    if (i6 >= i + i) {
                        break;
                    }
                    Object obj = ouoVar3.a[i6];
                    if (!obj.equals(ovdVar)) {
                        Object[] objArr = ouoVar3.a;
                        objArr[i5] = obj;
                        objArr[i5 + 1] = objArr[i6 + 1];
                        i5 += 2;
                    }
                    i6 += 2;
                }
                ouoVar3.b = i - ((i6 - i5) >> 1);
                while (i5 < i6) {
                    ouoVar3.a[i5] = null;
                    i5++;
                }
            }
            n(oun.a, new ouw((Throwable) j().d(oun.a), ovfVar, oyb.b(oup.class, ovfVar.f)));
        }
        return true;
    }
}
