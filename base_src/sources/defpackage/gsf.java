package defpackage;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gsf {
    public final lwp a;
    public final lig b;
    public final Rect c;
    private final lwp d;

    public gsf(lwp lwpVar, lwp lwpVar2, lig ligVar, Rect rect) {
        this.a = lwpVar;
        this.d = lwpVar2;
        this.b = ligVar;
        this.c = rect;
    }

    public static gsf a(lvp lvpVar, lig ligVar, int i) throws gse {
        List<lig> listX = lvpVar.x(i);
        if (listX.isEmpty()) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("No picture sizes supported for format: ");
            sb.append(i);
            throw new gse(sb.toString());
        }
        obr.aQ(!listX.isEmpty());
        lig ligVarBs = null;
        long j = Long.MAX_VALUE;
        for (lig ligVar2 : listX) {
            long jB = ligVar2.b();
            if (ligVar2.a >= ligVar.a && ligVar2.b >= ligVar.b && jB < j) {
                ligVarBs = ligVar2;
                j = jB;
            }
        }
        if (ligVarBs == null) {
            ligVarBs = mip.bs(listX);
        }
        return new gsf(new lwp(i, ligVarBs), new lwp(i, mip.bs(listX)), ligVar, lhs.h(ligVar).c(new Rect(0, 0, ligVarBs.a, ligVarBs.b)));
    }

    public final lig b() {
        return this.d.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsf)) {
            return false;
        }
        gsf gsfVar = (gsf) obj;
        return this.b.equals(gsfVar.b) && this.d.equals(gsfVar.d) && this.a.equals(gsfVar.a) && this.c.equals(gsfVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.d, this.a, this.c});
    }

    public final String toString() {
        ojb ojbVarBa = obr.ba("PictureSizeCalculator.Configuration");
        ojbVarBa.b("desired size", this.b);
        ojbVarBa.b("large image reader", this.a);
        ojbVarBa.b("full-size image reader", this.d);
        ojbVarBa.b("crop", this.c);
        return ojbVarBa.toString();
    }
}
