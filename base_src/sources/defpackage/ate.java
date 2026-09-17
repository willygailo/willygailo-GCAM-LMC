package defpackage;

import j$.util.function.Consumer;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
class ate implements Iterator, j$.util.Iterator {
    final /* synthetic */ atg a;
    public atd b;
    private int c;
    private atl d;
    private String e;
    private Iterator f;
    private int g;
    private Iterator h;

    public ate(atg atgVar) {
        this.a = atgVar;
        this.c = 0;
        this.f = null;
        this.g = 0;
        this.h = Collections.EMPTY_LIST.iterator();
        this.b = null;
    }

    public ate(atg atgVar, atl atlVar, String str, int i) {
        this.a = atgVar;
        this.c = 0;
        this.f = null;
        this.g = 0;
        this.h = Collections.EMPTY_LIST.iterator();
        this.b = null;
        this.d = atlVar;
        this.c = 0;
        if (atlVar.g().n()) {
            atgVar.b = atlVar.a;
        }
        this.e = a(atlVar, str, i);
    }

    protected static final atd b(atl atlVar, String str, String str2) {
        return new atd(str, str2, atlVar.g().n() ? null : atlVar.b, atlVar);
    }

    private final boolean c(Iterator it) {
        if (!this.h.hasNext() && it.hasNext()) {
            atl atlVar = (atl) it.next();
            int i = this.g + 1;
            this.g = i;
            this.h = new ate(this.a, atlVar, this.e, i);
        }
        if (!this.h.hasNext()) {
            return false;
        }
        this.b = (atd) this.h.next();
        return true;
    }

    protected final String a(atl atlVar, String str, int i) {
        String string;
        String str2;
        if (atlVar.c == null || atlVar.g().n()) {
            return null;
        }
        if (atlVar.c.g().d()) {
            String strValueOf = String.valueOf(i);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 2);
            sb.append("[");
            sb.append(strValueOf);
            sb.append("]");
            string = sb.toString();
            str2 = "";
        } else {
            string = atlVar.a;
            str2 = "/";
        }
        if (str == null || str.length() == 0) {
            return string;
        }
        if (this.a.a.h(1024)) {
            return !string.startsWith("?") ? string : string.substring(1);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + String.valueOf(string).length());
        sb2.append(str);
        sb2.append(str2);
        sb2.append(string);
        return sb2.toString();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        int i = this.c;
        if (i == 0) {
            this.c = 1;
            if (this.d.c == null || (this.a.a.b() && this.d.s())) {
                return hasNext();
            }
            this.b = b(this.d, this.a.b, this.e);
            return true;
        }
        if (i != 1) {
            if (this.f == null) {
                this.f = this.d.i();
            }
            return c(this.f);
        }
        if (this.f == null) {
            this.f = this.d.h();
        }
        boolean zC = c(this.f);
        if (zC || !this.d.t() || this.a.a.h(4096)) {
            return zC;
        }
        this.c = 2;
        this.f = null;
        return hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException("There are no more nodes to return");
        }
        atd atdVar = this.b;
        this.b = null;
        return atdVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
