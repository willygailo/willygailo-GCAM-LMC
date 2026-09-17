package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class atf extends ate {
    final /* synthetic */ atg c;
    private final String d;
    private final Iterator e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atf(atg atgVar, atl atlVar) {
        super(atgVar);
        this.c = atgVar;
        this.f = 0;
        if (atlVar.g().n()) {
            atgVar.b = atlVar.a;
        }
        this.d = a(atlVar, null, 1);
        this.e = atlVar.h();
    }

    @Override // defpackage.ate, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        if (!this.e.hasNext()) {
            return false;
        }
        atl atlVar = (atl) this.e.next();
        this.f++;
        String strA = null;
        if (atlVar.g().n()) {
            this.c.b = atlVar.a;
        } else if (atlVar.c != null) {
            strA = a(atlVar, this.d, this.f);
        }
        if (this.c.a.b() && atlVar.s()) {
            return hasNext();
        }
        this.b = b(atlVar, this.c.b, strA);
        return true;
    }
}
