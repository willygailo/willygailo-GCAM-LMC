package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class oxf extends ows {
    private final String a;
    private final boolean b;
    private final Level c;
    private final boolean d;

    public oxf(String str, String str2, boolean z, Level level, boolean z2) {
        super(str2);
        this.a = str;
        this.b = z;
        this.c = level;
        this.d = z2;
    }

    @Override // defpackage.ovr
    public final void c(ovq ovqVar) {
        String strB = (String) ovqVar.j().d(ovl.a);
        if (strB == null) {
            strB = a();
        }
        if (strB == null) {
            strB = ovqVar.f().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        String strD = oxh.d(this.a, strB, this.b);
        Level levelM = ovqVar.m();
        if (!this.d) {
            int iE = oxh.e(levelM);
            if (!Log.isLoggable(strD, iE) && !Log.isLoggable("all", iE)) {
                return;
            }
        }
        oxg.e(ovqVar, strD, this.c);
    }

    @Override // defpackage.ovr
    public final boolean d(Level level) {
        return true;
    }
}
