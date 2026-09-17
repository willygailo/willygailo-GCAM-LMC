package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bfi {
    private final bfn a;
    private final nvb b;

    public bfi(fc fcVar) {
        bfn bfnVar = new bfn(fcVar);
        this.b = new nvb((byte[]) null, (byte[]) null, (char[]) null);
        this.a = bfnVar;
    }

    public final synchronized List a(Class cls) {
        return this.a.c(cls);
    }

    public final synchronized List b(Class cls) {
        List listUnmodifiableList;
        jdy jdyVar = (jdy) this.b.a.get(cls);
        listUnmodifiableList = jdyVar == null ? null : jdyVar.h;
        if (listUnmodifiableList == null) {
            listUnmodifiableList = Collections.unmodifiableList(this.a.b(cls));
            if (((jdy) this.b.a.put(cls, new jdy(listUnmodifiableList))) != null) {
                String strValueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 34);
                sb.append("Already cached loaders for model: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        return listUnmodifiableList;
    }

    public final synchronized void c(Class cls, Class cls2, bfh bfhVar) {
        this.a.d(cls, cls2, bfhVar);
        this.b.a.clear();
    }
}
