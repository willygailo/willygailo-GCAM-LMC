package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gls {
    public final glw a;
    public final List b;
    public final List c;

    public gls(glw glwVar, List list, List list2) {
        this.a = glwVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gls)) {
            return false;
        }
        gls glsVar = (gls) obj;
        return this.a.equals(glsVar.a) && this.b.equals(glsVar.b) && this.c.equals(glsVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ojb ojbVarBa = obr.ba("ImageSaverTrace");
        ojbVarBa.b("ProcessingMethod", this.a);
        ojbVarBa.b("Input Image Metadata", this.b);
        ojbVarBa.b("Reprocessing Metadata", this.c);
        return ojbVarBa.toString();
    }
}
