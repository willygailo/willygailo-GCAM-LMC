package defpackage;

import com.Fix.Pref;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class imc implements oiu {
    public final /* synthetic */ ddf a;
    private final /* synthetic */ int b;

    public /* synthetic */ imc(ddf ddfVar, int i) {
        this.b = i;
        this.a = ddfVar;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                ddf ddfVar = this.a;
                List list = (List) obj;
                ((Boolean) list.get(0)).booleanValue();
                ((Boolean) list.get(1)).booleanValue();
                ddi ddiVar = dee.a;
                ddfVar.d();
                return false;
            case 1:
                ddf ddfVar2 = this.a;
                ouj oujVar = eqx.a;
                ddi ddiVar2 = ddt.a;
                ddfVar2.f();
                return htj.LASAGNA_TR_MEDIUM;
            default:
                ddf ddfVar3 = this.a;
                List list2 = (List) obj;
                boolean z2 = (Pref.MenuValue("pref_rn8p_key") != 0 ? ddfVar3.k(ddm.X) : ddfVar3.k(ddm.XF)) && list2 != null && list2.get(0) != gqx.OFF && ((Integer) list2.get(2)).intValue() == 1;
                jrl jrlVar = (jrl) list2.get(1);
                boolean z3 = jrlVar.equals(jrl.LONG_EXPOSURE) && !ddfVar3.k(ddq.e);
                if (!jrlVar.equals(jrl.PHOTO) && !jrlVar.equals(jrl.PORTRAIT) && !jrlVar.equals(jrl.MOTION_BLUR) && !z3) {
                    z = false;
                }
                ijq ijqVar = new ijq();
                ijqVar.b = Boolean.valueOf(z2);
                ijqVar.a = Boolean.valueOf(z);
                Boolean bool = ijqVar.b;
                if (bool != null && ijqVar.a != null) {
                    return new hbt(bool.booleanValue(), ijqVar.a.booleanValue());
                }
                StringBuilder sb = new StringBuilder();
                if (ijqVar.b == null) {
                    sb.append(" hdrNetEnabled");
                }
                if (ijqVar.a == null) {
                    sb.append(" modeSupported");
                }
                String strValueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(strValueOf);
                throw new IllegalStateException(sb2.toString());
        }
    }
}
