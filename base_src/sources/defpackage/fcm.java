package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fcm {
    private static fcl a = null;

    public static fcl a(awy awyVar) {
        int i;
        int i2;
        int i3;
        double d;
        int iAbs;
        if (a == null) {
            ArrayList arrayList = new ArrayList(awyVar.f);
            ArrayList arrayList2 = new ArrayList(awyVar.c);
            int[] iArr = new int[arrayList.size()];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = -1;
                if (i4 >= arrayList.size()) {
                    break;
                }
                iArr[i4] = -1;
                double dB = ((axn) arrayList.get(i4)).b();
                double dA = ((axn) arrayList.get(i4)).a();
                Double.isNaN(dB);
                Double.isNaN(dA);
                double d2 = dB / dA;
                int i6 = Integer.MAX_VALUE;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    double dB2 = ((axn) arrayList2.get(i7)).b();
                    double dA2 = ((axn) arrayList2.get(i7)).a();
                    Double.isNaN(dB2);
                    Double.isNaN(dA2);
                    if (Math.abs(d2 - (dB2 / dA2)) < 0.03d && ((axn) arrayList2.get(i7)).b() < 640 && (iAbs = Math.abs(((axn) arrayList2.get(i7)).b() - 320)) < i6) {
                        iArr[i4] = i7;
                        i6 = iAbs;
                    }
                }
                if (iArr[i4] >= 0) {
                    i5++;
                }
                i4++;
            }
            double d3 = Double.MAX_VALUE;
            if (i5 == 0) {
                double d4 = 320.0d;
                int i8 = 0;
                int i9 = -1;
                while (i8 < arrayList2.size()) {
                    double dAbs = Math.abs(((axn) arrayList2.get(i8)).b() - 320);
                    double d5 = dAbs < d4 ? dAbs : d4;
                    if (dAbs < d4) {
                        i9 = i8;
                    }
                    i8++;
                    d4 = d5;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = i9;
                }
                i2 = 0;
            } else {
                i2 = 0;
            }
            while (i2 < arrayList.size()) {
                if (iArr[i2] < 0) {
                    d = d3;
                } else {
                    double dAbs2 = Math.abs(((axn) arrayList.get(i2)).b() - 3000);
                    d = d3;
                    double dB3 = ((axn) arrayList.get(i2)).b();
                    double dA3 = ((axn) arrayList.get(i2)).a();
                    Double.isNaN(dB3);
                    Double.isNaN(dA3);
                    double dAbs3 = Math.abs((dB3 / dA3) - 1.3333333333333333d);
                    if (i < 0 || dAbs2 < d || (dAbs2 == d && dAbs3 < d3)) {
                        d3 = dAbs3;
                        i = i2;
                        d3 = dAbs2;
                    }
                    i2++;
                }
                d3 = d;
                i2++;
            }
            double d6 = d3;
            if (d3 > 0.03d) {
                double d7 = d6;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (iArr[i11] < 0) {
                        i3 = i;
                    } else {
                        double dB4 = ((axn) arrayList.get(i11)).b();
                        double dA4 = ((axn) arrayList.get(i11)).a();
                        Double.isNaN(dB4);
                        Double.isNaN(dA4);
                        double dAbs4 = Math.abs((dB4 / dA4) - 1.3333333333333333d);
                        double dAbs5 = Math.abs(((axn) arrayList.get(i11)).b() - 3000);
                        if (dAbs4 + 0.03d < d3) {
                            int i12 = i;
                            double dAbs6 = Math.abs(((axn) arrayList.get(i11)).b() - 3000);
                            if (dAbs6 < 1050.0d) {
                                d3 = dAbs4;
                            }
                            if (dAbs6 < 1050.0d) {
                                d7 = dAbs5;
                            }
                            i = dAbs6 < 1050.0d ? i11 : i12;
                        } else {
                            i3 = i;
                            if (Math.abs(dAbs4 - d3) < 0.03d && dAbs5 < d7) {
                                i = i11;
                                d3 = dAbs4;
                                d7 = dAbs5;
                            }
                        }
                    }
                    i = i3;
                }
            }
            int i13 = iArr[i];
            axn axnVar = (axn) arrayList.get(i);
            axnVar.b();
            axnVar.a();
            a = new fcl((axn) arrayList2.get(i13), (axn) arrayList.get(i));
        }
        return a;
    }
}
