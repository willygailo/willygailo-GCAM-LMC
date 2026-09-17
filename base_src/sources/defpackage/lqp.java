package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lqp {
    private final Set a;
    private final Set b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final lis f;

    public lqp(Set set, Set set2, Set set3, Set set4, lis lisVar) {
        this.b = ope.F(set);
        this.c = ope.F(set2);
        this.d = ope.F(set4);
        this.e = ope.F(set3);
        this.f = lisVar.a("ParamBlkList");
        opc opcVarD = ope.D();
        opcVarD.i(set);
        opcVarD.i(set3);
        opcVarD.i(set4);
        opcVarD.i(set2);
        this.a = opcVarD.f();
    }

    final boolean a(CaptureRequest.Key key) {
        lqo lqoVar;
        if (!this.a.contains(key)) {
            return false;
        }
        if (this.b.contains(key)) {
            lqoVar = lqo.SESSION_BLACKLIST;
        } else if (this.c.contains(key)) {
            lqoVar = lqo.AAA_BLACKLIST;
        } else if (this.d.contains(key)) {
            lqoVar = lqo.API_BLACKLIST;
        } else if (this.e.contains(key)) {
            lqoVar = lqo.DEVICE_BLACKLIST;
        } else {
            obr.ap(!this.a.contains(key));
            lqoVar = null;
        }
        lqoVar.getClass();
        lis lisVar = this.f;
        String name = key.getName();
        String str = lqoVar.f;
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 45 + String.valueOf(str).length());
        sb.append("Trying to update a blacklisted parameter : ");
        sb.append(name);
        sb.append(". ");
        sb.append(str);
        lisVar.h(sb.toString());
        return true;
    }
}
