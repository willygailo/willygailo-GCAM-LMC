package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class oxr extends oxs {
    private final oxq c;

    public oxr(ovn ovnVar, int i, oxq oxqVar) {
        super(ovnVar, i);
        this.c = oxqVar;
        StringBuilder sb = new StringBuilder("%");
        ovnVar.f(sb);
        sb.append(true != ovnVar.d() ? 't' : 'T');
        sb.append(oxqVar.G);
        sb.toString();
    }

    @Override // defpackage.oxs
    public final void a(oxt oxtVar, Object obj) {
        oxq oxqVar = this.c;
        ovn ovnVar = this.b;
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb = new StringBuilder("%");
            ovnVar.f(sb);
            sb.append(true != ovnVar.d() ? 't' : 'T');
            sb.append(oxqVar.G);
            ((oxx) oxtVar).d.append(String.format(ovt.a, sb.toString(), obj));
            return;
        }
        StringBuilder sb2 = ((oxx) oxtVar).d;
        char c = oxqVar.G;
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("%t");
        sb3.append(c);
        oxx.d(sb2, obj, sb3.toString());
    }
}
