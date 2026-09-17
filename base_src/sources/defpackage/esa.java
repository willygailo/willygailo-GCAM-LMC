package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class esa implements lwz {
    private double a = 0.0d;
    private double b = 0.0d;
    private double c = 0.0d;
    private int d = 0;

    private final synchronized void c(lxc lxcVar) {
        double d = this.a;
        double d2 = lxcVar.f;
        Double.isNaN(d2);
        this.a = d + d2;
        double d3 = this.b;
        double d4 = lxcVar.g;
        Double.isNaN(d4);
        this.b = d3 + d4;
        double d5 = this.c;
        double d6 = lxcVar.h;
        Double.isNaN(d6);
        this.c = d5 + d6;
        this.d++;
    }

    @Override // defpackage.lwz
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((lxc) it.next());
        }
    }

    final synchronized ojc b() {
        ojc ojcVarI;
        int i = this.d;
        if (i == 0) {
            ojcVarI = oih.a;
        } else {
            double d = i;
            double d2 = this.a;
            Double.isNaN(d);
            double d3 = d2 / d;
            double d4 = this.b;
            Double.isNaN(d);
            double d5 = d4 / d;
            double d6 = this.c;
            Double.isNaN(d);
            double d7 = d6 / d;
            ojcVarI = ojc.i(Float.valueOf((float) Math.sqrt((d3 * d3) + (d5 * d5) + (d7 * d7))));
        }
        return ojcVarI;
    }
}
