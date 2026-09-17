package defpackage;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class atp {
    static final Set a = new HashSet(Arrays.asList("xml:lang", "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"));
    public ati b;
    public asy c;
    public OutputStreamWriter d;
    public aty e;
    public int f = 1;
    public int g;

    private final void k(String str, boolean z) {
        d(atb.h(str, z));
    }

    private final void l(atl atlVar, boolean z, int i) {
        if (z || atlVar.s()) {
            e(i);
            d(true != z ? "</rdf:" : "<rdf:");
            if (atlVar.g().j()) {
                d("Alt");
            } else if (atlVar.g().k()) {
                d("Seq");
            } else {
                d("Bag");
            }
            if (!z || atlVar.s()) {
                d(">");
            } else {
                d("/>");
            }
            f();
        }
    }

    private static final boolean m(atl atlVar) {
        return (atlVar.t() || atlVar.g().p() || atlVar.g().l() || "[]".equals(atlVar.a)) ? false : true;
    }

    private final void n(String str, String str2, Set set) throws IOException {
        if (str2 == null) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(0, iIndexOf);
                str.substring(iIndexOf + 1);
                str = strSubstring;
            } else {
                str = "";
            }
            if (str == null || str.length() <= 0) {
                return;
            }
            str2 = asv.a.b(str.concat(":"));
            n(str, str2, set);
        }
        if (set.contains(str)) {
            return;
        }
        f();
        e(4);
        d("xmlns:");
        d(str);
        d("=\"");
        d(str2);
        c(34);
        set.add(str);
    }

    public final void a(atl atlVar, int i) throws ass, IOException {
        boolean zBooleanValue;
        Iterator itH = atlVar.h();
        while (itH.hasNext()) {
            atl atlVar2 = (atl) itH.next();
            if (!m(atlVar2)) {
                String str = atlVar2.a;
                boolean z = true;
                if (true == "[]".equals(str)) {
                    str = "rdf:li";
                }
                e(i);
                c(60);
                d(str);
                Iterator itI = atlVar2.i();
                boolean z2 = false;
                boolean z3 = false;
                boolean zEquals = false;
                while (itI.hasNext()) {
                    atl atlVar3 = (atl) itI.next();
                    if (a.contains(atlVar3.a)) {
                        zEquals = "rdf:resource".equals(atlVar3.a);
                        c(32);
                        d(atlVar3.a);
                        d("=\"");
                        k(atlVar3.b, true);
                        c(34);
                    } else {
                        z3 = true;
                    }
                }
                if (z3) {
                    d(" rdf:parseType=\"Resource\">");
                    f();
                    int i2 = i + 1;
                    b(atlVar2, true, i2);
                    Iterator itI2 = atlVar2.i();
                    while (itI2.hasNext()) {
                        b((atl) itI2.next(), false, i2);
                    }
                    zBooleanValue = true;
                } else if (!atlVar2.g().l()) {
                    Boolean bool = Boolean.TRUE;
                    Boolean bool2 = Boolean.TRUE;
                    if (atlVar2.g().p()) {
                        d(" rdf:resource=\"");
                        k(atlVar2.b, true);
                        d("\"/>");
                        f();
                        bool = Boolean.FALSE;
                    } else {
                        String str2 = atlVar2.b;
                        if (str2 == null || str2.length() == 0) {
                            d("/>");
                            f();
                            bool = Boolean.FALSE;
                        } else {
                            c(62);
                            k(atlVar2.b, false);
                            bool2 = Boolean.FALSE;
                        }
                    }
                    Object[] objArr = {bool, bool2};
                    boolean zBooleanValue2 = ((Boolean) objArr[0]).booleanValue();
                    zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                    z = zBooleanValue2;
                } else if (atlVar2.g().d()) {
                    c(62);
                    f();
                    int i3 = i + 1;
                    l(atlVar2, true, i3);
                    if (atlVar2.g().i()) {
                        gk.k(atlVar2);
                    }
                    a(atlVar2, i + 2);
                    l(atlVar2, false, i3);
                    zBooleanValue = true;
                } else {
                    Iterator itH2 = atlVar2.h();
                    boolean z4 = false;
                    boolean z5 = false;
                    while (itH2.hasNext()) {
                        boolean zM = m((atl) itH2.next());
                        z4 |= !zM;
                        z5 |= zM;
                        if (z5 && z4) {
                            break;
                        }
                    }
                    if (zEquals && z4) {
                        throw new ass("Can't mix rdf:resource qualifier and element fields", 202);
                    }
                    if (!atlVar2.s()) {
                        d(" rdf:parseType=\"Resource\"/>");
                        f();
                    } else if (!z4) {
                        h(atlVar2, i + 1);
                        d("/>");
                        f();
                    } else if (z5) {
                        c(62);
                        f();
                        int i4 = i + 1;
                        e(i4);
                        d("<rdf:Description");
                        h(atlVar2, i + 2);
                        d(">");
                        f();
                        a(atlVar2, i4);
                        e(i4);
                        d("</rdf:Description>");
                        f();
                        z2 = true;
                    } else {
                        d(" rdf:parseType=\"Resource\">");
                        f();
                        a(atlVar2, i + 1);
                        z2 = true;
                    }
                    z = z2;
                    zBooleanValue = true;
                }
                if (z) {
                    if (zBooleanValue) {
                        e(i);
                    }
                    d("</");
                    d(str);
                    c(62);
                    f();
                }
            }
        }
    }

    public final void b(atl atlVar, boolean z, int i) throws ass, IOException {
        boolean z2;
        String str = atlVar.a;
        if (z) {
            str = "rdf:value";
        } else if ("[]".equals(str)) {
            str = "rdf:li";
        }
        e(i);
        c(60);
        d(str);
        Iterator itI = atlVar.i();
        boolean z3 = false;
        boolean z4 = false;
        boolean zEquals = false;
        while (true) {
            z2 = true;
            if (!itI.hasNext()) {
                break;
            }
            atl atlVar2 = (atl) itI.next();
            if (a.contains(atlVar2.a)) {
                zEquals = "rdf:resource".equals(atlVar2.a);
                if (!z) {
                    c(32);
                    d(atlVar2.a);
                    d("=\"");
                    k(atlVar2.b, true);
                    c(34);
                }
            } else {
                z4 = true;
            }
        }
        if (!z4 || z) {
            if (atlVar.g().l()) {
                if (atlVar.g().d()) {
                    c(62);
                    f();
                    int i2 = i + 1;
                    l(atlVar, true, i2);
                    if (atlVar.g().i()) {
                        gk.k(atlVar);
                    }
                    Iterator itH = atlVar.h();
                    while (itH.hasNext()) {
                        b((atl) itH.next(), false, i + 2);
                    }
                    l(atlVar, false, i2);
                    z3 = true;
                } else if (zEquals) {
                    Iterator itH2 = atlVar.h();
                    while (itH2.hasNext()) {
                        atl atlVar3 = (atl) itH2.next();
                        if (!m(atlVar3)) {
                            throw new ass("Can't mix rdf:resource and complex fields", 202);
                        }
                        f();
                        e(i + 1);
                        c(32);
                        d(atlVar3.a);
                        d("=\"");
                        k(atlVar3.b, true);
                        c(34);
                    }
                    d("/>");
                    f();
                } else if (atlVar.s()) {
                    d(" rdf:parseType=\"Resource\">");
                    f();
                    Iterator itH3 = atlVar.h();
                    while (itH3.hasNext()) {
                        b((atl) itH3.next(), false, i + 1);
                    }
                    z3 = true;
                } else {
                    d(" rdf:parseType=\"Resource\"/>");
                    f();
                }
            } else if (atlVar.g().p()) {
                d(" rdf:resource=\"");
                k(atlVar.b, true);
                d("\"/>");
                f();
            } else {
                String str2 = atlVar.b;
                if (str2 == null || "".equals(str2)) {
                    d("/>");
                    f();
                } else {
                    c(62);
                    k(atlVar.b, false);
                    z3 = true;
                    z2 = false;
                }
            }
        } else {
            if (zEquals) {
                throw new ass("Can't mix rdf:resource and general qualifiers", 202);
            }
            d(" rdf:parseType=\"Resource\">");
            f();
            int i3 = i + 1;
            b(atlVar, true, i3);
            Iterator itI2 = atlVar.i();
            while (itI2.hasNext()) {
                atl atlVar4 = (atl) itI2.next();
                if (!a.contains(atlVar4.a)) {
                    b(atlVar4, false, i3);
                }
            }
            z3 = true;
        }
        if (z3) {
            if (z2) {
                e(i);
            }
            d("</");
            d(str);
            c(62);
            f();
        }
    }

    public final void c(int i) throws IOException {
        this.d.write(i);
    }

    public final void d(String str) {
        this.d.write(str);
    }

    public final void e(int i) {
        while (i > 0) {
            this.d.write(this.e.d);
            i--;
        }
    }

    public final void f() {
        this.d.write(this.e.c);
    }

    public final void g() throws IOException {
        c(34);
        String str = this.b.a.a;
        if (str != null) {
            k(str, true);
        }
        c(34);
    }

    public final boolean h(atl atlVar, int i) throws IOException {
        Iterator itH = atlVar.h();
        boolean z = true;
        while (itH.hasNext()) {
            atl atlVar2 = (atl) itH.next();
            if (m(atlVar2)) {
                f();
                e(i);
                d(atlVar2.a);
                d("=\"");
                k(atlVar2.b, true);
                c(34);
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void i(atl atlVar, Set set) throws IOException {
        if (atlVar.g().n()) {
            String str = atlVar.b;
            n(str.substring(0, str.length() - 1), atlVar.a, set);
        } else if (atlVar.g().o()) {
            Iterator itH = atlVar.h();
            while (itH.hasNext()) {
                n(((atl) itH.next()).a, null, set);
            }
        }
        Iterator itH2 = atlVar.h();
        while (itH2.hasNext()) {
            i((atl) itH2.next(), set);
        }
        Iterator itI = atlVar.i();
        while (itI.hasNext()) {
            atl atlVar2 = (atl) itI.next();
            n(atlVar2.a, null, set);
            i(atlVar2, set);
        }
    }

    public final void j(int i) throws IOException {
        while (i > 0) {
            this.d.write(32);
            i--;
        }
    }
}
