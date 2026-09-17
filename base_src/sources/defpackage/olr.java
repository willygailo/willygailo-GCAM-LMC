package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class olr extends oln implements osg {
    final Comparator a;
    private transient osg b;

    public olr() {
        this(ore.a);
    }

    public olr(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.osg, defpackage.osf
    public final Comparator comparator() {
        return this.a;
    }

    @Override // defpackage.osg
    public final oqv g() {
        Iterator itE = e();
        if (itE.hasNext()) {
            return ((osw) itE).a();
        }
        return null;
    }

    @Override // defpackage.oln
    public final /* bridge */ /* synthetic */ Set i() {
        return new osi(this);
    }

    @Override // defpackage.osg
    public final oqv l() {
        Iterator itP = p();
        if (itP.hasNext()) {
            return ((osw) itP).a();
        }
        return null;
    }

    @Override // defpackage.osg
    public final oqv m() {
        Iterator itE = e();
        if (!itE.hasNext()) {
            return null;
        }
        oqv oqvVarA = ((osw) itE).a();
        oqv oqvVarS = obr.S(oqvVarA.b(), oqvVarA.a());
        itE.remove();
        return oqvVarS;
    }

    @Override // defpackage.osg
    public final oqv n() {
        Iterator itP = p();
        if (!itP.hasNext()) {
            return null;
        }
        oqv oqvVarA = ((osw) itP).a();
        oqv oqvVarS = obr.S(oqvVarA.b(), oqvVarA.a());
        itP.remove();
        return oqvVarS;
    }

    @Override // defpackage.osg
    public final osg o() {
        osg osgVar = this.b;
        if (osgVar != null) {
            return osgVar;
        }
        olq olqVar = new olq(this);
        this.b = olqVar;
        return olqVar;
    }

    public abstract Iterator p();

    @Override // defpackage.oln, defpackage.oqw
    /* JADX INFO: renamed from: q */
    public final NavigableSet j() {
        return (NavigableSet) super.j();
    }

    @Override // defpackage.osg
    public final osg r(Object obj, int i, Object obj2, int i2) {
        return s(obj, i).gE(obj2, i2);
    }
}
