package defpackage;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class otk extends ord implements osg {
    private static final long serialVersionUID = 0;
    private transient otk d;

    public otk(osg osgVar) {
        super(osgVar);
    }

    @Override // defpackage.osg, defpackage.osf
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // defpackage.ord
    public final /* bridge */ /* synthetic */ Set d() {
        return obr.C(b().j());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ord, defpackage.oni
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final osg b() {
        return (osg) this.a;
    }

    @Override // defpackage.osg
    public final oqv g() {
        return b().g();
    }

    @Override // defpackage.osg
    public final osg gE(Object obj, int i) {
        return obr.T(b().gE(obj, i));
    }

    @Override // defpackage.osg
    public final oqv l() {
        return b().l();
    }

    @Override // defpackage.osg
    public final oqv m() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.osg
    public final oqv n() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.osg
    public final osg o() {
        otk otkVar = this.d;
        if (otkVar != null) {
            return otkVar;
        }
        otk otkVar2 = new otk(b().o());
        otkVar2.d = this;
        this.d = otkVar2;
        return otkVar2;
    }

    @Override // defpackage.ord, defpackage.oni, defpackage.oqw
    /* JADX INFO: renamed from: q */
    public final NavigableSet j() {
        return (NavigableSet) super.j();
    }

    @Override // defpackage.osg
    public final osg r(Object obj, int i, Object obj2, int i2) {
        return obr.T(b().r(obj, i, obj2, i2));
    }

    @Override // defpackage.osg
    public final osg s(Object obj, int i) {
        return obr.T(b().s(obj, i));
    }
}
