package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class nuj {
    public final nrl a;
    public final nqh b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final nrm g;

    public nuj(nrl nrlVar, nqh nqhVar, List list, List list2, List list3, List list4, nrm nrmVar) {
        this.a = nrlVar;
        this.b = nqhVar;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = nrmVar;
    }

    public static /* synthetic */ nuj b(nuj nujVar, nqh nqhVar, List list, List list2, int i) {
        nrl nrlVar = (i & 1) != 0 ? nujVar.a : null;
        if ((i & 2) != 0) {
            nqhVar = nujVar.b;
        }
        nqh nqhVar2 = nqhVar;
        if ((i & 4) != 0) {
            list = nujVar.c;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = nujVar.d;
        }
        List list4 = list2;
        List list5 = nujVar.e;
        List list6 = nujVar.f;
        nrm nrmVar = nujVar.g;
        nrlVar.getClass();
        nqhVar2.getClass();
        list3.getClass();
        list4.getClass();
        return new nuj(nrlVar, nqhVar2, list3, list4, list5, list6, nrmVar);
    }

    public final void a(List list, int i, String str) {
        Collection collectionQ;
        if (i != list.size()) {
            nrm nrmVar = this.g;
            nrl nrlVar = this.a;
            List listQ = qmd.q(this.b);
            if (i < 0) {
                throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            }
            if (i == 0) {
                collectionQ = qmd.w(list);
            } else {
                int size = list.size() - i;
                if (size <= 0) {
                    collectionQ = qkx.a;
                } else if (size != 1) {
                    ArrayList arrayList = new ArrayList(size);
                    if (list instanceof RandomAccess) {
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = list.listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    collectionQ = arrayList;
                } else {
                    if (list.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    collectionQ = qmd.q(list.get(qmd.r(list)));
                }
            }
            nrmVar.a(nrlVar.b(listQ, collectionQ, 32, new IllegalStateException(qno.a("Extra ", str))));
        }
    }

    public final void c(int i, Throwable th) {
        this.g.a(this.a.b(qmd.q(this.b), qmd.v(qmd.v(this.c, this.d), this.e), i, th));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuj)) {
            return false;
        }
        nuj nujVar = (nuj) obj;
        return qno.c(this.a, nujVar.a) && qno.c(this.b, nujVar.b) && qno.c(this.c, nujVar.c) && qno.c(this.d, nujVar.d) && qno.c(this.e, nujVar.e) && qno.c(this.f, nujVar.f) && qno.c(this.g, nujVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "UploadItem(logStarter=" + this.a + ", resource=" + this.b + ", annotations=" + this.c + ", attachments=" + this.d + ", notForUploads=" + this.e + ", originalAnnotachmentOnDeviceIdOrder=" + this.f + ", f250Logger=" + this.g + ')';
    }
}
