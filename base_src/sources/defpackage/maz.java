package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class maz {
    public final mch a;
    public final maq b;
    public final mbj c;
    public final Executor d;
    public final ljf e;
    public final lis f;
    private final man g;

    public maz(mch mchVar, man manVar, maq maqVar, mbj mbjVar, Executor executor, ljf ljfVar, lis lisVar) {
        this.a = mchVar;
        this.g = manVar;
        this.b = maqVar;
        this.c = mbjVar;
        this.d = executor;
        this.e = ljfVar;
        this.f = lisVar.a("MediaGroup");
    }

    public final void a(mcg mcgVar, mai maiVar, max maxVar, mam mamVar) {
        String str;
        String str2;
        man manVar = this.g;
        mbs mbsVarA = mbs.a(mamVar.e.i().e);
        StringBuilder sb = new StringBuilder();
        if (mbsVarA.b()) {
            str = manVar.a.b;
        } else {
            str = mbsVarA.c() ? manVar.a.c : manVar.a.a;
        }
        sb.append(str);
        Date date = new Date(maxVar.b);
        DateFormat dateFormat = manVar.a.j;
        synchronized (dateFormat) {
            str2 = dateFormat.format(date);
        }
        sb.append(str2);
        if (!maxVar.c.isEmpty()) {
            sb.append(".");
            sb.append(maxVar.c);
        }
        Integer num = (Integer) ((maj) maiVar).a.get(mamVar);
        int iIntValue = num == null ? 0 : num.intValue();
        if (iIntValue > 0) {
            String strAx = obr.ax(Integer.toString(iIntValue), manVar.a.g);
            if (!manVar.a.i || maxVar.c.isEmpty()) {
                sb.append(".");
                sb.append(manVar.a.e);
                sb.append(strAx);
            } else {
                sb.append("-");
                sb.append(strAx);
            }
        }
        if (!mamVar.c.isEmpty()) {
            sb.append(".");
            sb.append(mamVar.c);
        }
        if (maxVar.e.size() > 1 && iIntValue > 0 && mamVar == maxVar.d) {
            sb.append(".");
            sb.append(manVar.a.f);
        }
        String string = sb.toString();
        mcn mcnVarI = mamVar.e.i();
        lis lisVar = this.f;
        String strC = mcnVarI.c();
        String strValueOf = String.valueOf(maxVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strC).length() + 29 + String.valueOf(string).length() + String.valueOf(strValueOf).length());
        sb2.append("Renaming ");
        sb2.append(strC);
        sb2.append(" to ");
        sb2.append(string);
        sb2.append(" based on info: ");
        sb2.append(strValueOf);
        lisVar.b(sb2.toString());
        mcgVar.b(mamVar.e, mcn.a(mcnVarI.a, mcnVarI.b, string, mcnVarI.d, mcnVarI.e), mamVar.d);
    }
}
