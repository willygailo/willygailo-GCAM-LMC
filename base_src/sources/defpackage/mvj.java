package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mvj implements ndi {
    private final qkg a;
    private final qkg b;
    private final Set c;

    public mvj(qkg qkgVar, qkg qkgVar2, Set set) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = set;
    }

    private final String c(String str) {
        return ((SharedPreferences) this.b.get()).getString(d(str), null);
    }

    private static final String d(String str) {
        return str.length() != 0 ? "federatedLearningLastScheduledSession_".concat(str) : new String("federatedLearningLastScheduledSession_");
    }

    @Override // defpackage.ndi
    public final void a(qyk qykVar) {
        mve mveVar = (mve) this.a.get();
        for (mvd mvdVar : this.c) {
            if (((pyy) mvdVar.b.get()).a) {
                ope opeVarA = mvdVar.a(qykVar);
                if (!opeVarA.isEmpty()) {
                    List listAm = obr.am(opeVarA.v(), imd.p);
                    String strReplace = ((pyy) mvdVar.b.get()).b.replace("%PACKAGE_NAME%", mvdVar.c.getPackageName()).replace("%METRIC_NAME%", mvdVar.a);
                    String str = ((pyy) mvdVar.b.get()).c;
                    String str2 = mvdVar.a;
                    mveVar.a(str, listAm);
                    mveVar.c(strReplace);
                    String strC = c(str2);
                    if (strC != null && !strReplace.equals(strC)) {
                        mveVar.b(strC);
                        ((SharedPreferences) this.b.get()).edit().putString(d(str2), strReplace).commit();
                    }
                }
            } else {
                String strC2 = c(mvdVar.a);
                if (strC2 != null) {
                    mveVar.b(strC2);
                }
            }
        }
    }

    @Override // defpackage.ndi
    public final nle b() {
        return new nle(-10);
    }
}
