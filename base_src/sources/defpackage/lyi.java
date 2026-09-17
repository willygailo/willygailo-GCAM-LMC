package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class lyi implements lym {
    private int b = 0;
    private double[] a = new double[5];

    @Override // defpackage.lym
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    @Override // defpackage.lym
    public final void b(lyr lyrVar, Object[] objArr) {
        for (int i = 0; i < this.b; i++) {
            double d = this.a[i];
            lyv lyvVar = lyrVar.a;
            lyvVar.getClass();
            lye lyeVarA = lye.a(objArr);
            lyw lywVar = (lyw) lyvVar.b.get(lyeVarA);
            if (lywVar == null) {
                lyvVar.b.put(lyeVarA, new lyu(d));
            } else {
                lyu lyuVar = (lyu) lywVar;
                double d2 = lyuVar.a + 1.0d;
                lyuVar.a = d2;
                lyuVar.e = d;
                if (d < lyuVar.b) {
                    lyuVar.b = d;
                } else if (d > lyuVar.c) {
                    lyuVar.c = d;
                }
                lyuVar.d = (lyuVar.d * (((-1.0d) + d2) / d2)) + (d / d2);
            }
        }
    }

    public final String toString() {
        return Arrays.toString(this.a);
    }
}
