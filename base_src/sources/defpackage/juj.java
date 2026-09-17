package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class juj {
    private final juk d;
    public final ols c = ols.r();
    public final osg b = new osz(ore.a);
    public final Object a = this;

    public juj(juk jukVar) {
        this.d = jukVar;
    }

    private final void f(Long l, lie lieVar) {
        this.c.q(l, lieVar);
        this.b.remove(l);
    }

    public final lie a(long j) {
        synchronized (this.a) {
            osg osgVar = this.b;
            Long lValueOf = Long.valueOf(j);
            if (!osgVar.contains(lValueOf)) {
                return null;
            }
            return (lie) this.c.b(lValueOf).get(0);
        }
    }

    public final lie b() {
        synchronized (this.a) {
            if (this.b.isEmpty()) {
                return null;
            }
            return (lie) this.c.b((Long) this.b.g().b()).get(0);
        }
    }

    public final lie c() {
        synchronized (this.a) {
            if (this.b.isEmpty()) {
                return null;
            }
            Long l = (Long) this.b.g().b();
            lie lieVar = (lie) this.c.b(l).get(0);
            f(l, lieVar);
            return lieVar;
        }
    }

    public final List d() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(((old) this.c).b);
            Iterator itV = obr.V(this.b);
            long j = -1;
            while (itV.hasNext()) {
                long jLongValue = ((Long) itV.next()).longValue();
                if (j != jLongValue) {
                    arrayList.addAll(this.c.b(Long.valueOf(jLongValue)));
                    j = jLongValue;
                }
            }
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void e(long j, Object obj) {
        lie lieVar = (lie) obj;
        synchronized (this.a) {
            osg osgVar = this.b;
            Long lValueOf = Long.valueOf(j);
            osgVar.add(lValueOf);
            this.c.l(lValueOf, lieVar);
            if (!this.c.p()) {
                while (!this.b.isEmpty() && this.d.a(obr.T(this.b))) {
                    Long l = (Long) this.b.g().b();
                    lie lieVar2 = (lie) this.c.b(l).get(0);
                    f(l, lieVar2);
                    lieVar2.close();
                }
            }
        }
    }
}
