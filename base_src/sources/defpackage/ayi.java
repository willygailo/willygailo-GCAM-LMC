package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ayi {
    public final bfi a;
    public final bkm b;
    public final bkk c = new bkk();
    public final bkj d = new bkj();
    public final fc e;
    public final jdy f;
    public final jdy g;
    public final jdy h;
    private final bah i;
    private final jdy j;

    public ayi() {
        fc fcVarA = bmm.a(new fe(20), new bdu(2), new bmh());
        this.e = fcVarA;
        this.a = new bfi(fcVarA);
        this.g = new jdy((byte[]) null, (char[]) null);
        this.b = new bkm();
        this.f = new jdy((byte[]) null, (byte[]) null, (byte[]) null);
        this.i = new bah();
        this.h = new jdy((char[]) null, (byte[]) null, (byte[]) null);
        this.j = new jdy((short[]) null, (byte[]) null);
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.b.d(arrayList);
    }

    public final bae a(Object obj) {
        return this.i.a(obj);
    }

    public final List b() {
        List listL = this.j.l();
        if (listL.isEmpty()) {
            throw new aye();
        }
        return listL;
    }

    public final List c(Object obj) {
        List listB = this.a.b(obj.getClass());
        if (listB.isEmpty()) {
            throw new ayf(obj);
        }
        int size = listB.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            bfg bfgVar = (bfg) listB.get(i);
            if (bfgVar.b(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                }
                listEmptyList.add(bfgVar);
                z = false;
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new ayf(obj, listB);
        }
        return listEmptyList;
    }

    public final void d(Class cls, aze azeVar) {
        this.g.o(cls, azeVar);
    }

    public final void e(Class cls, azw azwVar) {
        this.f.k(cls, azwVar);
    }

    public final void f(Class cls, Class cls2, azv azvVar) {
        h("legacy_append", cls, cls2, azvVar);
    }

    public final void g(Class cls, Class cls2, bfh bfhVar) {
        this.a.c(cls, cls2, bfhVar);
    }

    public final void h(String str, Class cls, Class cls2, azv azvVar) {
        this.b.c(str, azvVar, cls, cls2);
    }

    public final void i(azg azgVar) {
        this.j.m(azgVar);
    }

    public final void j(bad badVar) {
        this.i.b(badVar);
    }

    public final void k(Class cls, Class cls2, bjg bjgVar) {
        this.h.r(cls, cls2, bjgVar);
    }
}
