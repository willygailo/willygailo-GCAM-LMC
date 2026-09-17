package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class atl implements Comparable {
    public String a;
    public String b;
    public atl c;
    public List d;
    public atx e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private List j;

    public atl(String str, atx atxVar) {
        this(str, null, atxVar);
    }

    public atl(String str, String str2, atx atxVar) {
        this.j = null;
        this.d = null;
        this.a = str;
        this.b = str2;
        this.e = atxVar;
    }

    private final List u() {
        if (this.d == null) {
            this.d = new ArrayList(0);
        }
        return this.d;
    }

    private final void v(String str) throws ass {
        if ("[]".equals(str) || c(str) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append("Duplicate property or field node '");
        sb.append(str);
        sb.append("'");
        throw new ass(sb.toString(), 203);
    }

    private final boolean w() {
        return "xml:lang".equals(this.a);
    }

    private final boolean x() {
        return "rdf:type".equals(this.a);
    }

    private static final atl y(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atl atlVar = (atl) it.next();
            if (atlVar.a.equals(str)) {
                return atlVar;
            }
        }
        return null;
    }

    public final int a() {
        List list = this.j;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int b() {
        List list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final atl c(String str) {
        return y(j(), str);
    }

    public final Object clone() {
        atx atxVar;
        try {
            atxVar = new atx(g().a);
        } catch (ass e) {
            atxVar = new atx();
        }
        atl atlVar = new atl(this.a, this.b, atxVar);
        try {
            Iterator itH = h();
            while (itH.hasNext()) {
                atlVar.k((atl) ((atl) itH.next()).clone());
            }
            Iterator itI = i();
            while (itI.hasNext()) {
                atlVar.m((atl) ((atl) itI.next()).clone());
            }
        } catch (ass e2) {
        }
        return atlVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return g().n() ? this.b.compareTo(((atl) obj).b) : this.a.compareTo(((atl) obj).a);
    }

    public final atl d(String str) {
        return y(this.d, str);
    }

    public final atl e(int i) {
        return (atl) j().get(i - 1);
    }

    public final atl f(int i) {
        return (atl) u().get(i - 1);
    }

    public final atx g() {
        if (this.e == null) {
            this.e = new atx();
        }
        return this.e;
    }

    public final Iterator h() {
        return this.j != null ? j().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    public final Iterator i() {
        return this.d != null ? new atk(u().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    public final List j() {
        if (this.j == null) {
            this.j = new ArrayList(0);
        }
        return this.j;
    }

    public final void k(atl atlVar) throws ass {
        v(atlVar.a);
        atlVar.c = this;
        j().add(atlVar);
    }

    public final void l(int i, atl atlVar) throws ass {
        v(atlVar.a);
        atlVar.c = this;
        j().add(i - 1, atlVar);
    }

    public final void m(atl atlVar) throws ass {
        String str = atlVar.a;
        if (!"[]".equals(str) && d(str) != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("Duplicate '");
            sb.append(str);
            sb.append("' qualifier");
            throw new ass(sb.toString(), 203);
        }
        atlVar.c = this;
        atlVar.g().f(32, true);
        g().v(true);
        if (atlVar.w()) {
            this.e.u(true);
            u().add(0, atlVar);
        } else if (!atlVar.x()) {
            u().add(atlVar);
        } else {
            this.e.w(true);
            u().add(this.e.c() ? 1 : 0, atlVar);
        }
    }

    public final void n() {
        if (this.j.isEmpty()) {
            this.j = null;
        }
    }

    public final void o(atl atlVar) {
        j().remove(atlVar);
        n();
    }

    public final void p() {
        this.j = null;
    }

    public final void q(atl atlVar) {
        atx atxVarG = g();
        if (atlVar.w()) {
            atxVarG.u(false);
        } else if (atlVar.x()) {
            atxVarG.w(false);
        }
        u().remove(atlVar);
        if (this.d.isEmpty()) {
            atxVarG.v(false);
            this.d = null;
        }
    }

    public final void r() {
        int length;
        if (t()) {
            atl[] atlVarArr = (atl[]) u().toArray(new atl[b()]);
            int i = 0;
            while (true) {
                length = atlVarArr.length;
                if (length <= i || !("xml:lang".equals(atlVarArr[i].a) || "rdf:type".equals(atlVarArr[i].a))) {
                    break;
                }
                atlVarArr[i].r();
                i++;
            }
            Arrays.sort(atlVarArr, i, length);
            ListIterator listIterator = this.d.listIterator();
            for (int i2 = 0; i2 < atlVarArr.length; i2++) {
                listIterator.next();
                listIterator.set(atlVarArr[i2]);
                atlVarArr[i2].r();
            }
        }
        if (s()) {
            if (!g().d()) {
                Collections.sort(this.j);
            }
            Iterator itH = h();
            while (itH.hasNext()) {
                ((atl) itH.next()).r();
            }
        }
    }

    public final boolean s() {
        List list = this.j;
        return list != null && list.size() > 0;
    }

    public final boolean t() {
        List list = this.d;
        return list != null && list.size() > 0;
    }
}
