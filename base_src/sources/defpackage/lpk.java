package defpackage;

import android.util.Printer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class lpk implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;

    public lpk(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        String string;
        String string2;
        String str;
        lis lisVar = ((liq) this.a).get();
        ljf ljfVar = (ljf) this.b.get();
        lnf lnfVar = ((lpn) this.c).get();
        lap lapVar = (lap) this.d.get();
        llr llrVar = (llr) this.e.get();
        qkg qkgVar = this.f;
        ljfVar.e("FrameServer");
        final lis lisVarA = lisVar.a("FrameServer");
        ljfVar.e("create");
        lpx lpxVarA = ((lpy) qkgVar).get();
        lisVarA.getClass();
        final Printer printer = new Printer() { // from class: lpg
            @Override // android.util.Printer
            public final void println(String str2) {
                lisVarA.f(str2);
            }
        };
        lpf lpfVar = lpxVarA.a;
        Printer printer2 = new Printer() { // from class: lpe
            @Override // android.util.Printer
            public final void println(String str2) {
                Printer printer3 = printer;
                String strValueOf = String.valueOf(str2);
                printer3.println(strValueOf.length() != 0 ? "  ".concat(strValueOf) : new String("  "));
            }
        };
        String strValueOf = String.valueOf(lpfVar.a);
        String str2 = lpfVar.b.a.a;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 10 + String.valueOf(str2).length());
        sb.append(strValueOf);
        sb.append(" (Camera ");
        sb.append(str2);
        String str3 = ")";
        sb.append(")");
        printer.println(sb.toString());
        String strValueOf2 = String.valueOf(lpfVar.c().k());
        String str4 = true != lpfVar.c().L() ? " (Physical)" : " (Logical)";
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + str4.length());
        sb2.append(strValueOf2);
        sb2.append(str4);
        lpf.e(printer2, "Facing", sb2.toString());
        lpf.e(printer2, "Mode", lpfVar.b.b == lnp.NORMAL ? "Normal" : "HighSpeed");
        lxx lxxVar = lpfVar.c;
        if (lxxVar.b <= 0) {
            string = "-";
        } else {
            long jLongValue = ((Long) lxxVar.f().fA()).longValue();
            long j = lpfVar.c.b;
            StringBuilder sb3 = new StringBuilder(49);
            sb3.append(jLongValue / 1048576);
            sb3.append(" / ");
            sb3.append(j / 1048576);
            sb3.append(" (MiB)");
            string = sb3.toString();
        }
        lpf.e(printer2, "Memory", string);
        printer.println("Streams: ");
        oti otiVarListIterator = lpfVar.d.a.listIterator();
        while (otiVarListIterator.hasNext()) {
            lui luiVar = (lui) otiVarListIterator.next();
            if (luiVar.g) {
                String str5 = luiVar.f.a;
                StringBuilder sb4 = new StringBuilder(String.valueOf(str5).length() + 10);
                sb4.append(" (Camera-");
                sb4.append(str5);
                sb4.append(str3);
                string2 = sb4.toString();
            } else {
                string2 = "";
            }
            String string3 = luiVar instanceof ltw ? Long.toString(((ltw) luiVar).e) : "inf";
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[7];
            objArr[0] = luiVar;
            int i = luiVar.b().a;
            String str6 = str3;
            int i2 = luiVar.b().b;
            oti otiVar = otiVarListIterator;
            lpx lpxVar = lpxVarA;
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append(i);
            sb5.append("x");
            sb5.append(i2);
            objArr[1] = sb5.toString();
            objArr[2] = mip.T(luiVar.a());
            loa loaVarH = luiVar.h();
            loa loaVar = loa.IMAGE_READER;
            switch (loaVarH) {
                case IMAGE_READER:
                    str = "IMAGE_READER";
                    break;
                case SURFACE_TEXTURE:
                    str = "SURFACE_TEXTURE";
                    break;
                case SURFACE_VIEW:
                    str = "SURFACE_VIEW";
                    break;
                case SURFACE:
                    str = "SURFACE";
                    break;
                case SURFACE_DEFERRED:
                    str = "SURFACE_DEFERRED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            objArr[3] = str;
            double dF = luiVar.f();
            Double.isNaN(dF);
            objArr[4] = Double.valueOf(dF / 1048576.0d);
            objArr[5] = string3;
            objArr[6] = string2;
            printer2.println(String.format(locale, "%-10s %10s %-15s %-15s %6.2f MiB/image %4s images/stream%s", objArr));
            str3 = str6;
            otiVarListIterator = otiVar;
            lpxVarA = lpxVar;
        }
        lpx lpxVar2 = lpxVarA;
        ope opeVar = lpfVar.b.h;
        if (!opeVar.isEmpty()) {
            printer.println("Session Parameters: ");
            oon oonVarN = oor.n(opeVar.size());
            oti otiVarListIterator2 = opeVar.listIterator();
            int iMax = 20;
            while (otiVarListIterator2.hasNext()) {
                lnq lnqVar = (lnq) otiVarListIterator2.next();
                String strA = lnqVar.a();
                iMax = Math.max(iMax, strA.length());
                oonVarN.e(strA, lnqVar.b);
            }
            oor oorVarC = oonVarN.c();
            ArrayList arrayList = new ArrayList(oorVarC.keySet());
            Collections.sort(arrayList);
            StringBuilder sb6 = new StringBuilder(17);
            sb6.append("%-");
            sb6.append(iMax);
            sb6.append("s %s");
            String string4 = sb6.toString();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str7 = (String) arrayList.get(i3);
                printer2.println(mip.bp(string4, str7, oorVarC.get(str7)));
            }
        }
        lapVar.c(llrVar.a(lnfVar.i));
        ljfVar.g("resume");
        lpxVar2.f();
        ljfVar.f();
        ljfVar.f();
        return lpxVar2;
    }
}
