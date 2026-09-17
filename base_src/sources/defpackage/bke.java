package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bke extends bu {
    public final bjj a;
    private bke aa;
    public final bjv b;
    public ayn c;
    private final Set d;

    public bke() {
        bjj bjjVar = new bjj();
        this.b = new bkd(this);
        this.d = new HashSet();
        this.a = bjjVar;
    }

    private final void k() {
        bke bkeVar = this.aa;
        if (bkeVar != null) {
            bkeVar.d.remove(this);
            this.aa = null;
        }
    }

    @Override // defpackage.bu
    public final void J() {
        super.J();
        this.a.b();
        k();
    }

    @Override // defpackage.bu
    public final void e() {
        super.e();
        k();
    }

    @Override // defpackage.bu
    public final void g() {
        super.g();
        this.a.c();
    }

    @Override // defpackage.bu
    public final void gv(Context context) {
        super.gv(context);
        bu buVar = this;
        while (true) {
            bu buVar2 = buVar.B;
            if (buVar2 == null) {
                break;
            } else {
                buVar = buVar2;
            }
        }
        cu cuVar = buVar.y;
        if (cuVar == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            Context contextR = r();
            k();
            bke bkeVarD = axv.b(contextR).e.d(cuVar);
            this.aa = bkeVarD;
            if (equals(bkeVarD)) {
                return;
            }
            this.aa.d.add(this);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // defpackage.bu
    public final void h() {
        super.h();
        this.a.d();
    }

    @Override // defpackage.bu
    public final String toString() {
        String string = super.toString();
        bu buVar = this.B;
        if (buVar == null) {
            buVar = null;
        }
        String strValueOf = String.valueOf(buVar);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 9 + String.valueOf(strValueOf).length());
        sb.append(string);
        sb.append("{parent=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
