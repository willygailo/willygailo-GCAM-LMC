package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class omu extends oni implements osg {
    private transient Comparator a;
    private transient NavigableSet b;
    private transient Set c;

    @Override // defpackage.osg, defpackage.osf
    public final Comparator comparator() {
        Comparator comparator = this.a;
        if (comparator != null) {
            return comparator;
        }
        orh orhVarA = orh.b(b().comparator()).a();
        this.a = orhVarA;
        return orhVarA;
    }

    @Override // defpackage.oni, defpackage.one
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract osg b();

    public abstract Iterator e();

    @Override // defpackage.osg
    public final oqv g() {
        return b().l();
    }

    @Override // defpackage.osg
    public final osg gE(Object obj, int i) {
        return b().s(obj, i).o();
    }

    @Override // defpackage.oni
    protected final oqw i() {
        return b();
    }

    @Override // defpackage.one, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return obr.V(this);
    }

    @Override // defpackage.oni, defpackage.oqw
    public final Set k() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        omt omtVar = new omt(this);
        this.c = omtVar;
        return omtVar;
    }

    @Override // defpackage.osg
    public final oqv l() {
        return b().g();
    }

    @Override // defpackage.osg
    public final oqv m() {
        return b().n();
    }

    @Override // defpackage.osg
    public final oqv n() {
        return b().m();
    }

    @Override // defpackage.osg
    public final osg o() {
        return b();
    }

    @Override // defpackage.oni, defpackage.oqw
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final NavigableSet j() {
        NavigableSet navigableSet = this.b;
        if (navigableSet != null) {
            return navigableSet;
        }
        osi osiVar = new osi(this);
        this.b = osiVar;
        return osiVar;
    }

    @Override // defpackage.osg
    public final osg r(Object obj, int i, Object obj2, int i2) {
        return b().r(obj2, i2, obj, i).o();
    }

    @Override // defpackage.osg
    public final osg s(Object obj, int i) {
        return b().gE(obj, i).o();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return u();
    }

    @Override // defpackage.one, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return obr.O(this, objArr);
    }

    @Override // defpackage.onj
    public final String toString() {
        return k().toString();
    }
}
