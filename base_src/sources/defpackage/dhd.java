package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dhd {
    final /* synthetic */ dhg a;

    public dhd(dhg dhgVar) {
        this.a = dhgVar;
    }

    public final void a(int i, double d, double d2) {
        String str;
        synchronized (this.a) {
            for (dhf dhfVar : this.a.b) {
                double d3 = d / d2;
                Map map = dhfVar.b;
                Integer numValueOf = Integer.valueOf(i);
                fcr fcrVar = (fcr) map.get(numValueOf);
                if (fcrVar == null) {
                    fcrVar = new fcr((short[]) null);
                    dhfVar.b.put(numValueOf, fcrVar);
                }
                if (d3 < 1.5d) {
                    fcrVar.d++;
                } else if (d3 < 2.5d) {
                    fcrVar.b++;
                } else if (d3 < 5.0d) {
                    fcrVar.c++;
                } else {
                    fcrVar.a++;
                }
            }
        }
        oug ougVar = (oug) ((oug) dhg.a.c()).G(777);
        jrl jrlVar = this.a.d;
        switch (i) {
            case 0:
                str = String.format("abs Δ(result sensor timestamp) = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
                break;
            case 1:
                str = String.format("rel Δ(result sensor timestamp) = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
                break;
            case 2:
                str = String.format("result sensor delay = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
                break;
            case 3:
                str = String.format("abs Δ(surface sensor timestamp) = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
                break;
            case 4:
                str = String.format("rel Δ(surface sensor timestamp) = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
                break;
            case 5:
                str = String.format("abs pipeline latency = %.2f ms > %.2f ms", Double.valueOf(d), Double.valueOf(d2));
                break;
            default:
                str = String.format("rel pipeline latency = %.2f > %.2f", Double.valueOf(d), Double.valueOf(d2));
                break;
        }
        ougVar.y("%s > %s", jrlVar, str);
    }
}
