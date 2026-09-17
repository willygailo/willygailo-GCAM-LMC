package defpackage;

import android.net.Uri;
import j$.util.Comparator$CC;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class dfu implements Iterable {
    private static final ouj a = ouj.h("com/google/android/apps/camera/data/NavigableFilmstripData");
    private final TreeSet b = new TreeSet(Collections.reverseOrder(Comparator$CC.$default$thenComparing(Comparator$CC.comparing(cgw.i), cgw.j)));
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    private final synchronized ojc l(btz btzVar) {
        hsp hspVarD = btzVar.d();
        Uri uriC = btzVar.c();
        boolean z = (hspVarD == null && uriC.equals(Uri.EMPTY)) ? false : true;
        obr.aT(z, "At least one of shotId or Uri should be set: %s", btzVar);
        bty btyVar = hspVarD != null ? (bty) this.c.get(hspVarD) : null;
        bty btyVar2 = (bty) this.d.get(uriC);
        if (btyVar != null && btyVar2 != null) {
            obr.aU(btyVar == btyVar2, "Maps out of sync, byUri:%s, byShotId: %s", btyVar2, btyVar);
            return ojc.i(btyVar);
        }
        if (btyVar != null) {
            return ojc.i(btyVar);
        }
        return btyVar2 != null ? ojc.i(btyVar2) : oih.a;
    }

    private final synchronized void m(bty btyVar) {
        ojc ojcVarL = l(btyVar.a());
        if (ojcVarL.g()) {
            bty btyVar2 = (bty) ojcVarL.c();
            hsp hspVarD = btyVar2.a().d();
            Uri uriC = btyVar2.a().c();
            if (hspVarD != null) {
                ((bty) this.c.remove(hspVarD)).getClass();
            }
            if (!uriC.equals(Uri.EMPTY)) {
                ((bty) this.d.remove(uriC)).getClass();
            }
            obr.aU(this.b.remove(btyVar2), "Couldn't remove %s from filmstripItems=%s", btyVar2, this.b);
        }
    }

    final synchronized int a() {
        return this.b.size();
    }

    final synchronized bty b() {
        return !this.b.isEmpty() ? (bty) this.b.first() : null;
    }

    final synchronized bty c(Uri uri) {
        return (bty) this.d.get(uri);
    }

    final synchronized bty d(hsp hspVar) {
        return (bty) this.c.get(hspVar);
    }

    final synchronized bty e(bty btyVar) {
        ojc ojcVarL = l(btyVar.a());
        if (ojcVarL.g()) {
            return (bty) ojcVarL.c();
        }
        k(btyVar);
        return btyVar;
    }

    final synchronized bty f() {
        return !this.b.isEmpty() ? (bty) this.b.last() : null;
    }

    final synchronized void g(Collection collection) {
        int i = ((orr) collection).c;
        obr.aS(this.b.size() == 0, "addAll must be called on an empty list. filmstripItems contains: %s", this.b.size());
        obr.aS(this.d.size() == 0, "addAll must be called on an empty list. uriFilmstripItemMap contains: %s", this.d.size());
        obr.aS(this.c.size() == 0, "addAll must be called on an empty list. shotToFilmStripMap contains: %s", this.c.size());
        this.b.addAll(collection);
        otj it = ((oom) collection).iterator();
        while (it.hasNext()) {
            bty btyVar = (bty) it.next();
            hsp hspVarD = btyVar.a().d();
            Uri uriC = btyVar.a().c();
            if (!uriC.equals(Uri.EMPTY)) {
                obr.aR(!this.d.containsKey(uriC), String.format(Locale.ROOT, "Multiple entries for uri: %s. %s & %s", uriC, this.d.get(uriC), btyVar));
                this.d.put(uriC, btyVar);
            }
            if (hspVarD != null) {
                obr.aR(!this.c.containsKey(hspVarD), String.format(Locale.ROOT, "Multiple entries for shotId: %s. %s & %s", hspVarD, this.c.get(hspVarD), btyVar));
                this.c.put(hspVarD, btyVar);
            }
        }
    }

    final synchronized void h() {
        this.c.clear();
        this.d.clear();
        this.b.clear();
    }

    final synchronized void i(Uri uri) {
        bty btyVarC = c(uri);
        if (btyVarC == null) {
            ((oug) ((oug) a.c()).G((char) 754)).r("Uri %s not found in filmstrip", uri);
        } else {
            m(btyVarC);
        }
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator iterator() {
        return new TreeSet((SortedSet) this.b).iterator();
    }

    final synchronized void j(bty btyVar) {
        m(btyVar);
    }

    final synchronized void k(bty btyVar) {
        btz btzVarA = btyVar.a();
        hsp hspVarD = btzVarA.d();
        Uri uriC = btzVarA.c();
        boolean z = true;
        if (hspVarD == null && uriC.equals(Uri.EMPTY)) {
            z = false;
        }
        obr.aT(z, "At least one of shotId or Uri should be set: %s", btyVar);
        ojc ojcVarL = l(btzVarA);
        if (ojcVarL.g()) {
            btyVar = (bty) ojcVarL.c();
            this.b.remove(btyVar);
            btyVar.f(btzVarA);
        }
        if (hspVarD != null) {
            this.c.put(hspVarD, btyVar);
        }
        if (!uriC.equals(Uri.EMPTY)) {
            this.d.put(uriC, btyVar);
        }
        this.b.add(btyVar);
        ojcVarL.g();
    }
}
