package defpackage;

import android.util.ArraySet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hxj {
    public final Set a = new ArraySet();
    private ojc b;
    private ojc c;
    private lvp d;

    public final synchronized lie a(hxi hxiVar) {
        this.a.add(hxiVar);
        lvp lvpVar = this.d;
        if (lvpVar != null) {
            hxiVar.e(lvpVar);
        }
        return new hxh(this, hxiVar);
    }

    final synchronized ojc b() {
        return this.b;
    }

    final synchronized ojc c() {
        return this.c;
    }

    final synchronized void d(lvp lvpVar) {
        this.d = lvpVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hxi) it.next()).e(lvpVar);
        }
    }

    final synchronized void e(lzv lzvVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hxi) it.next()).f(lzvVar);
        }
    }

    final synchronized void f(ojc ojcVar) {
        this.b = ojcVar;
    }

    final synchronized void g(ojc ojcVar) {
        this.c = ojcVar;
    }

    final synchronized void h(lrr lrrVar, lnx lnxVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hxi) it.next()).g(lrrVar, lnxVar);
        }
    }
}
